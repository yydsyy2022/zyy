package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.IndustrialDevelopOff;

/**
 *
 */
public interface IndustrialDevelopOffService  {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopOff record);

    int insertSelective(IndustrialDevelopOff record);

    IndustrialDevelopOff selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopOff record);

    int updateByPrimaryKey(IndustrialDevelopOff record);
}
