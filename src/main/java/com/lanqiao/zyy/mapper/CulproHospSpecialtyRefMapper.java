package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.CulproHospSpecialtyRef;

/**
 * @Entity com.lanqiao.zyy.domain.CulproHospSpecialtyRef
 */
public interface CulproHospSpecialtyRefMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproHospSpecialtyRef record);

    int insertSelective(CulproHospSpecialtyRef record);

    CulproHospSpecialtyRef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproHospSpecialtyRef record);

    int updateByPrimaryKey(CulproHospSpecialtyRef record);

}
