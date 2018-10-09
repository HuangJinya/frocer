package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 积分等级实体类信息
 */
@Data
@Entity
@Table(name = "t_integrallevel")
public class Integrallevel {
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
    @Column(name = "levelID_")
    private String levelID_;
    /**
     * 等级
     */
    @Column(name = "grade_")
    private String grade_;
    /**
     * 备注
     */
    @Column(name = "remark_")
    private String remark_;
    /**
     * 积分值
     */
    @Column(name = "num_")
    private Integer num_;
}
