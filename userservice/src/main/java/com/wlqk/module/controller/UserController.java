package com.wlqk.module.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zc
 * @CreateDate: 2019/8/1 10:42
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/find")
    public String find(){
        return "userservice:"+"find";
    }

    @GetMapping("/findById")
    public String findById(@RequestParam(name = "id") String id){
        return "id="+id+"---"+"name="+"张三";
    }

}
