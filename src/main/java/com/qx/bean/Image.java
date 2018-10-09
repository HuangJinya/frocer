package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 图片实体类信息
 */
@Entity
@Data
@Table(name = "t_image")
public class Image {
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
     * 相关ID
     */
    @Column(name = "relevancelId_")
    private String relevancelId_;
    /**
     * 图片路径
     */
    @Column(name = "imgPath_")
    private String imgPath_;
    /**
     * 图片类型
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 0:未删除 1:删除
     */
    @Column(name = "imgDel_")
    private String imgDel_;
}
