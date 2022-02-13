package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.User;

/**
 * @Entity com.lanqiao.zyy.domain.User
 */
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
