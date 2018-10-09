package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 收藏实体类信息
 */
@Data
@Entity
@Table(name = "t_collect")
public class Collect {
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
     * 收藏ID
     */
    @Column(name = "colID_")
    private String colID_;
    /**
     * 用户ID
     */
    @Column(name = "userID_")
    private String userID_;
    /**
     * 商品ID
     */
    @Column(name = "proId_")
    private String proId_;
    /**
     * 状态(0.收藏1.不收藏)
     */
    @Column(name = "status_")
    private String status_;
}
