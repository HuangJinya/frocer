package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 每日定时商品行为实体信息类
 */
@Data
@Entity
@Table(name="t_productdata")
public class Productdata {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "createDate_")
    private Date createDate_;
    @Column(name = "updateDate_")
    private Date updateDate_;
    /**
     * 商品id
     */
    @Column(name = "proId_")
    private String proId_;
    /**
     * 首页查看
     */
    @Column(name = "homeLook_")
    private Integer homeLook_;
    /**
     * 首页查看后点击租赁
     */
    @Column(name = "homeLookZ_")
    private Integer homeLookZ_;
    /**
     * 首页查看商品后成交订单
     */
    @Column(name = "homeLookC_")
    private Integer homeLookC_;
    /**
     * 附近柜查看
     */
    @Column(name = "cabLook_")
    private Integer cabLook_;
    /**
     * 附近柜租赁
     */
    @Column(name = "cabLookZ_")
    private Integer cabLookZ_;
    /**
     * 附近柜成交
     */
    @Column(name = "cabLookC_")
    private Integer cabLookC_;
    /**
     * 成交占比
     */
    @Column(name = "prop_")
    private Double prop_;

}
