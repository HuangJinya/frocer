package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 地址管理实体信息
 */
@Data
@Entity
@Table(name = "t_adr")
public class Adr {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    /**
     * 创建时间
     */
    @Column(name = "createData_")
    private Date createData_;
    /**
     * 创建者ID
     */
    @Column(name = "createUser_")
    private String createUser_;
    /**
     * 最后修改时间
     */
    @Column(name = "updateDate_")
    private Date updateDate_;
    /**
     *最后修改人
     */
    @Column(name = "updateUser_")
    private String updateUser_;
    /**
     * 地址id
     */
    @Column(name = "id_")
    private String id_;
    /**
     * 用户id
     */
    @Column(name = "userid_")
    private String  userid_;
    /**
     * 用户地址
     */
    @Column(name = "adr_")
    private String adr_;
    /**
     * 地址状态(0.默认1.普通2.删除)
     */
    @Column(name = "adrState_")
    private String adrState_;
    /**
     * 横坐标
     */
    @Column(name = "Xlatitude_")
    private String Xlatitude_;
    /**
     * 纵坐标
     */
    @Column(name = "Ylatitude_")
    private String Ylatitude_;
    /**
     * 用户名
     */
    @Column(name = "name_")
    private String name_;
    /**
     * 用户备注
     */
    @Column(name = "remark_")
    private String remark_;
    /**
     * 用户电话
     */
    @Column(name = "telpho_")
    private String telpho_;
    /**
     * 详细地址
     */
    @Column(name = "exactadr_")
    private String exactadr_;
    /**
     * 柜子id
     */
    @Column(name = "cabId_")
    private String cabId_;
    /**
     * 柜子名称
     */
    @Column(name = "boxName_")
    private String boxName_;
}
