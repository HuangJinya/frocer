package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 优惠券和用户关联实体类
 */
@Data
@Entity
@Table(name = "t_couponanduser")
public class Couponanduser {
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
     * 用户id
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 优惠券ID
     */
    @Column(name = "couponId_")
    private String couponId_;
    /**
     * 是否使用优惠券  0:不使用  1：使用
     */
    @Column(name = "use_")
    private String use_;
    /**
     * 优惠券名称
     */
    @Column(name = "couponname_")
    private String couponname_;
    /**
     * 优惠券使用说明
     */
    @Column(name = "couponcontent_")
    private String couponcontent_;
    /**
     * 优惠券图片
     */
    @Column(name = "imgUrl_")
    private String imgUrl_;
    /**
     * 发送优惠券总数
     */
    @Column(name = "total_")
    private Integer total_;
    /**
     * 可领取的优惠券时间
     */
    @Column(name = "grantdate_")
    private Date grantdate_;
    /**
     * 优惠券有效使用开始时间
     */
    @Column(name = "enddate_")
    private Date enddate_;
    /**
     * 优惠券类型
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 优惠券面额
     */
    @Column(name = "Denomination_")
    private String Denomination_;
    /**
     * 优惠券使用范围
     */
    @Column(name = "range_")
    private String range_;
    /**
     * 接收人群
     */
    @Column(name = "receive_")
    private String receive_;
    /**
     * 优惠券有效使用的结束时间
     */
    @Column(name = "enddate1_")
    private Date enddate1_;
    /**
     * 最后的可领取优惠券时间
     */
    @Column(name = "grantdate1_")
    private Date grantdate1_;
    /**
     * 发放时间
     */
    @Column(name = "releasedate_")
    private Date releasedate_;
    /**
     * 优惠券种类  0：启享红包  1：抵扣券
     */
    @Column(name = "kind_")
    private Integer kind_;
}
