package com.zhweb.service;

import com.zhweb.entity.MMovie;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
public interface MMovieService extends IService<MMovie> {

    List<MMovie> query();

}
