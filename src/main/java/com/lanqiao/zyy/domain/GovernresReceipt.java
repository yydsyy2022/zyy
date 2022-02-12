package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 收文记录表
 * @TableName tb_governres_receipt
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GovernresReceipt implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 收文号

     */
    private String receivingNum;

    /**
     * 收文日期
     */
    private Date receivingDateOfReceipt;

    /**
     * 来文标题
     */
    private String receivingTitle;

    /**
     * 来文单位
     */
    private String receivingUnitOfCommun;

    /**
     * 文件编号
     */
    private String fileNo;

    /**
     * 份数
     */
    private Integer number;

    /**
     * 密级
     */
    private String secretLevel;

    /**
     * 紧急程度
     */
    private String receivingDegreeOfUrgency;

    /**
     * 数据状态
     */
    private String receivingDataStatus;

    /**
     * 办结时限
     */
    private Date timeLimit;

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
     * 局长意见
     */
    private String reasono;

    /**
     * 中医分局意见
     */
    private String reasont;

    /**
     * 中药分局意见
     */
    private String reasonh;

    /**
     * 综合分局意见
     */
    private String reasonf;

    /**
     * 法规分局意见
     */
    private String reasonv;

    /**
     * 综合处长意见
     */
    private String reasons;

    /**
     * 局长姓名
     */
    private String nameo;

    /**
     * 中医分局姓名
     */
    private String namet;

    /**
     * 中药分局姓名
     */
    private String nameh;

    /**
     * 综合分局姓名
     */
    private String namef;

    /**
     * 法规分局姓名
     */
    private String namev;

    /**
     * 综合处长姓名
     */
    private String names;

    /**
     * 局长审核时间
     */
    private Date dateo;

    /**
     * 中医分局审核时间
     */
    private Date datet;

    /**
     * 中药分局审核时间
     */
    private Date dateh;

    /**
     * 综合分局审核时间
     */
    private Date datef;

    /**
     * 法规分局审核时间
     */
    private Date datev;

    /**
     * 综合处长审核时间
     */
    private Date dates;

    /**
     * 判断局长审核各个阶段
     */
    private String receiptReason;

    /**
     * 转发分管局长
     */
    private String receiptReasonl;

    /**
     * 审核阶段标志
     */
    private String receiptReasonk;

    private static final long serialVersionUID = 1L;
}