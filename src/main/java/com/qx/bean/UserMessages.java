package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "s_usermessages")
public class UserMessages {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    /**
     * 帐套编号
     */
    @Column(name = "CorpNo_")
    private String CorpNo_;
    /**
     * 接收用户
     */
    @Column(name = "UserCode_")
    private String UserCode_;
    /**
     * 消息等级
     */
    @Column(name = "Level_")
    private Integer Level_;
    @Column(name = "Process_")
    private Integer Process_;
    @Column(name = "Subject_")
    private String Subject_;
    /**
     * 内容
     */
    @Column(name = "Content_")
    private String Content_;
    /**
     * 状态
     */
    @Column(name = "Status_")
    private Integer Status_;
    /**
     * 发送时间
     */
    @Column(name = "AppDate_")
    private Date AppDate_;
    /**
     * 确认否
     */
    @Column(name = "Final_")
    private int Final_;
    /**
     * 发送者
     */
    @Column(name = "AppUser_")
    private String AppUser_;
}
