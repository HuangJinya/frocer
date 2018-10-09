package com.qx.bean;

import lombok.Data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 用户设置档实体类
 */
@Entity
@Data
@Table(name = "s_useroptions")
public class UserOptions {
    @Id
    @Column(name = "UserCode_")
    private String UserCode_;
    @Column(name = "Code_")
    private String Code_;
    @Column(name = "Name_")
    private String Name_;
    @Column(name = "Value_")
    private String Value_;
    @Column(name = "UpdateUser_")
    private String UpdateUser_;
    @Column(name = "UpdateDate_")
    private Date UpdateDate_;
    @Column(name = "AppUser_")
    private String AppUser_;
    @Column(name = "AppDate_")
    private Date AppDate_;
    @Column(name = "UpdateKey_")
    private String UpdateKey_;
}
