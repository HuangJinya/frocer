package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 退货实体信息类
 */
@Data
@Entity
@Table(name = "t_goodsrejected")
public class Goodsrejected {
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
     * 关联租赁订单id
     */
    @Column(name = "orderId_")
    private String orderId_;
    /**
     * 退货ID
     */
    @Column(name = "rgId_")
    private String rgId_;
    /**
     * 商品ID
     */
    @Column(name = "proId_")
    private String proId_;
    /**
     * 用户ID
     */
    @Column(name = "userId_")
    private String userId_;
    /**
     * 是否同意退货 0：不同意 1：同意
     */
    @Column(name = "isAgree_")
    private String isAgree_;
    /**
     * 退货物流单号
     */
    @Column(name = "rgLogisticsId_")
    private String rgLogisticsId_;
    @Column(name = "rgLogisticsName_")
    private String rgLogisticsName_;
    /**
     * 收货检查 0：不达标 1：达标
     */
    @Column(name = "check_")
    private String check_;
    /**
     * 退货状态 0：退货处理中 1：退货成功
     */
    @Column(name = "rgStatus_")
    private String rgStatus_;
    /**
     * 退货处理 0：部分退款 1:全额退款
     */
    @Column(name = "rgHand_")
    private String rgHand_;
    /**
     * 退货结算金额
     */
    @Column(name = "rgMoney_")
    private Double rgMoney_;
    /**
     * 物流状态(-1：单号或快递公司代码错误, 0：暂无轨迹，1:快递收件，2：在途中,3：签收,4：问题件)
     */
    @Column(name = "logisticsState_")
    private String logisticsState_;
}
