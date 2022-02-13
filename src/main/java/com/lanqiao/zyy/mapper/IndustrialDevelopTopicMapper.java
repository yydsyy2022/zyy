package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopTopic;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.lanqiao.zyy.domain.IndustrialDevelopTopic
 */
@Repository
public interface IndustrialDevelopTopicMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopTopic record);

    int insertSelective(IndustrialDevelopTopic record);

    IndustrialDevelopTopic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopTopic record);

    int updateByPrimaryKey(IndustrialDevelopTopic record);

}
