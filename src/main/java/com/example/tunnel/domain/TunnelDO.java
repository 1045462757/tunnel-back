package com.example.tunnel.domain;

/**
 * @author 10454
 */
public class TunnelDO {
    /**
     * 隧道Id
     */
    private String tunnelId;

    /**
     * 隧道名
     */
    private String tunnelName;

    /**
     * 简介
     */
    private String tunnelIntro;

    /**
     * 方案设计
     */
    private String projectDesign;

    /**
     * 初步设计
     */
    private String preliminaryDesign;

    /**
     * 施工图设计
     */
    private String constructionDesign;

    /**
     * 周边环境
     */
    private String surroundingEnvironment;

    /**
     * 施工信息
     */
    private String constructionInformation;

    /**
     * 监测信息
     */
    private String monitoringInformation;

    /**
     * 二次衬砌
     */
    private String secondaryLining;

    /**
     * 地层基本信息
     */
    private String basicFormationInformation;

    public String getTunnelId() {
        return tunnelId;
    }

    public void setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
    }

    public String getTunnelName() {
        return tunnelName;
    }

    public void setTunnelName(String tunnelName) {
        this.tunnelName = tunnelName;
    }

    public String getTunnelIntro() {
        return tunnelIntro;
    }

    public void setTunnelIntro(String tunnelIntro) {
        this.tunnelIntro = tunnelIntro;
    }

    public String getProjectDesign() {
        return projectDesign;
    }

    public void setProjectDesign(String projectDesign) {
        this.projectDesign = projectDesign;
    }

    public String getPreliminaryDesign() {
        return preliminaryDesign;
    }

    public void setPreliminaryDesign(String preliminaryDesign) {
        this.preliminaryDesign = preliminaryDesign;
    }

    public String getConstructionDesign() {
        return constructionDesign;
    }

    public void setConstructionDesign(String constructionDesign) {
        this.constructionDesign = constructionDesign;
    }

    public String getSurroundingEnvironment() {
        return surroundingEnvironment;
    }

    public void setSurroundingEnvironment(String surroundingEnvironment) {
        this.surroundingEnvironment = surroundingEnvironment;
    }

    public String getConstructionInformation() {
        return constructionInformation;
    }

    public void setConstructionInformation(String constructionInformation) {
        this.constructionInformation = constructionInformation;
    }

    public String getMonitoringInformation() {
        return monitoringInformation;
    }

    public void setMonitoringInformation(String monitoringInformation) {
        this.monitoringInformation = monitoringInformation;
    }

    public String getSecondaryLining() {
        return secondaryLining;
    }

    public void setSecondaryLining(String secondaryLining) {
        this.secondaryLining = secondaryLining;
    }

    public String getBasicFormationInformation() {
        return basicFormationInformation;
    }

    public void setBasicFormationInformation(String basicFormationInformation) {
        this.basicFormationInformation = basicFormationInformation;
    }

    @Override
    public String toString() {
        return "TunnelDO{" +
                "tunnelId='" + tunnelId + '\'' +
                ", tunnelName='" + tunnelName + '\'' +
                ", tunnelIntro='" + tunnelIntro + '\'' +
                ", projectDesign='" + projectDesign + '\'' +
                ", preliminaryDesign='" + preliminaryDesign + '\'' +
                ", constructionDesign='" + constructionDesign + '\'' +
                ", surroundingEnvironment='" + surroundingEnvironment + '\'' +
                ", constructionInformation='" + constructionInformation + '\'' +
                ", monitoringInformation='" + monitoringInformation + '\'' +
                ", secondaryLining='" + secondaryLining + '\'' +
                ", basicFormationInformation='" + basicFormationInformation + '\'' +
                '}';
    }
}
