package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 商品分类实体信息
 */
@Data
@Entity
@Table(name = "t_protype")
public class Protype {
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
     * 一级分类名称
     */
    @Column(name = "fristName_")
    private String fristName_;
    /**
     * 一级分类ID
     */
    @Column(name = "fristNameId_")
    private String fristNameId_;
    /**
     * 一级分类状态(0.启用1.禁用)
     */
    @Column(name = "fristState_")
    private String fristState_;
    /**
     * 0 未删除 ,1 删除
     */
    @Column(name = "fristDel_")
    private String fristDel_;
    /**
     * 二级分类名称
     */
    @Column(name = "twoName_")
    private String twoName_;
    /**
     * 二级分类ID
     */
    @Column(name = "twoNameId_")
    private String twoNameId_;
    /**
     * 二级分类状态
     */
    @Column(name = "twoState_")
    private String twoState_;
    /**
     * 0 未删除 ,1删除
     */
    @Column(name = "twoDel_")
    private String twoDel_;
    /**
     * 三级分类名称
     */
    @Column(name = "proModel_")
    private String proModel_;
    /**
     * 三级分类ID(商品型号)
     */
    @Column(name = "proModelId_")
    private String proModelId_;
    /**
     * 三级分类状态(0.启用1.禁用)
     */
    @Column(name = "proModelState_")
    private String proModelState_;
    /**
     * 0 未删除,1删除
     */
    @Column(name = "proDel_")
    private String proDel_;
    /**
     * 二级分类的图片地址
     */
    @Column(name = "twoImgUrl_")
    private String twoImgUrl_;
    /**
     * 一级分类图标
     */
    @Column(name = "fristImgUrl_")
    private String fristImgUrl_;
}
