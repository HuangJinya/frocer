package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="t_user_report")
public class UserReport {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    /**
     * 用于存放城市区号
     */
    @Column(name = "corpNo_")
    private String corpNo_;
    /**
     * 最近更新人员
     */
    @Column(name = "updateUser_")
    private String updateUser_;
    /**
     *最近更新时间
     */
    @Column(name = "updateTime_")
    private Date updateTime_;
    /**
     * '建档人员
     */
    @Column(name = "createUser_")
    private String createUser_;
    /**
     * 建档时间
     */
    @Column(name = "createTime_")
    private Date createTime_;
    /**
     * 注册量
     */
    @Column(name = "regist_count_")
    private Integer regist_count_;
    /**
     * 绑定量
     */
    @Column(name = "bind_count_")
    private Integer bind_count_;
    /**
     * 解绑量
     */
    @Column(name = "unbind_count_")
    private Integer unbind_count_;
    /**
     * 登录数量
     */
    @Column(name = "login_count_")
    private Integer login_count_;
}
