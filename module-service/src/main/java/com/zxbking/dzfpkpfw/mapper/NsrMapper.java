package com.zxbking.dzfpkpfw.mapper;

import com.zxbking.dzfpkpfw.model.Nsr;
import com.zxbking.dzfpkpfw.model.NsrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NsrMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(NsrExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(NsrExample example);

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
    int insert(Nsr record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Nsr record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<Nsr> selectByExample(NsrExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Nsr selectByPrimaryKey(String id);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Nsr record, @Param("example") NsrExample example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Nsr record, @Param("example") NsrExample example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Nsr record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Nsr record);
}