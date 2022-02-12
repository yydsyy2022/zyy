package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopBasestyle;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopBasestyle
 */
public interface IndustrialDevelopBasestyleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopBasestyle record);

    int insertSelective(IndustrialDevelopBasestyle record);

    IndustrialDevelopBasestyle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopBasestyle record);

    int updateByPrimaryKey(IndustrialDevelopBasestyle record);

}
