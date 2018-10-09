package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 *运维校验二维码实体类信息
 */
@Data
@Entity
@Table(name = "t_ywcheck")
public class Ywcheck {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "createTime_")
    private Date createTime_;
    /**
     * 柜子编号
     */
    @Column(name = "id_")
    private String id_;
    /**
     * 生成时间
     */
    @Column(name = "data_")
    private String data_;
    /**
     * 是否验证通过(0 未通过 1 通过
     */
    @Column(name = "isCheck_")
    private String isCheck_;
    /**
     * 操作用户
     */
    @Column(name = "code_")
    private String code_;
}
