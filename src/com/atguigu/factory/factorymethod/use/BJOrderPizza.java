package com.atguigu.factory.factorymethod.use;

import com.atguigu.factory.factorymethod.pizza.BJCheesePizza;
import com.atguigu.factory.factorymethod.pizza.BJGreekPizza;
import com.atguigu.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("Beijing Cheese");
        } else if (type.equals("greek")) {
            pizza = new BJGreekPizza();
            pizza.setName("Beijing Greek");
        }
        return pizza;
    }
}
