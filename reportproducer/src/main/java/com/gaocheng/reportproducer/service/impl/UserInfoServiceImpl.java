package com.gaocheng.reportproducer.service.impl;

import com.gaocheng.reportproducer.domain.UserInfo;
import com.gaocheng.reportproducer.mapper.UserInfoMapper;
import com.gaocheng.reportproducer.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    @Cacheable(value = "userinfo",key = "'selectAll'")
    public List<UserInfo> selectAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    @Cacheable(value = "userinfo",key = "#p0")
    public UserInfo selectByName(String id) {
        return userInfoMapper.selectByName(id);
    }

    @Override
    @CachePut(value = "userinfo",key = "#p0.id",unless = "#result eq null ")
    public UserInfo insertUser(UserInfo userInfo) {
       int result= userInfoMapper.insertUser(userInfo);
       if(result>0){
           return  userInfo;
       }
       return  null;
    }
}
