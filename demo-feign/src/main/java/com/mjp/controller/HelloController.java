package com.mjp.controller;

import com.mjp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mjp
 * @date 2019/8/11 - 7:01
 */
@RestController
public class HelloController {

   @Autowired
    HelloService helloService;

    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        return helloService.obtainOtherServerJsonData(name);
    }


    @RequestMapping("/sayHello2")
    public String sayHello2(String name) {
        return helloService.obtainOtherServerJsonData(name);
    }


}
