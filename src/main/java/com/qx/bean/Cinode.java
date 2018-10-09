package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 配件电子条码实体类信息
 */
@Data
@Entity
@Table(name="t_cinode")
public class Cinode {
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
     * 主电子条码表
     */
    @Column(name = "zhuCode_")
    private String zhuCode_;
    /**
     * 配件电子条码
     */
    @Column(name = "ciCode_")
    private String ciCode_;
    /**
     * 配件电子条码名称
     */
    @Column(name = "ciCodeName_")
    private String ciCodeName_;
    /**
     * 是否删除 0 未删除    1已删除
     */
    @Column(name = "ciDel_")
    private String ciDel_;
    /**
     * 商品图片
     */
    @Column(name = "imgPath_")
    private String imgPath_;
    /**
     * 配件名称
     */
    @Column(name = "partName_")
    private String partName_;
    /**
     * 配件规则
     */
    @Column(name = "partRule_")
    private String partRule_;
    /**
     * 配件数量
     */
    @Column(name = "partNum_")
    private int partNum_;
    /**
     * 配件备注
     */
    @Column(name = "partRemark_")
    private String partRemark_;
    /**
     * 商品ID
     */
    @Column(name = "proId_")
    private String proId_;
}
