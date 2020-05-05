package com.example.tunnel.service;

import com.example.tunnel.domain.Monp;
import com.example.tunnel.domain.Tunnel;
import com.example.tunnel.util.BusinessResult;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class MonpServiceTest {

    @Resource
    private MonpService monpService;

    @Test
    public void insertMonp() {

        Monp monp = new Monp();
        monp.setName("test");
        Tunnel tunnel = new Tunnel();
        tunnel.setTunnelId("111");
        monp.setTunnel(tunnel);

        BusinessResult businessResult = monpService.insertMonp(monp);

        System.out.println(businessResult);
    }

    @Test
    public void deletMonp() {
        BusinessResult businessResult = monpService.deleteMonp("test");
        System.out.println(businessResult);
    }

    @Test
    public void updateMonp() {
        Monp monp = new Monp();
        monp.setMonpId("test2");
        monp.setName("update");
        BusinessResult businessResult = monpService.updateMonp(monp);
        System.out.println(businessResult);
    }

    @Test
    public void getMonp() {
        BusinessResult businessResult = monpService.getMonp("test2");
        System.out.println(businessResult);
    }

    @Test
    public void listMonps() {
        BusinessResult businessResult = monpService.listMonps("222", 1);
        System.out.println(businessResult);
    }

    @Test
    public void listIdAndName() {
        BusinessResult businessResult = monpService.listIdAndName("a313bbcf3a");

        System.out.println(businessResult);
    }
}
