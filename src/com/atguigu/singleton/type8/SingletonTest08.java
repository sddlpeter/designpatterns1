package com.atguigu.singleton.type8;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton.instance.method();
        Singleton.instance.method();
    }
}

// 枚举实现单例模式
// 防止反序列化重新创建新对象

enum Singleton {
    instance;
    public void method() {
        System.out.println("调用方法...");
    }
}