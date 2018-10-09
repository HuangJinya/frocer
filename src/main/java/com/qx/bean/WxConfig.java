package com.qx.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * 微信配置实体类信息
 */
@Data
@Entity
@Table(name = "t_wx_config")
public class WxConfig {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    /**
     * 城市编码
     */
    @Column(name = "corpNo_")
    private String corpNo_;
    /**
     * 公众号ID
     */
    @Column(name = "wxCode_")
    private String wxCode_;
    /**
     * 公众号名称
     */
    @Column(name = "wxName_")
    private String wxName_;
    /**
     * 公众号APPID
     */
    @Column(name = "appID_")
    private String appID_;
    /**
     * 公众号密钥
     */
    @Column(name = "appSecret_")
    private String appSecret_;
    /**
     * 回调接口验证token
     */
    @Column(name = "token_")
    private String token_;
    /**
     * 支付的商户号
     */
    @Column(name = "mchID_")
    private String mchID_;
    /**
     * 密码key
     */
    @Column(name = "apiKey_")
    private String apiKey_;
}
