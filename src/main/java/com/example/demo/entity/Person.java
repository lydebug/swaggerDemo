package com.example.demo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: liyang27
 * @Date: 2020/6/26 15:06
 * @Description:
 */
@ConfigurationProperties(prefix = "person")
@Component
@Data
public class Person {
    private String name;
    private Integer age;
    private String addr;
}
