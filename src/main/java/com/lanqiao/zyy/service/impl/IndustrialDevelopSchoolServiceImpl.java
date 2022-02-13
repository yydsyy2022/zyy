package com.lanqiao.zyy.service.impl;

import com.lanqiao.zyy.domain.IndustrialDevelopSchool;
import com.lanqiao.zyy.mapper.IndustrialDevelopSchoolMapper;
import com.lanqiao.zyy.service.IndustrialDevelopSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopSchoolService")
public class IndustrialDevelopSchoolServiceImpl  implements IndustrialDevelopSchoolService {

    @Autowired
    IndustrialDevelopSchoolMapper industrialDevelopSchoolMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.industrialDevelopSchoolMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IndustrialDevelopSchool record) {
        return this.industrialDevelopSchoolMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopSchool record) {
        return this.industrialDevelopSchoolMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopSchool selectByPrimaryKey(Long id) {
        return this.industrialDevelopSchoolMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopSchool record) {
        return this.industrialDevelopSchoolMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopSchool record) {
        return this.industrialDevelopSchoolMapper.updateByPrimaryKey(record);
    }
}




