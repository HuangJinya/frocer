package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 积分实体类信息
 */
@Data
@Entity
@Table(name = "t_integral")
public class Integral {
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
     * 加积分的人
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 积分
     */
    @Column(name = "integral_")
    private Double integral_;
    /**
     * 备注
     */
    @Column(name = "remark_")
    private String remark_;
    /**
     * 等级
     */
    @Column(name = "grade_")
    private String grade_;
    /**
     * 扫码人
     */
    @Column(name = "userId_")
    private String userId_;
    /**
     * 0：签到  1：扫码分享 3：收藏 4:评论 5:登录 6:租赁 7:分享商品
     */
    @Column(name = "type_")
    private Integer type_;
    /**
     * 积分说明
     */
    @Column(name = "explain_")
    private String explain_;
    /**
     * 邀请码
     */
    @Column(name = "InvitationCode_")
    private String InvitationCode_;
}
