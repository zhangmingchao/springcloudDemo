package com.wlqk.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: zc
 * @CreateDate: 2019/8/1 10:33
 */
@EnableDiscoveryClient//声明这是一个Eureka Client
@SpringBootApplication
public class UserServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApp.class);
    }
}
