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
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public boolean addUserInfo(UserInfo userInfo) {
        int flag = userInfoMapper.insertSelective(userInfo);
        return flag==1;
    }

    @Override
    public UserInfo findById(String id) {
        UserInfo CeShi = userInfoMapper.selectByPrimaryKey(id);
        return CeShi;
    }

    @Override
    public boolean deleteUserInfoById(String id) {
        int flag = userInfoMapper.deleteByPrimaryKey(id);
        return flag==1;
    }

    @Override
    public boolean updateUserInfo(UserInfo userInfo) {
        int flag=0;
        if(userInfo!=null ){
            if(userInfo.getId()!=null ){
                flag = userInfoMapper.updateByPrimaryKeySelective(userInfo);
            }else {
                throw new RuntimeException("缺少标识");
            }
        }
        return flag==1;
    }

    @Override
    public PageInfo selectUserInfoByExample(UserInfo userInfo, Integer pageNo, Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        UserInfoExample example =new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();

        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = mapper.convertValue(userInfo, Map.class);

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if(entry.getValue()!=null&&StringUtils.isNotBlank(entry.getValue()+"")){
                if("accountId".equals(entry.getKey())){ criteria.andAccountIdLike("%"+entry.getValue()+"%"); continue; }
				if("userName".equals(entry.getKey())){ criteria.andUserNameLike("%"+entry.getValue()+"%"); continue; }
				if("phone".equals(entry.getKey())){ criteria.andPhoneLike("%"+entry.getValue()+"%"); continue; }
				if("sex".equals(entry.getKey())){ criteria.andSexLike("%"+entry.getValue()+"%"); continue; }
				if("email".equals(entry.getKey())){ criteria.andEmailLike("%"+entry.getValue()+"%"); continue; }
				if("identityCard".equals(entry.getKey())){ criteria.andIdentityCardLike("%"+entry.getValue()+"%"); continue; }
				if("createTime".equals(entry.getKey())){ criteria.andCreateTimeEqualTo(new Date((Long)entry.getValue())); continue; }
				if("lastTime".equals(entry.getKey())){ criteria.andLastTimeEqualTo(new Date((Long)entry.getValue())); continue; }
				if("deleted".equals(entry.getKey())){ criteria.andDeletedEqualTo((java.lang.Integer)entry.getValue()); continue; }
				if("deleteTime".equals(entry.getKey())){ criteria.andDeleteTimeEqualTo(new Date((Long)entry.getValue())); continue; }
				
            }
        }

        example.setOrderByClause("id");
        List<UserInfo> list = userInfoMapper.selectByExample(example);
        PageInfo page=new PageInfo(list);
        return page;
    }

    @Override
    public List<UserInfo> selectAll(){
        UserInfoExample example =new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andDeletedEqualTo(0);
        List<UserInfo> list = userInfoMapper.selectByExample(example);
        return list;
    }
}
