package com.example.tunnel.domain;

/**
 * @author 10454
 */
public class BasicFormationInformation {
    /**
     * 数字化对象编号
     */
    private String id;

    /**
     * 地层名
     */
    private String name;

    /**
     * 地层年代
     */
    private String year;

    /**
     * 地层岩性
     */
    private String lithology;

    /**
     * 地层记录代码
     */
    private String code;

    /**
     * 风化程度
     */
    private String degreeOfWeathering;

    /**
     * 承载力基本容许值
     */
    private String basicAllowableBearingCapacity;

    /**
     * 地层分布范围
     */
    private String stratigraphicDistributionRange;

    /**
     * 倾向
     */
    private String tendency;

    /**
     * 倾角
     */
    private String angle;

    /**
     * 地层总体描述
     */
    private String overallStratigraphicDescription;

    /**
     * 关联文件索引
     */
    private String associatedFileIndex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLithology() {
        return lithology;
    }

    public void setLithology(String lithology) {
        this.lithology = lithology;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDegreeOfWeathering() {
        return degreeOfWeathering;
    }

    public void setDegreeOfWeathering(String degreeOfWeathering) {
        this.degreeOfWeathering = degreeOfWeathering;
    }

    public String getBasicAllowableBearingCapacity() {
        return basicAllowableBearingCapacity;
    }

    public void setBasicAllowableBearingCapacity(String basicAllowableBearingCapacity) {
        this.basicAllowableBearingCapacity = basicAllowableBearingCapacity;
    }

    public String getStratigraphicDistributionRange() {
        return stratigraphicDistributionRange;
    }

    public void setStratigraphicDistributionRange(String stratigraphicDistributionRange) {
        this.stratigraphicDistributionRange = stratigraphicDistributionRange;
    }

    public String getTendency() {
        return tendency;
    }

    public void setTendency(String tendency) {
        this.tendency = tendency;
    }

    public String getAngle() {
        return angle;
    }

    public void setAngle(String angle) {
        this.angle = angle;
    }

    public String getOverallStratigraphicDescription() {
        return overallStratigraphicDescription;
    }

    public void setOverallStratigraphicDescription(String overallStratigraphicDescription) {
        this.overallStratigraphicDescription = overallStratigraphicDescription;
    }

    public String getAssociatedFileIndex() {
        return associatedFileIndex;
    }

    public void setAssociatedFileIndex(String associatedFileIndex) {
        this.associatedFileIndex = associatedFileIndex;
    }

    @Override
    public String toString() {
        return "BasicFormationInformation{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", lithology='" + lithology + '\'' +
                ", code='" + code + '\'' +
                ", degreeOfWeathering='" + degreeOfWeathering + '\'' +
                ", basicAllowableBearingCapacity='" + basicAllowableBearingCapacity + '\'' +
                ", stratigraphicDistributionRange='" + stratigraphicDistributionRange + '\'' +
                ", tendency='" + tendency + '\'' +
                ", angle='" + angle + '\'' +
                ", overallStratigraphicDescription='" + overallStratigraphicDescription + '\'' +
                ", associatedFileIndex='" + associatedFileIndex + '\'' +
                '}';
    }
}