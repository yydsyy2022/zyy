package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopExpertRef;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.lanqiao.zyy.domain.IndustrialDevelopExpertRef
 */
@Repository
public interface IndustrialDevelopExpertRefMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopExpertRef record);

    int insertSelective(IndustrialDevelopExpertRef record);

    IndustrialDevelopExpertRef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopExpertRef record);

    int updateByPrimaryKey(IndustrialDevelopExpertRef record);

}
