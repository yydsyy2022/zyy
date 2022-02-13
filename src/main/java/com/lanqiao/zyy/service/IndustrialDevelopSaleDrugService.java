package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.IndustrialDevelopSaleDrug;

/**
 *
 */
public interface IndustrialDevelopSaleDrugService {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopSaleDrug record);

    int insertSelective(IndustrialDevelopSaleDrug record);

    IndustrialDevelopSaleDrug selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopSaleDrug record);

    int updateByPrimaryKey(IndustrialDevelopSaleDrug record);
}
