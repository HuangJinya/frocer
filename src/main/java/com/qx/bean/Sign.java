package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "t_sign")
public class Sign {
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
     * 签到人
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 备注
     */
    @Column(name = "remark_")
    private String remark_;
}
