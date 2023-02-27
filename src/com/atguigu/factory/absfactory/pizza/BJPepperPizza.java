package com.atguigu.factory.absfactory.pizza;

public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(name + " is preparing...");
    }
}
