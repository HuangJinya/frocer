package com.qx.bean;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="t_wx_user_device_binding")
@Data
public class WxUserDeviceBinding {

    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID;
    @Column(name = "wxOpenId_")
    private String wxOpenId;
    @Column(name = "deviceNumber_")
    private String deviceNumber;
    @Column(name = "eventType_")
    private String eventType;
    @Column(name = "createDate_")
    private Date createDate;
    @Column(name = "updateDate_")
    private Date updateDate;

}
