package tech.hutu.admin.rest;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class AdminRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminRestApplication.class, args);
    }
}
