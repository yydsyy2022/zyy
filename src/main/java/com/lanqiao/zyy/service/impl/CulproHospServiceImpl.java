package com.lanqiao.zyy.service.impl;

import com.lanqiao.zyy.domain.CulproHosp;
import com.lanqiao.zyy.mapper.CulproHospMapper;
import com.lanqiao.zyy.service.CulproHospService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service("culproHospService")
public class CulproHospServiceImpl  implements CulproHospService {

    @Autowired
    CulproHospMapper culproHospMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return culproHospMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CulproHosp record) {
        return culproHospMapper.insert(record);
    }

    @Override
    public int insertSelective(CulproHosp record) {
        return culproHospMapper.insertSelective(record);
    }

    @Override
    public CulproHosp selectByPrimaryKey(Integer id) {
        return culproHospMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CulproHosp> selectBySelective(CulproHosp record) {
        return culproHospMapper.selectBySelective(record);
    }


    @Override
    public int updateByPrimaryKeySelective(CulproHosp record) {
        return culproHospMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKey(CulproHosp record) {
        return culproHospMapper.updateByPrimaryKeySelective(record);
    }
}




