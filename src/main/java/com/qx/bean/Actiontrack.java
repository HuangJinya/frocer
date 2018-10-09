package com.qx.bean;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

/**
 * 用户操作行为追踪
 */
@Data
@Entity
@Table(name = "t_actiontrack")
public class Actiontrack {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    /**
     * 创建时间
     */
    @Column(name = "createDate_")
    private Date createDate_;
    /**
     * 用户编码
     */
    @Column(name = "userCode_")
    private String userCode_;
    /**
     * 用户名称
     */
    @Column(name = "userName_")
    private String userName_;
    /**
     * 行为描述
     */
    @Column(name = "info_")
    private String info_;
    /**
     * 手机号码
     */
    @Column(name = "mobile_")
    private String mobile_;
    /**
     * 0、首页 1、分类 2、附近柜 3、其他
     */
    @Column(name = "type_")
    private String type_;
}
