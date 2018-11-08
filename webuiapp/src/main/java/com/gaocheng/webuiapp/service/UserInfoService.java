package com.gaocheng.webuiapp.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "service-producer",fallback = userInfoFallback.class)
public interface UserInfoService {
    @RequestMapping("/")
    public Object selectAll();
}
@Component
class  userInfoFallback implements UserInfoService{

    @Override
    public Object selectAll() {
        return "from client side msg";
    }
}
