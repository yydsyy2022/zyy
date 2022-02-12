package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 记录发文、请示报告、会签意见表
 * @TableName tb_governres_advice
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GovernresAdvice implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 主表中itemCode
     */
    private String dataCode;

    /**
     * 初始拟稿
     */
    private String initial;

    /**
     * 初始拟稿时间
     */
    private Date initialDate;

    /**
     * 处室拟稿
     */
    private String department;

    /**
     * 处室拟稿人姓名
     */
    private String departmentName;

    /**
     * 处室拟稿时间
     */
    private Date departDate;

    /**
     * 办公室核稿
     */
    private String office;

    /**
     * 办公室核稿人姓名
     */
    private String officeName;

    /**
     * 办公室核稿时间
     */
    private Date officeDate;

    /**
     * 中医处分管局长审核意见
     */
    private String deputyDirector;

    /**
     * 中医处分管局长姓名
     */
    private String deputyDirectorName;

    /**
     * 中医处分管局长审核时间
     */
    private Date deputyDirectorDate;

    /**
     * 中药处分管局长审核意见
     */
    private String deputyDirector1;

    /**
     * 中药处分管局长姓名
     */
    private String deputyDirectorName1;

    /**
     * 中药处分管局长审核时间
     */
    private Date deputyDirectorDate1;

    /**
     * 综合处分管局长审核意见
     */
    private String deputyDirector2;

    /**
     * 综合处分管局长姓名
     */
    private String deputyDirectorName2;

    /**
     * 综合处分管局长审核时间
     */
    private Date deputyDirectorDate2;

    /**
     * 法规监督处分管局长审核意见
     */
    private String deputyDirector3;

    /**
     * 法规监督处分管局长姓名
     */
    private String deputyDirectorName3;

    /**
     * 法规监督处分管局长审核时间
     */
    private Date deputyDirectorDate3;

    /**
     * 局长审核意见
     */
    private String director;

    /**
     * 局长姓名
     */
    private String directorName;

    /**
     * 局长审核时间
     */
    private Date directorDate;

    /**
     * 会签部门审核意见
     */
    private String signopinion;

    /**
     * 会签部门审核时间
     */
    private String signdate;

    /**
     * 会签部门审核人
     */
    private String signname;

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