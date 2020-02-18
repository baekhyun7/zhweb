package com.zhweb.service;

import com.baomidou.mybatisplus.service.IService;
import com.common.exception.BaseException;
import com.zhweb.entity.*;
import com.zhweb.entity.RO.CarSupplyConReq;
import com.zhweb.entity.RO.CarSupplyReq;
import com.zhweb.entity.RO.UserInfoConReq;
import com.zhweb.entity.RO.UserInfoReq;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
public interface CarSupplyService {

    List<CarSupply> query(CarSupplyConReq carSupplyConReq);

    int add(CarSupplyReq carSupply);

    int update(CarSupplyReq carSupply);

    int deleteBatch(List<String> list);

    List<CarType> queryCarType();

    List<CarTypeRel> queryTypeNum(String id);

}
