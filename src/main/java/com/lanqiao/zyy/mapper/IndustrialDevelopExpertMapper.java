package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopExpert;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopExpert
 */
public interface IndustrialDevelopExpertMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopExpert record);

    int insertSelective(IndustrialDevelopExpert record);

    IndustrialDevelopExpert selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopExpert record);

    int updateByPrimaryKey(IndustrialDevelopExpert record);

}
