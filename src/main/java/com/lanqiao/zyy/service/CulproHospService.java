package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.CulproHosp;

import java.util.List;

/**
 *
 */
public interface CulproHospService  {
    int deleteByPrimaryKey(Integer id);

    int insert(CulproHosp record);

    int insertSelective(CulproHosp record);

    CulproHosp selectByPrimaryKey(Integer id);

    List<CulproHosp> selectBySelective(CulproHosp record);

    int updateByPrimaryKeySelective(CulproHosp record);

    int updateByPrimaryKey(CulproHosp record);


}
