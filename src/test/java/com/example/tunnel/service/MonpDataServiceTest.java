package com.example.tunnel.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class MonpDataServiceTest {

    @Resource
    private MonpDataService monpDataService;

    @Test
    public void listMonpData() {
        System.out.println(monpDataService.listMonpData("462c086130", "2020-05-03 00:00:00", "2020-05-05 00:00:00"));
    }
}
