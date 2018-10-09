package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "t_alonecredit")
public class Alonecredit {
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
     * 征信对象
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 个人征信单来源
     */
    @Column(name = "source_")
    private String source_;
    /**
     * 产生征信原因
     */
    @Column(name = "yuanying_")
    private String yuanying_;
    /**
     * 产生征信的节点
     */
    @Column(name = "node_")
    private String node_;
    /**
     * 产生征信责任人
     */
    @Column(name = "people_")
    private String people_;
    /**
     * 产生征信的时间
     */
    @Column(name = "time_")
    private Date time_;
    /**
     * 征信方法
     */
    @Column(name = "method_")
    private String method_;
    /**
     * 征信调整数据
     */
    @Column(name = "revision_")
    private String revision_;
    /**
     * 状态（0、启用 1、失效 ）
     */
    @Column(name = "status_")
    private String status_;
    /**
     * 征信关联订单
     */
    @Column(name = "orderId_")
    private String orderId_;
    /**
     * 类型（0、押金比例浮动 1、是否给予押金 2、免押金额度跳转 3、租赁订单结算方式）
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 备注
     */
    @Column(name = "beizhu_")
    private String beizhu_;
}
