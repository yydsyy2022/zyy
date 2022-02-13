package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.GovernresPostRef;

/**
 * @Entity com.lanqiao.zyy.domain.GovernresPostRef
 */
public interface GovernresPostRefMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresPostRef record);

    int insertSelective(GovernresPostRef record);

    GovernresPostRef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresPostRef record);

    int updateByPrimaryKey(GovernresPostRef record);

}
