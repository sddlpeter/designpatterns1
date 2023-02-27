package com.atguigu.singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        System.out.println(Singleton.getSingleton().hashCode());
        System.out.println(Singleton.getSingleton().hashCode());
    }
}


//饿汉式：静态代码块
// 线程安全，没有实现lazy loading
class Singleton{
    private Singleton(){

    }
    private static Singleton singleton;
    static {
        singleton = new Singleton();
    }
    public static Singleton getSingleton() {
        return singleton;
    }
}


