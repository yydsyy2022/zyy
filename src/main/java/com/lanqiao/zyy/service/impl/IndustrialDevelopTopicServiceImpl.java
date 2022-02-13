package com.lanqiao.zyy.service.impl;

import com.lanqiao.zyy.domain.IndustrialDevelopTopic;
import com.lanqiao.zyy.mapper.IndustrialDevelopTopicMapper;
import com.lanqiao.zyy.service.IndustrialDevelopTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopTopicService")
public class IndustrialDevelopTopicServiceImpl implements IndustrialDevelopTopicService {

    @Autowired
    IndustrialDevelopTopicMapper industrialDevelopTopicMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.industrialDevelopTopicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IndustrialDevelopTopic record) {
        return this.industrialDevelopTopicMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopTopic record) {
        return this.industrialDevelopTopicMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopTopic selectByPrimaryKey(Long id) {
        return this.industrialDevelopTopicMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopTopic record) {
        return this.industrialDevelopTopicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopTopic record) {
        return this.industrialDevelopTopicMapper.updateByPrimaryKey(record);
    }
}




