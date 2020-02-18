package com.zhweb.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.common.exception.BaseException;
import com.google.common.collect.Lists;
import com.zhweb.entity.RO.CarSupplyConReq;
import com.zhweb.entity.RO.CarSupplyReq;
import com.zhweb.entity.RO.UserInfoConReq;
import com.zhweb.entity.RO.UserInfoReq;
import com.zhweb.entity.*;
import com.zhweb.mapper.CarSupplyMapper;
import com.zhweb.mapper.RoleInfoMapper;
import com.zhweb.mapper.UserInfoMapper;
import com.zhweb.mapper.UserInfoMoreMapper;
import com.zhweb.service.CarSupplyService;
import com.zhweb.service.UserInfoService;
import com.zhweb.util.MD5Util;
import com.zhweb.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
public class CarSupplyServiceImpl implements CarSupplyService {

    @Autowired
    private CarSupplyMapper carSupplyMapper;

    @Override
    public List<CarSupply> query(CarSupplyConReq carSupplyConReq) {
        return carSupplyMapper.queryCarSupply(carSupplyConReq);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int add(CarSupplyReq carSupply) {
        String id = UUIDUtils.creatUUID();
        carSupply.setId(id);
        List<CarTypeRel> carTypeNums = carSupply.getCarTypeNums();
        for (CarTypeRel carTypeNum : carTypeNums) {
            carTypeNum.setId(UUIDUtils.creatUUID());
            carTypeNum.setSupplyId(id);
        }
        carSupplyMapper.addTypeNumBatch(carTypeNums);
        return carSupplyMapper.addCarSupply(carSupply);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(CarSupplyReq carSupply) {
        String id = carSupply.getId();
        carSupplyMapper.deleteTypeNumRel(id);
        List<CarTypeRel> carTypeNums = carSupply.getCarTypeNums();
        for (CarTypeRel carTypeNum : carTypeNums) {
            carTypeNum.setId(UUIDUtils.creatUUID());
            carTypeNum.setSupplyId(id);
        }
        carSupplyMapper.addTypeNumBatch(carTypeNums);
        return carSupplyMapper.updateCarSupply(carSupply);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteBatch(List<String> list) {
        return carSupplyMapper.deleteCarSupply(list);
    }

    @Override
    public List<CarType> queryCarType() {
        return carSupplyMapper.queryCarType();
    }

    @Override
    public List<CarTypeRel> queryTypeNum(String id) {
        return carSupplyMapper.queryTypeNum(id);
    }
}
