package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.IndustrialDevelopMedMat;

/**
 *
 */
public interface IndustrialDevelopMedMatService {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopMedMat record);

    int insertSelective(IndustrialDevelopMedMat record);

    IndustrialDevelopMedMat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopMedMat record);

    int updateByPrimaryKey(IndustrialDevelopMedMat record);

}
