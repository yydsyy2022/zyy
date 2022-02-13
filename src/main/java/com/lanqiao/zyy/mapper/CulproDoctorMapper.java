package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.CulproDoctor;

/**
 * @Entity com.lanqiao.zyy.domain.CulproDoctor
 */
public interface CulproDoctorMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproDoctor record);

    int insertSelective(CulproDoctor record);

    CulproDoctor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproDoctor record);

    int updateByPrimaryKey(CulproDoctor record);

}
