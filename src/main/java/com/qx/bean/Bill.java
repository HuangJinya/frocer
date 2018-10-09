package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 平台日账单总结实体信息类
 */
@Data
@Entity
@Table(name = "t_bill")
public class Bill {
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
     * 充值金额
     */
    @Column(name = "cMoney_")
    private BigDecimal cMoney_;
    /**
     * 提现金额
     */
    @Column(name = "tMoney_")
    private BigDecimal tMoney_;
    /**
     *租赁订单今日结算订单租金总金额
     */
    @Column(name = "leaseTotalMoney_")
    private BigDecimal leaseTotalMoney_;
    /**
     * 租赁订单今日结算时扣除的租金金额
     */
    @Column(name = "leaseKouchuMoney_")
    private BigDecimal leaseKouchuMoney_;
    /**
     * 月初微信用户余额
     */
    @Column(name = "wxUserMoneyc_")
    private BigDecimal wxUserMoneyc_;
    /**
     * 微信用户余额
     */
    @Column(name = "wxUserMoney_")
    private BigDecimal wxUserMoney_;
    /**
     * 月初用户总可用金额
     */
    @Column(name = "userAvailableMoneyc_")
    private BigDecimal userAvailableMoneyc_;
    /**
     * 用户总可用金额
     */
    @Column(name = "userAvailableMoney_")
    private BigDecimal userAvailableMoney_;
    /**
     * 月初用户正数可用余额
     */
    @Column(name = "userzAvailableMoneyc_")
    private BigDecimal userzAvailableMoneyc_;
    /**
     * 用户正数可用余额
     */
    @Column(name = "userzAvailableMoney_")
    private BigDecimal userzAvailableMoney_;
    /**
     * 月初用户负数可用余额
     */
    @Column(name = "userfAvailableMoneyc_")
    private BigDecimal userfAvailableMoneyc_;
    /**
     * 用户负数可用余额
     */
    @Column(name = "userfAvailableMoney_")
    private BigDecimal userfAvailableMoney_;
    /**
     * 今日产生赔付单金额
     */
    @Column(name = "userPeifuMoney_")
    private BigDecimal userPeifuMoney_;
    /**
     * 今日产生负数总额
     */
    @Column(name = "userFuMoney_")
    private BigDecimal userFuMoney_;
    /**
     * 今日用户充值填补负数总金额
     */
    @Column(name = "userTianbuMoney_")
    private BigDecimal userTianbuMoney_;
    /**
     * 今日新建产生租赁单立收租金金额
     */
    @Column(name = "leaseLishouMoney_")
    private BigDecimal leaseLishouMoney_;
    /**
     * 类型（1、平台账单  2、社区账单  3、机构账单
     */
    @Column(name = "type_")
    private String type_;
}
