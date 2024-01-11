package org.example.lury;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        System.out.println("AAAA");
        System.out.println("hello world");
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
