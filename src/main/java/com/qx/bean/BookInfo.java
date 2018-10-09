package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 帐号编号登记实体类
 */
@Entity
@Table(name = "t_bookinfo")
@Data
public class BookInfo {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    /**
     * 取值范围：0.总运营商；1.城市
     */
    @Column(name = "corpType_")
    private Integer corpType_;
    /**
     * 存放城市区号
     */
    @Column(name = "corpNo_")
    private String corpNo_;
    /**
     * 存放城市简称
     */
    @Column(name = "shortName_")
    private String shortName_;
    /**
     * 存放城市全称
     */
    @Column(name = "name_")
    private String name_;
    /**
     * 微信公众号
     */
    @Column(name = "wxAccount_")
    private String wxAccount_;
    /**
     * 微信APPID
     */
    @Column(name = "wxAppid_")
    private String wxAppid_;
    /**
     * 取值范围：0.未启用，1.使用中，2.已停用
     */
    @Column(name = "status_")
    private String status_;
    /**
     * 备注
     */
    @Column(name = "remark_")
    private String remark_;
    /**
     * 操作者
     */
    @Column(name = "AppUser_")
    private String AppUser_;
    /**
     * 创建时间
     */
    @Column(name = "cretateDate_")
    private Date cretateDate_;
    /**
     * 修改者
     */
    @Column(name = "updateUser_")
    private String updateUser_;
    /**
     * 更新时间
     */
    @Column(name = "updateDate_")
    private Date updateDate_;

}
