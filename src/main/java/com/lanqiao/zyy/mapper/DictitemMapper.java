package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.Dictitem;

/**
 * @Entity com.lanqiao.zyy.domain.Dictitem
 */
public interface DictitemMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Dictitem record);

    int insertSelective(Dictitem record);

    Dictitem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dictitem record);

    int updateByPrimaryKey(Dictitem record);

}
