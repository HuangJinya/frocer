package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 活体映像认证实体信息类
 */
@Data
@Entity
@Table(name = "t_htcertified")
public class Htcertified {
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
     * 认证订单ID
     */
    @Column(name = "id_")
    private String id_;
    /**
     * 发起用户名
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 失效时间
     */
    @Column(name = "sxDate_")
    private Date sxDate_;
    /**
     * 柜子地址
     */
    @Column(name = "cabAdr_")
    private String cabAdr_;
    /**
     * 柜子编号
     */
    @Column(name = "cabNo_")
    private String cabNo_;
    /**
     * 订单状态(1、正常 2、失效）
     */
    @Column(name = "status_")
    private String status_;
    /**
     * 订单映像图片
     */
    @Column(name = "imgUrl_")
    private String imgUrl_;
}
