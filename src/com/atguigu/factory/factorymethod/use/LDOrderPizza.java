package com.atguigu.factory.factorymethod.use;

import com.atguigu.factory.factorymethod.pizza.LDCheesePizza;
import com.atguigu.factory.factorymethod.pizza.LDGreekPizza;
import com.atguigu.factory.factorymethod.pizza.LDVeggiePizza;
import com.atguigu.factory.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("London Cheese");
        } else if (type.equals("greek")) {
            pizza = new LDGreekPizza();
            pizza.setName("London Greek");
        } else if (type.equals("veggie")) {
            pizza = new LDVeggiePizza();
            pizza.setName("London Veggie");
        }
        return pizza;
    }
}
