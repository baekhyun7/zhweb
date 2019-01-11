package com.zhweb.JwtToken;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Author: ZH
 * @Date: 2019/1/11 0011 10:03
 * @Description:
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    private String password;

    public JwtToken(String token,String password) {
        this.token = token;
        this.password = password;
    }

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return password;
    }
}
