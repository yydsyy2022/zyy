package com.lanqiao.zyy.service.impl;

import com.lanqiao.zyy.domain.IndustrialDevelopExpertRef;
import com.lanqiao.zyy.mapper.IndustrialDevelopExpertRefMapper;
import com.lanqiao.zyy.service.IndustrialDevelopExpertRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopExpertRefService")
public class IndustrialDevelopExpertRefServiceImpl implements IndustrialDevelopExpertRefService {

    @Autowired
    IndustrialDevelopExpertRefMapper industrialDevelopExpertRefMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.industrialDevelopExpertRefMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IndustrialDevelopExpertRef record) {
        return this.industrialDevelopExpertRefMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopExpertRef record) {
        return this.industrialDevelopExpertRefMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopExpertRef selectByPrimaryKey(Long id) {
        return this.industrialDevelopExpertRefMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopExpertRef record) {
        return this.industrialDevelopExpertRefMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopExpertRef record) {
        return this.industrialDevelopExpertRefMapper.updateByPrimaryKey(record);
    }
}




