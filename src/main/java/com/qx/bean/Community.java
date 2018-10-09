package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 社区实体类信息
 */
@Data
@Entity
@Table(name = "t_community")
public class Community {
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
     * 社区ID
     */
    @Column(name = "communityId_")
    private String communityId_;
    /**
     * 社区序号
     */
    @Column(name = "communityNo_")
    private String communityNo_;
    /**
     * 社区简称
     */
    @Column(name = "communityJname_")
    private String communityJname_;
    /**
     * 社区名称
     */
    @Column(name = "communityName_")
    private String communityName_;
    /**
     * 社区物业简称
     */
    @Column(name = "wuYeJname_")
    private String wuYeJname_;
    /**
     * 物业全称
     */
    @Column(name = "wuYeName_")
    private String wuYeName_;
    /**
     * 物业电话
     */
    @Column(name = "wuYePhone_")
    private String wuYePhone_;
    /**
     * 社区区域
     */
    @Column(name = "communityArea_")
    private String communityArea_;
    /**
     * 门牌地址
     */
    @Column(name = "doorPlate_")
    private String doorPlate_;
    /**
     * 商城社区地址
     */
    @Column(name = "address_")
    private String address_;
    /**
     * 总部
     */
    @Column(name = "headquarters_")
    private String headquarters_;
    /**
     * 省代理
     */
    @Column(name = "provinceAgent_")
    private String provinceAgent_;
    /**
     * 市代理
     */
    @Column(name = "cityAgent_")
    private String cityAgent_;
    /**
     * 区域代理
     */
    @Column(name = "areaAgent_")
    private String areaAgent_;
    /**
     * 区域ID
     */
    @Column(name = "areaid_")
    private String areaid_;
}
