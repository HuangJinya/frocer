package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户评价实体类信息
 */
@Data
@Entity
@Table(name = "t_evaluate")
public class Evaluate {
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
     * 评价ID
     */
    @Column(name = "evaId_")
    private String evaId_;
    /**
     * 评价等级(0到5，好评度依次递增)
     */
    @Column(name = "evaLevel_")
    private String evaLevel_;
    /**
     * 评价内容
     */
    @Column(name = "evaContent_")
    private String evaContent_;
    /**
     * 评价图片ID
     */
    @Column(name = "evaImgId_")
    private String evaImgId_;
    /**
     * 评价状态(0.匿名1.不匿名)
     */
    @Column(name = "evaState_")
    private String evaState_;
    /**
     * 用户Id
     */
    @Column(name = "UserId_")
    private String UserId_;
    /**
     * 商品ID
     */
    @Column(name = "proId_")
    private String proId_;
    /**
     * 订单类型（0.租凭，1.购买）
     */
    @Column(name = "orderType_")
    private String orderType_;
    /**
     * 是否显示   0：显示    1：不显示
     */
    @Column(name = "isShow_")
    private String isShow_;
    /**
     * 管理员回复
     */
    @Column(name = "adminReply_")
    private String adminReply_;
    /**
     * 可见  0：自己  1：全部人
     */
    @Column(name = "visible_")
    private String visible_;
}
