package com.lanqiao.zyy.mapper;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopBasestyle;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.lanqiao.zyy.domain.IndustrialDevelopBasestyle
 */
@Repository
public interface IndustrialDevelopBasestyleMapper {

    int deleteByPrimaryKey(Integer id,String code);

    int insert(IndustrialDevelopBasestyle record);

    int insertSelective(IndustrialDevelopBasestyle record);

    IndustrialDevelopBasestyle selectByPrimaryKey(Integer id,String code);

    Page<IndustrialDevelopBasestyle> selectBySelective
            (@Param("baseStyle") IndustrialDevelopBasestyle baseStyle,
             @Param("pageNum") Integer pageNum,
             @Param("pageSize") Integer pageSize);

    int updateByPrimaryKeySelective(IndustrialDevelopBasestyle record);

    int updateByPrimaryKey(IndustrialDevelopBasestyle record);

}
