package com.gaocheng.reportproducer.service.impl;

import com.gaocheng.reportproducer.domain.WghStationDataHistroy;
import com.gaocheng.reportproducer.mapper.WghStationDataHistroyMapper;
import com.gaocheng.reportproducer.service.WghStationDataHistroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class WghStationDataHistroyServiceImpl implements WghStationDataHistroyService {
    @Autowired
    private WghStationDataHistroyMapper wghStationDataHistroyMapper;
    @Override
    @Cacheable(value = "wghstationdatahistroy",key = "#p0.toString()+#p1.toString()",unless = "#result eq null ")
    public List<WghStationDataHistroy> selectByTime(String starttime, String endtime) {
        return wghStationDataHistroyMapper.selectByTime(starttime,endtime);
    }
}
