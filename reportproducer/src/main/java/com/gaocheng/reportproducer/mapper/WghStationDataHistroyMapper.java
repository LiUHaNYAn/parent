package com.gaocheng.reportproducer.mapper;

import com.gaocheng.reportproducer.domain.WghStationDataHistroy;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
@Component
public interface WghStationDataHistroyMapper {
    List<WghStationDataHistroy> selectByTime(@Param("starttime") String starttime, @Param("endtime")String endtime);
}
