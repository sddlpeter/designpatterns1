package com.atguigu.factory.simplefactory.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(name + " 正在准备...");
    }
}
