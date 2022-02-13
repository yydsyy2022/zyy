package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.HealthCareChineseMedicine;

/**
 * @Entity com.lanqiao.zyy.domain.HealthCareChineseMedicine
 */
public interface HealthCareChineseMedicineMapper {

    int deleteByPrimaryKey(Long id);

    int insert(HealthCareChineseMedicine record);

    int insertSelective(HealthCareChineseMedicine record);

    HealthCareChineseMedicine selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HealthCareChineseMedicine record);

    int updateByPrimaryKey(HealthCareChineseMedicine record);

}
