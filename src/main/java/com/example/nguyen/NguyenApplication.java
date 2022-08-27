package com.example.nguyen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class NguyenApplication {

    public static void main(String[] args) {
        SpringApplication.run(NguyenApplication.class, args);
    }

}
