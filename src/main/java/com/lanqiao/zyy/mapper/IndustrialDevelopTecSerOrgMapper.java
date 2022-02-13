package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopTecSerOrg;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.lanqiao.zyy.domain.IndustrialDevelopTecSerOrg
 */
@Repository
public interface IndustrialDevelopTecSerOrgMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopTecSerOrg record);

    int insertSelective(IndustrialDevelopTecSerOrg record);

    IndustrialDevelopTecSerOrg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopTecSerOrg record);

    int updateByPrimaryKey(IndustrialDevelopTecSerOrg record);

}
