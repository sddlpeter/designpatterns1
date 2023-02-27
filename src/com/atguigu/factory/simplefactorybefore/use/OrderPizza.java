package com.atguigu.factory.simplefactorybefore.use;

import com.atguigu.factory.simplefactorybefore.pizza.CheesePizza;
import com.atguigu.factory.simplefactorybefore.pizza.GreekPizza;
import com.atguigu.factory.simplefactorybefore.pizza.PepperPizza;
import com.atguigu.factory.simplefactorybefore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza() {
        do {
            Pizza pizza = null;
            String orderType = getType();
            if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName(orderType);
            } else if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName(orderType);
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName(orderType);
            } else {
                System.out.println("invalid input");
                break;
            }
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }

    public String getType() {
        String input = "";
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input your pizza type:");
        try {
            input = strin.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return input;
    }
}
