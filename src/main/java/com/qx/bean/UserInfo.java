package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户帐号实体类
 */
@Entity
@Data
@Table(name = "s_userinfo")
public class UserInfo {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    /**
     * 公司编码
     */
    @Column(name = "corpCode_")
    private String corpCode_;
    /**
     * 用户ID
     */
    @Column(name = "id_")
    private String id_;
    /**
     * 用户Code
     */
    @Column(name = "code_")
    private String code_;
    /**
     * 用户姓名
     */
    @Column(name = "name_")
    private String name_;
    /**
     * 角色代码
     */
    @Column(name = "roleCode_")
    private String roleCode_;
    /**
     * 自定义权限
     */
    @Column(name = "diyRole_")
    private String diyRole_;
    /**
     * 启用否
     */
    @Column(name = "enabled_")
    private String enabled_;
    /**
     * 是否为测试员工 1是 null 不是
     */
    @Column(name = "emailAccount_")
    private String emailAccount_;
    /**
     * 备注
     */
    @Column(name = "remark_")
    private String remark_;
    /**
     * 手机号码
     */
    @Column(name = "mobile_")
    private String mobile_;
    /**
     * QQ号码
     */
    @Column(name = "qq_")
    private String qq_;
    /**
     * 超级用户
     */
    @Column(name = "superUser_")
    private String superUser_;
    /**
     * 企业编号
     */
    @Column(name = "corpNo_")
    private String corpNo_;
    /**
     * 代理用户
     */
    @Column(name = "ProxyUsers_")
    private String ProxyUsers_;
    /**
     * 修改者
     */
    @Column(name = "updateUser_")
    private String updateUser_;
    /**
     * 更新时间
     */
    @Column(name = "updateTime_")
    private Date updateTime_;
    /**
     * 创建者
     */
    @Column(name = "createUser_")
    private String createUser_;
    /**
     * 创建时间
     */
    @Column(name = "createTime_")
    private Date createTime_;
    /**
     * 用户密码
     */
    @Column(name = "password_")
    private String password_;
    /**
     * 是否黑名单
     */
    @Column(name = "isBlack_")
    private int isBlack_;
    /**
     * 是否保存密码
     */
    @Column(name = "isCheckPwd_")
    private int isCheckPwd_;
    /**
     *
     */
    @Column(name = "idCard_")
    private String idCard_;
    /**
     * 0:不是后台管理元员，1:是后台管理员
     */
    @Column(name = "isManager_")
    private int isManager_;
    /**
     * 用户会员等级
     */
    @Column(name = "userVIP_")
    private String userVIP_;
    /**
     * 用户积分
     */
    @Column(name = "userJifen_")
    private String userJifen_;
    /**
     * 用户账户余额
     */
    @Column(name = "overMoney_")
    private BigDecimal overMoney_;
    /**
     * 是否为运维人员(0其它人员，1是运维人员)
     */
    @Column(name = "isOperate_")
    private String isOperate_;
    /**
     * 地址状态(0.普通1.默认3.删除)
     */
    @Column(name = "adrState_")
    private String adrState_;
    /**
     * 是否为用户(0.不是1.是)
     */
    @Column(name = "isUser_")
    private int isUser_;
    /**
     * 收件人
     */
    @Column(name = "receiver_")
    private String receiver_;
    /**
     * 收件人手机
     */
    @Column(name = "recPhone_")
    private String recPhone_;
    /**
     * 用户地址
     */
    @Column(name = "userAdr_")
    private String userAdr_;
    /**
     * 头像
     */
    @Column(name = "imgUrl_")
    private String imgUrl_;
    /**
     * 是否绑定管理员（1.未绑定 2.已绑定）
     */
    @Column(name = "binding")
    private String binding;
    /**
     * 身份证姓名
     */
    @Column(name = "cardName_")
    private String cardName_;
    /**
     * 身份证号码
     */
    @Column(name = "cardId_")
    private String cardId_;
    /**
     * 芝麻信用分
     */
    @Column(name = "zhimaNum_")
    private int zhimaNum_;
    /**
     * 最近登录时间
     */
    @Column(name = "loginTime_")
    private Date loginTime_;
    /**
     * 性别 1男 2女
     */
    @Column(name = "sex_")
    private String sex_;
    /**
     * 微信OPENID
     */
    @Column(name = "openid")
    private String openid;
    /**
     * 减免金额
     */
    @Column(name = "jmMoney_")
    private BigDecimal jmMoney_;
    /**
     * 连续签到次数
     */
    @Column(name = "signTime_")
    private int signTime_;
    /**
     * 是否为第一次绑定芝麻；（0 未 1绑定了）
     */
    @Column(name = "isBuding_")
    private String isBuding_;

}
