package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 积分类型实体信息类
 */
@Data
@Entity
@Table(name = "t_integraltype")
public class Integraltype {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "createTime_")
    private Date createTime_;
    @Column(name = "createUser_")
    private String createUser_;
    @Column(name = "updateTime_")
    private Date updateTime_;
    @Column(name = "updateUser_")
    private String updateUser_;
    /**
     * 积分类型 1:邀请积分  0：签到积分
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 积分值
     */
    @Column(name = "integral_")
    private String integral_;
}
