package com.zhweb.mapper;

import com.zhweb.entity.MMovie;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
@Mapper
public interface MMovieMapper extends BaseMapper<MMovie> {

    List<MMovie> query();

}
