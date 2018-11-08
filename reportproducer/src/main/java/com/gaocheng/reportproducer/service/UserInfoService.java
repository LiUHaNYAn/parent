package com.gaocheng.reportproducer.service;

import com.gaocheng.reportproducer.domain.UserInfo;

import java.util.List;

public interface UserInfoService {

    public List<UserInfo> selectAll();
    UserInfo selectByName(String id);
    UserInfo  insertUser(UserInfo userInfo);
}
