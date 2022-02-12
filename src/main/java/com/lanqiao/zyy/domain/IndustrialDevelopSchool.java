package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 高等学院数据记录表
 * @TableName tb_industrial_develop_school
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndustrialDevelopSchool implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 学校名称
     */
    private String schoolName;

    /**
     * 学校简介（字少）
     */
    private String schoolIntroduce;

    /**
     * 二级学院名称
     */
    private String secondaryCollege;

    /**
     * 本科招生专业
     */
    private String enrollmentMajor;

    /**
     * 研究生招生专业
     */
    private String graduateEnrollmentMajor;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 在线地址
     */
    private String onlineAddress;

    /**
     * 学校简介
     */
    private String schoolText;

    /**
     * 学校地址省份
     */
    private String addressPro;

    /**
     * 学校地址市
     */
    private String addressCity;

    /**
     * 学校地址省份
     */
    private String addressCountry;

    /**
     * 手动输入地址 
     */
    private String address;

    /**
     * 机构编号
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