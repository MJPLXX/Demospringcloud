package com.mjp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mjp
 * @date 2019/8/10 - 0:54
 */
@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String hi(String name) {
        return "hi " + name + " , l am " + port + " port";
    }
}
