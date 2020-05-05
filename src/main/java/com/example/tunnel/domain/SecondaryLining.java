package com.example.tunnel.domain;

/**
 * @author 10454
 */
public class SecondaryLining {
    /**
    * 数字化对象编号
    */
    private String id;

    /**
    * 衬砌类型
    */
    private String liningType;

    /**
    * 是否设置仰拱
    */
    private String invert;

    /**
    * 二衬混凝土型号
    */
    private String secondLiningConcrete;

    /**
    * 拱顶二衬内半径
    */
    private String radiusInsideTheSecondLiningOfTheVault;

    /**
    * 拱顶二衬圆心角
    */
    private String theVaultIsLinedWithACentralAngle;

    /**
    * 拱脚二衬内半径
    */
    private String innerRadiusOfArchFootSecondLining;

    /**
    * 拱脚二衬圆心角
    */
    private String archLegWithCentralAngle;

    /**
    * 仰拱二衬内半径
    */
    private String radiusInsideTheSecondLiningOfTheInvert;

    /**
    * 仰拱二衬圆心角
    */
    private String invertedArchWithCentralAngle;

    /**
    * 拱顶二衬厚度
    */
    private String thicknessOfSecondLiningOfVault;

    /**
    * 侧墙二衬厚度
    */
    private String thicknessOfSideWallLining;

    /**
    * 仰拱厚度
    */
    private String theThicknessOfTheInvertedArch;

    /**
    * 仰拱混凝土型号
    */
    private String invertConcreteModel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLiningType() {
        return liningType;
    }

    public void setLiningType(String liningType) {
        this.liningType = liningType;
    }

    public String getInvert() {
        return invert;
    }

    public void setInvert(String invert) {
        this.invert = invert;
    }

    public String getSecondLiningConcrete() {
        return secondLiningConcrete;
    }

    public void setSecondLiningConcrete(String secondLiningConcrete) {
        this.secondLiningConcrete = secondLiningConcrete;
    }

    public String getRadiusInsideTheSecondLiningOfTheVault() {
        return radiusInsideTheSecondLiningOfTheVault;
    }

    public void setRadiusInsideTheSecondLiningOfTheVault(String radiusInsideTheSecondLiningOfTheVault) {
        this.radiusInsideTheSecondLiningOfTheVault = radiusInsideTheSecondLiningOfTheVault;
    }

    public String getTheVaultIsLinedWithACentralAngle() {
        return theVaultIsLinedWithACentralAngle;
    }

    public void setTheVaultIsLinedWithACentralAngle(String theVaultIsLinedWithACentralAngle) {
        this.theVaultIsLinedWithACentralAngle = theVaultIsLinedWithACentralAngle;
    }

    public String getInnerRadiusOfArchFootSecondLining() {
        return innerRadiusOfArchFootSecondLining;
    }

    public void setInnerRadiusOfArchFootSecondLining(String innerRadiusOfArchFootSecondLining) {
        this.innerRadiusOfArchFootSecondLining = innerRadiusOfArchFootSecondLining;
    }

    public String getArchLegWithCentralAngle() {
        return archLegWithCentralAngle;
    }

    public void setArchLegWithCentralAngle(String archLegWithCentralAngle) {
        this.archLegWithCentralAngle = archLegWithCentralAngle;
    }

    public String getRadiusInsideTheSecondLiningOfTheInvert() {
        return radiusInsideTheSecondLiningOfTheInvert;
    }

    public void setRadiusInsideTheSecondLiningOfTheInvert(String radiusInsideTheSecondLiningOfTheInvert) {
        this.radiusInsideTheSecondLiningOfTheInvert = radiusInsideTheSecondLiningOfTheInvert;
    }

    public String getInvertedArchWithCentralAngle() {
        return invertedArchWithCentralAngle;
    }

    public void setInvertedArchWithCentralAngle(String invertedArchWithCentralAngle) {
        this.invertedArchWithCentralAngle = invertedArchWithCentralAngle;
    }

    public String getThicknessOfSecondLiningOfVault() {
        return thicknessOfSecondLiningOfVault;
    }

    public void setThicknessOfSecondLiningOfVault(String thicknessOfSecondLiningOfVault) {
        this.thicknessOfSecondLiningOfVault = thicknessOfSecondLiningOfVault;
    }

    public String getThicknessOfSideWallLining() {
        return thicknessOfSideWallLining;
    }

    public void setThicknessOfSideWallLining(String thicknessOfSideWallLining) {
        this.thicknessOfSideWallLining = thicknessOfSideWallLining;
    }

    public String getTheThicknessOfTheInvertedArch() {
        return theThicknessOfTheInvertedArch;
    }

    public void setTheThicknessOfTheInvertedArch(String theThicknessOfTheInvertedArch) {
        this.theThicknessOfTheInvertedArch = theThicknessOfTheInvertedArch;
    }

    public String getInvertConcreteModel() {
        return invertConcreteModel;
    }

    public void setInvertConcreteModel(String invertConcreteModel) {
        this.invertConcreteModel = invertConcreteModel;
    }

    @Override
    public String toString() {
        return "SecondaryLining{" +
                "id='" + id + '\'' +
                ", liningType='" + liningType + '\'' +
                ", invert='" + invert + '\'' +
                ", secondLiningConcrete='" + secondLiningConcrete + '\'' +
                ", radiusInsideTheSecondLiningOfTheVault='" + radiusInsideTheSecondLiningOfTheVault + '\'' +
                ", theVaultIsLinedWithACentralAngle='" + theVaultIsLinedWithACentralAngle + '\'' +
                ", innerRadiusOfArchFootSecondLining='" + innerRadiusOfArchFootSecondLining + '\'' +
                ", archLegWithCentralAngle='" + archLegWithCentralAngle + '\'' +
                ", radiusInsideTheSecondLiningOfTheInvert='" + radiusInsideTheSecondLiningOfTheInvert + '\'' +
                ", invertedArchWithCentralAngle='" + invertedArchWithCentralAngle + '\'' +
                ", thicknessOfSecondLiningOfVault='" + thicknessOfSecondLiningOfVault + '\'' +
                ", thicknessOfSideWallLining='" + thicknessOfSideWallLining + '\'' +
                ", theThicknessOfTheInvertedArch='" + theThicknessOfTheInvertedArch + '\'' +
                ", invertConcreteModel='" + invertConcreteModel + '\'' +
                '}';
    }
}