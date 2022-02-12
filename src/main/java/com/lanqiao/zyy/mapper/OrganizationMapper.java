package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.Organization;

/**
 * @Entity org.lanqiao.zyysys.domain.Organization
 */
public interface OrganizationMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Organization record);

    int insertSelective(Organization record);

    Organization selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);

}
