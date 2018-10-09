package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 箱子实体信息类
 */
@Data
@Entity
@Table(name = "t_box")
public class Box {
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
     * 智能柜编号(一个智能柜包含多个箱子)
     */
    @Column(name = "cabId_")
    private String cabId_;
    /**
     * 箱子编号
     */
    @Column(name = "boxId_")
    private String boxId_;
    /**
     * 箱子别名
     */
    @Column(name = "boxName_")
    private String boxName_;
    /**
     * 箱子体型（0大，1中，2小）
     */
    @Column(name = "boxVolume_")
    private Integer boxVolume_;
    /**
     * 箱子类型（0租赁箱，1公益箱）
     */
    @Column(name = "boxType_")
    private Integer boxType_;
    /**
     * 箱子内空箱状态（0空箱，1有物品）
     */
    @Column(name = "emptyStatus_")
    private int emptyStatus_;
    /**
     * 箱子描述
     */
    @Column(name = "boxDesc_")
    private String boxDesc_;
    /**
     * 最近关锁时间
     */
    @Column(name = "lockDate_")
    private Date lockDate_;
    /**
     * 箱子订单锁定状态（0自由，1锁定
     */
    @Column(name = "boxOrderLock_")
    private int boxOrderLock_;
    /**
     * 箱锁UD
     */
    @Column(name = "boxLockUD_")
    private String boxLockUD_;
    /**
     * 锁箱启闭状态0未启用，1启用
     */
    @Column(name = "boxStatus_")
    private int boxStatus_;
    /**
     * 箱子编号(调试添加)
     */
    @Column(name = "numOrder")
    private String numOrder;
    /**
     * 锁编号(调试添加)
     */
    @Column(name = "lockNumber")
    private String lockNumber;
    /**
     * rfid主天线ID(调试添加)
     */
    @Column(name = "hostAnt")
    private String hostAnt;
    /**
     * rfid子天线id(调试添加)
     */
    @Column(name = "childAnt")
    private String childAnt;
    /**
     * 商品电子标签(调试添加)
     */
    @Column(name = "goodsLab")
    private String goodsLab;
    /**
     * 柜组大小
     */
    @Column(name = "boxsize")
    private String boxsize;
}
