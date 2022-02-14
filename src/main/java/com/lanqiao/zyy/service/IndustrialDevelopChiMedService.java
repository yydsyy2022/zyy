package com.lanqiao.zyy.service;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopChiMed;
import org.apache.ibatis.annotations.Param;

/**
 *
 */
public interface IndustrialDevelopChiMedService  {

    int deleteByPrimaryKey(Integer id);

    int insert(IndustrialDevelopChiMed record);

    int insertSelective(IndustrialDevelopChiMed record);

    IndustrialDevelopChiMed selectByPrimaryKey(Integer id);

    Page<IndustrialDevelopChiMed> selectBySelective
            (IndustrialDevelopChiMed chiMed,
             Integer pageNum,
             Integer pageSize);

    int updateByPrimaryKeySelective(IndustrialDevelopChiMed record);

    int updateByPrimaryKey(IndustrialDevelopChiMed record);
}
