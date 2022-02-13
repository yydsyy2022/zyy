package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.IndustrialDevelopTalRec;

/**
 *
 */
public interface IndustrialDevelopTalRecService {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopTalRec record);

    int insertSelective(IndustrialDevelopTalRec record);

    IndustrialDevelopTalRec selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopTalRec record);

    int updateByPrimaryKey(IndustrialDevelopTalRec record);

}
