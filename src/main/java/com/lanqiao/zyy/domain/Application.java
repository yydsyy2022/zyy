package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 应用数据记录表
 * @TableName application
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application implements Serializable {
    /**
     * 
     */
    private Integer itemid;

    /**
     * 
     */
    private String itemcode;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 系统描述
     */
    private String appDescription;

    /**
     * 0为普通应用，1为权限系统应用
     */
    private Integer appType;

    /**
     * 图标地址
     */
    private String appImageurl;

    /**
     * 访问地址
     */
    private String appAppurl;

    /**
     * 端口号
     */
    private String appPort;

    /**
     * 是否允许异地登陆
     */
    private String appRemoteLogin;

    /**
     * 密码错误次数
     */
    private Integer appPasswordError;

    /**
     * 默认登出时间
     */
    private Integer appAutoExit;

    /**
     * 应用状态
     */
    private String appStatus;

    /**
     * 创建人
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