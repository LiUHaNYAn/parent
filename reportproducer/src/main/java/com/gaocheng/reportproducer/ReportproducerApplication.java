package com.gaocheng.reportproducer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.gaocheng.reportproducer.mapper")
@EnableDiscoveryClient
public class ReportproducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportproducerApplication.class, args);
    }
}
