package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.IndustrialDevelopExpert;

/**
 *
 */
public interface IndustrialDevelopExpertService {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopExpert record);

    int insertSelective(IndustrialDevelopExpert record);

    IndustrialDevelopExpert selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopExpert record);

    int updateByPrimaryKey(IndustrialDevelopExpert record);
}
