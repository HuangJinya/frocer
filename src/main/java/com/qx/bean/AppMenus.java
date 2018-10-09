package com.qx.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="s_appmenus")
@Data
public class AppMenus {
    @Id
    @Column(name="It_")
    private Integer it_;
    @Column(name="VerList_")
    private String verList_;
    @Column(name="ProcCode_")
    private String procCode_;
    @Column(name="Parent_")
    private String parent_;
    @Column(name="Code_")
    private String code_;
    @Column(name="Name_")
    private String name_;
    @Column(name="Win_")
    private int win_;
    @Column(name="Web_")
    private int web_;
    @Column(name="Security_")
    private int security_;
    @Column(name="Hide_")
    private int hide_;
    @Column(name="Folder_")
    private int folder_;
    @Column(name="Update_")
    private Date Update_;
    @Column(name="UpdateKey_")
    private String updateKey_;
    @Column(name="Class_")
    private String class_;
    @Column(name="Image_")
    private String image_;
    @Column(name="Custom_")
    private int custom_;
    @Column(name="Group_")
    private String group_;
    @Column(name="Lock_")
    private int lock_;
    @Column(name="Approve_")
    private String approve_;
    @Column(name="FormNo_")
    private int formNo_;
    @Column(name="AppDate_")
    private Date appDate_;
    @Column(name="Database_")
    private String database_;
    @Column(name="WorkDay_")
    private int workDay_;
    @Column(name="ExeName_")
    private String exeName_;
    @Column(name="ID_")
    private String ID_;
    @Column(name="Param_")
    private String param_;
    @Column(name="Author_")
    private String author_;
    @Column(name="Status_")
    private int status_;
    @Column(name="Remark_")
    private String remark_;
}
