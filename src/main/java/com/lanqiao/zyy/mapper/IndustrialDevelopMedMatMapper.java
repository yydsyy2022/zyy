package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopMedMat;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.lanqiao.zyy.domain.IndustrialDevelopMedMat
 */
@Repository
public interface IndustrialDevelopMedMatMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopMedMat record);

    int insertSelective(IndustrialDevelopMedMat record);

    IndustrialDevelopMedMat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopMedMat record);

    int updateByPrimaryKey(IndustrialDevelopMedMat record);

}
