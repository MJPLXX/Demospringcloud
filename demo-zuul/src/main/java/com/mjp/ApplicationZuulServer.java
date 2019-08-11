package com.mjp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author mjp
 * @date 2019/8/12 - 0:18
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
public class ApplicationZuulServer {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationZuulServer.class,args);
    }

}
