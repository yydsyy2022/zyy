package com.lanqiao.zyy.service.impl;

import com.lanqiao.zyy.domain.IndustrialDevelopSaleDrug;
import com.lanqiao.zyy.mapper.IndustrialDevelopSaleDrugMapper;
import com.lanqiao.zyy.service.IndustrialDevelopSaleDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopSaleDrugService")
public class IndustrialDevelopSaleDrugServiceImpl implements IndustrialDevelopSaleDrugService {

    @Autowired
    IndustrialDevelopSaleDrugMapper industrialDevelopSaleDrugMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.industrialDevelopSaleDrugMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IndustrialDevelopSaleDrug record) {
        return this.industrialDevelopSaleDrugMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopSaleDrug record) {
        return this.industrialDevelopSaleDrugMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopSaleDrug selectByPrimaryKey(Long id) {
        return this.industrialDevelopSaleDrugMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopSaleDrug record) {
        return this.industrialDevelopSaleDrugMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopSaleDrug record) {
        return this.industrialDevelopSaleDrugMapper.updateByPrimaryKey(record);
    }
}




