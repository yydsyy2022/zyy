package com.lanqiao.zyy.service.impl;

import com.lanqiao.zyy.domain.IndustrialDevelopMedMat;
import com.lanqiao.zyy.mapper.IndustrialDevelopMedMatMapper;
import com.lanqiao.zyy.service.IndustrialDevelopMedMatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopMedMatService")
public class IndustrialDevelopMedMatServiceImpl implements IndustrialDevelopMedMatService {

    @Autowired
    IndustrialDevelopMedMatMapper industrialDevelopMedMatMapper;
    
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.industrialDevelopMedMatMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IndustrialDevelopMedMat record) {
        return this.industrialDevelopMedMatMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopMedMat record) {
        return this.industrialDevelopMedMatMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopMedMat selectByPrimaryKey(Long id) {
        return this.industrialDevelopMedMatMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopMedMat record) {
        return this.industrialDevelopMedMatMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopMedMat record) {
        return this.industrialDevelopMedMatMapper.updateByPrimaryKey(record);
    }
}




