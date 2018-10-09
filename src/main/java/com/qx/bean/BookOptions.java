package com.qx.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 帐套参数档
 */
@Table(name="s_bookoptions")
@Entity
@Data
public class BookOptions {
    /**
     * 帐套代码
     */
    @Id
    @Column(name = "CorpNo_")
    private String CorpNo_;
    /**
     * 参数代码
     */
    @Column(name = "Code_")
    private String Code_;
    /**
     * 参数名称
     */
    @Column(name = "Name_")
    private String Name_;
    /**
     * 参数数值
     */
    @Column(name = "Value_")
    private String Value_;
    /**
     * 更新ID
     */
    @Column(name = "UpdateKey_")
    private String UpdateKey_;
}
