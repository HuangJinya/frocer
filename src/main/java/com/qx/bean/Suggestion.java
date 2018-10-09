package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 反馈建议实体类信息
 */
@Data
@Entity
@Table(name = "t_suggestion")
public class Suggestion {
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
     * 建议ID
     */
    @Column(name = "sugId_")
    private String sugId_;
    /**
     * 建议内容
     */
    @Column(name = "sugcontent_")
    private String sugcontent_;
    /**
     * 用户ID
     */
    @Column(name = "userId_")
    private String userId_;
}
