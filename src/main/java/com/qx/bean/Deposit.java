package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 押金实体类信息
 */
@Data
@Entity
@Table(name = "t_deposit")
public class Deposit {
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
     * 订单号
     */
    @Column(name = "orderId_")
    private String orderId_;
    /**
     * 押金
     */
    @Column(name = "deposit_")
    private Double deposit_;
    @Column(name = "depositID_")
    private String depositID_;
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 是否删除 1删除退还 0未删除未退还
     */
    @Column(name = "isDel_")
    private String isDel_;
}
