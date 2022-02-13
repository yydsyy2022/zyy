package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.Dict;

/**
 * @Entity com.lanqiao.zyy.domain.Dict
 */
public interface DictMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);

}
