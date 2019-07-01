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
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    private InvoiceMapper invoiceMapper;

    @Override
    public boolean addInvoice(Invoice invoice) {
        invoice.setStatus(1);
        invoice.setCreateTime(new Date());
        invoice.setDeleted(0);
        int flag = invoiceMapper.insertSelective(invoice);
        return flag==1;
    }

    @Override
    public Invoice findById(String id) {
        Invoice CeShi = invoiceMapper.selectByPrimaryKey(id);
        return CeShi;
    }

    @Override
    public boolean deleteInvoiceById(String id) {
        int flag = invoiceMapper.deleteByPrimaryKey(id);
        return flag==1;
    }

    @Override
    public boolean updateInvoice(Invoice invoice) {
        int flag=0;
        if(invoice!=null ){
            if(invoice.getId()!=null ){
                flag = invoiceMapper.updateByPrimaryKeySelective(invoice);
            }else {
                throw new RuntimeException("缺少标识");
            }
        }
        return flag==1;
    }

    @Override
    public PageInfo selectInvoiceByExample(Invoice invoice, Integer pageNo, Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        InvoiceExample example =new InvoiceExample();
        InvoiceExample.Criteria criteria = example.createCriteria();

        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = mapper.convertValue(invoice, Map.class);

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if(entry.getValue()!=null&&StringUtils.isNotBlank(entry.getValue()+"")){
                if("id".equals(entry.getKey())){ criteria.andIdLike("%"+entry.getValue()+"%"); continue; }
				if("type".equals(entry.getKey())){ criteria.andTypeEqualTo((java.lang.Integer)entry.getValue()); continue; }
				if("name".equals(entry.getKey())){ criteria.andNameLike("%"+entry.getValue()+"%"); continue; }
				if("phone".equals(entry.getKey())){ criteria.andPhoneLike("%"+entry.getValue()+"%"); continue; }
				if("email".equals(entry.getKey())){ criteria.andEmailLike("%"+entry.getValue()+"%"); continue; }
				if("createTime".equals(entry.getKey())){ criteria.andCreateTimeEqualTo(new Date((Long)entry.getValue())); continue; }
				if("lastTime".equals(entry.getKey())){ criteria.andLastTimeEqualTo(new Date((Long)entry.getValue())); continue; }
				if("lastUser".equals(entry.getKey())){ criteria.andLastUserLike("%"+entry.getValue()+"%"); continue; }
				if("deleted".equals(entry.getKey())){ criteria.andDeletedEqualTo((java.lang.Integer)entry.getValue()); continue; }
				if("deleteTime".equals(entry.getKey())){ criteria.andDeleteTimeEqualTo(new Date((Long)entry.getValue())); continue; }
				if("nsrsbh".equals(entry.getKey())){ criteria.andNsrsbhLike("%"+entry.getValue()+"%"); continue; }
				if("gsAddress".equals(entry.getKey())){ criteria.andGsAddressLike("%"+entry.getValue()+"%"); continue; }
				if("gsPhone".equals(entry.getKey())){ criteria.andGsPhoneLike("%"+entry.getValue()+"%"); continue; }
				if("bankName".equals(entry.getKey())){ criteria.andBankNameLike("%"+entry.getValue()+"%"); continue; }
				if("bankAccountName".equals(entry.getKey())){ criteria.andBankAccountNameLike("%"+entry.getValue()+"%"); continue; }
				if("taxAbleAmount".equals(entry.getKey())){ criteria.andTaxAbleAmountEqualTo((java.lang.Long)entry.getValue()); continue; }
				if("taxFreeAmount".equals(entry.getKey())){ criteria.andTaxFreeAmountEqualTo((java.lang.Long)entry.getValue()); continue; }
				if("status".equals(entry.getKey())){ criteria.andStatusEqualTo((java.lang.Integer)entry.getValue()); continue; }
				if("orderId".equals(entry.getKey())){ criteria.andOrderIdLike("%"+entry.getValue()+"%"); continue; }
				if("remark".equals(entry.getKey())){ criteria.andRemarkLike("%"+entry.getValue()+"%"); continue; }
				if("fpTime".equals(entry.getKey())){ criteria.andFpTimeEqualTo(new Date((Long)entry.getValue())); continue; }
				
            }
        }

        example.setOrderByClause("id");
        List<Invoice> list = invoiceMapper.selectByExample(example);
        PageInfo page=new PageInfo(list);
        return page;
    }

    @Override
    public List<Invoice> selectAll(){
        InvoiceExample example =new InvoiceExample();
        List<Invoice> list = invoiceMapper.selectByExample(example);
        return list;
    }
}
