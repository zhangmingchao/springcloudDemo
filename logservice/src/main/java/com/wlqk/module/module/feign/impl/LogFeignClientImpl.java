package com.wlqk.module.module.feign.impl;

import com.wlqk.module.module.feign.LogFeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Author: zc
 * @CreateDate: 2019/8/1 11:20
 */
@Component
public class LogFeignClientImpl implements LogFeignClient {
    @Override
    public String findById(@RequestParam(name = "id") String id) {
        return "出现异常";
    }
}
