package com.zhweb.service.impl;

import com.zhweb.entity.MMovie;
import com.zhweb.mapper.MMovieMapper;
import com.zhweb.service.MMovieService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
@Service
public class MMovieServiceImpl extends ServiceImpl<MMovieMapper, MMovie> implements MMovieService {

    @Autowired
    private MMovieMapper mMovieMapper;

    @Override
    public List<MMovie> query() {
        return mMovieMapper.query();
    }
}
