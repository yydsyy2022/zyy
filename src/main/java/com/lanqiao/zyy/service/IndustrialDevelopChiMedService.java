package com.lanqiao.zyy.service;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopChiMed;
import org.apache.ibatis.annotations.Param;

/**
 *
 */
public interface IndustrialDevelopChiMedService  {

    int deleteByPrimaryKey(Integer id,String code);

    int insert(IndustrialDevelopChiMed record);

    int insertSelective(IndustrialDevelopChiMed record);

    IndustrialDevelopChiMed selectByPrimaryKey(Integer id,String code);

    Page<IndustrialDevelopChiMed> selectBySelective
            (IndustrialDevelopChiMed chiMed,
             Integer pageNum,
             Integer pageSize);

    int updateByPrimaryKeySelective(IndustrialDevelopChiMed record);

    int updateByPrimaryKey(IndustrialDevelopChiMed record);
}
