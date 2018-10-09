package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 管理员信息实体类
 */
@Table(name = "t_adminanduser")
@Entity
@Data
public class Adminanduser {
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
     * 管理员id
     */
    @Column(name = "adminCode_")
    private String adminCode_;
    /**
     * 用户ID
     */
    @Column(name = "userCode_")
    private String userCode_;
}
