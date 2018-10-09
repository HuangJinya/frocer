package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 中控屏上报开箱关箱记录实体类信息
 */
@Data
@Entity
@Table(name = "t_reportlog")
public class Reportlog {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "createDate_")
    private Date createDate_;
    @Column(name = "createUser_")
    private String createUser_;
    /**
     * 柜子编号
     */
    @Column(name = "numOrder_")
    private String numOrder_;
    /**
     * 柜子锁号
     */
    @Column(name = "lockNumber_")
    private String lockNumber_;
    /**
     * 柜子ID
     */
    @Column(name = "cabId_")
    private String cabId_;
    /**
     * 订单ID
     */
    @Column(name = "orderId_")
    private String orderId_;
    /**
     * 上报类型（1、关箱 2、 关箱 3、异常）
     */
    @Column(name = "type_")
    private String type_;
    @Column(name = "zhuCode_")
    private String zhuCode_;
}
