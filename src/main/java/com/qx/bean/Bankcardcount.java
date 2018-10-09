package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 银行卡绑定实体信息类
 */
@Data
@Entity
@Table(name = "t_bankcardcount")
public class Bankcardcount {
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
     * 用户ID
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 银行卡号
     */
    @Column(name = "cardNum_")
    private String cardNum_;
    /**
     * 所属银行
     */
    @Column(name = "bankName_")
    private String bankName_;
    /**
     * 持卡人姓名
     */
    @Column(name = "userName_")
    private String userName_;
    /**
     * 银行卡类型
     */
    @Column(name = "cardType_")
    private String cardType_;
}
