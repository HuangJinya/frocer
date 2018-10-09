package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 中控屏版本更新实体类信息
 */
@Data
@Entity
@Table(name = "t_version")
public class Version {
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
    /**
     * 版本号
     */
    @Column(name = "versionNum_")
    private Double versionNum_;
    /**
     * 版本文件
     */
    @Column(name = "versionFile_")
    private String versionFile_;
    /**
     * 版本名称
     */
    @Column(name = "versionName_")
    private String versionName_;
}
