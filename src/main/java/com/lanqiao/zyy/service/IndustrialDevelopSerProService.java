package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.IndustrialDevelopSerPro;

/**
 *
 */
public interface IndustrialDevelopSerProService  {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopSerPro record);

    int insertSelective(IndustrialDevelopSerPro record);

    IndustrialDevelopSerPro selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopSerPro record);

    int updateByPrimaryKey(IndustrialDevelopSerPro record);
}
