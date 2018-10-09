package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name="s_applogs")
public class AppLogs {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer uID_;
    @Column(name = "CorpNo_")
    private String corpNo_;
    @Column(name = "Service_")
    private String service_;
    @Column(name = "Trans_")
    private int trans_;
    @Column(name = "TickCount_")
    private BigDecimal tickCount_;
    @Column(name = "AppUser_")
    private String appUser_;
    @Column(name = "AppDate_")
    private Date appDate_;
    @Column(name = "DataIn_")
    private String dataIn_;
}
