package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 在线用户信息实体类
 */
@Table(name = "s_currentuser")
@Entity
@Data
public class Currentuser {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID;
    /**
     * SessionID
     */
    @Column(name = "LoginID_")
    private String LoginID_;
    /**
     * 帐套编号
     */
    @Column(name = "CorpNo_")
    private String CorpNo_;
    /**
     * 用户帐号
     */
    @Column(name = "Account_")
    private String Account_;
    /**
     * 版本号
     */
    @Column(name = "clientVersion_")
    private String clientVersion_;
    /**
     * os版本号
     */
    @Column(name = "clientOS_")
    private String clientOS_;
    /**
     * 客户端IP
     */
    @Column(name = "clientIP_")
    private String clientIP_;
    /**
     * 屏幕分辨率
     */
    @Column(name = "Screen_")
    private String Screen_;
    /**
     * 电脑名称
     */
    @Column(name = "Computer_")
    private String Computer_;
    @Column(name = "LoginServer_")
    private String LoginServer_;
    @Column(name = "LoginTime_")
    private Date LoginTime_;
    @Column(name = "LogoutTime_")
    private Date LogoutTime_;
    @Column(name = "KeyCardID_")
    private String KeyCardID_;
    @Column(name = "ParamValue_")
    private String ParamValue_;
    /**
     * 生命值
     */
    @Column(name = "Viability_")
    private int Viability_;
    /**
     * 用户ID
     */
    @Column(name = "UserID_")
    private String UserID_;
}
