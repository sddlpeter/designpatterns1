package com.atguigu.factory.simplefactorybefore.pizza;

public abstract class Pizza {
    String name;
    public abstract void prepare();
    public void bake() {
        System.out.println(name + " is baking...");
    }
    public void cut() {
        System.out.println(name + " is cutting...");
    }
    public void box() {
        System.out.println(name + " is boxing...");
    }
    public void setName(String name) {
        this.name = name;
    }
}
