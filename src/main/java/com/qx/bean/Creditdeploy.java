package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 征信配置实体类信息
 */
@Data
@Entity
@Table(name = "t_creditdeploy")
public class Creditdeploy {
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
     * 1、芝麻信用分设置 2、芝麻分抵扣金额设置 3、活体映像抵扣金额设置 4、银行卡认证抵扣金额设置 5、认证客户抵扣金额设置
     */
    @Column(name="type_")
    private String type_;
    /**
     * 金额额度
     */
    @Column(name="money_")
    private BigDecimal money_;
    /**
     * 上一次设置金额
     */
    @Column(name="moneyS_")
    private BigDecimal moneyS_;
}
