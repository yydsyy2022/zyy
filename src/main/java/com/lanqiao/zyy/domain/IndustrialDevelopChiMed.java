package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 中药种植园、中药材加工企业、中药材销售企业、中药材制药企业信息记录表
 * @TableName tb_industrial_develop_chi_med
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndustrialDevelopChiMed implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 名称
     */
    private String name;

    /**
     * 占地面积（种植园种植面积）
     */
    private String areaCoverd;

    /**
     * 销售种类
     */
    private String salesCategory;

    /**
     * 加工种类
     */
    private String processingType;

    /**
     * 生产种类
     */
    private String peoduceType;

    /**
     * 种植类别
     */
    private String plantType;

    /**
     * 生产药品
     */
    private String peoduceDrug;

    /**
     * 销售药品
     */
    private String sellingDrugs;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 地址省份
     */
    private String addressPro;

    /**
     * 地址市
     */
    private String addressCity;

    /**
     * 地址县
     */
    private String addressCountry;

    /**
     * 手动输入地址
     */
    private String address;

    /**
     * 简介
     */
    private String intruduce;

    /**
     * 数据状态
     */
    private String status;

    /**
     * 不通过理由
     */
    private String reason;

    /**
     * 用户所在机构code
     */
    private String orgCode;

    /**
     * 区别数据
     */
    private String type;

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