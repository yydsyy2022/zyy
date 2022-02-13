package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.CulproCulturalResources;

/**
 * @Entity com.lanqiao.zyy.domain.CulproCulturalResources
 */
public interface CulproCulturalResourcesMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproCulturalResources record);

    int insertSelective(CulproCulturalResources record);

    CulproCulturalResources selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproCulturalResources record);

    int updateByPrimaryKey(CulproCulturalResources record);

}
