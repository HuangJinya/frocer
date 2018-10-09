package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 中控屏状态实体类信息
 */
@Data
@Entity
@Table(name = "t_reportinfo")
public class Reportinfo {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "createDate_")
    private Date createDate_;
    /**
     * 智能柜编号
     */
    @Column(name = "cabId_")
    private String cabId_;
    /**
     * 报告信息
     */
    @Column(name = "msg_")
    private String msg_;
}
