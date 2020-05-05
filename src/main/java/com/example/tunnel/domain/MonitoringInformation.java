package com.example.tunnel.domain;

/**
 * @author 10454
 */
public class MonitoringInformation {
    private String id;

    /**
    * 地质及支护状态观察
    */
    private String state;

    /**
    * 地表下沉数据
    */
    private String surfaceSubsidenceData;

    /**
    * 拱顶下沉数据
    */
    private String vaultSinkData;

    /**
    * 洞内收敛数据
    */
    private String holeConvergenceData;

    /**
    * 地表下沉数据预警
    */
    private String surfaceSubsidenceDataWarning;

    /**
    * 拱顶下沉数据预警
    */
    private String vaultSinkDataWarning;

    /**
    * 洞内收敛数据预警
    */
    private String holeConvergenceDataWarning;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSurfaceSubsidenceData() {
        return surfaceSubsidenceData;
    }

    public void setSurfaceSubsidenceData(String surfaceSubsidenceData) {
        this.surfaceSubsidenceData = surfaceSubsidenceData;
    }

    public String getVaultSinkData() {
        return vaultSinkData;
    }

    public void setVaultSinkData(String vaultSinkData) {
        this.vaultSinkData = vaultSinkData;
    }

    public String getHoleConvergenceData() {
        return holeConvergenceData;
    }

    public void setHoleConvergenceData(String holeConvergenceData) {
        this.holeConvergenceData = holeConvergenceData;
    }

    public String getSurfaceSubsidenceDataWarning() {
        return surfaceSubsidenceDataWarning;
    }

    public void setSurfaceSubsidenceDataWarning(String surfaceSubsidenceDataWarning) {
        this.surfaceSubsidenceDataWarning = surfaceSubsidenceDataWarning;
    }

    public String getVaultSinkDataWarning() {
        return vaultSinkDataWarning;
    }

    public void setVaultSinkDataWarning(String vaultSinkDataWarning) {
        this.vaultSinkDataWarning = vaultSinkDataWarning;
    }

    public String getHoleConvergenceDataWarning() {
        return holeConvergenceDataWarning;
    }

    public void setHoleConvergenceDataWarning(String holeConvergenceDataWarning) {
        this.holeConvergenceDataWarning = holeConvergenceDataWarning;
    }

    @Override
    public String toString() {
        return "MonitoringInformation{" +
                "id='" + id + '\'' +
                ", state='" + state + '\'' +
                ", surfaceSubsidenceData='" + surfaceSubsidenceData + '\'' +
                ", vaultSinkData='" + vaultSinkData + '\'' +
                ", holeConvergenceData='" + holeConvergenceData + '\'' +
                ", surfaceSubsidenceDataWarning='" + surfaceSubsidenceDataWarning + '\'' +
                ", vaultSinkDataWarning='" + vaultSinkDataWarning + '\'' +
                ", holeConvergenceDataWarning='" + holeConvergenceDataWarning + '\'' +
                '}';
    }
}