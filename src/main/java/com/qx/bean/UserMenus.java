package com.qx.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户自定义菜单
 */
@Data
@Entity
@Table(name = "s_usermenus")
public class UserMenus {
    /**
     * 用户帐号
     */
    @Id
    @Column(name = "UserCode_")
    private String UserCode_;
    /**
     * 菜单代码
     */
    @Column(name = "MenuCode_")
    private String MenuCode_;
    /**
     * 序
     */
    @Column(name = "It_")
    private Integer It_;

}
