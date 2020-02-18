package com.zhweb.service;

import com.zhweb.entity.*;
import com.zhweb.entity.RO.CarSupplyConReq;
import com.zhweb.entity.RO.CarSupplyReq;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
public interface CarInventoryService {

    List<CarTypeTotal> query(String name);

    List<CarSupplyNum> queryCarSupplyNum(String id);

    int update(CarTypeRel carTypeRel);

}
