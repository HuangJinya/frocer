package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 合作商实体类信息
 */
@Data
@Entity
@Table(name="t_partner")
public class Partner {
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
     * 合作单ID
     */
    @Column(name = "partnerId_")
    private String partnerId_;
    /**
     * 合作单用户名
     */
    @Column(name = "partnerName_")
    private String partnerName_;
    /**
     * 开始时间
     */
    @Column(name = "startDate_")
    private Date startDate_;
    /**
     * 结束时间
     */
    @Column(name = "deadlineDate_")
    private Date deadlineDate_;
    /**
     * 合作商联络人
     */
    @Column(name = "partnerRen_")
    private String partnerRen_;
    /**
     * 合作商手机号
     */
    @Column(name = "partnerPhone_")
    private String partnerPhone_;
    /**
     * 合作商地址
     */
    @Column(name = "partnerAddr_")
    private String partnerAddr_;
    /**
     * 内部负责人
     */
    @Column(name = "principal_")
    private String principal_;
    /**
     * 负责人手机号
     */
    @Column(name = "phone_")
    private String phone_;
    /**
     * 租赁格口数
     */
    @Column(name = "boxCount_")
    private Integer boxCount_;
    /**
     * 备注
     */
    @Column(name = "desc_")
    private String desc_;
    /**
     * 0 未删除 1已删除
     */
    @Column(name = "status_")
    private String status_;
}
