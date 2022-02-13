package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.GovernresAdviceCopy;

/**
 * @Entity com.lanqiao.zyy.domain.GovernresAdviceCopy
 */
public interface GovernresAdviceCopyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresAdviceCopy record);

    int insertSelective(GovernresAdviceCopy record);

    GovernresAdviceCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresAdviceCopy record);

    int updateByPrimaryKey(GovernresAdviceCopy record);

}
