package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.GovernresPost;

/**
 * @Entity com.lanqiao.zyy.domain.GovernresPost
 */
public interface GovernresPostMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresPost record);

    int insertSelective(GovernresPost record);

    GovernresPost selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresPost record);

    int updateByPrimaryKey(GovernresPost record);

}
