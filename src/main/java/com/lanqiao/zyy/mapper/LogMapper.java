package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.Log;

/**
 * @Entity com.lanqiao.zyy.domain.Log
 */
public interface LogMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Log record);

    int insertSelective(Log record);

    Log selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);

}
