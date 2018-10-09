package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 赔付实体类信息
 */
@Data
@Entity
@Table(name="t_pay")
public class Pay {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "createDate_")
    private Date createDate_;
    @Column(name = "createUser_")
    private String createUser_;
    @Column(name = "updateDate_")
    private Date updateDate_;
    @Column(name = "updateUser_")
    private String updateUser_;
    /**
     * 赔付单号
     */
    @Column(name = "payID_")
    private String payID_;
    /**
     * 关联租赁订单号
     */
    @Column(name = "orderId_")
    private String orderId_;
    /**
     * 赔付说明
     */
    @Column(name = "payDesc_")
    private String payDesc_;
    /**
     * 赔付图片id
     */
    @Column(name = "payImg_")
    private String payImg_;
    /**
     * 赔付状态0.赔付(生效)1.无需赔付（失效）2:未操作
     */
    @Column(name = "payState_")
    private String payState_;
    /**
     * 建议赔付金额
     */
    @Column(name = "suggestMoney_")
    private Double suggestMoney_;
    /**
     * 达成赔付金额
     */
    @Column(name = "successMoney_")
    private Double successMoney_;
    /**
     * 赔付后建议
     */
    @Column(name = "suggest_")
    private String suggest_;
    /**
     * 赔付备注
     */
    @Column(name = "payRemark_")
    private String payRemark_;
    /**
     * 赔付原因
     */
    @Column(name = "payReason_")
    private String payReason_;
    /**
     * 赔付状态（0、生效 1、失效）
     */
    @Column(name = "payStatus_")
    private String payStatus_;
}
