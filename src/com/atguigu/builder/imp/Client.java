package com.atguigu.builder.imp;

import com.atguigu.builder.org.CommonHouse;

public class Client {
    public static void main(String[] args) {
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);
        houseDirector.constructHouse();
    }
}
