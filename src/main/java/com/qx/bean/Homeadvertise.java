package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "t_homeadvertise")
public class Homeadvertise {
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
     * 图片ID
     */
    @Column(name = "imgId_")
    private String imgId_;
    /**
     * 是否删除
     */
    @Column(name = "isDel_")
    private Integer isDel_;
    /**
     * 视频地址
     */
    @Column(name = "vedioId_")
    private String vedioId_;
    @Column(name = "imgSrc_")
    private String imgSrc_;
}
