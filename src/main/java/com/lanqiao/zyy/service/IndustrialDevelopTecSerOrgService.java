package com.lanqiao.zyy.service;


import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopTecSerOrg;



/**
 *
 */
public interface IndustrialDevelopTecSerOrgService  {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopTecSerOrg record);

    int insertSelective(IndustrialDevelopTecSerOrg record);

    IndustrialDevelopTecSerOrg selectByPrimaryKey(Long id);

    Page<IndustrialDevelopTecSerOrg> selectBySelective
            (IndustrialDevelopTecSerOrg tecSerOgr,
             Integer pageNum,
             Integer pageSize);

    int updateByPrimaryKeySelective(IndustrialDevelopTecSerOrg record);

    int updateByPrimaryKey(IndustrialDevelopTecSerOrg record);

}
