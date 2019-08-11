package com.mjp.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author mjp
 * @date 2019/8/11 - 7:06
 */
@FeignClient(value = "SERVICE-CLIENT",fallback = ErrHander.class)
public interface HelloService {
    //如果不加上@RequestParam注解，就不能正确的携带参数去调用"SERVICE-CLIENT"服务器。
    // 所以，必须要为接口方法上的参数，添加@RequestParam注解。
    @RequestMapping("/hi")
    String obtainOtherServerJsonData(@RequestParam(value = "name")String name);
}
