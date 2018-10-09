package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 后台录入客户认证实体信息类
 */
@Data
@Entity
@Table(name="t_clientcertified")
public class Clientcertified {
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
     * 用户手机号
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 来源
     */
    @Column(name = "source_")
    private String source_;
    /**
     * 属性
     */
    @Column(name = "attributes_")
    private String attributes_;
    /**
     * 资料责任人
     */
    @Column(name = "dataRen_")
    private String dataRen_;
    /**
     * 状态
     */
    @Column(name = "status_")
    private String status_;
}
