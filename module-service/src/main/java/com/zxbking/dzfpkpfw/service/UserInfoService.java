package com.zxbking.dzfpkpfw.service;

import com.github.pagehelper.PageInfo;
import com.zxbking.dzfpkpfw.mapper.*;
import com.zxbking.dzfpkpfw.model.*;
import com.zxbking.dzfpkpfw.service.*;
import java.util.List;

public interface UserInfoService {

    boolean addUserInfo(UserInfo userInfo);

    UserInfo findById(String id);

    boolean deleteUserInfoById(String id);

    boolean updateUserInfo(UserInfo userInfo);

    PageInfo selectUserInfoByExample(UserInfo userInfo, Integer pageNo, Integer pageSize);

    List<UserInfo> selectAll();


}
