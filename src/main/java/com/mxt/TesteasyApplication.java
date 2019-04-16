package com.mxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.mxt.dao")
@SpringBootApplication
public class TesteasyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TesteasyApplication.class, args);
    }

}
