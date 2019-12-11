package com.wlqk.module.module.feign;/**
 * Created by admin on 2019/8/1.
 */

import com.wlqk.module.module.feign.impl.UserServiceFeignClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Author: zc
 * @CreateDate: 2019/8/1 11:03
 */
@FeignClient(value = "user-service",fallback = UserServiceFeignClientImpl.class)
public interface IUserServiceFeignClient {

    @GetMapping("/user/findById")
    public String findById(@RequestParam(name = "id") String id);

}
