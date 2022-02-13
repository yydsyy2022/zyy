package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.HealthCareFamPre;

/**
 * @Entity com.lanqiao.zyy.domain.HealthCareFamPre
 */
public interface HealthCareFamPreMapper {

    int deleteByPrimaryKey(Long id);

    int insert(HealthCareFamPre record);

    int insertSelective(HealthCareFamPre record);

    HealthCareFamPre selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HealthCareFamPre record);

    int updateByPrimaryKey(HealthCareFamPre record);

}
