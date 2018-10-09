package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 平台账户日志管理实体类信息
 */
@Data
@Entity
@Table(name = "t_recordaccount")
public class Recordaccount {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "createTime_")
    private Date createTime_;
    @Column(name = "createUser_")
    private String createUser_;
    @Column(name = "updateTime_")
    private Date updateTime_;
    @Column(name = "updateUser_")
    private String updateUser_;
    /**
     * 账户资金流水
     */
    @Column(name = "number_")
    private String number_;
    /**
     * 发生金额
     */
    @Column(name = "amount_")
    private BigDecimal amount_;
    /**
     * 交易类型
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 交易前金额
     */
    @Column(name = "qamount_")
    private BigDecimal qamount_;
    /**
     * 交易后金额
     */
    @Column(name = "hamount_")
    private BigDecimal hamount_;
    /**
     * 交易流水
     */
    @Column(name = "recordId_")
    private String recordId_;
    /**
     * 平台商户ID
     */
    @Column(name = "accountId_")
    private String accountId_;
    /**
     * 交易描述
     */
    @Column(name = "desc_")
    private String desc_;
}
