package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户行为统计实体类
 */
@Data
@Table(name = "t_useractioninfo")
@Entity
public class Useractioninfo {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "createDate_")
    private Date createDate_;
    @Column(name = "updateDate_")
    private Date updateDate_;
    /**
     * 用户ID
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 进图首页
     */
    @Column(name = "goHome_")
    private Integer goHome_;
    /**
     * 点附近柜
     */
    @Column(name = "goCab_")
    private Integer goCab_;
    /**
     * 浏览商品
     */
    @Column(name = "goPro_")
    private Integer goPro_;
    /**
     * 点击租赁
     */
    @Column(name = "goZulin_")
    private Integer goZulin_;
    /**
     * 成功下单
     */
    @Column(name = "goOrder_")
    private Integer goOrder_;
    /**
     * 正常归还
     */
    @Column(name = "goHuan_")
    private Integer goHuan_;
    /**
     * 损坏赔付
     */
    @Column(name = "goPay_")
    private Integer goPay_;
    /**
     * 超期归还
     */
    @Column(name = "goChao_")
    private Integer goChao_;
    /**
     * 满星评价
     */
    @Column(name = "assessM_")
    private Integer assessM_;
    /**
     * 非满评价
     */
    @Column(name = "assessF_")
    private Integer assessF_;
    /**
     * 未满星评价
     */
    @Column(name = "assessW_")
    private Integer assessW_;
    /**
     * 成交占比
     */
    @Column(name = "prop_")
    private Double prop_;
}
