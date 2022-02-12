package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 文化资源模块数据记录表
 * @TableName tb_culpro_cultural_resources
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CulproCulturalResources implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 中医文化名称
     */
    private String chineseCulturalName;

    /**
     * 正文
     */
    private String chineseCulturalContent;

    /**
     * 来源
     */
    private String chineseCulturalSource;

    /**
     * 作者
     */
    private String chineseCulturalAuthor;

    /**
     * 浏览次数
     */
    private Integer visitNum;

    /**
     * 数据类型（区分数据类别）
     */
    private String chineseCulturalType;

    /**
     * 数据状态
     */
    private String chineseCulturalStatus;

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