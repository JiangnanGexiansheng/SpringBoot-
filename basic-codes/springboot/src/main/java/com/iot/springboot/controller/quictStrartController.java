package com.iot.springboot.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ConfigurationProperties(prefix = "student")//里面的参数表示key的前缀
@Controller
public class quictStrartController {

    /*
    * 利用@ConfigurationProperties(prefix = "student")注解获取
    * application.yml文件中的配置信息
    * */
    private String name;
    private int age;
    private String addr;

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "Hello "+name+" age:"+age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
