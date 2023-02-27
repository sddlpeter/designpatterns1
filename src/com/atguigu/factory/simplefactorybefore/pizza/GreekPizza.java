package com.atguigu.factory.simplefactorybefore.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(name + " is preparing...");
    }
}
