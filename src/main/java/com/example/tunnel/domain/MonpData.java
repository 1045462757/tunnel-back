package com.example.tunnel.domain;

import java.util.Date;

/**
 * @author 10454
 */
public class MonpData {
    private Integer id;

    private Monp monpId;

    private Date time;

    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Monp getMonpId() {
        return monpId;
    }

    public void setMonpId(Monp monpId) {
        this.monpId = monpId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MonpData{" +
                "id=" + id +
                ", monpId=" + monpId +
                ", time=" + time +
                ", value='" + value + '\'' +
                '}';
    }
}