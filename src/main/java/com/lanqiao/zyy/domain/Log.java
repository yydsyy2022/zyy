package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 日志记录表
 * @TableName log
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Log implements Serializable {
    /**
     * 
     */
    private Integer itemid;

    /**
     * uuid
     */
    private String itemcode;

    /**
     * 应用id
     */
    private String appCode;

    /**
     * 错误标题
     */
    private String logTitle;

    /**
     * 日志等级
     */
    private String logLevel;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 
     */
    private Date itemcreateat;

    /**
     * 
     */
    private String updater;

    /**
     * 修改时间
     */
    private Date itemupdateat;

    private static final long serialVersionUID = 1L;
}