package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.GovernresCountersignCopy;

/**
 * @Entity com.lanqiao.zyy.domain.GovernresCountersignCopy
 */
public interface GovernresCountersignCopyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresCountersignCopy record);

    int insertSelective(GovernresCountersignCopy record);

    GovernresCountersignCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresCountersignCopy record);

    int updateByPrimaryKey(GovernresCountersignCopy record);

}
