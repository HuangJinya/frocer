package com.qx.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "t_data_point")
public class DataPoint {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "CreateTime_")
    private Date CreateTime_;
    @Column(name = "CorpNo_")
    private String CorpNo_;
    @Column(name = "UpdateTime_")
    private Date UpdateTime_;
    /**
     * 埋点路径
     */
    @Column(name = "DataPointUrl_")
    private String DataPointUrl_;
    /**
     * 埋点名字
     */
    @Column(name = "DataPointName_")
    private String DataPointName_;
    /**
     * 操作量
     */
    @Column(name = "TickCount_")
    private Integer TickCount_;
    /**
     * 金额量
     */
    @Column(name = "Amount_")
    private Double Amount_;
}
