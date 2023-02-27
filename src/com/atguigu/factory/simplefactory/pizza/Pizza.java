package com.atguigu.factory.simplefactory.pizza;

public abstract class Pizza {
    protected String name;
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " 正在烘焙...");
    }

    public void cut() {
        System.out.println(name + " 正在分片...");
    }

    public void box() {
        System.out.println(name + " 正在装盒...");
    }

    public void setName(String name) {
        this.name = name;
    }
}

