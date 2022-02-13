package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.IndustrialDevelopSciAchi;

/**
 *
 */
public interface IndustrialDevelopSciAchiService  {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopSciAchi record);

    int insertSelective(IndustrialDevelopSciAchi record);

    IndustrialDevelopSciAchi selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopSciAchi record);

    int updateByPrimaryKey(IndustrialDevelopSciAchi record);
}
