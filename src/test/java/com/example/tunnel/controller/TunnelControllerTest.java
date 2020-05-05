package com.example.tunnel.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TunnelControllerTest {

    @Resource
    private TunnelController tunnelController;

    @Test
    public void listTunnel() {
        System.out.println(tunnelController.listTunnel(2));
    }

    @Test
    public void getTunnel() {
        System.out.println(tunnelController.getTunnel("ee0677969f"));
    }

    @Test
    public void getTunnelList() {
        System.out.println(tunnelController.getTunnelList());
    }
}
