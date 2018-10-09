package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 智能柜实体类信息
 */
@Data
@Entity
@Table(name = "t_cabinet")
public class Cabinet {
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
     * 柜子编号
     */
    @Column(name = "id_")
    private String id_;
    /**
     * 柜子名字
     */
    @Column(name = "name_")
    private String name_;
    /**
     * 轮播图片的编号
     */
    @Column(name = "carouselId_")
    private String carouselId_;
    /**
     * 柜组最后接入系统时间
     */
    @Column(name = "joinUpDate_")
    private Date joinUpDate_;
    /**
     * 柜组现在是否接入系统(0没有接入，1接入)
     */
    @Column(name = "joinStatus_")
    private int joinStatus_;
    /**
     * 柜子组合信息
     */
    @Column(name = "combinationInfo_")
    private String combinationInfo_;
    /**
     * 柜子地址
     */
    @Column(name = "address_")
    private String address_;
    /**
     * 挂靠社区简称
     */
    @Column(name = "communityName_")
    private String communityName_;
    /**
     * 挂靠社区编号
     */
    @Column(name = "communityNum_")
    private String communityNum_;
    /**
     * 经度
     */
    @Column(name = "x_")
    private Double x_;
    /**
     * 纬度
     */
    @Column(name = "y_")
    private Double y_;
    /**
     * 描述
     */
    @Column(name = "desc_")
    private String desc_;
    /**
     * 所属区域编号
     */
    @Column(name = "areaId_")
    private String areaId_;
    /**
     * 柜组类型（A柜组）(0、12格 1、10格)
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 系统是否启用（0没有启用，1启用中, 2 废置，3、已删除）
     */
    @Column(name = "status_")
    private String status_;
    /**
     * 柜子类型： 1  公益柜  0  租赁柜子
     */
    @Column(name = "cabinetType_")
    private Integer cabinetType_;
    /**
     * 运维人员姓名
     */
    @Column(name = "manName_")
    private String manName_;
    /**
     * 运维人员手机号
     */
    @Column(name = "manPhone_")
    private String manPhone_;
    /**
     * 所有权 0自营 1托管
     */
    @Column(name = "droit_")
    private String droit_;
    /**
     * 投放属性（0 室内 1室外）
     */
    @Column(name = "place_")
    private String place_;
    /**
     * 柜组类型（Z柜组）(1、8格)
     */
    @Column(name = "type1_")
    private String type1_;
    /**
     * 柜组类型（B柜组）(0、12格 1、10格)
     */
    @Column(name = "type2_")
    private String type2_;
    /**
     * 柜组类型（C柜组）(0、12格 1、10格)
     */
    @Column(name = "type3_")
    private String type3_;
    /**
     * 配置属性
     */
    @Column(name = "typeCount_")
    private String typeCount_;
    /**
     * 是否为正式柜组  1.是  0.否（测试柜组）
     */
    @Column(name = "isTest_")
    private String isTest_;
}
