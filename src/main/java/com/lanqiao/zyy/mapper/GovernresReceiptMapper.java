package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.GovernresReceipt;

/**
 * @Entity org.lanqiao.zyysys.domain.GovernresReceipt
 */
public interface GovernresReceiptMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresReceipt record);

    int insertSelective(GovernresReceipt record);

    GovernresReceipt selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresReceipt record);

    int updateByPrimaryKey(GovernresReceipt record);

}
