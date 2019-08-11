package com.mjp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author mjp
 * @date 2019/8/10 - 0:29
 */
@SpringBootApplication
@EnableEurekaClient
public class ApplicationSlicentServer {
    public static  void main(String [] args){
        SpringApplication.run(ApplicationSlicentServer.class,args);
    }
}
