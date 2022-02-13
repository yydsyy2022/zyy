package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.CulproHosp;

import java.util.List;

/**
 * @Entity org.lanqiao.zyysys.domain.CulproHosp
 */
public interface CulproHospMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CulproHosp record);

    int insertSelective(CulproHosp record);

    CulproHosp selectByPrimaryKey(Integer id);

    List<CulproHosp> selectBySelective(CulproHosp record);

    int updateByPrimaryKeySelective(CulproHosp record);

    int updateByPrimaryKey(CulproHosp record);

}
