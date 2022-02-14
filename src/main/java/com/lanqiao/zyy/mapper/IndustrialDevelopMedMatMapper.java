package com.lanqiao.zyy.mapper;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopMedMat;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.lanqiao.zyy.domain.IndustrialDevelopMedMat
 */
@Repository
public interface IndustrialDevelopMedMatMapper {

    int deleteByPrimaryKey(Integer id,String code);

    int insert(IndustrialDevelopMedMat record);

    int insertSelective(IndustrialDevelopMedMat record);

    IndustrialDevelopMedMat selectByPrimaryKey(Integer id,String code);

    Page<IndustrialDevelopMedMat> selectBySelective
            (@Param("medMat") IndustrialDevelopMedMat medMat,
             @Param("pageNum") Integer pageNum,
             @Param("pageSize") Integer pageSize);

    int updateByPrimaryKeySelective(IndustrialDevelopMedMat record);

    int updateByPrimaryKey(IndustrialDevelopMedMat record);

}
