package com.example.demo;

import com.example.demo.entity.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import java.text.DecimalFormat;

@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {

    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;

    @Test
    void contextLoads() {
        System.out.println("person = " + person);
    }

    @Test
    public void testJedis() {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.set("name", "leon");
        System.out.println("jedis.get(\"name\") = " + jedis.get("name"));
        jedis.close();
    }

    @Test
    public void df1() {
        double d1 = 123.456789;
        System.out.println(new DecimalFormat("0").format(d1));//123
        System.out.println(new DecimalFormat("00000.00").format(d1));//00123.46
        System.out.println(new DecimalFormat("#").format(d1));//123
        System.out.println(new DecimalFormat("####.##").format(d1));//123.46
        System.out.println(new DecimalFormat("#.#####E0").format(d1));//1.23457E2
    }

}
