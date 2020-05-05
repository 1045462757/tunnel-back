package com.example.tunnel.domain;

import java.util.Date;

public class Sheet1 {
    private String deviceId;

    private String kong;

    private String bId;

    private String surveyResult;

    private Date createTime;

    private String deep;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getKong() {
        return kong;
    }

    public void setKong(String kong) {
        this.kong = kong;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getSurveyReslut() {
        return surveyResult;
    }

    public void setSurveyReslut(String surveyReslut) {
        this.surveyResult = surveyReslut;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDeep() {
        return deep;
    }

    public void setDeep(String deep) {
        this.deep = deep;
    }

    @Override
    public String toString() {
        return "Sheet1{" +
                "surveyReslut='" + surveyResult + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}