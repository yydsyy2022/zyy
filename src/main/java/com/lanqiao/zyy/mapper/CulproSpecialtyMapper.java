package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.CulproSpecialty;

/**
 * @Entity com.lanqiao.zyy.domain.CulproSpecialty
 */
public interface CulproSpecialtyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproSpecialty record);

    int insertSelective(CulproSpecialty record);

    CulproSpecialty selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproSpecialty record);

    int updateByPrimaryKey(CulproSpecialty record);

}
