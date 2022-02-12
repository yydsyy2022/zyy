package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 中医文化、科普知识数据记录表
 * @TableName tb_culpro_chinese_cultural
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CulproChineseCultural implements Serializable {
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
     * 数据类型（区分数据类别）;
1.文化古迹;
2.非物质文化遗产;
3.文化场馆;
1.电视电影;
2.动漫游戏;
3.漫画典故;
健康旅游信息;
     */
    private String chineseCulturalType;

    /**
     * 数据状态：
1、上架中
2、已下架
3、待上架
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