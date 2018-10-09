package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 交易记录实体类
 */
@Data
@Entity
@Table(name="t_record")
public class Record {
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
     * 流水号
     */
    @Column(name = "number_")
    private String number_;
    /**
     * 支付平台  0：微信 1: 钱包
     */
    @Column(name = "platform_")
    private String platform_;
    /**
     *
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 交易方式  0：提现 1：充值
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 操作类型  A:转出 B：转入 C：付款 D：零钱退款 E:微信退款
     */
    @Column(name = "opeType_")
    private String opeType_;
    /**
     * 操作金额
     */
    @Column(name = "amount_")
    private BigDecimal amount_;
    /**
     * 微信流水号
     */
    @Column(name = "out_trade_no_")
    private String out_trade_no_;
    /**
     * 状态 0.成功 1.失败
     */
    @Column(name = "status_")
    private String status_;
    /**
     * 订单ID
     */
    @Column(name = "orderId_")
    private String orderId_;
    @Column(name = "openid_")
    private String openid_;
    /**
     * 用户所持有余额
     */
    @Column(name = "userNowMoney_")
    private BigDecimal userNowMoney_;
    /**
     * 对应平台ID
     */
    @Column(name = "accountId_")
    private String accountId_;
    /**
     * 流水说明
     */
    @Column(name = "remark_")
    private String remark_;
    @Column(name = "payMethod_")
    private String payMethod_;
}
