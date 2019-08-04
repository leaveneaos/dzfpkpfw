package com.zxbking.dzfpkpfw.service;

import com.github.pagehelper.PageInfo;
import com.zxbking.dzfpkpfw.mapper.*;
import com.zxbking.dzfpkpfw.model.*;
import com.zxbking.dzfpkpfw.service.*;
import java.util.List;

public interface NsrService {

    boolean addNsr(Nsr nsr);

    Nsr findById(String id);

    boolean deleteNsrById(String id);

    boolean updateNsr(Nsr nsr);

    PageInfo selectNsrByExample(Nsr nsr, Integer pageNo, Integer pageSize);

    List<Nsr> selectAll();
}
