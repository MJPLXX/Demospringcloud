package com.mjp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author mjp
 * @date 2019/8/10 - 14:41
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //表示想服务中心注册
@EnableHystrix
public class ApplicationRibbonServer {
    public static void main(String [] args){
        SpringApplication.run(ApplicationRibbonServer.class,args);
    }

    @Bean
    @LoadBalanced //表明resttemplate工具将会负载均衡
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }

}
