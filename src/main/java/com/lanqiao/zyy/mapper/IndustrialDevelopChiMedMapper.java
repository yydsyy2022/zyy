package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopChiMed;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.lanqiao.zyy.domain.IndustrialDevelopChiMed
 */
@Repository
public interface IndustrialDevelopChiMedMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopChiMed record);

    int insertSelective(IndustrialDevelopChiMed record);

    IndustrialDevelopChiMed selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopChiMed record);

    int updateByPrimaryKey(IndustrialDevelopChiMed record);

}
