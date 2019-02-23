package com.zhweb.config;

import com.alibaba.fastjson.JSON;
import com.common.constants.CommonConstants;
import com.common.exception.BaseException;
import com.zhweb.JwtToken.JwtToken;
import com.zhweb.entity.SysPermission;
import com.zhweb.entity.SysRole;
import com.zhweb.entity.UserInfo;
import com.zhweb.service.UserInfoService;
import com.zhweb.util.JwtUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;

/**
 * 功能描述：MyShiroRealm
 *
 * @ClassName MyShiroRealm
 * @Description TODO
 * @Author zh
 * @Data 12-23 21:45
 * @Version 1.0
 */
public class MyShiroRealm extends AuthorizingRealm {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 必须重写此方法，不然Shiro会报错
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 认证信息.(身份验证)
     * :
     * Authentication 是用来验证用户身份
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("————身份认证方法————");

        //获取用户的输入的账号.
        String jwttoken = (String) token.getPrincipal();
        String username = JwtUtils.getUsername(jwttoken);
        if(username==null){
            throw new AuthenticationException("token 错误");
        }

//        //获取用户的输入的账号.
//        String username = (String)token.getPrincipal();

        System.out.println("这是token信息" + token.getCredentials());
//
//        //通过username从数据库中查找 User对象，如果找到，没找到.
//        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        UserInfo userInfo = null;
        try {
            userInfo = userInfoService.findByUsername(username);
        } catch (BaseException e) {
            e.printStackTrace();
        }
        System.out.println("----->>userInfo=" + userInfo);
        if (userInfo == null) {
            throw new AuthenticationException("Username not found");
        }
        //加密方式;
        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                userInfo,
                userInfo.getPassword(),
              //  ByteSource.Util.bytes(userInfo.getCredentialsSalt()),
                getName()
        );
//        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
//                userInfo,
//                userInfo.getPassword(),
//                this.getName());
        return authenticationInfo;
    }


    /**
     * 此方法调用  hasRole,hasPermission的时候才会进行回调.
     * <p>
     * 权限信息.(授权):
     * 1、如果用户正常退出，缓存自动清空；
     * 2、如果用户非正常退出，缓存自动清空；
     * 3、如果我们修改了用户的权限，而用户不退出系统，修改的权限无法立即生效。
     * （需要手动编程进行实现；放在service进行调用）
     * 在权限修改后调用realm中的方法，realm已经由spring管理，所以从spring中获取realm实例，
     * 调用clearCached方法；
     * :Authorization 是授权访问控制，用于对用户进行的操作授权，证明该用户是否允许进行当前操作，如访问某个链接，某个资源文件等。
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
       /*
        * 当没有使用缓存的时候，不断刷新页面的话，这个代码会不断执行，
        * 当其实没有必要每次都重新设置权限信息，所以我们需要放到缓存中进行管理；
        * 当放到缓存中时，这样的话，doGetAuthorizationInfo就只会执行一次了，
        * 缓存过期之后会再次执行。
        */
        // 登录时清除当前用户授权
        this.clearCached();
        System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()"+principals.toString());
        UserInfo userInfo = (UserInfo) principals.getPrimaryPrincipal();
        System.err.println("username" + userInfo.getUserName());
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        List<SysPermission> sysPermissions;
        String s = stringRedisTemplate.opsForValue().get(CommonConstants.USERID_PREFIX + userInfo.getId());
        if(s!=null){
            System.err.println("从缓存中查询该用户的权限信息");
            sysPermissions = JSON.parseArray(s, SysPermission.class);
            for (SysPermission sysPermission : sysPermissions) {
                authorizationInfo.addStringPermission(sysPermission.getPermission());
            }
        }else{
            //从数据库查询该用户的权限信息
            sysPermissions = userInfoService.getPermissionList(userInfo.getId());
            System.err.println("从数据库查询该用户的权限信息");
            stringRedisTemplate.opsForValue().set(CommonConstants.USERID_PREFIX + userInfo.getId(),JSON.toJSONString(sysPermissions));
        }

       if(!sysPermissions.isEmpty()){
        for (SysPermission sysPermission : sysPermissions) {
            authorizationInfo.addStringPermission(sysPermission.getPermission());
        }
       }
        return authorizationInfo;
    }

    /**
     * 清除缓存
     */
    public void clearCached() {
        PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principals);
    }

    /**
     * 清空当前用户权限信息
     */
    public void clearCachedAuthorizationInfo() {
        PrincipalCollection principalCollection = SecurityUtils.getSubject().getPrincipals();
        SimplePrincipalCollection principals = new SimplePrincipalCollection(principalCollection, getName());
        super.clearCachedAuthorizationInfo(principals);
    }
}
