package com.qx.bean;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "s_mgtosql")
public class Mgtosql {
    @Id
    @GeneratedValue
    @Column(name = "UID_")
    private Integer UID_;
    @Column(name = "c1")
    private String c1;
    @Column(name = "c2")
    private String c2;
    @Column(name = "c3")
    private String c3;
    @Column(name = "c4")
    private String c4;
    @Column(name = "c5")
    private String c5;
}
