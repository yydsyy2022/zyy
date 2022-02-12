package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 加工企业在售药材、种植园在售药材记录表
 * @TableName tb_industrial_develop_med_mat
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndustrialDevelopMedMat implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 药材名称
     */
    private String name;

    /**
     * 规格
     */
    private String specifications;

    /**
     * 价格
     */
    private String price;

    /**
     * 产地
     */
    private String place;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 数据状态
     */
    private String status;

    /**
     * 用户所在机构code
     */
    private String orgCode;

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