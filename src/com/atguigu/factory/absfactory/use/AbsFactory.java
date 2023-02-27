package com.atguigu.factory.absfactory.use;

import com.atguigu.factory.absfactory.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String type);
}
