package com.lanqiao.zyy.mapper;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopChiMed;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.lanqiao.zyy.domain.IndustrialDevelopChiMed
 */
@Repository
public interface IndustrialDevelopChiMedMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(IndustrialDevelopChiMed record);

    int insertSelective(IndustrialDevelopChiMed record);

    IndustrialDevelopChiMed selectByPrimaryKey(Integer id);

    Page<IndustrialDevelopChiMed> selectBySelective
            (@Param("chiMed") IndustrialDevelopChiMed chiMed,
             @Param("pageNum") Integer pageNum,
             @Param("pageSize") Integer pageSize);

    int updateByPrimaryKeySelective(IndustrialDevelopChiMed record);

    int updateByPrimaryKey(IndustrialDevelopChiMed record);

}
