package com.example.tunnel.domain;

/**
 * @author 10454
 */
public class SurroundingEnvironment {
    private String id;

    /**
    * 地表水源
    */
    private String surfaceWater;

    /**
    * 地表水质
    */
    private String quality;

    /**
    * 潜水
    */
    private String diving;

    /**
    * 地下水质
    */
    private String groundWater;

    /**
    * 植被种类
    */
    private String vegetationType;

    /**
    * 植被根系
    */
    private String vegetationRootSystem;

    /**
    * 开挖洞渣
    */
    private String excavationHoleSlag;

    /**
    * 弃渣场地
    */
    private String abandonSlagField;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurfaceWater() {
        return surfaceWater;
    }

    public void setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getDiving() {
        return diving;
    }

    public void setDiving(String diving) {
        this.diving = diving;
    }

    public String getGroundWater() {
        return groundWater;
    }

    public void setGroundWater(String groundWater) {
        this.groundWater = groundWater;
    }

    public String getVegetationType() {
        return vegetationType;
    }

    public void setVegetationType(String vegetationType) {
        this.vegetationType = vegetationType;
    }

    public String getVegetationRootSystem() {
        return vegetationRootSystem;
    }

    public void setVegetationRootSystem(String vegetationRootSystem) {
        this.vegetationRootSystem = vegetationRootSystem;
    }

    public String getExcavationHoleSlag() {
        return excavationHoleSlag;
    }

    public void setExcavationHoleSlag(String excavationHoleSlag) {
        this.excavationHoleSlag = excavationHoleSlag;
    }

    public String getAbandonSlagField() {
        return abandonSlagField;
    }

    public void setAbandonSlagField(String abandonSlagField) {
        this.abandonSlagField = abandonSlagField;
    }

    @Override
    public String toString() {
        return "SurroundingEnvironment{" +
                "id='" + id + '\'' +
                ", surfaceWater='" + surfaceWater + '\'' +
                ", quality='" + quality + '\'' +
                ", diving='" + diving + '\'' +
                ", groundWater='" + groundWater + '\'' +
                ", vegetationType='" + vegetationType + '\'' +
                ", vegetationRootSystem='" + vegetationRootSystem + '\'' +
                ", excavationHoleSlag='" + excavationHoleSlag + '\'' +
                ", abandonSlagField='" + abandonSlagField + '\'' +
                '}';
    }
}