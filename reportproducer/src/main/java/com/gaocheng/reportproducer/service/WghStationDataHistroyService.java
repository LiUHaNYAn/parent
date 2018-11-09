package com.gaocheng.reportproducer.service;

import com.gaocheng.reportproducer.domain.WghStationDataHistroy;

import java.util.Date;
import java.util.List;

public interface WghStationDataHistroyService {
    public List<WghStationDataHistroy> selectByTime(String starttime,String endtime);
}
