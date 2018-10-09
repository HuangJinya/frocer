package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "s_pagelogs")
public class PageLogs {

    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "corpNo_")
    private String corpNo_;
    @Column(name = "page_")
    private String page_;
    @Column(name = "dataIn_")
    private String dataIn_;
    @Column(name = "tickCount_")
    private String tickCount_;
    @Column(name = "AppUser_")
    private String AppUser_;
    @Column(name = "createTime_")
    private Date createTime_;
}
