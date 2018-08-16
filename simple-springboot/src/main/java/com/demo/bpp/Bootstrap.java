package com.demo.bpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author junhong
 */

@SpringBootApplication
@ComponentScan("com.demo")
@EnableSwagger2
public class Bootstrap {

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class);
    }

}