package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 活动信息实体
 */
@Data
@Entity
@Table(name = "t_activityinfo")
public class Activityinfo {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "createDate_")
    private Date createDate_;
    @Column(name = "name_")
    private String name_;
    @Column(name = "age_")
    private String age_;
    @Column(name = "phone_")
    private String phone_;
}
