package com.mjp.controller;

import com.mjp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mjp
 * @date 2019/8/10 - 14:47
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("hello")
    public String hello(String name){

        return helloService.obtainOtherService(name);
    }


}
