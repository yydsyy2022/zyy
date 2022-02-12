package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 专家和课题关系表
 * @TableName tb_industrial_develop_expert_ref
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndustrialDevelopExpertRef implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 专家code
     */
    private String expertCode;

    /**
     * 课题code
     */
    private String topicCode;

    /**
     * 专家审核状态
     */
    private String exmaineStatus;

    /**
     * 提交状态
     */
    private String submitStatus;

    /**
     * 总数分数
     */
    private String score;

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

    /**
     * 专家意见
     */
    private String opinion;

    private static final long serialVersionUID = 1L;
}