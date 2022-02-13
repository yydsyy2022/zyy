package com.lanqiao.zyy.service.impl;

import com.lanqiao.zyy.domain.IndustrialDevelopCooExc;
import com.lanqiao.zyy.mapper.IndustrialDevelopCooExcMapper;
import com.lanqiao.zyy.service.IndustrialDevelopCooExcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopCooExcService")
public class IndustrialDevelopCooExcServiceImpl implements IndustrialDevelopCooExcService {

    @Autowired
    IndustrialDevelopCooExcMapper industrialDevelopCooExcMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.industrialDevelopCooExcMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IndustrialDevelopCooExc record) {
        return this.industrialDevelopCooExcMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopCooExc record) {
        return this.industrialDevelopCooExcMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopCooExc selectByPrimaryKey(Long id) {
        return this.industrialDevelopCooExcMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopCooExc record) {
        return this.industrialDevelopCooExcMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopCooExc record) {
        return this.industrialDevelopCooExcMapper.updateByPrimaryKeySelective(record);
    }
}




