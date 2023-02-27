package com.atguigu.factory.absfactory.use;

import com.atguigu.factory.absfactory.pizza.LDCheesePizza;
import com.atguigu.factory.absfactory.pizza.LDGreekPizza;
import com.atguigu.factory.absfactory.pizza.Pizza;

public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("London Cheese");
        } else if (type.equals("greek")) {
            pizza = new LDGreekPizza();
            pizza.setName("London Greek");
        }
        return pizza;
    }
}
