package com.atguigu.singleton.type4;

// 懒汉式2 - 线程安全
public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().hashCode());
    }
}


// 实现了lazy loading，同时也有线程安全
// 但是效率很低，因为若有多个线程同时调用getInstance方法，
// 只有第一个会马上执行，剩下的线程需要排队等待，直到同步锁被打开，再依次调用此方法
class Singleton{
    private Singleton() {

    }
    private static Singleton instance;
    // 同步锁
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

