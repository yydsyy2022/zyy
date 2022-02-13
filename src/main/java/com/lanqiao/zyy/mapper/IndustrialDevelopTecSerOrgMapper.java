package com.lanqiao.zyy.mapper;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopTecSerOrg;
import org.apache.ibatis.annotations.Param;
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

    Page<IndustrialDevelopTecSerOrg> selectBySelective
            (@Param("tecSerOgr") IndustrialDevelopTecSerOrg tecSerOgr,
             @Param("pageNum") Integer pageNum,
             @Param("pageSize") Integer pageSize);

    int updateByPrimaryKeySelective(IndustrialDevelopTecSerOrg record);

    int updateByPrimaryKey(IndustrialDevelopTecSerOrg record);

}
