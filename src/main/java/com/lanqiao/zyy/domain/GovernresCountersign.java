package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 会签记录表
 * @TableName tb_governres_countersign
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GovernresCountersign implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 文件标题
     */
    private String receivingTitle;

    /**
     * 需要份数
     */
    private Integer number;

    /**
     * 政府信息公开
     */
    private String govPunlic;

    /**
     * 不公开理由
     */
    private String reason;

    /**
     * 文号
     */
    private String fileNo;

    /**
     * 密级
     */
    private String classification;

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

    /**
     * 会签部门
     */
    private String parment;

    /**
     * 文件编号
     */
    private String fileNumber;

    private static final long serialVersionUID = 1L;
}