package com.atguigu.builder.imp;

public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙");

    }

    @Override
    public void buildRoof() {
        System.out.println(" 普通房子封顶");

    }
}
