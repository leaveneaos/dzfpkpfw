package com.zxbking.dzfpkpfw.mapper;

import com.zxbking.dzfpkpfw.model.Invoice;
import com.zxbking.dzfpkpfw.model.InvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(InvoiceExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(InvoiceExample example);

    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(Invoice record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Invoice record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<Invoice> selectByExample(InvoiceExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Invoice selectByPrimaryKey(String id);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Invoice record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Invoice record);
}