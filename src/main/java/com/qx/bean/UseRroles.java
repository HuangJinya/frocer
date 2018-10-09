package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 角色表
 */
@Entity
@Data
@Table(name = "s_userroles")
public class UseRroles {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    /**
     * 所属版本
     */
    @Column(name = "CorpType_")
    private Integer CorpType_;
    /**
     * 角色代码
     */
    @Column(name = "Code_")
    private String Code_;

    /**
     *角色名称
     */
    @Column(name = "Name_")
    private String Name_;
    /**
     * 参考角色
     */
    @Column(name = "StandardRole_")
    private String StandardRole_;
    /**
     * 备注
     */
    @Column(name = "Remark_")
    private String Remark_;
    /**
     * 启停状态
     */
    @Column(name = "isLive_")
    private String isLive_;
    /**
     * 内置角色否
     */
    @Column(name = "System_")
    private int System_;
    /**
     * 新用户默认
     */
    @Column(name = "Default_")
    private int Default_;
    /**
     * 更新人员
     */
    @Column(name = "UpdateUser_")
    private String UpdateUser_;
    /**
     * 更新时间
     */
    @Column(name = "UpdateDate_")
    private Date UpdateDate_;
    /**
     * 建档人员
     */
    @Column(name = "AppUser_")
    private String AppUser_;
    /**
     * 建档时间
     */
    @Column(name = "AppDate_")
    private Date AppDate_;
    /**
     * 更新ID
     */
    @Column(name = "UpdateKey_")
    private String UpdateKey_;
    /**
     * 是否为隐藏角色
     */
    @Column(name = "Hide_")
    private int Hide_;
}
