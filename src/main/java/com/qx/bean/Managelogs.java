package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 后台日志实体信息类
 */
@Data
@Entity
@Table(name="t_managelogs")
public class Managelogs {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "operateUser_")
    private String operateUser_;
    @Column(name = "operateData_")
    private Date operateData_;
    @Column(name = "operateType_")
    private String operateType_;
    @Column(name = "operate_")
    private String operate_;
    @Column(name = "operateAdress_")
    private String operateAdress_;
    @Column(name = "operateDetail_")
    private String operateDetail_;
    @Column(name = "corpNo_")
    private String corpNo_;
}
