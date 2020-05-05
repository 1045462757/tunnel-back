package com.example.tunnel.mapper;

import com.example.tunnel.domain.Monp;
import com.example.tunnel.domain.Tunnel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class MonpMapperTest {

    @Resource
    private MonpMapper monpMapper;

    @Test
    public void insert() {
        Monp monp = new Monp();
        monp.setMonpId("test2");

        Tunnel tunnel = new Tunnel();
        tunnel.setTunnelId("test");
        monp.setTunnel(tunnel);
        monp.setName("test");
        System.out.println(monpMapper.insert(monp));
    }

    @Test
    public void delete() {
        System.out.println(monpMapper.deleteByPrimaryKey("test"));
    }

    @Test
    public void update() {
        Monp monp = new Monp();
        monp.setMonpId("test");

        monp.setName("test");
        monp.setUnit("update");

        System.out.println(monpMapper.updateByPrimaryKeySelective(monp));
    }

    @Test
    public void select() {
        System.out.println(monpMapper.selectByPrimaryKey("test"));
    }

    @Test
    public void listMonp() {
        System.out.println(monpMapper.listMonp("222", 0, 10));
    }

    @Test
    public void countMonp() {
        System.out.println(monpMapper.countMonp());
    }

    @Test
    public void listTunnelName() {
        System.out.println(monpMapper.listTunnelName("a313bbcf3a"));
    }
}
