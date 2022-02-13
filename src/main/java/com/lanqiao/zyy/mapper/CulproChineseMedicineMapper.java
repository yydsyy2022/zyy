package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.CulproChineseMedicine;

/**
 * @Entity com.lanqiao.zyy.domain.CulproChineseMedicine
 */
public interface CulproChineseMedicineMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproChineseMedicine record);

    int insertSelective(CulproChineseMedicine record);

    CulproChineseMedicine selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproChineseMedicine record);

    int updateByPrimaryKey(CulproChineseMedicine record);

}
