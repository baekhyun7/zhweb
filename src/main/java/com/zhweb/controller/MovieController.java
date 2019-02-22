package com.zhweb.controller;


import com.zhweb.entity.MMovie;
import com.zhweb.service.MMovieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author zh
 * @since 2018-12-17
 */
@Api(tags = "MMovieController的接口")
@RestController
@RequestMapping("/movie")
public class MovieController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MMovieService mMovieService;

    @ApiOperation(value = "sayHello", notes = "sayHello")
    @PostMapping("/hello")
    @RequiresPermissions("user.add")
    public String hello(){
        logger.info("这里是hello的方法");
        return "hello";
    }

    @ApiOperation(value = "query", notes = "query")
    @PostMapping("/query")
    @RequiresPermissions("user:add")
    public List<MMovie> query(){
        List<MMovie> query = mMovieService.query();
        return query;
    }



}
