package com.lanqiao.zyy.service.impl;

import com.lanqiao.zyy.domain.IndustrialDevelopTalRec;
import com.lanqiao.zyy.mapper.IndustrialDevelopTalRecMapper;
import com.lanqiao.zyy.service.IndustrialDevelopTalRecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("industrialDevelopTalRecService")
public class IndustrialDevelopTalRecServiceImpl  implements IndustrialDevelopTalRecService {

    @Autowired
    IndustrialDevelopTalRecMapper industrialDevelopTalRecMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.industrialDevelopTalRecMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IndustrialDevelopTalRec record) {
        return this.industrialDevelopTalRecMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopTalRec record) {
        return this.industrialDevelopTalRecMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopTalRec selectByPrimaryKey(Long id) {
        return this.industrialDevelopTalRecMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopTalRec record) {
        return this.industrialDevelopTalRecMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopTalRec record) {
        return this.industrialDevelopTalRecMapper.updateByPrimaryKey(record);
    }
}




