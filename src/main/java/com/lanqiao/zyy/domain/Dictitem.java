package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 字典详情表
 * @TableName dictitem
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dictitem implements Serializable {
    /**
     * 
     */
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    private String itemcode;

    /**
     * 关联dict表中的itemCode字段
     */
    private String dictCode;

    /**
     * 字典项编码
     */
    private String ditemCode;

    /**
     * 字典项的值
     */
    private String ditemValue;

    /**
     * 父级CODE，关联本表的itemCode
     */
    private String ditemPcode;

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