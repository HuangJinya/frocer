package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 租赁取物订单
 */
@Data
@Entity
@Table(name = "t_qhorder")
public class Qhorder {
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
     * 取物单号
     */
    @Column(name = "id_")
    private String id_;
    /**
     * 取物用户iD
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 关联订单ID号
     */
    @Column(name = "orderId_")
    private String orderId_;
    /**
     * 商品名称
     */
    @Column(name = "goodName_")
    private String goodName_;
    /**
     * 租赁时主电子条码
     */
    @Column(name = "zhuCode_")
    private String zhuCode_;
    /**
     * 配件主电子条码
     */
    @Column(name = "pzhuCode_")
    private String pzhuCode_;
    /**
     * 取物柜所在社区名称
     */
    @Column(name = "sqName_")
    private String sqName_;
    /**
     * 柜子箱号
     */
    @Column(name = "cabinetName_")
    private String cabinetName_;
    /**
     * 取物箱号
     */
    @Column(name = "boxNo_")
    private String boxNo_;
    /**
     * 是否关门（1、关门  2、未关门）
     */
    @Column(name = "isClosed_")
    private String isClosed_;
}
