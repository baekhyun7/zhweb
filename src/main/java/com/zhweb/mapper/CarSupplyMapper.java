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
public interface CarSupplyMapper {

    List<CarSupply> queryCarSupply(@Param("carSupplyConReq") CarSupplyConReq carSupplyConReq);

    int addCarSupply(CarSupply carSupply);

    int updateCarSupply(CarSupply carSupply);

    int deleteCarSupply(List<String> list);

    List<CarType> queryCarType();

    void addTypeNumBatch(@Param("carTypeNums") List<CarTypeRel> carTypeNums);

    void deleteTypeNumRel(@Param("id") String id);

    List<CarTypeRel> queryTypeNum(@Param("supplyId") String supplyId);
}
