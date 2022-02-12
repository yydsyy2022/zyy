package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 角色表
 * @TableName role
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    private String itemcode;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色说明
     */
    private String roleDescription;

    /**
     * 应用id
     */
    private String appCode;

    /**
     * 类型（0：普通，1：管理员）
     */
    private Integer roleType;

    /**
     * 
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
     * 
     */
    private Date itemupdateat;

    private static final long serialVersionUID = 1L;
}