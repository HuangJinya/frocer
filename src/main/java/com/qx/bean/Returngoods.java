package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 归还订单实体类信息
 */
@Data
@Entity
@Table(name = "t_returngoods")
public class Returngoods {
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
     * 归还订单号
     */
    @Column(name = "returnId_")
    private String returnId_;
    /**
     * 关联租赁单号
     */
    @Column(name = "orderId_")
    private String orderId_;
    /**
     * 归还方式0.箱子归还1.快递归还
     */
    @Column(name = "returnMethod_")
    private String returnMethod_;
    /**
     * 运费
     */
    @Column(name = "shippingCosts_")
    private Double shippingCosts_;
    /**
     * 归还类型0.无损归还1.报修归还
     */
    @Column(name = "returnType_")
    private String returnType_;
    /**
     * 归还时间
     */
    @Column(name = "returnOverTime_")
    private Date returnOverTime_;
    /**
     * 归还物流名称
     */
    @Column(name = "returnLogisticsName_")
    private String returnLogisticsName_;
    /**
     * 归还物流单号
     */
    @Column(name = "retuenLogisticsId_")
    private String retuenLogisticsId_;
    /**
     * 报修类型(0.自己责任1.他人责任)
     */
    @Column(name = "repairType_")
    private String repairType_;
    /**
     * 物流状态(-1：单号或快递公司代码错误, 0：暂无轨迹，1:快递收件，2：在途中,3：签收,4：问题件)
     */
    @Column(name = "logisticsState_")
    private String logisticsState_;
    @Column(name = "userCode_")
    private String userCode_;
}
