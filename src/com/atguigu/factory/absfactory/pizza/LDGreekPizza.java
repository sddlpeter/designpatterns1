package com.atguigu.factory.absfactory.pizza;

import com.atguigu.factory.absfactory.pizza.Pizza;

public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(name + " is preparing...");
    }
}
