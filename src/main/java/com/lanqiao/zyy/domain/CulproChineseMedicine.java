package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 名老中医信息记录表
 * @TableName tb_culpro_chinese_medicine
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CulproChineseMedicine implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 中医名称
     */
    private String chineseMedicineName;

    /**
     * 荣誉称号（国医大师）
     */
    private String chineseMedicineType;

    /**
     * 职称
     */
    private String chineseMedicineTitle;

    /**
     * 所在科室（科室表的code）
     */
    private String deptCode;

    /**
     * 出诊地点（医院code）
     */
    private String hospCode;

    /**
     * 出诊时间
     */
    private String visitTime;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 专家简介
     */
    private String expertBriefIntroduce;

    /**
     * 专家介绍
     */
    private String expertIntroduce;

    /**
     * 主要就诊
     */
    private String mainVisit;

    /**
     * 重点医案
     */
    private String medicineRecords;

    /**
     * 数据状态
     */
    private String chineseMedicineStatus;

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