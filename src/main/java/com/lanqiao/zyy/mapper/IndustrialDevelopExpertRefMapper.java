package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopExpertRef;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopExpertRef
 */
public interface IndustrialDevelopExpertRefMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopExpertRef record);

    int insertSelective(IndustrialDevelopExpertRef record);

    IndustrialDevelopExpertRef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopExpertRef record);

    int updateByPrimaryKey(IndustrialDevelopExpertRef record);

}
