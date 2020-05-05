package com.example.tunnel.domain;

/**
 * @author 10454
 */
public class Monp {
    /**
     * 数字化对象编号
     */
    private String monpId;

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
     * 隧道
     */
    private Tunnel tunnel;

    /**
     * 监测点名称
     */
    private String name;

    /**
     * 监测数据单位
     */
    private String unit;

    /**
     * 监测仪器
     */
    private String instrument;

    /**
     * 监测频率描述
     */
    private String rate;

    /**
     * 监测仪器操作人员
     */
    private String contractor;

    /**
     * 备注
     */
    private String remarks;

    public String getMonpId() {
        return monpId;
    }

    public void setMonpId(String monpId) {
        this.monpId = monpId;
    }

    public Tunnel getTunnel() {
        return tunnel;
    }

    public void setTunnel(Tunnel tunnel) {
        this.tunnel = tunnel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Monp{" +
                "monpId='" + monpId + '\'' +
                ", tunnel=" + tunnel +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", instrument='" + instrument + '\'' +
                ", rate='" + rate + '\'' +
                ", contractor='" + contractor + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}