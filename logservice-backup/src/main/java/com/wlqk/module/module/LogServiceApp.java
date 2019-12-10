package com.wlqk.module.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @Author: zc
 * @CreateDate: 2019/8/1 10:33
 */
@EnableDiscoveryClient//声明这是一个Eureka Client
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class LogServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(LogServiceApp.class);
    }
}
