package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 捐赠实体类信息
 */
@Entity
@Data
@Table(name = "t_donation")
public class Donation {
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
    @Column(name = "donationId_")
    private String donationId_;
    /**
     * 商品数量
     */
    @Column(name = "productNum_")
    private Integer productNum_;
    /**
     *  商品规格  0：大 1：小 2：中
     */
    @Column(name = "proGuiGe_")
    private String proGuiGe_;
    /**
     * 描述 1:衣物 0：书籍
     */
    @Column(name = "proRemark_")
    private String proRemark_;
    /**
     * 捐赠状态 0：已捐赠  1：未捐赠
     */
    @Column(name = "status_")
    private String status_;
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 捐赠说明
     */
    @Column(name = "explain_")
    private String explain_;
    /**
     * 所属箱柜
     */
    @Column(name = "cabId_")
    private String cabId_;
    /**
     * 收货状态 0：未收货 1：已收货
     */
    @Column(name = "gdStatus_")
    private String gdStatus_;
    /**
     * 收货人电话
     */
    @Column(name = "gdMobile_")
    private Integer gdMobile_;
    /**
     * 收货时间
     */
    @Column(name = "gbTime_")
    private Date gbTime_;
    /**
     * 图片地址
     */
    @Column(name = "imageURL_")
    private String imageURL_;

}
