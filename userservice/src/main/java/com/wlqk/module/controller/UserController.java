package com.wlqk.module.controller;

import com.wlqk.module.feign.ILogServiceFeignClient;
import com.wlqk.module.model.TestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: zc
 * @CreateDate: 2019/8/1 10:42
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @GetMapping("/find")
    public String find(){
        return "userservice:"+"find";
    }

    @GetMapping("/findById")
    public String findById(@RequestParam(name = "id") String id){
        return "id="+id+"---"+"name="+"张三";
    }




//   rest 风格测试 ribbon
//    @GetMapping("/test")
//    public String test() {
//        String result = restTemplate.getForObject("http://log-service/log/123",String.class);
//        System.out.println(result);
//        return result;
//    }
//
//    @GetMapping("/test2")
//    public String test2() {
//        ServiceInstance serviceInstance = loadBalancerClient.choose("log-service");
//        String result = serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort();
//        System.out.println(result);
//        return result;
//    }


    @Autowired
    private ILogServiceFeignClient logServiceFeignClient;


    @GetMapping("/test")
    public String test() {
        String result = logServiceFeignClient.test(234L);
        System.out.println(result);
        return result;
    }

    @GetMapping("/test2")
    public String test2() {
        TestParam testParam = new TestParam(55, "zhangsan");
        String result = logServiceFeignClient.post(testParam);
        System.out.println(result);
        return result;
    }

}
