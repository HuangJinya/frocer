package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 商品状态实体类信息
 */
@Data
@Entity
@Table(name="t_prostate")
public class Prostate {
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
     * 商品id
     */
    @Column(name = "proId_")
    private String proId_;
    /**
     *商品名称
     */
    @Column(name = "proName_")
    private String proName_;
    /**
     * 主电子条码
     */
    @Column(name = "zhuCode_")
    private String zhuCode_;
    /**
     * 配件电子条码
     */
    @Column(name = "ciCode_")
    private String ciCode_;
    /**
     * （1.在库，2.线下运营（在柜），3.线下租用（在租），4.在途 5.已售 6.维护中 7.废止 8.采购入库 9.托管入库 10.待采购 11.采购中   12.已配置（待出货） 13.待上架  14、线下回仓(待回仓) 15
     */
    @Column(name = "nodeState_")
    private String nodeState_;
    /**
     * 是否删除  0：未删除    1：已删除
     */
    @Column(name = "coDel_")
    private String coDel_;

}
