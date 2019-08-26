package dev.td.mgrmseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MgrMsEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MgrMsEurekaApplication.class, args);
    }

}
