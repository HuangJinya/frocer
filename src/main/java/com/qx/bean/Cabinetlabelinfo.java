package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="t_cabinetlabelinfo")
public class Cabinetlabelinfo {
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
     * 智能柜ID
     */
    @Column(name = "cabinetId")
    private String cabinetId;
    /**
     * 箱子编号
     */
    @Column(name = "numOrder")
    private String numOrder;
    /**
     * 锁编号
     */
    @Column(name = "lockNumber")
    private String lockNumber;
    /**
     * rfid主天线ID
     */
    @Column(name = "hostAnt")
    private String hostAnt;
    /**
     * rfid子天线id
     */
    @Column(name = "childAnt")
    private String childAnt;
    /**
     * 商品电子标签
     */
    @Column(name = "goodsLab")
    private String goodsLab;
}
