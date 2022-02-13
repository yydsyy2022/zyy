package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.CulproFile;

/**
 * @Entity com.lanqiao.zyy.domain.CulproFile
 */
public interface CulproFileMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproFile record);

    int insertSelective(CulproFile record);

    CulproFile selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproFile record);

    int updateByPrimaryKey(CulproFile record);

}
