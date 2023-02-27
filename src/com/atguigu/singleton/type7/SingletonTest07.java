package com.atguigu.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {

    }
}

// 静态内部类
// Singleton类被加载的时候，不会加载innerClass
// 这样就达到了lazy loading的目的
// 而且当调用getInstance方法的时候，JVM只会实例化instance一次
// 因此也有线程安全
// 效率不受加锁影响，所以很高

class Singleton {

    private static class innerClass {
        private static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance() {
        return innerClass.instance;
    }
}
