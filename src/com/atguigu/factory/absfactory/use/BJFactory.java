package com.atguigu.factory.absfactory.use;

import com.atguigu.factory.absfactory.pizza.BJCheesePizza;
import com.atguigu.factory.absfactory.pizza.BJGreekPizza;
import com.atguigu.factory.absfactory.pizza.BJPepperPizza;
import com.atguigu.factory.absfactory.pizza.Pizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("Beijing Cheese");
        } else if (type.equals("greek")) {
            pizza = new BJGreekPizza();
            pizza.setName("Beijing Greek");
        } else if (type.equals("pepper")) {
            pizza = new BJPepperPizza();
            pizza.setName("Beijing pepper");
        }
        return pizza;
    }
}
