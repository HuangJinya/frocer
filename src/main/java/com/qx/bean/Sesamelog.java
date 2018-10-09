package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 芝麻信用认证记录实体类信息
 */
@Data
@Entity
@Table(name = "t_sesamelog")
public class Sesamelog {
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
     * 身份证姓名
     */
    @Column(name = "name_")
    private String name_;
    /**
     * 身份号
     */
    @Column(name = "idCard_")
    private String idCard_;
    /**
     * 1、已授权 0、未授权
     */
    @Column(name = "sqStatus_")
    private Integer sqStatus_;
    /**
     * 1、认证成功 0、认证失败
     */
    @Column(name = "rzStatus_")
    private Integer rzStatus_;
    /**
     * 芝麻分
     */
    @Column(name = "sesameFen_")
    private Integer sesameFen_;
    /**
     * 认证次数
     */
    @Column(name = "count_")
    private Integer count_;
}
