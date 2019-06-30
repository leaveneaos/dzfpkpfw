package com.zxbking.dzfpkpfw.service;

import com.github.pagehelper.PageInfo;
import com.zxbking.dzfpkpfw.mapper.*;
import com.zxbking.dzfpkpfw.model.*;
import com.zxbking.dzfpkpfw.service.*;
import java.util.List;

public interface InvoiceService {

    boolean addInvoice(Invoice invoice);

    Invoice findById(String id);

    boolean deleteInvoiceById(String id);

    boolean updateInvoice(Invoice invoice);

    PageInfo selectInvoiceByExample(Invoice invoice, Integer pageNo, Integer pageSize);

    List<Invoice> selectAll();
}
