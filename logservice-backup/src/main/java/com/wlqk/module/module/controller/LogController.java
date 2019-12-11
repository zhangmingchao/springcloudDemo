package com.wlqk.module.module.controller;

//import com.wlqk.module.module.feign.IUserServiceFeignClient;

import com.wlqk.module.module.feign.IUserServiceFeignClient;
import com.wlqk.module.module.model.TestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: zc
 * @CreateDate: 2019/8/1 10:42
 */
@RestController
@RequestMapping("/log")
public class LogController {


//
//    @GetMapping("/find")
//    public String find(){
//        return "logservice:"+"find";
//    }
//
//    @GetMapping("/findById/{id}")
//    public String findById(@PathVariable("id") String id){
//        return logFeignClient.findById(id);
//    }

      //Rest 风格调用
//    @GetMapping("/{id}")
//    public String getMessage(@PathVariable Long id) {
//        return "the request1 id is " + id;
//    }

    @Autowired
    private IUserServiceFeignClient logFeignClient;

    @GetMapping("/{id}")
    public String getMessage(@PathVariable Long id) {
        System.out.println("logservice-backup");
        return "the request1 id is " + id;
    }

    @PostMapping("/post")
    public String post(@RequestBody TestParam testParam) {
        System.out.println("logservice-backup");
        return "testParam 1" + testParam.toString();
    }

}
