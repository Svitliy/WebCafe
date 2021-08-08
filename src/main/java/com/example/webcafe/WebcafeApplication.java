package com.example.webcafe;

import com.example.webcafe.config.AppConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebcafeApplication {
    BeanFactory beanFactory;



    public static void main(String[] args) {


        SpringApplication.run(WebcafeApplication.class, args);
    }

}
