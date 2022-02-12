package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 文创产品模块、健康旅游模块数据记录表
 * @TableName tb_culpro_fam_pro
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CulproFamPro implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 电视、动漫、漫画、旅游景点知识名称
     */
    private String name;

    /**
     * 电视、动漫、漫画、旅游景点知识来源
     */
    private String source;

    /**
     * 作者
     */
    private String author;

    /**
     * 浏览次数
     */
    private Integer visitNum;

    /**
     * 正文
     */
    private String content;

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