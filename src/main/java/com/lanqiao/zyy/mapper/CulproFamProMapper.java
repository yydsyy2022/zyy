package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.CulproFamPro;

/**
 * @Entity org.lanqiao.zyysys.domain.CulproFamPro
 */
public interface CulproFamProMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproFamPro record);

    int insertSelective(CulproFamPro record);

    CulproFamPro selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproFamPro record);

    int updateByPrimaryKey(CulproFamPro record);

}
