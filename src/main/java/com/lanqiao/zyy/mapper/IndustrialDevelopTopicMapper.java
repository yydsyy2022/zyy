package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopTopic;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopTopic
 */
public interface IndustrialDevelopTopicMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopTopic record);

    int insertSelective(IndustrialDevelopTopic record);

    IndustrialDevelopTopic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopTopic record);

    int updateByPrimaryKey(IndustrialDevelopTopic record);

}
