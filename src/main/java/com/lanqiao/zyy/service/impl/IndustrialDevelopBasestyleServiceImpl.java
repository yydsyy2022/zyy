package com.lanqiao.zyy.service.impl;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopBasestyle;
import com.lanqiao.zyy.mapper.IndustrialDevelopBasestyleMapper;
import com.lanqiao.zyy.service.IndustrialDevelopBasestyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopBasestyleService")
public class IndustrialDevelopBasestyleServiceImpl implements IndustrialDevelopBasestyleService {

    @Autowired
    IndustrialDevelopBasestyleMapper industrialDevelopBasestyleMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.industrialDevelopBasestyleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IndustrialDevelopBasestyle record) {
        return this.industrialDevelopBasestyleMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopBasestyle record) {
        return this.industrialDevelopBasestyleMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopBasestyle selectByPrimaryKey(Integer id,String code) {
        return this.industrialDevelopBasestyleMapper.selectByPrimaryKey(id,code);
    }

    @Override
    public Page<IndustrialDevelopBasestyle> selectBySelective(IndustrialDevelopBasestyle baseStyle, Integer pageNum, Integer pageSize) {
        return this.industrialDevelopBasestyleMapper.selectBySelective(baseStyle,pageNum,pageSize);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopBasestyle record) {
        return this.industrialDevelopBasestyleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopBasestyle record) {
        return this.industrialDevelopBasestyleMapper.updateByPrimaryKey(record);
    }
}




