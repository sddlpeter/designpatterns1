package com.atguigu.factory.simplefactory.use;

import com.atguigu.factory.simplefactory.pizza.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleFactory {
    public Pizza createPizza() throws IOException {
        Pizza pizza = null;
        String type = getType();
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(type);
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if (type.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("pepper");
        } else if (type.equals("vege")) {
            pizza = new VegePizza();
            pizza.setName(type);
        } else if (type.equals("tomato")) {
            pizza = new TomatoPizza();
            pizza.setName(type);
        }
        return pizza;
    }

    private String getType() throws IOException {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input your pizza type: ");
        String input = strin.readLine();
        return input;
    }
}
