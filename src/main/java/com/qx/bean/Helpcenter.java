package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 帮助中心实体类信息
 */
@Data
@Entity
@Table(name="t_helpcenter")
public class Helpcenter {
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
     * 文章标题
     */
    @Column(name = "title_")
    private String title_;
    /**
     * 添加文章时间
     */
    @Column(name = "addtime_")
    private Date addtime_;
    /**
     * 新增文章内容
     */
    @Column(name = "content_")
    private String content_;
    /**
     * 标题ID
     */
    @Column(name = "id_")
    private String id_;
}
