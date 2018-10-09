package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 合作商格口信息实体类
 */
@Data
@Entity
@Table(name="t_partner_box")
public class PartnerBox {
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
     * 合作商ID
     */
    @Column(name = "partnerId_")
    private String partnerId_;
    /**
     * 分配柜子ID
     */
    @Column(name = "cabId_")
    private String cabId_;
    /**
     * 分配柜子名
     */
    @Column(name = "cabName_")
    private String cabName_;
    /**
     * 租赁格口汇总
     */
    @Column(name = "boxIdCount_")
    private String boxIdCount_;
    /**
     * 是否删除（0正常 1删除）
     */
    @Column(name = "status_")
    private String status_;
}
