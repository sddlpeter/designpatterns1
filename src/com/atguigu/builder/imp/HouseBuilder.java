package com.atguigu.builder.imp;

public abstract class HouseBuilder {
    House house = new House();
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void buildRoof();

    public House buildHouse() {
        return house;
    }
}
