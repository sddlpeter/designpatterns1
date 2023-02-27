package com.atguigu.factory.simplefactory.use;

import com.atguigu.factory.simplefactory.pizza.Pizza;

import java.io.IOException;

public class OrderPizza {
    SimpleFactory simpleFactory;
    Pizza pizza = null;
    public OrderPizza(SimpleFactory simpleFactory) throws IOException {
        placeOrder(simpleFactory);
    }

    public void placeOrder(SimpleFactory simpleFactory) throws IOException {
        this.simpleFactory = simpleFactory;
        do {
            pizza = simpleFactory.createPizza();
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                System.out.println();
            } else {
                System.out.println("invalid input type, exit program");
                break;
            }
        } while (true);
    }

}
