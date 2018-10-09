package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 区域实体信息类
 */
@Data
@Entity
@Table(name = "t_area")
public class Area {
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
     * 区域id
     */
    @Column(name = "areaid_")
    private String areaid_;
    /**
     * 省
     */
    @Column(name = "province_")
    private String province_;
    /**
     * 市
     */
    @Column(name = "city_")
    private String city_;
    /**
     * 区域
     */
    @Column(name = "area_")
    private String area_;
    /**
     * 区域编码
     */
    @Column(name = "areaNum_")
    private String areaNum_;
    /**
     * 区域类型
     */
    @Column(name = "areaType_")
    private String areaType_;
    /**
     * 备注
     */
    @Column(name = "remark_")
    private String remark_;
    /**
     * 国家
     */
    @Column(name = "country_")
    private String country_;
}
