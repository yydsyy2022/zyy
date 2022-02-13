package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopSchool;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.lanqiao.zyy.domain.IndustrialDevelopSchool
 */
@Repository
public interface IndustrialDevelopSchoolMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopSchool record);

    int insertSelective(IndustrialDevelopSchool record);

    IndustrialDevelopSchool selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopSchool record);

    int updateByPrimaryKey(IndustrialDevelopSchool record);

}
