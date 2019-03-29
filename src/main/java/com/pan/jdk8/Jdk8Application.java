package com.pan.jdk8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class Jdk8Application {

    public static void main(String[] args) {
        //SpringApplication.run(Jdk8Application.class, args);

        Double d= new Double(0);

        System.out.println(d==0);


    }

}
