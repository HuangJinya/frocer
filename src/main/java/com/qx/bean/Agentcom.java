package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 社区与代理商关联实体类
 */
@Data
@Entity
@Table(name = "t_agentcom")
public class Agentcom {
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
    @Column(name = "communityId_")
    private String communityId_;
    @Column(name = "agentId_")
    private String agentId_;
}
