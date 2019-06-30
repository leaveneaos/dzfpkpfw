package com.zxbking.dzfpkpfw.service;

import com.github.pagehelper.PageInfo;
import com.zxbking.dzfpkpfw.mapper.*;
import com.zxbking.dzfpkpfw.model.*;
import com.zxbking.dzfpkpfw.service.*;
import java.util.List;

public interface AccountService {

    boolean addAccount(Account account);

    Account findById(String id);

    boolean deleteAccountById(String id);

    boolean updateAccount(Account account);

    PageInfo selectAccountByExample(Account account, Integer pageNo, Integer pageSize);

    List<Account> selectAll();

    Account findAccountName(String accountName);
}
