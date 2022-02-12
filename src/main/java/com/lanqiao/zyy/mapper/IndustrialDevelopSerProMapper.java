package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopSerPro;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopSerPro
 */
public interface IndustrialDevelopSerProMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopSerPro record);

    int insertSelective(IndustrialDevelopSerPro record);

    IndustrialDevelopSerPro selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopSerPro record);

    int updateByPrimaryKey(IndustrialDevelopSerPro record);

}
