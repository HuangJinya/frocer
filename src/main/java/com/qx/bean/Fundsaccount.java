package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 平台资金账户实体信息类
 */
@Data
@Entity
@Table(name = "t_fundsaccount")
public class Fundsaccount {
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
     * 账户号
     */
    @Column(name = "id_")
    private String id_;
    /**
     * 账户名称
     */
    @Column(name = "name_")
    private String name_;
    /**
     * 余额
     */
    @Column(name = "balance_")
    private BigDecimal balance_;
    /**
     * 账户类型
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 用途描述
     */
    @Column(name = "desc_")
    private String desc_;
}
