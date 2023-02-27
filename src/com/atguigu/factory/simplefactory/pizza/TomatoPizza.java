package com.atguigu.factory.simplefactory.pizza;

public class TomatoPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(name + " is preparing...");
    }
}
