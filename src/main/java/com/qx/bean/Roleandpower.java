package com.qx.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * 角色权限中间实体类信息
 */
@Data
@Entity
@Table(name = "t_roleandpower")
public class Roleandpower {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "roleId_")
    private String roleId_;
    @Column(name = "powerId_")
    private Integer powerId_;
}
