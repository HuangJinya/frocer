package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 商品实体类信息
 */
@Data
@Entity
@Table(name = "t_products")
public class Products {
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
     * 商品ID
     */
    @Column(name = "proId_")
    private String proId_;
    /**
     * 商品名称
     */
    @Column(name = "proName_")
    private String proName_;
    /**
     * 原租赁价
     */
    @Column(name = "dayRentMoney_")
    private Double dayRentMoney_;
    /**
     * 押金
     */
    @Column(name = "cashPledge_")
    private String cashPledge_;
    /**
     * 售价
     */
    @Column(name = "price_")
    private String price_;
    /**
     * 商品分类的二级ID
     */
    @Column(name = "proTypeId_")
    private String proTypeId_;
    /**
     * 商品详情图片
     */
    @Column(name = "proImgId_")
    private String proImgId_;
    /**
     * 商品描述
     */
    @Column(name = "proDesc_")
    private String proDesc_;
    /**
     * 0.可租 1.可卖 2可租可卖
     */
    @Column(name = "proState_")
    private String proState_;
    /**
     * 是否删除 0：未删除    1：删除
     */
    @Column(name = "isDel_")
    private String isDel_;
    @Column(name = "proVideoId_")
    private String proVideoId_;
    /**
     * 商品型号ID
     */
    @Column(name = "proModelId_")
    private String proModelId_;
    /**
     * 物品折扣后租赁价
     */
    @Column(name = "discountPrice_")
    private Double discountPrice_;
    /**
     * 物品净重
     */
    @Column(name = "proWeight_")
    private String proWeight_;
    /**
     *商品颜色
     */
    @Column(name = "proColor_")
    private String proColor_;
    /**
     * 物品规格  0： 大   1：中   2 小
     */
    @Column(name = "proSize_")
    private String proSize_;
    /**
     * 主标签总数
     */
    @Column(name = "proLaberSum_")
    private String proLaberSum_;
    /**
     * 主标签在途数（快递到柜未补货）
     */
    @Column(name = "proTuCount_")
    private String proTuCount_;
    /**
     * 主标签在柜数
     */
    @Column(name = "proGuiCount_")
    private String proGuiCount_;
    /**
     * 主标签在租数（在租订单中）
     */
    @Column(name = "proRentCount_")
    private String proRentCount_;
    /**
     * 主标签报修数（运维人员拿走保修中）
     */
    @Column(name = "proFixCount_")
    private String proFixCount_;
    /**
     * 售卖数
     */
    @Column(name = "proSaleCount_")
    private String proSaleCount_;
    /**
     * 是否有折扣   0：没有    1有
     */
    @Column(name = "isDiscount_")
    private String isDiscount_;
    /**
     * 租赁积分
     */
    @Column(name = "jifen_")
    private String jifen_;
    /**
     * 售卖积分
     */
    @Column(name = "saleJiFen_")
    private String saleJiFen_;
    /**
     * 售卖热推   默认为关 0：关       1：开
     */
    @Column(name = "salesHotPush_")
    private String salesHotPush_;
    /**
     * 售卖分类菜单   默认为关 0：关       1：开
     */
    @Column(name = "salesTypeMenu_")
    private String salesTypeMenu_;
    /**
     * 售卖精品   默认为关 0：关       1：开
     */
    @Column(name = "salesFine_")
    private String salesFine_;
    /**
     * 售卖新品   默认为关 0：关       1：开
     */
    @Column(name = "salesNewPro_")
    private String salesNewPro_;
    /**
     * 租赁热推   默认为关 0：关       1：开
     */
    @Column(name = "rentHotPush_")
    private String rentHotPush_;
    /**
     * 租赁分类菜单   默认为关 0：关       1：开
     */
    @Column(name = "rentTypeMenu_")
    private String rentTypeMenu_;
    /**
     * 租赁精品   默认为关 0：关       1：开
     */
    @Column(name = "rentFine_")
    private String rentFine_;
    /**
     * 租赁新品  默认为关 0：关       1：开
     */
    @Column(name = "rentNewPro_")
    private String rentNewPro_;
    /**
     * 同城快递邮费
     */
    @Column(name = "posTage_")
    private String posTage_;
    /**
     * 商品照片
     */
    @Column(name = "proZsImges_")
    private String proZsImges_;
    /**
     * 详情轮播图
     */
    @Column(name = "proLbImges_")
    private String proLbImges_;
    /**
     * 属性  1.加盟 0.自营
     */
    @Column(name = "attribute_")
    private String attribute_;
    /**
     * 品牌
     */
    @Column(name = "brand_")
    private String brand_;
    /**
     * 规格型号
     */
    @Column(name = "proModel_")
    private String proModel_;
    /**
     * 二维码规格
     */
    @Column(name = "proQRcodeModel_")
    private String proQRcodeModel_;
    /**
     * 商品全称
     */
    @Column(name = "proAllName_")
    private String proAllName_;
    /**
     * 商品数量
     */
    @Column(name = "proNum_")
    private Integer proNum_;
    /**
     * 单位
     */
    @Column(name = "proUnit_")
    private String proUnit_;
    /**
     * 需求时间
     */
    @Column(name = "needTime_")
    private Date needTime_;
    /**
     * 购买链接
     */
    @Column(name = "buyLink_")
    private String buyLink_;
    /**
     * 配件图片
     */
    @Column(name = "partsImg_")
    private String partsImg_;
    /**
     * 介绍说明图片
     */
    @Column(name = "explainImg_")
    private String explainImg_;
    /**
     * 运维流程图
     */
    @Column(name = "ywProcessImg_")
    private String ywProcessImg_;
    /**
     * 0:0元购 1：五折  2：编辑j价格   0.折扣优惠  1.自定义优惠
     */
    @Column(name = "zhe_")
    private String zhe_;
    /**
     * 是否启用线上租赁 0：启用  1.不启用
     */
    @Column(name = "isEnable_")
    private String isEnable_;
    /**
     * 折扣率
     */
    @Column(name = "discount_")
    private Double discount_;
}
