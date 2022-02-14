package com.lanqiao.zyy.service;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopBasestyle;
import org.apache.ibatis.annotations.Param;

/**
 *
 */
public interface IndustrialDevelopBasestyleService  {

    int deleteByPrimaryKey(Integer id,String code);

    int insert(IndustrialDevelopBasestyle record);

    int insertSelective(IndustrialDevelopBasestyle record);

    IndustrialDevelopBasestyle selectByPrimaryKey(Integer id,String code);

    Page<IndustrialDevelopBasestyle> selectBySelective
            (IndustrialDevelopBasestyle baseStyle,
             Integer pageNum,
             Integer pageSize);

    int updateByPrimaryKeySelective(IndustrialDevelopBasestyle record);

    int updateByPrimaryKey(IndustrialDevelopBasestyle record);
}
