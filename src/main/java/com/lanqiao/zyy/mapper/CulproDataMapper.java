package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.CulproData;

/**
 * @Entity org.lanqiao.zyysys.domain.CulproData
 */
public interface CulproDataMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproData record);

    int insertSelective(CulproData record);

    CulproData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproData record);

    int updateByPrimaryKey(CulproData record);

}
