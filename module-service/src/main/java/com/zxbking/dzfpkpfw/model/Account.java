package com.zxbking.dzfpkpfw.model;

import com.ihyht.alyxjs.nbjcpt.component.generator.IdEntity;
import java.io.Serializable;
import java.util.Date;

public class Account extends IdEntity implements Serializable {
    /**
     * 账号标识
     * 表 : tb_base_account
     * 对应字段 : id
     */
    private String id;

    /**
     * 账号名
     * 表 : tb_base_account
     * 对应字段 : account_name
     */
    private String accountName;

    /**
     * 账号密码
     * 表 : tb_base_account
     * 对应字段 : password
     */
    private String password;

    /**
     * mm
     * 表 : tb_base_account
     * 对应字段 : mm
     */
    private String mm;

    /**
     * 有效标记
     * 表 : tb_base_account
     * 对应字段 : valid_mark
     */
    private Integer validMark;

    /**
     * 创建时间
     * 表 : tb_base_account
     * 对应字段 : create_time
     */
    private Date createTime;

    /**
     * 最后修改时间
     * 表 : tb_base_account
     * 对应字段 : last_time
     */
    private Date lastTime;

    /**
     * 删除标记
     * 表 : tb_base_account
     * 对应字段 : deleted
     */
    private Integer deleted;

    /**
     * 删除时间
     * 表 : tb_base_account
     * 对应字段 : delete_time
     */
    private Date deleteTime;

    private static final long serialVersionUID = 1L;

    /**
     * get method 
     *
     * @return tb_base_account.id：账号标识
     */
    public String getId() {
        return id;
    }

    /**
     * set method 
     *
     * @param id  账号标识
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * get method 
     *
     * @return tb_base_account.account_name：账号名
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * set method 
     *
     * @param accountName  账号名
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * get method 
     *
     * @return tb_base_account.password：账号密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * set method 
     *
     * @param password  账号密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * get method 
     *
     * @return tb_base_account.mm：mm
     */
    public String getMm() {
        return mm;
    }

    /**
     * set method 
     *
     * @param mm  mm
     */
    public void setMm(String mm) {
        this.mm = mm == null ? null : mm.trim();
    }

    /**
     * get method 
     *
     * @return tb_base_account.valid_mark：有效标记
     */
    public Integer getValidMark() {
        return validMark;
    }

    /**
     * set method 
     *
     * @param validMark  有效标记
     */
    public void setValidMark(Integer validMark) {
        this.validMark = validMark;
    }

    /**
     * get method 
     *
     * @return tb_base_account.create_time：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * set method 
     *
     * @param createTime  创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * get method 
     *
     * @return tb_base_account.last_time：最后修改时间
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * set method 
     *
     * @param lastTime  最后修改时间
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * get method 
     *
     * @return tb_base_account.deleted：删除标记
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * set method 
     *
     * @param deleted  删除标记
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * get method 
     *
     * @return tb_base_account.delete_time：删除时间
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * set method 
     *
     * @param deleteTime  删除时间
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}