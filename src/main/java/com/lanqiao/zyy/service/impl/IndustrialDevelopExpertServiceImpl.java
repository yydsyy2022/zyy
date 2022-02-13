package com.lanqiao.zyy.service.impl;

import com.lanqiao.zyy.domain.IndustrialDevelopExpert;
import com.lanqiao.zyy.mapper.IndustrialDevelopExpertMapper;
import com.lanqiao.zyy.service.IndustrialDevelopExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopExpertService")
public class IndustrialDevelopExpertServiceImpl implements IndustrialDevelopExpertService {

    @Autowired
    IndustrialDevelopExpertMapper industrialDevelopExpertMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.industrialDevelopExpertMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IndustrialDevelopExpert record) {
        return this.industrialDevelopExpertMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopExpert record) {
        return this.industrialDevelopExpertMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopExpert selectByPrimaryKey(Long id) {
        return this.industrialDevelopExpertMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopExpert record) {
        return this.industrialDevelopExpertMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopExpert record) {
        return this.industrialDevelopExpertMapper.updateByPrimaryKey(record);
    }
}




