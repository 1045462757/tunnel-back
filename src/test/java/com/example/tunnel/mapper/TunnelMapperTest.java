package com.example.tunnel.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TunnelMapperTest {

    @Resource
    private TunnelMapper tunnelMapper;

    @Test
    public void test() {
        System.out.println(tunnelMapper.listTunnel(0, 10));
    }

    @Test
    public void insert() {
        System.out.println(tunnelMapper.insert("test", "test", "test", "test",
                "test", "test", "test", "test",
                "test", "test", "test"));
    }

    @Test
    public void delete() {
        System.out.println(tunnelMapper.deleteByPrimaryKey("test"));
    }

    @Test
    public void select() {
        System.out.println(tunnelMapper.selectByPrimaryKey("test"));
    }

    @Test
    public void select2() {
        System.out.println(tunnelMapper.select("test"));
    }

    @Test
    public void update() {
        System.out.println(tunnelMapper.updateByPrimaryKeySelective("test", "update", "update"));
    }

    @Test
    public void listTunnelName() {
        System.out.println(tunnelMapper.listTunnelName());
    }
}
