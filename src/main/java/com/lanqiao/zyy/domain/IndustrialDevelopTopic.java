package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 课题数据记录表
 * @TableName tb_industrial_develop_topic
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndustrialDevelopTopic implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 项目编号
     */
    private String projectNo;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 学科专业代码
     */
    private String disciplineCode;

    /**
     * 学科专业名称
     */
    private String disciplineName;

    /**
     * 申请人
     */
    private String applicant;

    /**
     * 所在单位
     */
    private String company;

    /**
     * 通讯地址
     */
    private String postalAddress;

    /**
     * 邮政编码
     */
    private String postalCode;

    /**
     * 联系电话
     */
    private String contactCode;

    /**
     * 电子信箱
     */
    private String email;

    /**
     * 申请日期
     */
    private Date applicationDate;

    /**
     * 数据提交状态
     */
    private String status;

    /**
     * 审核状态
     */
    private String examineStatus;

    /**
     * 用户code
     */
    private String userCode;

    /**
     * 理由
     */
    private String reason;

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