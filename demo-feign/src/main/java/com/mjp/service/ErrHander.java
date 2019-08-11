package com.mjp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mjp
 * @date 2019/8/11 - 7:31
 * 熔断器处理类
 * 在接口上的@FeignClient注解里，增加fallback = ErrorHandler.class配置。

ErrorHandler是我们的熔断处理类。 需要实现@FeignClient注解的接口，并且使用@Component加入IOC容器。
 */
@Component
public class ErrHander implements HelloService {

    @Value("${server.port}")
    private String port;



    public String obtainOtherServerJsonData(String name) {
        return "sorry " + name + " , " + port + " server internal error";

    }
}
