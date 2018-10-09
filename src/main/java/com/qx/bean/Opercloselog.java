package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 运维关门记录实体类信息
 */
@Data
@Entity
@Table(name = "t_opercloselog")
public class Opercloselog {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "createDate_")
    private Date createDate_;
    @Column(name = "createUser_")
    private String createUser_;
    /**
     * 柜子ID
     */
    @Column(name = "cabId_")
    private String cabId_;
    /**
     * 箱子ID
     */
    @Column(name = "boxId_")
    private String boxId_;
    /**
     * 描述
     */
    @Column(name = "desc_")
    private String desc_;
}
