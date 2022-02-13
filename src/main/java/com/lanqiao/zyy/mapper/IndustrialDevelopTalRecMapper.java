package com.lanqiao.zyy.mapper;

import com.lanqiao.zyy.domain.IndustrialDevelopTalRec;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.lanqiao.zyy.domain.IndustrialDevelopTalRec
 */
@Repository
public interface IndustrialDevelopTalRecMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopTalRec record);

    int insertSelective(IndustrialDevelopTalRec record);

    IndustrialDevelopTalRec selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopTalRec record);

    int updateByPrimaryKey(IndustrialDevelopTalRec record);

}
