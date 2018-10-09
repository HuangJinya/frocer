package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 商品电子条码信息实体类
 */
@Data
@Entity
@Table(name = "t_pronode")
public class Pronode {
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
     * 商品Id
     */
    @Column(name = "proId_")
    private String proId_;
    /**
     * 主电子条码
     */
    @Column(name = "zhuCode_")
    private String zhuCode_;
    /**
     * 加密编码
     */
    @Column(name = "encrypt_")
    private String encrypt_;
    /**
     * 进价
     */
    @Column(name = "proCostPrice_")
    private String proCostPrice_;
    /**
     * 报废年限（自定义折旧年限
     */
    @Column(name = "scrapTime_")
    private String scrapTime_;
    /**
     * 当前折旧（报废）的情况 范围（0-10）
     */
    @Column(name = "scrapState_")
    private String scrapState_;
    /**
     * 保修截至日期
     */
    @Column(name = "serverDeadTime_")
    private Date serverDeadTime_;
    /**
     * 入库时间
     */
    @Column(name = "enterKu_")
    private Date enterKu_;
    /**
     * 当前商品状态（0：启用   1：保修  2：报废  3：返厂翻新）
     */
    @Column(name = "state_")
    private String state_;
    /**
     * 备注
     */
    @Column(name = "remark_")
    private String remark_;
    /**
     * 归属机构
     */
    @Column(name = "homeAgency_")
    private String homeAgency_;
    /**
     * 供应商
     */
    @Column(name = "supplyUser_")
    private String supplyUser_;
    /**
     * 是否删除0：未删除    1：已删除
     */
    @Column(name = "isDel_")
    private String isDel_;
    /**
     * 物品上次归还前是否有运维 0:无 1：有
     */
    @Column(name = "operateState_")
    private String operateState_;
}
