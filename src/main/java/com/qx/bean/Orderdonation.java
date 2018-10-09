package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户捐赠单实体类信息
 */
@Data
@Entity
@Table(name="t_orderdonation")
public class Orderdonation {
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
    @Column(name = "userId_")
    private String userId_;
    /**
     * 订单描述
     */
    @Column(name = "orderDesc_")
    private String orderDesc_;
    /**
     * 数量
     */
    @Column(name = "count_")
    private Integer count_;
    /**
     * 捐赠柜地址
     */
    @Column(name = "adr_")
    private String adr_;
    /**
     * 订单状态（0，未发公益机构 1、已发公益机构）
     */
    @Column(name = "status_")
    private Integer status_;
    /**
     * 状态变更时间
     */
    @Column(name = "statusTime_")
    private Date  statusTime_;
    /**
     * 收货状态(0 已收货 1未收货)
     */
    @Column(name = "shStatus_")
    private String shStatus_;
    /**
     * 收货运维人员电话
     */
    @Column(name = "maintainPhone_")
    private String maintainPhone_;
    /**
     * 收货时间
     */
    @Column(name = "shouhuoTime_")
    private Date shouhuoTime_;
    /**
     * 箱子ID
     */
    @Column(name = "boxId_")
    private String boxId_;
    /**
     * 商品图片
     */
    @Column(name = "proImges_")
    private String proImges_;
}
