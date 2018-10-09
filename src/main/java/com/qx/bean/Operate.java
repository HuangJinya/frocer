package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 运维实体信息类
 */
@Data
@Entity
@Table(name="t_operate")
public class Operate {
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
     * 运维人员名称
     */
    @Column(name = "operateManName_")
    private String operateManName_;
    /**
     * 运维人员ID
     */
    @Column(name = "operateManId_")
    private String operateManId_;
    /**
     * 订单ID
     */
    @Column(name = "orderId_")
    private String orderId_;
    /**
     * 商品ID
     */
    @Column(name = "proId_")
    private String proId_;
    /**
     * 运维类型(0.运维1.补货（上架）2.调货（下架）3.赔付 4、调货（柜组间传递）)
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 柜子ID
     */
    @Column(name = "cobId_")
    private String cobId_;
    /**
     * 箱子ID
     */
    @Column(name = "boxId_")
    private String boxId_;
    /**
     * 运维ID（YW运维、PF赔付、DH调货）
     */
    @Column(name = "operateId_")
    private String operateId_;
    /**
     * 历史检查运维次数
     */
    @Column(name = "hisOpeCount")
    private String hisOpeCount;
    /**
     * 历史折损率
     */
    @Column(name = "hisLoss_")
    private String hisLoss_;
    /**
     * 本次折损率
     */
    @Column(name = "nowLoss_")
    private String nowLoss_;
    /**
     * 运维开箱时间
     */
    @Column(name = "OpenBoxTime_")
    private Date OpenBoxTime_;
    /**
     * 运维关箱时间
     */
    @Column(name = "CloseBoxTime_")
    private Date CloseBoxTime_;
    /**
     * 运维留言
     */
    @Column(name = "leaveMess_")
    private String leaveMess_;
    /**
     * 运维照片ID
     */
    @Column(name = "ImageId_")
    private String ImageId_;
    /**
     * 运维商品ID
     */
    @Column(name = "zhuCode_")
    private String zhuCode_;
    /**
     * 上次归还时间
     */
    @Column(name = "lastReturnTime_")
    private Date lastReturnTime_;
    /**
     * 本次运维开箱次数
     */
    @Column(name = "openBoxNum_")
    private String openBoxNum_;
    /**
     * 达成赔付金额（退款金额）
     */
    @Column(name = "successMoney_")
    private Double successMoney_;
    /**
     * 实际退款押金
     */
    @Column(name = "realMoney_")
    private Double realMoney_;
    /**
     * 是否超期运维（0 未超期 1超期）默认是超期状态，运维人员在有效时间运维变未超期
     */
    @Column(name = "overdue_")
    private String overdue_;
    /**
     * 上下架预生成订单默认未处理（0 未处理，1、已处理）
     */
    @Column(name = "isProcess_")
    private String isProcess_;
    /**
     * 是否带回修理（0、 未带回 1、带回）
     */
    @Column(name = "isGoHome_")
    private String isGoHome_;
    /**
     * 是否赔付（0 已赔付 1未赔付）
     */
    @Column(name = "isPay_")
    private String isPay_;
    /**
     * 调出柜组编号
     */
    @Column(name = "diaoOutCabid_")
    private String diaoOutCabid_;
    /**
     * 调入柜组编号
     */
    @Column(name = "diaoInCabid_")
    private String diaoInCabid_;
    /**
     * 调出格口编号
     */
    @Column(name = "diaoOutBox_")
    private String diaoOutBox_;
    /**
     * 调入格口编号
     */
    @Column(name = "diaoInBox_")
    private String diaoInBox_;
    /**
     * 调出商品电子标签
     */
    @Column(name = "diaoOutZhuCode_")
    private String diaoOutZhuCode_;
    /**
     * 调入商品标签
     */
    @Column(name = "diaoInZhuCode_")
    private String diaoInZhuCode_;
    /**
     * 实际调货时间
     */
    @Column(name = "actualDiaoTime_")
    private Date actualDiaoTime_;
    /**
     * 0 调入 1调出
     */
    @Column(name = "diaoType_")
    private String diaoType_;
}
