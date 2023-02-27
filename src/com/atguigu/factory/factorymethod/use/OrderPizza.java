package com.atguigu.factory.factorymethod.use;

import com.atguigu.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    public abstract Pizza createPizza(String type);

    public OrderPizza() {
        do {
            String type = getType();
            Pizza pizza = createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("invalid input");
                break;
            }
        } while (true);
    }

    public String getType() {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        System.out.println("input your pizza type: ");
        try {
            input = strin.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return input;
    }
}
