package com.qx.bean;

import lombok.Data;

import javax.naming.ldap.PagedResultsControl;
import javax.persistence.*;
import java.util.Date;

/**
 * 代理商实体类
 */
@Entity
@Data
@Table(name = "t_agent")
public class Agent {
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
     * 代理商序号
     */
    @Column(name = "agentNum_")
    private int agentNum_;
    /**
     * 代理商编码
     */
    @Column(name = "agentNo_")
    private String agentNo_;
    /**
     * 代理商简称
     */
    @Column(name = "agentJname_")
    private String agentJname_;
    /**
     * 代理商全称
     */
    @Column(name = "agentName_")
    private String agentName_;
    /**
     * 代理商级别
     */
    @Column(name = "agentLevel_")
    private String agentLevel_;
    /**
     * 代理区域
     */
    @Column(name = "agentArea_")
    private String agentArea_;
    /**
     * 社区ID
     */
    @Column(name = "communityId_")
    private String communityId_;
    @Column(name = "agentId_")
    private String agentId_;
}
