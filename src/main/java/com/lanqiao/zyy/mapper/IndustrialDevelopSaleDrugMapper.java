package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopSaleDrug;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.lanqiao.zyy.domain.IndustrialDevelopSaleDrug
 */
@Repository
public interface IndustrialDevelopSaleDrugMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopSaleDrug record);

    int insertSelective(IndustrialDevelopSaleDrug record);

    IndustrialDevelopSaleDrug selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopSaleDrug record);

    int updateByPrimaryKey(IndustrialDevelopSaleDrug record);

}
