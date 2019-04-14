package com.zhweb.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: ZH
 * @Date: 2019/3/5 0005 14:58
 * @Description:
 */
@Configuration
public class MyPicConfig implements WebMvcConfigurer {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/picture/**").addResourceLocations("file:/ideaProject/zhweb/src/main/resources/static/picture/");
}


}
