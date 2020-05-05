package com.example.tunnel.domain;

/**
 * @author 10454
 */
public class ConstructionInformation {
    private String id;

    /**
     * 计划进度
     */
    private String schedule;

    /**
     * 实际进度
     */
    private String actualSchedule;

    /**
     * 初衬施工质量
     */
    private String initial;

    /**
     * 二衬施工质量
     */
    private String second;

    /**
     * 注浆施工质量
     */
    private String grouting;

    /**
     * 锚杆施工质量
     */
    private String bolt;

    /**
     * 隧道路面质量
     */
    private String pavement;

    /**
     * 围岩变更
     */
    private String changes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getActualSchedule() {
        return actualSchedule;
    }

    public void setActualSchedule(String actualSchedule) {
        this.actualSchedule = actualSchedule;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getGrouting() {
        return grouting;
    }

    public void setGrouting(String grouting) {
        this.grouting = grouting;
    }

    public String getBolt() {
        return bolt;
    }

    public void setBolt(String bolt) {
        this.bolt = bolt;
    }

    public String getPavement() {
        return pavement;
    }

    public void setPavement(String pavement) {
        this.pavement = pavement;
    }

    public String getChanges() {
        return changes;
    }

    public void setChanges(String changes) {
        this.changes = changes;
    }

    @Override
    public String toString() {
        return "ConstructionInformation{" +
                "id='" + id + '\'' +
                ", schedule='" + schedule + '\'' +
                ", actualSchedule='" + actualSchedule + '\'' +
                ", initial='" + initial + '\'' +
                ", second='" + second + '\'' +
                ", grouting='" + grouting + '\'' +
                ", bolt='" + bolt + '\'' +
                ", pavement='" + pavement + '\'' +
                ", changes='" + changes + '\'' +
                '}';
    }
}