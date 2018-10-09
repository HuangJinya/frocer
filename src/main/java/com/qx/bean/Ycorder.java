package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 异常订单记录实体类信息
 */
@Data
@Entity
@Table(name = "t_ycorder")
public class Ycorder {
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
     * 异常单号
     */
    @Column(name = "ycNo_")
    private String ycNo_;
    /**
     * 异常来源
     */
    @Column(name = "source_")
    private String source_;
    /**
     * 关联订单号
     */
    @Column(name = "orderId_")
    private String orderId_;
    /**
     * 关联物品名称
     */
    @Column(name = "goodsName_")
    private String goodsName_;
    /**
     * 关联物品机构
     */
    @Column(name = "goodsAgency_")
    private String goodsAgency_;
    /**
     * 异常单时间
     */
    @Column(name = "ycTime_")
    private Date ycTime_;
    /**
     * 异常单处理状态
     */
    @Column(name = "ycStatus_")
    private String ycStatus_;
    /**
     * 异常处理结果
     */
    @Column(name = "ycResult")
    private String ycResult;
    /**
     * 处理时间
     */
    @Column(name = "clTime_")
    private Date clTime_;
    /**
     * 标记状态（0 未人工处理，1、标记处理）
     */
    @Column(name = "markStatus_")
    private String markStatus_;
    /**
     * 处理人
     */
    @Column(name = "dealer")
    private String dealer;
}
