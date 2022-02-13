package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.CulproPreTre;

/**
 * @Entity com.lanqiao.zyy.domain.CulproPreTre
 */
public interface CulproPreTreMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproPreTre record);

    int insertSelective(CulproPreTre record);

    CulproPreTre selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproPreTre record);

    int updateByPrimaryKey(CulproPreTre record);

}
