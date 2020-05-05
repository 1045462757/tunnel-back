package com.example.tunnel.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class MonpControllerTest {

    @Resource
    private MonpController monpController;

    @Test
    public void listMonp() {
        System.out.println(monpController.listMonp("111", 1));
    }

    @Test
    public void getMonp() {
        System.out.println(monpController.getMonp("test2"));
    }

    @Test
    public void deleteMonp() {
        System.out.println(monpController.deleteMonp("test2"));
    }
}
