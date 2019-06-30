package com.zxbking.dzfpkpfw.model;

import com.ihyht.alyxjs.nbjcpt.component.generator.IdEntity;
import java.io.Serializable;
import java.util.Date;

public class UserInfo extends IdEntity implements Serializable {
    /**
     * 账号标识
     * 表 : tb_base_userinfo
     * 对应字段 : account_id
     */
    private String accountId;

    /**
     * 税务人员姓名
     * 表 : tb_base_userinfo
     * 对应字段 : user_name
     */
    private String userName;

    /**
     * 联系电话
     * 表 : tb_base_userinfo
     * 对应字段 : phone
     */
    private String phone;

    /**
     * 性别
     * 表 : tb_base_userinfo
     * 对应字段 : sex
     */
    private String sex;

    /**
     * 电子邮箱
     * 表 : tb_base_userinfo
     * 对应字段 : email
     */
    private String email;

    /**
     * 身份证
     * 表 : tb_base_userinfo
     * 对应字段 : identity_card
     */
    private String identityCard;

    /**
     * 创建时间
     * 表 : tb_base_userinfo
     * 对应字段 : create_time
     */
    private Date createTime;

    /**
     * 最后修改时间
     * 表 : tb_base_userinfo
     * 对应字段 : last_time
     */
    private Date lastTime;

    /**
     * 删除标记
     * 表 : tb_base_userinfo
     * 对应字段 : deleted
     */
    private Integer deleted;

    /**
     * 删除时间
     * 表 : tb_base_userinfo
     * 对应字段 : delete_time
     */
    private Date deleteTime;

    private static final long serialVersionUID = 1L;

    /**
     * get method 
     *
     * @return tb_base_userinfo.account_id：账号标识
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * set method 
     *
     * @param accountId  账号标识
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * get method 
     *
     * @return tb_base_userinfo.user_name：税务人员姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set method 
     *
     * @param userName  税务人员姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * get method 
     *
     * @return tb_base_userinfo.phone：联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set method 
     *
     * @param phone  联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * get method 
     *
     * @return tb_base_userinfo.sex：性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * set method 
     *
     * @param sex  性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * get method 
     *
     * @return tb_base_userinfo.email：电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * set method 
     *
     * @param email  电子邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * get method 
     *
     * @return tb_base_userinfo.identity_card：身份证
     */
    public String getIdentityCard() {
        return identityCard;
    }

    /**
     * set method 
     *
     * @param identityCard  身份证
     */
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard == null ? null : identityCard.trim();
    }

    /**
     * get method 
     *
     * @return tb_base_userinfo.create_time：创建时间
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
     * @return tb_base_userinfo.last_time：最后修改时间
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
     * @return tb_base_userinfo.deleted：删除标记
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
     * @return tb_base_userinfo.delete_time：删除时间
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