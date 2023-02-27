package com.atguigu.factory.absfactory.pizza;

import com.atguigu.factory.absfactory.pizza.Pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(name + " is preparing...");
    }
}
