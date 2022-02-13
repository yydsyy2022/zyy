package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.IndustrialDevelopExpertRef;

/**
 *
 */
public interface IndustrialDevelopExpertRefService  {



    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopExpertRef record);

    int insertSelective(IndustrialDevelopExpertRef record);

    IndustrialDevelopExpertRef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopExpertRef record);

    int updateByPrimaryKey(IndustrialDevelopExpertRef record);
}
