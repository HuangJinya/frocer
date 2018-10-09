package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 公司信息实体类
 */
@Data
@Entity
@Table(name="t_s_custommenus")
public class CustomMenus {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID;
    /**
     * 公司编号
     */
    @Column(name = "CorpNo_")
    private String CorpNo_;
    /**
     * 菜单名
     */
    @Column(name = "Code_")
    private String Code_;
    /**
     * 备注
     */
    @Column(name = "Remark_")
    private String Remark_;
    /**
     * 建档人员
     */
    @Column(name = "AppUser_")
    private String AppUser_;
    /**
     * 建档日期
     */
    @Column(name = "AppDate_")
    private Date AppDate_;
}
