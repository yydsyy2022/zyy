package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopMedMat;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopMedMat
 */
public interface IndustrialDevelopMedMatMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopMedMat record);

    int insertSelective(IndustrialDevelopMedMat record);

    IndustrialDevelopMedMat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopMedMat record);

    int updateByPrimaryKey(IndustrialDevelopMedMat record);

}
