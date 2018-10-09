package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 消息实体类
 */
@Entity
@Data
@Table(name="t_message")
public class Message {
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
     * 消息ID
     */
    @Column(name = "messageId_")
    private String messageId_;
    /**
     * 消息类型(0.系统公告1.订单状态)
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 订单ID
     */
    @Column(name = "orderId_")
    private String orderId_;
    /**
     * 消息状态(0.未读1.已读)
     */
    @Column(name = "state_")
    private String state_;
    /**
     * 发送时间
     */
    @Column(name = "sendTime_")
    private Date sendTime_;
}
