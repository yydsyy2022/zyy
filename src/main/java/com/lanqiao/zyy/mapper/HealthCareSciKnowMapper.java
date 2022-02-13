package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.HealthCareSciKnow;

/**
 * @Entity com.lanqiao.zyy.domain.HealthCareSciKnow
 */
public interface HealthCareSciKnowMapper {

    int deleteByPrimaryKey(Long id);

    int insert(HealthCareSciKnow record);

    int insertSelective(HealthCareSciKnow record);

    HealthCareSciKnow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HealthCareSciKnow record);

    int updateByPrimaryKey(HealthCareSciKnow record);

}
