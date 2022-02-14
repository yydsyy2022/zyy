package com.lanqiao.zyy.service;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopMedMat;
import org.apache.ibatis.annotations.Param;

/**
 *
 */
public interface IndustrialDevelopMedMatService {

    int deleteByPrimaryKey(Integer id,String code);

    int insert(IndustrialDevelopMedMat record);

    int insertSelective(IndustrialDevelopMedMat record);

    IndustrialDevelopMedMat selectByPrimaryKey(Integer id,String code);

    Page<IndustrialDevelopMedMat> selectBySelective
            (IndustrialDevelopMedMat medMat,
             Integer pageNum,
             Integer pageSize);

    int updateByPrimaryKeySelective(IndustrialDevelopMedMat record);

    int updateByPrimaryKey(IndustrialDevelopMedMat record);

}
