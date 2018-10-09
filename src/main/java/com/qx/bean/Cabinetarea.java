package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 柜组配置记录实体信息类
 */
@Data
@Entity
@Table(name = "t_cabinet_configrecord")
public class Cabinetarea {

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
     * 记录id（查询操作使用此id）
     */
    @Column(name = "id_")
    private String id_;
    /**
     * 配置时间
     */
    @Column(name = "configDate_")
    private Date configDate_;
    /**
     * 柜组编号
     */
    @Column(name = "cabinetId_")
    private String cabinetId_;
    /**
     * 配置柜组的运维人员编号
     */
    @Column(name = "managerId_")
    private String managerId_;
}
