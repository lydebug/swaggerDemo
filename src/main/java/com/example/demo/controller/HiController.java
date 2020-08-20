package com.example.demo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liyang27
 * @Date: 2020/6/18 17:18
 * @Description:
 */
@RestController
@ConfigurationProperties(prefix = "person")
public class HiController {

    private String name;
    private String addr;

    /**
     * 功能描述:
     *
     * @param:
     * @return:
     * @auther: liyang27
     * @date: 2020/6/18 17:28
     */
    @GetMapping("/say")
    public String say() {
        return name + " ," + addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
