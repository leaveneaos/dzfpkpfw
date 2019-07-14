package com.zxbking.dzfpkpfw.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Date;
import com.zxbking.dzfpkpfw.mapper.*;
import com.zxbking.dzfpkpfw.model.*;
import com.zxbking.dzfpkpfw.service.*;
import java.util.Map;


@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public boolean addAccount(Account account) {
        int flag = accountMapper.insertSelective(account);
        return flag==1;
    }

    @Override
    public Account findById(String id) {
        Account CeShi = accountMapper.selectByPrimaryKey(id);
        return CeShi;
    }

    @Override
    public boolean deleteAccountById(String id) {
        int flag = accountMapper.deleteByPrimaryKey(id);
        return flag==1;
    }

    @Override
    public boolean updateAccount(Account account) {
        int flag=0;
        if(account!=null ){
            if(account.getId()!=null ){
                flag = accountMapper.updateByPrimaryKeySelective(account);
            }else {
                throw new RuntimeException("缺少标识");
            }
        }
        return flag==1;
    }

    @Override
    public PageInfo selectAccountByExample(Account account, Integer pageNo, Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        AccountExample example =new AccountExample();
        AccountExample.Criteria criteria = example.createCriteria();

        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = mapper.convertValue(account, Map.class);

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if(entry.getValue()!=null&&StringUtils.isNotBlank(entry.getValue()+"")){
                if("id".equals(entry.getKey())){ criteria.andIdLike("%"+entry.getValue()+"%"); continue; }
				if("accountName".equals(entry.getKey())){ criteria.andAccountNameLike("%"+entry.getValue()+"%"); continue; }
				if("password".equals(entry.getKey())){ criteria.andPasswordLike("%"+entry.getValue()+"%"); continue; }
				if("mm".equals(entry.getKey())){ criteria.andMmLike("%"+entry.getValue()+"%"); continue; }
				if("validMark".equals(entry.getKey())){ criteria.andValidMarkEqualTo((java.lang.Integer)entry.getValue()); continue; }
				if("createTime".equals(entry.getKey())){ criteria.andCreateTimeEqualTo(new Date((Long)entry.getValue())); continue; }
				if("lastTime".equals(entry.getKey())){ criteria.andLastTimeEqualTo(new Date((Long)entry.getValue())); continue; }
				if("deleted".equals(entry.getKey())){ criteria.andDeletedEqualTo((java.lang.Integer)entry.getValue()); continue; }
				if("deleteTime".equals(entry.getKey())){ criteria.andDeleteTimeEqualTo(new Date((Long)entry.getValue())); continue; }
				
            }
        }

        example.setOrderByClause("id");
        List<Account> list = accountMapper.selectByExample(example);
        PageInfo page=new PageInfo(list);
        return page;
    }

    @Override
    public List<Account> selectAll(){
        AccountExample example =new AccountExample();
        AccountExample.Criteria criteria = example.createCriteria();
        criteria.andDeletedEqualTo(0);
        List<Account> list = accountMapper.selectByExample(example);
        return list;
    }

    @Override
    public Account findAccountName(String accountName) {
        AccountExample example =new AccountExample();
        AccountExample.Criteria criteria = example.createCriteria();
        criteria.andAccountNameEqualTo(accountName).andDeletedEqualTo(0);
        List<Account> list = accountMapper.selectByExample(example);
        if(list.size()==1){
            return list.get(0);
        }
        return null;
    }
}
