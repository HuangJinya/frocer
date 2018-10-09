package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 箱子主电子条码中间实体类信息
 */
@Data
@Entity
@Table(name = "t_pronode_box")
public class PronodeBox {
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
     * 箱子id
     */
    @Column(name = "boxId_")
    private String boxId_;
    /**
     * 主电子条码
     */
    @Column(name = "zhuCode_")
    private String zhuCode_;
    /**
     * 状态0物品已经取走，1物品存放中
     */
    @Column(name = "status_")
    private int status_;
    /**
     * 柜子id
     */
    @Column(name = "cabId_")
    private String cabId_;
    /**
     * 锁编号
     */
    @Column(name = "lockNumber_")
    private String lockNumber_;
    /**
     * 箱子编号
     */
    @Column(name = "numOrder_")
    private String numOrder_;
    /**
     * 改柜组物品是否清洁（0、已清洁  1、未清洁）
     */
    @Column(name = "clean_")
    private String clean_;
    /**
     * 是否为自营格口（0 是 1否）
     */
    @Column(name = "iszy_")
    private String iszy_;
    /**
     * 是否是加盟（合作）格口（0是 1否）
     */
    @Column(name = "isJoin_")
    private String isJoin_;
}
