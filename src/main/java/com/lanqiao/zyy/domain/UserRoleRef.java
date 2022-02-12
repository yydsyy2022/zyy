package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户--角色  关联表
 * @TableName user_role_ref
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleRef implements Serializable {
    /**
     * 
     */
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    private String itemcode;

    /**
     * 关联user表itemCode字段
     */
    private String userCode;

    /**
     * 应用系统code
     */
    private String appCode;

    /**
     * 关联role表itemCode字段（应用系统角色）
     */
    private String roleCode;

    /**
     * 平台角色
     */
    private String platRole;

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