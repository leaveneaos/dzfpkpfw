package com.zxbking.dzfpkpfw.model;

import com.ihyht.alyxjs.nbjcpt.component.generator.IdEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Invoice extends IdEntity implements Serializable {
    /**
     * 账号标识
     * 表 : tb_invoice
     * 对应字段 : id
     */
    private String id;

    /**
     * 类型
     * 表 : tb_invoice
     * 对应字段 : type
     */
    private Integer type;

    /**
     * 发票名称
     * 表 : tb_invoice
     * 对应字段 : name
     */
    private String name;

    /**
     * 手机号码
     * 表 : tb_invoice
     * 对应字段 : phone
     */
    private String phone;

    /**
     * 电子邮箱
     * 表 : tb_invoice
     * 对应字段 : email
     */
    private String email;

    /**
     * 创建时间
     * 表 : tb_invoice
     * 对应字段 : create_time
     */
    private Date createTime;

    /**
     * 最后修改时间
     * 表 : tb_invoice
     * 对应字段 : last_time
     */
    private Date lastTime;

    /**
     * 
     * 表 : tb_invoice
     * 对应字段 : last_user
     */
    private String lastUser;

    /**
     * 删除标记
     * 表 : tb_invoice
     * 对应字段 : deleted
     */
    private Integer deleted;

    /**
     * 删除时间
     * 表 : tb_invoice
     * 对应字段 : delete_time
     */
    private Date deleteTime;

    /**
     * 纳税人识别号
     * 表 : tb_invoice
     * 对应字段 : nsrsbh
     */
    private String nsrsbh;

    /**
     * 公司地址
     * 表 : tb_invoice
     * 对应字段 : gs_address
     */
    private String gsAddress;

    /**
     * 公司电话号码
     * 表 : tb_invoice
     * 对应字段 : gs_phone
     */
    private String gsPhone;

    /**
     * 开户银行
     * 表 : tb_invoice
     * 对应字段 : bank_name
     */
    private String bankName;

    /**
     * 银行账号
     * 表 : tb_invoice
     * 对应字段 : bank_account_name
     */
    private String bankAccountName;

    /**
     * 金额含税
     * 表 : tb_invoice
     * 对应字段 : tax_able_amount
     */
    private BigDecimal taxAbleAmount;

    /**
     * 不含税金额
     * 表 : tb_invoice
     * 对应字段 : tax_free_amount
     */
    private BigDecimal taxFreeAmount;

    /**
     * 状态
     * 表 : tb_invoice
     * 对应字段 : status
     */
    private Integer status;

    /**
     * 
     * 表 : tb_invoice
     * 对应字段 : order_id
     */
    private String orderId;

    /**
     * 
     * 表 : tb_invoice
     * 对应字段 : remark
     */
    private String remark;

    /**
     * 
     * 表 : tb_invoice
     * 对应字段 : fp_time
     */
    private Date fpTime;

    private static final long serialVersionUID = 1L;

    /**
     * get method 
     *
     * @return tb_invoice.id：账号标识
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
     * @return tb_invoice.type：类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * set method 
     *
     * @param type  类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * get method 
     *
     * @return tb_invoice.name：发票名称
     */
    public String getName() {
        return name;
    }

    /**
     * set method 
     *
     * @param name  发票名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * get method 
     *
     * @return tb_invoice.phone：手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set method 
     *
     * @param phone  手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * get method 
     *
     * @return tb_invoice.email：电子邮箱
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
     * @return tb_invoice.create_time：创建时间
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
     * @return tb_invoice.last_time：最后修改时间
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
     * @return tb_invoice.last_user：
     */
    public String getLastUser() {
        return lastUser;
    }

    /**
     * set method 
     *
     * @param lastUser  
     */
    public void setLastUser(String lastUser) {
        this.lastUser = lastUser == null ? null : lastUser.trim();
    }

    /**
     * get method 
     *
     * @return tb_invoice.deleted：删除标记
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
     * @return tb_invoice.delete_time：删除时间
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

    /**
     * get method 
     *
     * @return tb_invoice.nsrsbh：纳税人识别号
     */
    public String getNsrsbh() {
        return nsrsbh;
    }

    /**
     * set method 
     *
     * @param nsrsbh  纳税人识别号
     */
    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh == null ? null : nsrsbh.trim();
    }

    /**
     * get method 
     *
     * @return tb_invoice.gs_address：公司地址
     */
    public String getGsAddress() {
        return gsAddress;
    }

    /**
     * set method 
     *
     * @param gsAddress  公司地址
     */
    public void setGsAddress(String gsAddress) {
        this.gsAddress = gsAddress == null ? null : gsAddress.trim();
    }

    /**
     * get method 
     *
     * @return tb_invoice.gs_phone：公司电话号码
     */
    public String getGsPhone() {
        return gsPhone;
    }

    /**
     * set method 
     *
     * @param gsPhone  公司电话号码
     */
    public void setGsPhone(String gsPhone) {
        this.gsPhone = gsPhone == null ? null : gsPhone.trim();
    }

    /**
     * get method 
     *
     * @return tb_invoice.bank_name：开户银行
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * set method 
     *
     * @param bankName  开户银行
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * get method 
     *
     * @return tb_invoice.bank_account_name：银行账号
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * set method 
     *
     * @param bankAccountName  银行账号
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    /**
     * get method 
     *
     * @return tb_invoice.tax_able_amount：金额含税
     */
    public BigDecimal getTaxAbleAmount() {
        return taxAbleAmount;
    }

    /**
     * set method 
     *
     * @param taxAbleAmount  金额含税
     */
    public void setTaxAbleAmount(BigDecimal taxAbleAmount) {
        this.taxAbleAmount = taxAbleAmount;
    }

    /**
     * get method 
     *
     * @return tb_invoice.tax_free_amount：不含税金额
     */
    public BigDecimal getTaxFreeAmount() {
        return taxFreeAmount;
    }

    /**
     * set method 
     *
     * @param taxFreeAmount  不含税金额
     */
    public void setTaxFreeAmount(BigDecimal taxFreeAmount) {
        this.taxFreeAmount = taxFreeAmount;
    }

    /**
     * get method 
     *
     * @return tb_invoice.status：状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set method 
     *
     * @param status  状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get method 
     *
     * @return tb_invoice.order_id：
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * set method 
     *
     * @param orderId  
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * get method 
     *
     * @return tb_invoice.remark：
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set method 
     *
     * @param remark  
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * get method 
     *
     * @return tb_invoice.fp_time：
     */
    public Date getFpTime() {
        return fpTime;
    }

    /**
     * set method 
     *
     * @param fpTime  
     */
    public void setFpTime(Date fpTime) {
        this.fpTime = fpTime;
    }
}