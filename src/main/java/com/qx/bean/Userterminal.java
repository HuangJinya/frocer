package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户终端实体类
 */
@Table(name = "s_userterminal")
@Entity
@Data
public class Userterminal {

    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    /**
     * 终端ID
     */
    @Column(name = "terminal_")
    private String terminal_;
    /**
     * 用户
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 状态(0:正常，1：停用)
     */
    @Column(name = "status_")
    private int status_;
    /**
     * 编号
     */
    @Column(name = "corpNo_")
    private String corpNo_;
    /**
     * 建档时间
     */
    @Column(name = "createTime_")
    private Date createTime_;
    /**
     * 更新时间
     */
    @Column(name = "updateTime_")
    private Date updateTime_;
    /**
     * 更新者
     */
    @Column(name = "updateUser_")
    private String updateUser_;
    /**
     * 终端类型（app:手机APP,weixin:微信 ，codeLogin:验证码登录）
     */
    @Column(name = "type_")
    private String type_;
}
