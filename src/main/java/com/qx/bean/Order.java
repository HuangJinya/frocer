package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 订单信息实体类
 */
@Data
@Entity
@Table(name="t_order")
public class Order {
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
     * 订单ID
     */
    @Column(name = "orderId_")
    private String orderId_;
    /**
     * 拿货柜子ID
     */
    @Column(name = "getCabinetId_")
    private String getCabinetId_;
    /**
     * 还货柜子ID
     */
    @Column(name = "setCabinetId_")
    private String setCabinetId_;

    /**
     * 拿货箱子ID
     */
    @Column(name = "getBoxId_")
    private String getBoxId_;
    /**
     * 还货箱子ID
     */
    @Column(name = "setBoxId_")
    private String setBoxId_;
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
     * 起租时间
     */
    @Column(name = "beginTime_")
    private Date beginTime_;
    /**
     * 应还时间
     */
    @Column(name = "returnTime_")
    private Date returnTime_;
    /**
     * 保修类型0.自己责任1.他人责任
     */
    @Column(name = "fixType_")
    private String fixType_;
    /**
     * 租金时长
     */
    @Column(name = "rentTime_")
    private String rentTime_;
    /**
     * 初始付款租金
     */
    @Column(name = "sumRentMoney_")
    private Double sumRentMoney_;
    /**
     * 付款时间
     */
    @Column(name = "proModelId_")
    private String proModelId_;
    /**
     * 数量
     */
    @Column(name = "counts_")
    private String counts_;
    /**
     * 用户留言
     */
    @Column(name = "remark_")
    private String remark_;
    /**
     * 检修说明
     */
    @Column(name = "overhaul_")
    private String overhaul_;
    /**
     * 退款原因
     */
    @Column(name = "returnReason_")
    private String returnReason_;
    /**
     * 退款金额
     */
    @Column(name = "returnMoney_")
    private Double returnMoney_;
    /**
     * 归还物流名称
     */
    @Column(name = "returnLogisticsName_")
    private String returnLogisticsName_;
    /**
     * 借出物流单号
     */
    @Column(name = "recLogisticsId_")
    private String recLogisticsId_;
    /**
     * 支付方式(0：微信 1：零钱)
     */
    @Column(name = "payMethod_")
    private String payMethod_;
    /**
     * 用户评价
     */
    @Column(name = "userEva_")
    private String userEva_;
    /**
     * 赔付总金额
     */
    @Column(name = "pay_")
    private String pay_;
    /**
     *赔付说明
     */
    @Column(name = "payDesc_")
    private String payDesc_;
    /**
     * 赔付图片ID
     */
    @Column(name = "payImg_")
    private String payImg_;
    /**
     * 赔付状态0.赔付(生效)1.无需赔付（失效）2:未操作
     */
    @Column(name = "payState_")
    private String payState_;
    /**
     * 允许退款金额(支付押金)
     */
    @Column(name = "allowReturnMoney_")
    private Double allowReturnMoney_;
    /**
     * 优惠金额
     */
    @Column(name = "coupon_")
    private String coupon_;
    /**
     * 减免金额
     */
    @Column(name = "reliefDeposit_")
    private String reliefDeposit_;
    /**
     * 收件人
     */
    @Column(name = "receiver_")
    private String receiver_;
    /**
     * 收货地址
     */
    @Column(name = "recAdr_")
    private String recAdr_;
    /**
     * 收件人联系方式
     */
    @Column(name = "recPhone_")
    private String recPhone_;
    /**
     * 物流状态1:快递收件(待发货)，2：在途中（配送中）,3：已到货
     */
    @Column(name = "logisticsState_")
    private String logisticsState_;
    /**
     * 发货时间
     */
    @Column(name = "deliveryTime_")
    private Date deliveryTime_;
    /**
     * 收货时间
     */
    @Column(name = "recTime_")
    private Date recTime_;
    /**
     * 借出物流名称
     */
    @Column(name = "recLogisticsName_")
    private String recLogisticsName_;
    /**
     * 租出快递时间
     */
    @Column(name = "recUpTime_")
    private Date recUpTime_;
    /**
     * 报修类型(0.自己责任1.他人责任)
     */
    @Column(name = "repairType_")
    private String repairType_;
    /**
     * 归还物流单号
     */
    @Column(name = "retuenLogisticsId_")
    private String retuenLogisticsId_;
    /**
     * 商品主电子条码
     */
    @Column(name = "zhuCode_")
    private String zhuCode_;
    /**
     * 订单总租金
     */
    @Column(name = "orderRentMoney_")
    private String orderRentMoney_;
    /**
     * 超期付款租金
     */
    @Column(name = "sumOverMoney_")
    private String sumOverMoney_;
    /**
     * 超期天数
     */
    @Column(name = "overdueDay_")
    private Integer overdueDay_;
    /**
     * 审核状态 0：未通过  1：通过
     */
    @Column(name = "status_")
    private String status_;
    /**
     * 建议赔付金额
     */
    @Column(name = "suggestMoney_")
    private Double suggestMoney_;
    /**
     * 达成赔付金额
     */
    @Column(name = "successMoney_")
    private Double successMoney_;
    /**
     * 赔付后建议
     */
    @Column(name = "suggest_")
    private String suggest_;
    /**
     * 赔付备注
     */
    @Column(name = "payRemark_")
    private String payRemark_;
    /**
     * 赔付原因
     */
    @Column(name = "payReason_")
    private String payReason_;
    /**
     * 赔付单编号
     */
    @Column(name = "payID_")
    private String payID_;
    /**
     * 赔付状态 0:结算前生效 1:结算后生效
     */
    @Column(name = "payStatus_")
    private String payStatus_;
    /**
     * 结算状态 0：未结算 1:手工结算 2：已结算
     */
    @Column(name = "settleState_")
    private String settleState_;
    /**
     * 退货金额
     */
    @Column(name = "reGoodsMoney_")
    private Double reGoodsMoney_;
    /**
     * 退货订单号
     */
    @Column(name = "reGoodsId_")
    private String reGoodsId_;
    /**
     * 是否同意退货 0：不同意 1同意
     */
    @Column(name = "agree_")
    private String agree_;
    /**
     * 退货时间
     */
    @Column(name = "reGoodsTime_")
    private Date reGoodsTime_;
    /**
     * 退货处理 0：全额退款 1：部分退款
     */
    @Column(name = "settle_")
    private String settle_;
    /**
     * 收货检查 0：不达标 1：达标
     */
    @Column(name = "check_")
    private String check_;
    /**
     * 归还方式
     */
    @Column(name = "returnMethod_")
    private String returnMethod_;
    /**
     * 归还类型 0无损 1有损
     */
    @Column(name = "returnType_")
    private String returnType_;
    /**
     * 归还时间
     */
    @Column(name = "returnOverTime_")
    private Date returnOverTime_;
    /**
     * 订单关联柜子ID
     */
    @Column(name = "cabId_")
    private String cabId_;
    /**
     * 物流类型  0.寄出 1.归还
     */
    @Column(name = "logType_")
    private String logType_;
}
