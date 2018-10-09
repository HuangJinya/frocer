package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 采购实体类信息
 */
@Data
@Entity
@Table(name="t_purchase")
public class Purchase {
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
     * 商品ID
     */
    @Column(name = "proId_")
    private String proId_;
    /**
     * 采购单ID
     */
    @Column(name = "purchaseID_")
    private String purchaseID_;
    /**
     * 物料名称
     */
    @Column(name = "proName_")
    private String proName_;
    /**
     * 品牌
     */
    @Column(name = "proBrand_")
    private String proBrand_;
    /**
     * 单位
     */
    @Column(name = "proUnit_")
    private String proUnit_;
    /**
     * 数量
     */
    @Column(name = "proNum_")
    private Integer proNum_;
    /**
     * 型号
     */
    @Column(name = "proModel_")
    private String proModel_;
    /**
     * 申请人
     */
    @Column(name = "applicant_")
    private String applicant_;
    /**
     * 部门 0：运营部  1.市场部
     */
    @Column(name = "department_")
    private String department_;
    /**
     * 用途  0.运营商品 1.生产物料 2.市场物料 3.办公文具
     */
    @Column(name = "purpose_")
    private String purpose_;
    /**
     * 状态  0:待采购 1.采购中 2.采购成功
     */
    @Column(name = "status_")
    private String status_;
    /**
     *
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 属性  1.托管 0.自营
     */
    @Column(name = "attribute_")
    private String attribute_;
}
