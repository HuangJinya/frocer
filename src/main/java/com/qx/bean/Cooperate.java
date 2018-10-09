package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "t_cooperate")
public class Cooperate {
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
    /**
     * 合作ID
     */
    @Column(name = "Id_")
    private String Id_;
    /**
     * 联系人
     */
    @Column(name = "contact_")
    private String contact_;
    /**
     * 联系电话
     */
    @Column(name = "phone_")
    private String phone_;
}
