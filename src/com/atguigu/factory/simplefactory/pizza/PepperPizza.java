package com.atguigu.factory.simplefactory.pizza;

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(name + " 正在准备...");
    }
}
