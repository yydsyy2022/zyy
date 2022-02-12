package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发文记录表
 * @TableName tb_governres_post
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GovernresPost implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 文号
     */
    private String postDocumentNum;

    /**
     * 文号2级选项
     */
    private String postDocumentNum1;

    /**
     * 判断个各审核阶段意见是否已填
     */
    private String postOpinion;

    /**
     * 判断收到转发的分管局长
     */
    private String postOpinion1;

    /**
     * 文件标题
     */
    private String postDocumentTitle;

    /**
     * 数据状态
     */
    private String postDataStatus;

    /**
     * 公开方式
     */
    private String postPublicWay;

    /**
     * 不公开理由
     */
    private String postReason;

    /**
     * 是否需要公平竞争审查
     */
    private String postFairDepartmentReview;

    /**
     * 是否规范性文件
     */
    private String postNormativeDocuments;

    /**
     * 印数
     */
    private Integer postPrinting;

    /**
     * 是否泄密
     */
    private String postSecretRelated;

    /**
     * 所在部门
     */
    private String postDepartment;

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