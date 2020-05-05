package com.example.tunnel.domain;

/**
 * @author 10454
 */
public class ConstructionDesign {
    private String id;

    /**
    * 洞门端墙
    */
    private String davidSideWall;

    /**
    * 洞门填筑
    */
    private String davidFilling;

    /**
    * 洞门衬砌
    */
    private String davidLining;

    /**
    * 衬砌钢筋笼
    */
    private String liningSteelCage;

    /**
    * 初喷混凝土
    */
    private String primaryShotcrete;

    /**
    * 钢筋网
    */
    private String steelFabric;

    /**
    * 工字钢架
    */
    private String steel;

    /**
    * 锚杆
    */
    private String anchor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDavidSideWall() {
        return davidSideWall;
    }

    public void setDavidSideWall(String davidSideWall) {
        this.davidSideWall = davidSideWall;
    }

    public String getDavidFilling() {
        return davidFilling;
    }

    public void setDavidFilling(String davidFilling) {
        this.davidFilling = davidFilling;
    }

    public String getDavidLining() {
        return davidLining;
    }

    public void setDavidLining(String davidLining) {
        this.davidLining = davidLining;
    }

    public String getLiningSteelCage() {
        return liningSteelCage;
    }

    public void setLiningSteelCage(String liningSteelCage) {
        this.liningSteelCage = liningSteelCage;
    }

    public String getPrimaryShotcrete() {
        return primaryShotcrete;
    }

    public void setPrimaryShotcrete(String primaryShotcrete) {
        this.primaryShotcrete = primaryShotcrete;
    }

    public String getSteelFabric() {
        return steelFabric;
    }

    public void setSteelFabric(String steelFabric) {
        this.steelFabric = steelFabric;
    }

    public String getSteel() {
        return steel;
    }

    public void setSteel(String steel) {
        this.steel = steel;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    @Override
    public String toString() {
        return "ConstructionDesign{" +
                "id='" + id + '\'' +
                ", davidSideWall='" + davidSideWall + '\'' +
                ", davidFilling='" + davidFilling + '\'' +
                ", davidLining='" + davidLining + '\'' +
                ", liningSteelCage='" + liningSteelCage + '\'' +
                ", primaryShotcrete='" + primaryShotcrete + '\'' +
                ", steelFabric='" + steelFabric + '\'' +
                ", steel='" + steel + '\'' +
                ", anchor='" + anchor + '\'' +
                '}';
    }
}