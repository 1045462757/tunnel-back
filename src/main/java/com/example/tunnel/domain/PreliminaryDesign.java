package com.example.tunnel.domain;

/**
 * @author 10454
 */
public class PreliminaryDesign {
    private String id;

    /**
    * 隧道桩号坐标
    */
    private String tunnelPileNumberCoordinates;

    /**
    * 沿桩衬砌类型
    */
    private String typeOfLiningAlongPile;

    /**
    * 洞门衬砌
    */
    private String davidLining;

    /**
    * 初喷混凝土
    */
    private String primaryShotcrete;

    /**
    * 锚杆
    */
    private String anchor;

    /**
    * 路面层
    */
    private String pavementLayer;

    /**
    * 设备洞室
    */
    private String equipmentCavern;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTunnelPileNumberCoordinates() {
        return tunnelPileNumberCoordinates;
    }

    public void setTunnelPileNumberCoordinates(String tunnelPileNumberCoordinates) {
        this.tunnelPileNumberCoordinates = tunnelPileNumberCoordinates;
    }

    public String getTypeOfLiningAlongPile() {
        return typeOfLiningAlongPile;
    }

    public void setTypeOfLiningAlongPile(String typeOfLiningAlongPile) {
        this.typeOfLiningAlongPile = typeOfLiningAlongPile;
    }

    public String getDavidLining() {
        return davidLining;
    }

    public void setDavidLining(String davidLining) {
        this.davidLining = davidLining;
    }

    public String getPrimaryShotcrete() {
        return primaryShotcrete;
    }

    public void setPrimaryShotcrete(String primaryShotcrete) {
        this.primaryShotcrete = primaryShotcrete;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public String getPavementLayer() {
        return pavementLayer;
    }

    public void setPavementLayer(String pavementLayer) {
        this.pavementLayer = pavementLayer;
    }

    public String getEquipmentCavern() {
        return equipmentCavern;
    }

    public void setEquipmentCavern(String equipmentCavern) {
        this.equipmentCavern = equipmentCavern;
    }

    @Override
    public String toString() {
        return "PreliminaryDesign{" +
                "id='" + id + '\'' +
                ", tunnelPileNumberCoordinates='" + tunnelPileNumberCoordinates + '\'' +
                ", typeOfLiningAlongPile='" + typeOfLiningAlongPile + '\'' +
                ", davidLining='" + davidLining + '\'' +
                ", primaryShotcrete='" + primaryShotcrete + '\'' +
                ", anchor='" + anchor + '\'' +
                ", pavementLayer='" + pavementLayer + '\'' +
                ", equipmentCavern='" + equipmentCavern + '\'' +
                '}';
    }
}