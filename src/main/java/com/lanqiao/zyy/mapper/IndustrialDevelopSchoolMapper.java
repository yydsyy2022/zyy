package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopSchool;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopSchool
 */
public interface IndustrialDevelopSchoolMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopSchool record);

    int insertSelective(IndustrialDevelopSchool record);

    IndustrialDevelopSchool selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopSchool record);

    int updateByPrimaryKey(IndustrialDevelopSchool record);

}
