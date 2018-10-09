package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 社区运维人员中间表
 */
@Data
@Entity
@Table(name = "t_cabinet_manager")
public class CabinetManager {
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
     * 挂靠社区编号
     */
    @Column(name = "communityNum_")
    private String communityNum_;
    /**
     * 运维人员编号
     */
    @Column(name = "managerId_")
    private String managerId_;
}
