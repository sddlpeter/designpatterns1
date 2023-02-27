package com.atguigu.factory.simplefactory.pizza;

public class VegePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(name + " is preparing...");
    }
}
