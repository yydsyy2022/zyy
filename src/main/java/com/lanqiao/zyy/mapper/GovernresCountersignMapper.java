package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.GovernresCountersign;

/**
 * @Entity com.lanqiao.zyy.domain.GovernresCountersign
 */
public interface GovernresCountersignMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresCountersign record);

    int insertSelective(GovernresCountersign record);

    GovernresCountersign selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresCountersign record);

    int updateByPrimaryKey(GovernresCountersign record);

}
