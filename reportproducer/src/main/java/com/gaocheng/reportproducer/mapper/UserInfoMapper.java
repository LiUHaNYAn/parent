package com.gaocheng.reportproducer.mapper;

import com.gaocheng.reportproducer.domain.UserInfo;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserInfoMapper {
    public List<UserInfo> selectAll();
    UserInfo selectByName(String id);
    int  insertUser(UserInfo userInfo);
}
