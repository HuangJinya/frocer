package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 运费模板实体信息类
 */
@Data
@Entity
@Table(name = "t_freight")
public class Freight {
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
     * 模板名称
     */
    @Column(name = "name_")
    private String name_;
    /**
     * 运费模板ID
     */
    @Column(name = "nameId_")
    private String nameId_;
    /**
     * 按件计费
     */
    @Column(name = "method_")
    private String method_;
    /**
     * 配送运费首件
     */
    @Column(name = "fristJian_")
    private Integer fristJian_;
    /**
     * 首件运费
     */
    @Column(name = "fristJianMoney_")
    private Double fristJianMoney_;
    /**
     * 续件
     */
    @Column(name = "nextJian_")
    private Integer nextJian_;
    /**
     * 续件费用
     */
    @Column(name = "nextJianMoney_")
    private Double nextJianMoney_;
    /**
     * 满多少件包邮
     */
    @Column(name = "baoFreight_")
    private Integer baoFreight_;
    /**
     * 包邮区域
     */
    @Column(name = "baoArea_")
    private String baoArea_;
    /**
     * 不包邮区域
     */
    @Column(name = "notBaoArea_")
    private String notBaoArea_;
}
