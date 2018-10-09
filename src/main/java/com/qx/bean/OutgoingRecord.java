package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 出库记实体类信息
 */
@Data
@Entity
@Table(name="t_outgoing_record")
public class OutgoingRecord {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "createDate_")
    private Date createDate_;
    @Column(name = "createUser_")
    private String createUser_;
    /**
     * 认证编号
     */
    @Column(name = "userNum_")
    private String userNum_;
    /**
     * 出库数量
     */
    @Column(name = "creatCount_")
    private String creatCount_;
    /**
     * 1:线上检测出库  2：线下检测出库
     */
    @Column(name = "insertType_")
    private String insertType_;
    /**
     * 出库记录标示
     */
    @Column(name = "outId_")
    private String outId_;
}
