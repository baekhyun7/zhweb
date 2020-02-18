package com.zhweb.mapper;

import com.zhweb.entity.*;
import com.zhweb.entity.RO.CarSupplyConReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
public interface CarInventoryMapper {

    List<CarTypeTotal> queryTotal(@Param("name") String name);

    List<CarSupplyNum> queryCarSupplyNum(@Param("typeId") String typeId);

    int update(CarTypeRel carTypeRel);

}
