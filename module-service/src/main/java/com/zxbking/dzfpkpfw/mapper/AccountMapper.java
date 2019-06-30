package com.zxbking.dzfpkpfw.mapper;

import com.zxbking.dzfpkpfw.model.Account;
import com.zxbking.dzfpkpfw.model.AccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(AccountExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(AccountExample example);

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
    int insert(Account record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Account record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<Account> selectByExample(AccountExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Account selectByPrimaryKey(String id);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Account record);
}