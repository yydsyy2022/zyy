package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.CulproFamPre;

/**
 * @Entity org.lanqiao.zyysys.domain.CulproFamPre
 */
public interface CulproFamPreMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproFamPre record);

    int insertSelective(CulproFamPre record);

    CulproFamPre selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproFamPre record);

    int updateByPrimaryKey(CulproFamPre record);

}
