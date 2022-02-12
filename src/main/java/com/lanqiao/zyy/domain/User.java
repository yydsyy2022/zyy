package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户表
 * @TableName user
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    /**
     * 
     */
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    private String itemcode;

    /**
     * 机构id(关联organization表中的itemID）
     */
    private String orgCode;

    /**
     * 登陆账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 用户名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 身份证件类型
     */
    private String idcardType;

    /**
     * 证件号码
     */
    private String idcardNo;

    /**
     * email
     */
    private String email;

    /**
     * 
     */
    private String state;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 电话号码
     */
    private String mobilephone;

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

    /**
     * 地级机构id
     */
    private String cityid;

    /**
     * 类型（0：普通，1：管理员）
     */
    private Integer type;

    /**
     * 肖像
     */
    private byte[] portrait;

    private static final long serialVersionUID = 1L;
}