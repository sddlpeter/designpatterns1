package com.atguigu.builder.imp;

public class HighBuildingBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println(" 高层建筑打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高层建筑砌墙");

    }

    @Override
    public void buildRoof() {
        System.out.println(" 高层建筑封顶");

    }
}
