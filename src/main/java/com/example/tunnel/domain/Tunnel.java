package com.example.tunnel.domain;

import java.util.Date;

/**
 * @author 10454
 */
public class Tunnel {
    /**
     * 隧道Id
     */
    private String tunnelId;

//    /**
//     * 数据生成时间
//     */
//    private Date createTime;
//
//    /**
//     * 最后修改时间
//     */
//    private Date updateTime;

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
    private ProjectDesign projectDesign;

    /**
     * 初步设计
     */
    private PreliminaryDesign preliminaryDesign;

    /**
     * 施工图设计
     */
    private ConstructionDesign constructionDesign;

    /**
     * 周边环境
     */
    private SurroundingEnvironment surroundingEnvironment;

    /**
     * 施工信息
     */
    private ConstructionInformation constructionInformation;

    /**
     * 监测信息
     */
    private MonitoringInformation monitoringInformation;

    /**
     * 二次衬砌
     */
    private SecondaryLining secondaryLining;

    /**
     * 地层基本信息
     */
    private BasicFormationInformation basicFormationInformation;

    public String getTunnelId() {
        return tunnelId;
    }

    public void setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
    }

//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }
//
//    public Date getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(Date updateTime) {
//        this.updateTime = updateTime;
//    }

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

    public ProjectDesign getProjectDesign() {
        return projectDesign;
    }

    public void setProjectDesign(ProjectDesign projectDesign) {
        this.projectDesign = projectDesign;
    }

    public PreliminaryDesign getPreliminaryDesign() {
        return preliminaryDesign;
    }

    public void setPreliminaryDesign(PreliminaryDesign preliminaryDesign) {
        this.preliminaryDesign = preliminaryDesign;
    }

    public ConstructionDesign getConstructionDesign() {
        return constructionDesign;
    }

    public void setConstructionDesign(ConstructionDesign constructionDesign) {
        this.constructionDesign = constructionDesign;
    }

    public SurroundingEnvironment getSurroundingEnvironment() {
        return surroundingEnvironment;
    }

    public void setSurroundingEnvironment(SurroundingEnvironment surroundingEnvironment) {
        this.surroundingEnvironment = surroundingEnvironment;
    }

    public ConstructionInformation getConstructionInformation() {
        return constructionInformation;
    }

    public void setConstructionInformation(ConstructionInformation constructionInformation) {
        this.constructionInformation = constructionInformation;
    }

    public MonitoringInformation getMonitoringInformation() {
        return monitoringInformation;
    }

    public void setMonitoringInformation(MonitoringInformation monitoringInformation) {
        this.monitoringInformation = monitoringInformation;
    }

    public SecondaryLining getSecondaryLining() {
        return secondaryLining;
    }

    public void setSecondaryLining(SecondaryLining secondaryLining) {
        this.secondaryLining = secondaryLining;
    }

    public BasicFormationInformation getBasicFormationInformation() {
        return basicFormationInformation;
    }

    public void setBasicFormationInformation(BasicFormationInformation basicFormationInformation) {
        this.basicFormationInformation = basicFormationInformation;
    }

    @Override
    public String toString() {
        return "Tunnel{" +
                "tunnelId='" + tunnelId + '\'' +
//                ", createTime=" + createTime +
//                ", updateTime=" + updateTime +
                ", tunnelName='" + tunnelName + '\'' +
                ", tunnelIntro='" + tunnelIntro + '\'' +
                ", projectDesign=" + projectDesign +
                ", preliminaryDesign=" + preliminaryDesign +
                ", constructionDesign=" + constructionDesign +
                ", surroundingEnvironment=" + surroundingEnvironment +
                ", constructionInformation=" + constructionInformation +
                ", monitoringInformation=" + monitoringInformation +
                ", secondaryLining=" + secondaryLining +
                ", basicFormationInformation=" + basicFormationInformation +
                '}';
    }
}