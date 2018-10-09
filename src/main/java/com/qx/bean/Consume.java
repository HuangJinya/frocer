package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户消费记录实体类信息
 */
@Data
@Entity
@Table(name = "t_consume")
public class Consume {
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
    /**
     * 关联的用户Id
     */
    @Column(name = "code_")
    private String code_;
    /**
     * 消费金额
     */
    @Column(name = "consumMoney_")
    private String consumMoney_;
    /**
     * 目前金额状态（0.支付，1.充值）
     */
    @Column(name = "moneyState_")
    private String moneyState_;
    /**
     * 关联的订单Id
     */
    @Column(name = "orderId_")
    private String orderId_;
    /**
     * ID
     */
    @Column(name = "id_")
    private String id_;
    /**
     * 用户支付前账户余额
     */
    @Column(name = "befPayMoney_")
    private String befPayMoney_;
    /**
     * 支付后账户余额
     */
    @Column(name = "aftPayMoney_")
    private String aftPayMoney_;

}
