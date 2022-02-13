package com.lanqiao.zyy.service.impl;

import com.lanqiao.zyy.domain.IndustrialDevelopOff;
import com.lanqiao.zyy.mapper.IndustrialDevelopOffMapper;
import com.lanqiao.zyy.service.IndustrialDevelopOffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopOffService")
public class IndustrialDevelopOffServiceImpl implements IndustrialDevelopOffService {

    @Autowired
    IndustrialDevelopOffMapper industrialDevelopOffMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.industrialDevelopOffMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IndustrialDevelopOff record) {
        return this.industrialDevelopOffMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopOff record) {
        return this.industrialDevelopOffMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopOff selectByPrimaryKey(Long id) {
        return this.industrialDevelopOffMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopOff record) {
        return this.industrialDevelopOffMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopOff record) {
        return this.industrialDevelopOffMapper.updateByPrimaryKey(record);
    }
}




