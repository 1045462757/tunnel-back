package com.example.tunnel.service;

import com.example.tunnel.domain.*;
import com.example.tunnel.util.BusinessResult;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TunnelServiceTest {

    @Resource
    private TunnelService tunnelService;

    @Test
    public void insertTunnel() {
        String tunnelName = "测试隧道名";
        String tunnelIntro = "测试隧道简介";

        BusinessResult businessResult = tunnelService.insertTunnel(tunnelName, tunnelIntro);

        System.out.println(businessResult);
    }

    @Test
    public void deleteTunnel() {
        String tunnelId = "88642a8e52";

        BusinessResult businessResult = tunnelService.deleteTunnel(tunnelId);

        System.out.println(businessResult);
    }

    @Test
    public void selectTunnel() {
        String tunnelId = "ee0677969f";

        BusinessResult businessResult = tunnelService.getTunnel(tunnelId);

        System.out.println(businessResult);
    }

    @Test
    public void listTunnels() {
        BusinessResult businessResult = tunnelService.listTunnels(2);

        System.out.println(businessResult);
    }

    @Test
    public void updateTunnel() {
        Tunnel tunnel = new Tunnel();

        ProjectDesign projectDesign = new ProjectDesign();
        projectDesign.setId("a3375b499b");
        projectDesign.setDesignUnit("测试修改");

        PreliminaryDesign preliminaryDesign = new PreliminaryDesign();
        preliminaryDesign.setId("4204e86cb1");
        preliminaryDesign.setAnchor("测试修改");

        ConstructionDesign constructionDesign = new ConstructionDesign();
        constructionDesign.setId("bc2ddfb6c1");
        constructionDesign.setAnchor("测试修改");

        SurroundingEnvironment surroundingEnvironment = new SurroundingEnvironment();
        surroundingEnvironment.setId("43ed998577");
        surroundingEnvironment.setAbandonSlagField("测试修改");

        ConstructionInformation constructionInformation = new ConstructionInformation();
        constructionInformation.setId("701c7bf02b");
        constructionInformation.setActualSchedule("测试修改");

        MonitoringInformation monitoringInformation = new MonitoringInformation();
        monitoringInformation.setId("fbd807ba11");
        monitoringInformation.setHoleConvergenceData("测试修改");

        SecondaryLining secondaryLining = new SecondaryLining();
        secondaryLining.setId("eab457fe56");
        secondaryLining.setInnerRadiusOfArchFootSecondLining("测试修改");

        BasicFormationInformation basicFormationInformation = new BasicFormationInformation();
        basicFormationInformation.setId("3cddab68b7");
        basicFormationInformation.setAngle("测试修改");

        tunnel.setTunnelId("ee0677969f");
        tunnel.setTunnelName("测试修改");
        tunnel.setProjectDesign(projectDesign);
        tunnel.setPreliminaryDesign(preliminaryDesign);
        tunnel.setConstructionDesign(constructionDesign);
        tunnel.setSurroundingEnvironment(surroundingEnvironment);
        tunnel.setConstructionInformation(constructionInformation);
        tunnel.setMonitoringInformation(monitoringInformation);
        tunnel.setSecondaryLining(secondaryLining);
        tunnel.setBasicFormationInformation(basicFormationInformation);

        BusinessResult businessResult = tunnelService.updateTunnel(tunnel);

        System.out.println(businessResult);
    }

    @Test
    public void listIdAndName() {
        BusinessResult businessResult = tunnelService.listIdAndName();

        System.out.println(businessResult);
    }
}
