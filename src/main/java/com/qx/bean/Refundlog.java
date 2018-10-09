package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 退款申请记录实体信息
 */
@Data
@Entity
@Table(name="t_refundlog")
public class Refundlog {
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
    @Column(name = "orderId_")
    private String orderId_;
    /**
     * 用户ID
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 微信支付单号
     */
    @Column(name = "out_refund_no")
    private String out_refund_no;
    /**
     * 退款凭证号
     */
    @Column(name = "out_trade_no")
    private String out_trade_no;
    /**
     * 订单金额
     */
    @Column(name = "total_fee")
    private String total_fee;
    /**
     * 退款金额
     */
    @Column(name = "refund_fee")
    private String refund_fee;
    /**
     * 0 未处理 1 同意 2 拒绝 3 赔付单无需变动
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 支付方式 0 微信 1 零钱
     */
    @Column(name = "mode_")
    private String mode_;
}
