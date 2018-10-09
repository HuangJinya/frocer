package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 售卖商品的入库单实体类信息
 */
@Data
@Entity
@Table(name = "t_storage")
public class Storage {
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
     * 售卖商品的Id
     */
    @Column(name = "proId_")
    private String proId_;
    /**
     * 售卖商品的进价
     */
    @Column(name = "jinPrice_")
    private Double jinPrice_;
    /**
     * 售卖商品的进价总额
     */
    @Column(name = "jinSum_")
    private Double jinSum_;
    /**
     * 售卖的商品售价
     */
    @Column(name = "salePrice_")
    private Double salePrice_;
    /**
     * 售卖商品的优惠价格
     */
    @Column(name = "offerPrice_")
    private Double offerPrice_;
    /**
     * 售卖商品的优惠数量
     */
    @Column(name = "offerCount_")
    private Integer offerCount_;
    /**
     * 售卖的会员价
     */
    @Column(name = "saleMemPrice_")
    private Double saleMemPrice_;
    /**
     * 售卖商品的货号
     */
    @Column(name = "proNumber_")
    private String proNumber_;
    /**
     * 售卖的商品条形码
     */
    @Column(name = "barCode_")
    private String barCode_;
    /**
     * 售卖商品的颜色
     */
    @Column(name = "saleProColor_")
    private String saleProColor_;
    /**
     * 入库单号
     */
    @Column(name = "ruKuId_")
    private String ruKuId_;
    /**
     * 售卖商品的入库时间
     */
    @Column(name = "saleRuKuTime_")
    private Double saleRuKuTime_;
    /**
     * 售卖商品保质截止日期
     */
    @Column(name = "saleServerDeadTime_")
    private Double saleServerDeadTime_;
    /**
     * 售卖商品的归属机构
     */
    @Column(name = "saleHomeAgency_")
    private String saleHomeAgency_;
    /**
     * 售卖商品的供应商
     */
    @Column(name = "saleSupply_")
    private String saleSupply_;
    /**
     * 入库数量
     */
    @Column(name = "ruKuCount_")
    private Integer ruKuCount_;
    /**
     * 售卖的录入批次
     */
    @Column(name = "pici_")
    private String pici_;
    /**
     * 售出的个数
     */
    @Column(name = "saleCount_")
    private Integer saleCount_;
    /**
     * 冲红数量
     */
    @Column(name = "chCount_")
    private Integer chCount_;
    /**
     * 最后冲红时间
     */
    @Column(name = "chTime_")
    private Date chTime_;
}
