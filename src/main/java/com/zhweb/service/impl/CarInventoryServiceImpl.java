package com.zhweb.service.impl;

import com.zhweb.entity.*;
import com.zhweb.entity.RO.CarSupplyConReq;
import com.zhweb.entity.RO.CarSupplyReq;
import com.zhweb.mapper.CarInventoryMapper;
import com.zhweb.mapper.CarSupplyMapper;
import com.zhweb.service.CarInventoryService;
import com.zhweb.service.CarSupplyService;
import com.zhweb.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
@Service
public class CarInventoryServiceImpl implements CarInventoryService {

    @Autowired
    private CarInventoryMapper carInventoryMapper;


    @Override
    public List<CarTypeTotal> query(String name) {
        return carInventoryMapper.queryTotal(name);
    }

    @Override
    public List<CarSupplyNum> queryCarSupplyNum(String id) {
        return carInventoryMapper.queryCarSupplyNum(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(CarTypeRel carTypeRel) {
        return carInventoryMapper.update(carTypeRel);
    }
}
