package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.GovernresRequestReport;

/**
 * @Entity com.lanqiao.zyy.domain.GovernresRequestReport
 */
public interface GovernresRequestReportMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresRequestReport record);

    int insertSelective(GovernresRequestReport record);

    GovernresRequestReport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresRequestReport record);

    int updateByPrimaryKey(GovernresRequestReport record);

}
