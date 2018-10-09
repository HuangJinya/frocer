package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "t_creditandorder")
public class Creditandorder {
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
     * 订单ID
     */
    @Column(name = "id_")
    private String id_;
    /**
     * 租赁单用户名
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 订单机构
     */
    @Column(name = "jigou_")
    private String jigou_;
    /**
     * 来自渠道
     */
    @Column(name = "channel_")
    private String channel_;
    /**
     * 下单时总免押额度
     */
    @Column(name = "myMoney_")
    private BigDecimal myMoney_;
    /**
     * 订单物品原押金
     */
    @Column(name = "yuanYj_")
    private BigDecimal yuanYj_;
    /**
     * 订单实际收取押金
     */
    @Column(name = "shiYj_")
    private BigDecimal shiYj_;
    /**
     * 享受免押金金额
     */
    @Column(name = "jianmianYj_")
    private BigDecimal jianmianYj_;
    /**
     * 订单归还是否报异常
     */
    @Column(name = "orderStatus_")
    private BigDecimal orderStatus_;
    /**
     * 订单结算后用户余额
     */
    @Column(name = "userJsMoney_")
    private BigDecimal userJsMoney_;
    /**
     * 用户当前余额
     */
    @Column(name = "userMoney_")
    private BigDecimal userMoney_;
}
