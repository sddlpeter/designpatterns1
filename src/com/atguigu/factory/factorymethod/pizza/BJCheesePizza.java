package com.atguigu.factory.factorymethod.pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(name + " is preparing...");
    }
}
