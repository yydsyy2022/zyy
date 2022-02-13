package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.IndustrialDevelopCooExc;

/**
 *
 */
public interface IndustrialDevelopCooExcService {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopCooExc record);

    int insertSelective(IndustrialDevelopCooExc record);

    IndustrialDevelopCooExc selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopCooExc record);

    int updateByPrimaryKey(IndustrialDevelopCooExc record);
}
