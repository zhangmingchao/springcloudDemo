package com.wlqk.module.module.controller;

//import com.wlqk.module.module.feign.LogFeignClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zc
 * @CreateDate: 2019/8/1 10:42
 */
@RestController
@RequestMapping("/log")
public class LogController {

    //    @Autowired
//    private LogFeignClient logFeignClient;
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
    @GetMapping("/{id}")
    public String getMessage(@PathVariable Long id) {
        return "the request1 id is " + id;
    }

}
