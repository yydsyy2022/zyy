package com.lanqiao.zyy.mapper;


import com.lanqiao.zyy.domain.domain.Application;

/**
 * @Entity com.lanqiao.zyy.domain.Application;
 */
public interface ApplicationMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Application record);

    int insertSelective(Application record);

    Application selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);

}
