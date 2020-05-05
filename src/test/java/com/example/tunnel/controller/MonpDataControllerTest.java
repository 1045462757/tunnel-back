package com.example.tunnel.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class MonpDataControllerTest {

    @Resource
    private MonpDataController monpDataController;

    @Test
    public void listMonpData() {
        String[] time = new String[2];
        time[0] = "2020-05-03 00:00:00";
        time[1] = "2020-05-05 00:00:00";
        System.out.println(monpDataController.listMonpData("462c086130", time));
    }
}
