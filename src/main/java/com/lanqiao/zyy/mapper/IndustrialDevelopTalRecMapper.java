package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopTalRec;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopTalRec
 */
public interface IndustrialDevelopTalRecMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopTalRec record);

    int insertSelective(IndustrialDevelopTalRec record);

    IndustrialDevelopTalRec selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopTalRec record);

    int updateByPrimaryKey(IndustrialDevelopTalRec record);

}
