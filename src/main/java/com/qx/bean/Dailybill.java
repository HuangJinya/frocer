package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 每日账户清算实体类信息
 */
@Data
@Entity
@Table(name = "t_dailybill")
public class Dailybill {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "createDate_")
    private Date createDate_;
    /**
     * 收入(微信收入/和商会平台对账)
     */
    @Column(name = "income_")
    private BigDecimal income_;
    /**
     * 支出(微信押金退还/超期支付退款)
     */
    @Column(name = "expenses_")
    private BigDecimal expenses_;
    /**
     * 结余(微信当日完成后结余收入余额)
     */
    @Column(name = "balance_")
    private BigDecimal balance_;
    /**
     * 实际纯收入（微信和零钱总收入不包含押金）
     */
    @Column(name = "realIncome_")
    private BigDecimal realIncome_;
    /**
     * 微信收益
     */
    @Column(name = "wxIncome_")
    private BigDecimal wxIncome_;
    /**
     * 零钱收益
     */
    @Column(name = "lqIncome_")
    private BigDecimal lqIncome_;
}
