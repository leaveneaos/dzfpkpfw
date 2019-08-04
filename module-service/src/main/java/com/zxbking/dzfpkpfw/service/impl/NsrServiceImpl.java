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
public class NsrServiceImpl implements NsrService {
    @Autowired
    private NsrMapper nsrMapper;

    @Override
    public boolean addNsr(Nsr nsr) {
        int flag = nsrMapper.insertSelective(nsr);
        return flag==1;
    }

    @Override
    public Nsr findById(String id) {
        Nsr CeShi = nsrMapper.selectByPrimaryKey(id);
        return CeShi;
    }

    @Override
    public boolean deleteNsrById(String id) {
        int flag = nsrMapper.deleteByPrimaryKey(id);
        return flag==1;
    }

    @Override
    public boolean updateNsr(Nsr nsr) {
        int flag=0;
        if(nsr!=null ){
            if(nsr.getId()!=null ){
                flag = nsrMapper.updateByPrimaryKeySelective(nsr);
            }else {
                throw new RuntimeException("缺少标识");
            }
        }
        return flag==1;
    }

    @Override
    public PageInfo selectNsrByExample(Nsr nsr, Integer pageNo, Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        NsrExample example =new NsrExample();
        NsrExample.Criteria criteria = example.createCriteria();

        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = mapper.convertValue(nsr, Map.class);

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if(entry.getValue()!=null&&StringUtils.isNotBlank(entry.getValue()+"")){
                if("id".equals(entry.getKey())){ criteria.andIdLike("%"+entry.getValue()+"%"); continue; }
				if("nsrmc".equals(entry.getKey())){ criteria.andNsrmcLike("%"+entry.getValue()+"%"); continue; }
				if("nsrbm".equals(entry.getKey())){ criteria.andNsrbmLike("%"+entry.getValue()+"%"); continue; }
				if("validMark".equals(entry.getKey())){ criteria.andValidMarkEqualTo((java.lang.Integer)entry.getValue()); continue; }
				if("createTime".equals(entry.getKey())){ criteria.andCreateTimeEqualTo(new Date((Long)entry.getValue())); continue; }
				if("lastTime".equals(entry.getKey())){ criteria.andLastTimeEqualTo(new Date((Long)entry.getValue())); continue; }
				if("deleted".equals(entry.getKey())){ criteria.andDeletedEqualTo((java.lang.Integer)entry.getValue()); continue; }
				if("deleteTime".equals(entry.getKey())){ criteria.andDeleteTimeEqualTo(new Date((Long)entry.getValue())); continue; }
				
            }
        }

        example.setOrderByClause("id");
        List<Nsr> list = nsrMapper.selectByExample(example);
        PageInfo page=new PageInfo(list);
        return page;
    }

    @Override
    public List<Nsr> selectAll(){
        NsrExample example =new NsrExample();
        List<Nsr> list = nsrMapper.selectByExample(example);
        return list;
    }
}
