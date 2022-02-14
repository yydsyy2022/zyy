package com.lanqiao.zyy.service.impl;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopChiMed;
import com.lanqiao.zyy.mapper.IndustrialDevelopChiMedMapper;
import com.lanqiao.zyy.service.IndustrialDevelopChiMedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopChiMedService")
public class IndustrialDevelopChiMedServiceImpl implements IndustrialDevelopChiMedService {
    
    @Autowired
    IndustrialDevelopChiMedMapper industrialDevelopChiMedMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.industrialDevelopChiMedMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IndustrialDevelopChiMed record) {
        return this.industrialDevelopChiMedMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopChiMed record) {
        return this.industrialDevelopChiMedMapper.insertSelective(record);
    }


    @Override
    public Page<IndustrialDevelopChiMed> selectBySelective(IndustrialDevelopChiMed chiMed, Integer pageNum, Integer pageSize) {
        return this.industrialDevelopChiMedMapper.selectBySelective(chiMed,pageNum,pageSize);
    }

    @Override
    public IndustrialDevelopChiMed selectByPrimaryKey(Integer id) {
        return this.industrialDevelopChiMedMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopChiMed record) {
        return this.industrialDevelopChiMedMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopChiMed record) {
        return this.industrialDevelopChiMedMapper.updateByPrimaryKey(record);
    }
}




