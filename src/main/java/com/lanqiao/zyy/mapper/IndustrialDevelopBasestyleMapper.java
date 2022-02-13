package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopBasestyle;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.lanqiao.zyy.domain.IndustrialDevelopBasestyle
 */
@Repository
public interface IndustrialDevelopBasestyleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopBasestyle record);

    int insertSelective(IndustrialDevelopBasestyle record);

    IndustrialDevelopBasestyle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopBasestyle record);

    int updateByPrimaryKey(IndustrialDevelopBasestyle record);

}
