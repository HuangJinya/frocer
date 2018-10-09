package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 每日用户活跃统计实体类
 */
@Data
@Entity
@Table(name = "t_usercountnum")
public class Usercountnum {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "createDate_")
    private Date createDate_;
    /**
     * 关注人数
     */
    @Column(name = "gzCount_")
    private Integer gzCount_;
    @Column(name = "newGzCount_")
    private Integer newGzCount_;
    /**
     * 取消关注人数
     */
    @Column(name = "cancelGzCount_")
    private Integer cancelGzCount_;
    /**
     * 注册人数
     */
    @Column(name = "zcCount_")
    private Integer zcCount_;
    /**
     * 新注册用户
     */
    @Column(name = "newZcCount_")
    private Integer newZcCount_;
    /**
     * 活跃用户统计
     */
    @Column(name = "hyCount_")
    private Integer hyCount_;
    /**
     * 访问商品数量
     */
    @Column(name = "commCount_")
    private Integer commCount_;
    /**
     * 点击租赁次数
     */
    @Column(name = "checkZlCount_")
    private Integer checkZlCount_;
    /**
     * 订单成交数量
     */
    @Column(name = "orderCjCount_")
    private Integer orderCjCount_;
    /**
     * 成交占比
     */
    @Column(name = "cjProportion")
    private Double cjProportion;
    /**
     * 单条备注
     */
    @Column(name = "remarks")
    private String remarks;
}
