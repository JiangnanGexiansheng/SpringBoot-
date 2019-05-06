package com.iot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 声明该类是SpringBoot的一个引导类
* 该@SpringBootApplication注解也可以放在其他类中
* 只不过run()方法中的参数要改为相应的类的Class对象
* */
@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);
    }
}
