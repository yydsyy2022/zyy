package com.lanqiao.zyy.service.impl;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopTecSerOrg;
import com.lanqiao.zyy.mapper.IndustrialDevelopTecSerOrgMapper;
import com.lanqiao.zyy.service.IndustrialDevelopTecSerOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopTecSerOrgService")
public class IndustrialDevelopTecSerOrgServiceImpl implements IndustrialDevelopTecSerOrgService {

    @Autowired
    IndustrialDevelopTecSerOrgMapper industrialDevelopTecSerOrgMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id,String code) {
        return this.industrialDevelopTecSerOrgMapper.deleteByPrimaryKey(id,code);
    }

    @Override
    public int insert(IndustrialDevelopTecSerOrg record) {
        return this.industrialDevelopTecSerOrgMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopTecSerOrg record) {
        return this.industrialDevelopTecSerOrgMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopTecSerOrg selectByPrimaryKey(Integer id,String code) {
        return this.industrialDevelopTecSerOrgMapper.selectByPrimaryKey(id,code);
    }

    @Override
    public Page<IndustrialDevelopTecSerOrg> selectBySelective(IndustrialDevelopTecSerOrg tecSerOgr, Integer pageNum, Integer pageSize) {
        return this.industrialDevelopTecSerOrgMapper.selectBySelective(tecSerOgr,pageNum,pageSize);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopTecSerOrg record) {
        return this.industrialDevelopTecSerOrgMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopTecSerOrg record) {
        return this.industrialDevelopTecSerOrgMapper.updateByPrimaryKey(record);
    }
}




