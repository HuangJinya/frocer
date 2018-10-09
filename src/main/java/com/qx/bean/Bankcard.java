package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "t_bankcard")
public class Bankcard {
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
     * 银行卡打款认证用户名
     */
    @Column(name = "userName_")
    private String userName_;
    /**
     * 最近发起认证时间
     */
    @Column(name = "lastDate_")
    private Date lastDate_;
    /**
     * 发起认证次数
     */
    @Column(name = "rzTime_")
    private int rzTime_;
    /**
     * 最近发起银行卡号
     */
    @Column(name = "lastBankCard_")
    private String lastBankCard_;
    /**
     * 银行卡开户行名称
     */
    @Column(name = "bankAccount_")
    private String bankAccount_;
    /**
     * 银行卡用户名
     */
    @Column(name = "bankUserName_")
    private String bankUserName_;
    /**
     * 打款金额
     */
    @Column(name = "account_")
    private Double account_;
    /**
     * 用户最近输入认证金额
     */
    @Column(name = "lastMoney_")
    private Double lastMoney_;
    /**
     * 最近输入认证金额时间
     */
    @Column(name = "lastMoneyTime_")
    private Date lastMoneyTime_;
    /**
     * 当前认证输入错误次数
     */
    @Column(name = "wrongTime_")
    private int wrongTime_;
    /**
     * 认证状态 0：不通过 1：认证通过并绑定银行卡
     */
    @Column(name = "status_")
    private String status_;
    /**
     * 用户ID
     */
    @Column(name = "userCode_")
    private String userCode_;

}
