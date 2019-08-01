package com.wlqk.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:
 * @Author: zc
 * @CreateDate: 2019/8/1 10:33
 */
@EnableEurekaServer
@SpringBootApplication
public class EurakaServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(EurakaServiceApp.class);
    }
}
