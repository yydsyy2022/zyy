package com.lanqiao.zyy.service.impl;

import com.lanqiao.zyy.domain.IndustrialDevelopSciAchi;
import com.lanqiao.zyy.mapper.IndustrialDevelopSciAchiMapper;
import com.lanqiao.zyy.service.IndustrialDevelopSciAchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopSciAchiService")
public class IndustrialDevelopSciAchiServiceImpl implements IndustrialDevelopSciAchiService {

    @Autowired
    IndustrialDevelopSciAchiMapper industrialDevelopSciAchiMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.industrialDevelopSciAchiMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IndustrialDevelopSciAchi record) {
        return this.industrialDevelopSciAchiMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopSciAchi record) {
        return this.industrialDevelopSciAchiMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopSciAchi selectByPrimaryKey(Long id) {
        return this.industrialDevelopSciAchiMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopSciAchi record) {
        return this.industrialDevelopSciAchiMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopSciAchi record) {
        return this.industrialDevelopSciAchiMapper.updateByPrimaryKey(record);
    }
}




