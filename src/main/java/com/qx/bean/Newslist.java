package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 消息管理实体信息类
 */
@Data
@Entity
@Table(name = "t_newslist")
public class Newslist {
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
     * 标题
     */
    @Column(name = "title_")
    private String title_;
    /**
     * 消息内容
     */
    @Column(name = "content_")
    private String content_;
    /**
     * 消息类型：(1、订单消息 2、系统消息 3、运维消息)
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 发送时间
     */
    @Column(name = "sendTime_")
    private Date sendTime_;
    /**
     * 发送对象
     */
    @Column(name = "sendOb_")
    private String sendOb_;
    /**
     * 消息内容id
     */
    @Column(name = "id_")
    private String id_;
    /**
     * 发送人
     */
    @Column(name = "sender_")
    private String sender_;
    /**
     * 消息状态
     */
    @Column(name = "status_")
    private String status_;
    /**
     * 用户名
     */
    @Column(name = "userCode_")
    private String userCode_;
}
