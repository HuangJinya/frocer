package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 优惠券实体类信息
 */
@Data
@Entity
@Table(name = "t_coupon")
public class Coupon {
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
     * 优惠券名称
     */
    @Column(name="couponname_")
    private String couponname_;
    /**
     * 优惠券类型   0.全平台 1.单品 2.商家
     */
    @Column(name="type_")
    private String type_;
    /**
     * 使用情况 0:未使用 1:已使用
     */
    @Column(name="use_")
    private String use_;
    /**
     *
     */
    @Column(name="kind_")
    private String kind_;
    /**
     * 接收人群 1.新用户  2.所有用户 3.等级用户
     */
    @Column(name="receive_")
    private String receive_;
    /**
     * 发放总数
     */
    @Column(name="total_")
    private Integer total_;
    /**
     * 优惠券图片
     */
    @Column(name="imgUrl_")
    private String imgUrl_;
    /**
     * 优惠券id
     */
    @Column(name="couponId_")
    private String couponId_;
    /**
     * 优惠券面额
     */
    @Column(name="Denomination_")
    private Integer Denomination_;
    /**
     * 优惠券可领取时间段
     */
    @Column(name="grantdate_")
    private Date grantdate_;
    /**
     * 优惠券可领取时间段
     */
    @Column(name="grantdate1_")
    private Date grantdate1_;
    /**
     * 优惠券可使用期的开始时间
     */
    @Column(name="enddate_")
    private Date enddate_;
    /**
     * 优惠券可使用有效期的结束时间
     */
    @Column(name="enddate1_")
    private Date enddate1_;
    /**
     * 优惠券可使用范围  0：租赁商品 1：售卖商品
     */
    @Column(name="range_")
    private String range_;
    /**
     * 优惠券说明内容
     */
    @Column(name="couponcontent_")
    private String couponcontent_;
    @Column(name="releasedate_")
    private Date releasedate_;
    /**
     * 用户Code_
     */
    @Column(name="userCode_")
    private String userCode_;
}
