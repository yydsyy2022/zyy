package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.UserRoleRef;

/**
 * @Entity com.lanqiao.zyy.domain.UserRoleRef
 */
public interface UserRoleRefMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserRoleRef record);

    int insertSelective(UserRoleRef record);

    UserRoleRef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRoleRef record);

    int updateByPrimaryKey(UserRoleRef record);

}
