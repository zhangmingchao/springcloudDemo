package com.wlqk.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description:
 * @Author: zc
 * @CreateDate: 2019/8/1 10:55
 */
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServiceApp.class);
    }
}
