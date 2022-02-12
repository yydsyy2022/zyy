package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 请示报告记录表
 * @TableName tb_governres_request_report
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GovernresRequestReport implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 报告标题
     */
    private String reportTitle;

    /**
     * 报告内容
     */
    private String reportContent;

    /**
     * 数据状态
     */
    private String reportDataStatus;

    /**
     * 理由
     */
    private String reason;

    /**
     * 理由一
     */
    private String reasonone;

    /**
     * 理由二
     */
    private String reasontwo;

    /**
     * 理由-综合处长
     */
    private String reasonth;

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
     * 更新人一
     */
    private String updaterone;

    /**
     * 更新人二
     */
    private String updatertwo;

    /**
     * 更新人三
     */
    private String updaterf;

    /**
     * 更新人-综合处长
     */
    private String updaterth;

    /**
     * 修改时间
     */
    private Date itemupdateat;

    /**
     * 更新时间一
     */
    private Date updateone;

    /**
     * 更新时间二
     */
    private Date updatetwo;

    /**
     * 更新时间四
     */
    private Date updatef;

    /**
     * 更新时间-综合处长
     */
    private Date updateth;

    private static final long serialVersionUID = 1L;
}