package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.IndustrialDevelopSchool;

/**
 *
 */
public interface IndustrialDevelopSchoolService  {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopSchool record);

    int insertSelective(IndustrialDevelopSchool record);

    IndustrialDevelopSchool selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopSchool record);

    int updateByPrimaryKey(IndustrialDevelopSchool record);
}
