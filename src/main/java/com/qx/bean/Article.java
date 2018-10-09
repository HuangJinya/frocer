package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 文章实体信息类
 */
@Data
@Entity
@Table(name = "t_article")
public class Article {
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
     * 文章ID
     */
    @Column(name = "id_")
    private String id_;
    /**
     * 文章标题
     */
    @Column(name = "title_")
    private String title_;
    /**
     * 文章内容
     */
    @Column(name = "content_")
    private String content_;
    /**
     * 文章类型(1.使用流程,2.商务合作,3.联系客服,4.关于我们,5.用户租赁,6.运维服务,7.银行卡绑定,8.积分规则,9.公益捐款,10.优惠券使用,11.签到规则,12.用户等级,13.快递至启享柜,14.芝麻信用减免,15.活体影像减免,16.手机号减免押金,17.邀请好友，18.系统公告，19.社区服务，20.疑难解答)
     */
    @Column(name = "type_")
    private String type_;
    /**
     * 发布时间
     */
    @Column(name = "date_")
    private Date date_;
}
