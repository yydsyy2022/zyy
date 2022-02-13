package com.lanqiao.zyy.service.impl;

import com.lanqiao.zyy.domain.IndustrialDevelopSerPro;
import com.lanqiao.zyy.mapper.IndustrialDevelopSerProMapper;
import com.lanqiao.zyy.service.IndustrialDevelopSerProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopSerProService")
public class IndustrialDevelopSerProServiceImpl implements IndustrialDevelopSerProService {

    @Autowired
    IndustrialDevelopSerProMapper industrialDevelopSerProMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.industrialDevelopSerProMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IndustrialDevelopSerPro record) {
        return this.industrialDevelopSerProMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopSerPro record) {
        return this.industrialDevelopSerProMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopSerPro selectByPrimaryKey(Long id) {
        return this.industrialDevelopSerProMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopSerPro record) {
        return this.industrialDevelopSerProMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopSerPro record) {
        return this.industrialDevelopSerProMapper.updateByPrimaryKey(record);
    }
}




