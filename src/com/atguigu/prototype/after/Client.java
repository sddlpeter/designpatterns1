package com.atguigu.prototype.after;

import com.atguigu.prototype.before.Sheep;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Tom", 1, "white");
        Sheep sheep1 = sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep1);
    }
}
