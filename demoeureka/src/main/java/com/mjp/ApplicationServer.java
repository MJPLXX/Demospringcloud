package com.mjp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author mjp
 * @date 2019/8/10 - 0:21
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationServer {
    public  static void main (String [] agrs){
        SpringApplication.run(ApplicationServer.class,agrs);
    }
}
