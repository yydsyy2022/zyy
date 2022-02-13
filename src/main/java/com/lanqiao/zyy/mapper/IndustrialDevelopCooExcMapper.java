package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopCooExc;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.lanqiao.zyy.domain.IndustrialDevelopCooExc
 */
@Repository
public interface IndustrialDevelopCooExcMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopCooExc record);

    int insertSelective(IndustrialDevelopCooExc record);

    IndustrialDevelopCooExc selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopCooExc record);

    int updateByPrimaryKey(IndustrialDevelopCooExc record);

}
