package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 商品活动实体类信息
 */
@Data
@Entity
@Table(name="t_proactivity")
public class Proactivity {
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
    private String proId_;
    /**
     * 商品简称
     */
    @Column(name = "proName_")
    private String proName_;
    /**
     * 商品品牌
     */
    @Column(name = "proBrand_")
    private String proBrand_;
    @Column(name = "firstTypeName_")
    private String firstTypeName_;
    @Column(name = "twoTypeName_")
    private String twoTypeName_;
    /**
     *所有权  1.加盟 0.自营
     */
    @Column(name = "attribute_")
    private String attribute_;
    @Column(name = "startTime_")
    private Date startTime_;
    /**
     * 发布人
     */
    @Column(name = "releaseUser_")
    private String releaseUser_;
    /**
     * （0:0元租 1.五折优惠 ） 1.折扣优惠2.自定义优惠 3.首页热门推荐
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 活动ID
     */
    @Column(name = "actId_")
    private String actId_;
    /**
     * 是否取消活动  0.已取消  1.未取消
     */
    @Column(name = "iscancel_")
    private String iscancel_;
}
