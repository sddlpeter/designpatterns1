package com.atguigu.prototype.shallowcopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Tom", 1, "white");
        sheep.friend = new Sheep("Jerry", 2, "grey");
        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        Sheep sheep4 = sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);

    }
}
