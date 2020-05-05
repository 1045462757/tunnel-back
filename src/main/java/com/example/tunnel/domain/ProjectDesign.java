package com.example.tunnel.domain;

/**
 * @author 10454
 */
public class ProjectDesign {
    private String id;

    /**
    * 业主单位
    */
    private String ownerUnit;

    /**
    * 设计单位
    */
    private String designUnit;

    /**
    * 施工单位
    */
    private String constructionUnit;

    /**
    * 监理单位
    */
    private String supervisionUnit;

    /**
    * 公路等级
    */
    private String highwayGrade;

    /**
    * 区域地理位置
    */
    private String location;

    /**
    * 建筑限界
    */
    private String clearance;

    /**
    * 临空断面
    */
    private String openingSection;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerUnit() {
        return ownerUnit;
    }

    public void setOwnerUnit(String ownerUnit) {
        this.ownerUnit = ownerUnit;
    }

    public String getDesignUnit() {
        return designUnit;
    }

    public void setDesignUnit(String designUnit) {
        this.designUnit = designUnit;
    }

    public String getConstructionUnit() {
        return constructionUnit;
    }

    public void setConstructionUnit(String constructionUnit) {
        this.constructionUnit = constructionUnit;
    }

    public String getSupervisionUnit() {
        return supervisionUnit;
    }

    public void setSupervisionUnit(String supervisionUnit) {
        this.supervisionUnit = supervisionUnit;
    }

    public String getHighwayGrade() {
        return highwayGrade;
    }

    public void setHighwayGrade(String highwayGrade) {
        this.highwayGrade = highwayGrade;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getClearance() {
        return clearance;
    }

    public void setClearance(String clearance) {
        this.clearance = clearance;
    }

    public String getOpeningSection() {
        return openingSection;
    }

    public void setOpeningSection(String openingSection) {
        this.openingSection = openingSection;
    }

    @Override
    public String toString() {
        return "ProjectDesign{" +
                "id='" + id + '\'' +
                ", ownerUnit='" + ownerUnit + '\'' +
                ", designUnit='" + designUnit + '\'' +
                ", constructionUnit='" + constructionUnit + '\'' +
                ", supervisionUnit='" + supervisionUnit + '\'' +
                ", highwayGrade='" + highwayGrade + '\'' +
                ", location='" + location + '\'' +
                ", clearance='" + clearance + '\'' +
                ", openingSection='" + openingSection + '\'' +
                '}';
    }
}