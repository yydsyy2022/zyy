package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.IndustrialDevelopBasestyle;

/**
 *
 */
public interface IndustrialDevelopBasestyleService  {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopBasestyle record);

    int insertSelective(IndustrialDevelopBasestyle record);

    IndustrialDevelopBasestyle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopBasestyle record);

    int updateByPrimaryKey(IndustrialDevelopBasestyle record);
}
