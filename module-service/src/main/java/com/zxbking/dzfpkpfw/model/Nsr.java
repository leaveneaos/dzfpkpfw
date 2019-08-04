package com.zxbking.dzfpkpfw.model;

import com.ihyht.alyxjs.nbjcpt.component.generator.IdEntity;
import java.io.Serializable;
import java.util.Date;

public class Nsr extends IdEntity implements Serializable {
    /**
     * 标识
     * 表 : tb_base_nsr
     * 对应字段 : id
     */
    private String id;

    /**
     * 纳税人名称
     * 表 : tb_base_nsr
     * 对应字段 : nsrmc
     */
    private String nsrmc;

    /**
     * 纳税人编码
     * 表 : tb_base_nsr
     * 对应字段 : nsrbm
     */
    private String nsrbm;

    /**
     * 有效标记
     * 表 : tb_base_nsr
     * 对应字段 : valid_mark
     */
    private Integer validMark;

    /**
     * 创建时间
     * 表 : tb_base_nsr
     * 对应字段 : create_time
     */
    private Date createTime;

    /**
     * 最后修改时间
     * 表 : tb_base_nsr
     * 对应字段 : last_time
     */
    private Date lastTime;

    /**
     * 删除标记
     * 表 : tb_base_nsr
     * 对应字段 : deleted
     */
    private Integer deleted;

    /**
     * 删除时间
     * 表 : tb_base_nsr
     * 对应字段 : delete_time
     */
    private Date deleteTime;

    private static final long serialVersionUID = 1L;

    /**
     * get method 
     *
     * @return tb_base_nsr.id：标识
     */
    public String getId() {
        return id;
    }

    /**
     * set method 
     *
     * @param id  标识
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * get method 
     *
     * @return tb_base_nsr.nsrmc：纳税人名称
     */
    public String getNsrmc() {
        return nsrmc;
    }

    /**
     * set method 
     *
     * @param nsrmc  纳税人名称
     */
    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc == null ? null : nsrmc.trim();
    }

    /**
     * get method 
     *
     * @return tb_base_nsr.nsrbm：纳税人编码
     */
    public String getNsrbm() {
        return nsrbm;
    }

    /**
     * set method 
     *
     * @param nsrbm  纳税人编码
     */
    public void setNsrbm(String nsrbm) {
        this.nsrbm = nsrbm == null ? null : nsrbm.trim();
    }

    /**
     * get method 
     *
     * @return tb_base_nsr.valid_mark：有效标记
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
     * @return tb_base_nsr.create_time：创建时间
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
     * @return tb_base_nsr.last_time：最后修改时间
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
     * @return tb_base_nsr.deleted：删除标记
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
     * @return tb_base_nsr.delete_time：删除时间
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