package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 治未病理念模块数据记录表
 * @TableName tb_culpro_pre_tre
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CulproPreTre implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 标题
     */
    private String dataTitle;

    /**
     * 作者
     */
    private String dataAuthor;

    /**
     * 来源
     */
    private String dataSource;

    /**
     * 正文
     */
    private String dataContent;

    /**
     * 数据状态
     */
    private String dataStatus;

    /**
     * 数据类型(用来区分）
     */
    private String dataType;

    /**
     * 浏览次数
     */
    private Integer visitNum;

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