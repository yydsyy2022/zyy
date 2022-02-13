package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.IndustrialDevelopChiMed;

/**
 *
 */
public interface IndustrialDevelopChiMedService  {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopChiMed record);

    int insertSelective(IndustrialDevelopChiMed record);

    IndustrialDevelopChiMed selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopChiMed record);

    int updateByPrimaryKey(IndustrialDevelopChiMed record);
}
