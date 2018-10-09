package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 供应商实体类信息
 */
@Data
@Entity
@Table(name = "t_supplypeople")
public class Supplypeople {
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
     * 供应商编号
     */
    @Column(name = "supplyId_")
    private String supplyId_;
    /**
     * 供应商简称
     */
    @Column(name = "supplyShortName_")
    private String supplyShortName_;
    /**
     * 供应商全称
     */
    @Column(name = "supplyFullName_")
    private String supplyFullName_;
    /**
     * 营业执照号
     */
    @Column(name = "businessLicense_")
    private String businessLicense_;
    /**
     * 公司固话
     */
    @Column(name = "companyTel_")
    private String companyTel_;
    /**
     * 供应物品范围
     */
    @Column(name = "supplyGoodsRange_")
    private String supplyGoodsRange_;
    /**
     * 联系人
     */
    @Column(name = "contact_")
    private String contact_;
    /**
     * 手机
     */
    @Column(name = "tel_")
    private String tel_;
    /**
     * QQ
     */
    @Column(name = "qq_")
    private String qq_;
    /**
     * 经营模式
     */
    @Column(name = "businessModel_")
    private String businessModel_;
    /**
     * 经营地址
     */
    @Column(name = "businessAdress_")
    private String businessAdress_;
    /**
     * 注册资本（万人民币）
     */
    @Column(name = "registerMoney_")
    private String registerMoney_;
    /**
     * 法人代表
     */
    @Column(name = "legalExpre_")
    private String legalExpre_;
    /**
     * 状态（是否删除）0 :未删除        1：已删除
     */
    @Column(name = "isDel_")
    private String isDel_;
    /**
     * 是否关联商品   0：未关联    1：关联
     */
    @Column(name = "isAssociated_")
    private String isAssociated_;
    /**
     * 关联商品的id
     */
    @Column(name = "proId_")
    private String proId_;
}
