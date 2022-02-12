package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 合作交流数据记录表
 * @TableName tb_industrial_develop_coo_exc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndustrialDevelopCooExc implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 合作交流名称
     */
    private String cooperationExchangeName;

    /**
     * 主研人
     */
    private String cooperationExchangeLeader;

    /**
     * 浏览次数
     */
    private Integer visitNum;

    /**
     * 项目简介
     */
    private String projectIntroduce;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 预期合作机构
     */
    private String cooperativeOrg;

    /**
     * 用户所在机构code
     */
    private String orgCode;

    /**
     * 数据状态
     */
    private String status;

    /**
     * 创建者
     */
    private String creater;

    /**
     * 创建时间
     */
    private Date itemcreateat;

    /**
     * 修改人
     */
    private String updater;

    /**
     * 修改时间
     */
    private Date itemupdateat;

    private static final long serialVersionUID = 1L;
}