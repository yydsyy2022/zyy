package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopOff;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopOff
 */
public interface IndustrialDevelopOffMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopOff record);

    int insertSelective(IndustrialDevelopOff record);

    IndustrialDevelopOff selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopOff record);

    int updateByPrimaryKey(IndustrialDevelopOff record);

}
