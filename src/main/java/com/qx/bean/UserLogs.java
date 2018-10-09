package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "s_userlogs")
public class UserLogs {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "CorpNo_")
    private String CorpNo_;
    @Column(name = "Level_")
    private Integer Level_;
    @Column(name = "Log_")
    private String Log_;
    @Column(name = "AppUser_")
    private String AppUser_;
    @Column(name = "AppDate_")
    private Date AppDate_;
}
