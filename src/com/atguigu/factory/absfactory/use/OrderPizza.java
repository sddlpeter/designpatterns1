package com.atguigu.factory.absfactory.use;

import com.atguigu.factory.absfactory.pizza.Pizza;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory factory;
    public OrderPizza(AbsFactory factory) {
        this.factory = factory;
        createPizza();
    }

    public void createPizza() {

        do {
            String type = getType();
            Pizza pizza = factory.createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("invalid pizza name");
                break;
            }
        } while (true);

    }

    public String getType() {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        String type = "";
        System.out.println("input your pizza type: ");
        try {
            type = strin.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return type;
    }
}
