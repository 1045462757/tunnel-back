package com.example.tunnel;

import com.example.tunnel.mapper.Sheet1Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class TunnelApplicationTests {

    @Resource
    private Sheet1Mapper sheet1Mapper;

    @Test
    void contextLoads() {
        System.out.println("Hello World");
    }

    @Test
    public void select() {
        System.out.println(sheet1Mapper.select("CQJT6910001298", "2020-04-06 00:00:00", "2020-04-07 00:00:00"));
    }

}
