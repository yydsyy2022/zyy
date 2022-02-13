package com.lanqiao.zyy.service;

import com.lanqiao.zyy.domain.IndustrialDevelopTopic;

/**
 *
 */
public interface IndustrialDevelopTopicService  {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopTopic record);

    int insertSelective(IndustrialDevelopTopic record);

    IndustrialDevelopTopic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopTopic record);

    int updateByPrimaryKey(IndustrialDevelopTopic record);
}
