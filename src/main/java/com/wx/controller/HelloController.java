package com.wx.controller;

import com.wx.pojo.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {


    @GetMapping(value = "/hello")
    public  String hello(){
        return "Hello!";
    }

    @GetMapping("/user")
    public User getUser(){
        return new User();
    }

    //@ApiOperation用在接口上，对接口进行说明
    @ApiOperation("Hello控制类")
    @GetMapping("/hello2")
    public String hello2(){
        return "";
    }
}
