package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 运维上报征信单实体类
 */
@Data
@Entity
@Table(name="t_operatelevy")
public class Operatelevy {
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
     * 运维订单id
     */
    @Column(name = "ywNo_")
    private String ywNo_;
    /**
     * 运维上报责任人
     */
    @Column(name = "reportedRen_")
    private String reportedRen_;
    /**
     * 运维上报时间
     */
    @Column(name = "reportedTime_")
    private Date reportedTime_;
    /**
     * 上报客户
     */
    @Column(name = "reportedClient_")
    private String reportedClient_;
    /**
     * 上报说明
     */
    @Column(name = "reportedInstructions_")
    private String reportedInstructions_;
    /**
     * 上报处理建议
     */
    @Column(name = "reportedSuggest_")
    private String reportedSuggest_;
    /**
     * 处理人
     */
    @Column(name = "dealer_")
    private String dealer_;
    /**
     * 处理状态(1、未处理/2、已处理)
     */
    @Column(name = "status_")
    private String status_;
}
