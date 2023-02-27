package com.atguigu.singleton.type1;
// 饿汉式：静态常量（成员变量初始化）
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getSingleton();
        Singleton instance2 = Singleton.getSingleton();

        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton {
    private  Singleton() {

    }

    private static Singleton singleton = new Singleton();

    public static Singleton getSingleton() {
        return singleton;
    }
}
