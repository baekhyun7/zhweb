package com.zhweb.mapper;

import com.zhweb.entity.UserInfoMore;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
@Mapper
public interface UserInfoMoreMapper{

   void addUserInfo(UserInfoMore userInfoMore);

}