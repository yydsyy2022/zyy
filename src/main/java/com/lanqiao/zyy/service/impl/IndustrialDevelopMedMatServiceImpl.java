package com.lanqiao.zyy.service.impl;

import com.github.pagehelper.Page;
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
    public int deleteByPrimaryKey(Integer id,String code) {
        return this.industrialDevelopMedMatMapper.deleteByPrimaryKey(id,code);
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
    public IndustrialDevelopMedMat selectByPrimaryKey(Integer id,String code) {
        return this.industrialDevelopMedMatMapper.selectByPrimaryKey(id,code);
    }

    @Override
    public Page<IndustrialDevelopMedMat> selectBySelective(IndustrialDevelopMedMat medMat, Integer pageNum, Integer pageSize) {
        return null;
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




