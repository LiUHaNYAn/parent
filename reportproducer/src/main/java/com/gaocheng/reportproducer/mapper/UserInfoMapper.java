package com.gaocheng.reportproducer.mapper;

import com.gaocheng.reportproducer.domain.UserInfo;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface UserInfoMapper {
    @Cacheable(value = "userinfo",key = "'selectAll'")
    public List<UserInfo> selectAll();
    @Cacheable(value = "userinfo", key = "#p0",unless = "#result eq null ")
    UserInfo selectByName(String id);
    @CachePut(value = "userinfo",key = "#p0.id")
    int  insertUser(UserInfo userInfo);
}
