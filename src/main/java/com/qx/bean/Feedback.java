package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 意见反馈实体类信息
 */
@Data
@Entity
@Table(name = "t_feedback")
public class Feedback {
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
     * 发聩者id
     */
    @Column(name = "userid_")
    private String userid_;
    /**
     * 回复文本id
     */
    @Column(name = "replyid_")
    private String replyid_;
    /**
     * 意见文本id
     */
    @Column(name = "id_")
    private String id_;
    /**
     * 回复文本
     */
    @Column(name = "reply_")
    private String reply_;
    /**
     * 意见文本
     */
    @Column(name = "view_")
    private String view_;
    /**
     * 后台回复时间
     */
    @Column(name = "answer_time")
    private Date answer_time;
    /**
     * 前台反馈提交时间
     */
    @Column(name = "submit_time")
    private Date submit_time;
    /**
     * 反馈人姓名
     */
    @Column(name = "username")
    private String username;
    /**
     * 用户手机号
     */
    @Column(name = "userphone")
    private String userphone;
    /**
     * 回复人id
     */
    @Column(name = "userCode_")
    private String userCode_;
}
