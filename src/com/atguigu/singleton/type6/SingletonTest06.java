package com.atguigu.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().hashCode());
        System.out.println(Singleton.getInstance().hashCode());
    }
}

// 双重检查锁
// 加volatile关键字是为了防止‘关键行’操作重排序，
// 因为这一行不是一个原子指令，会有 分配内存空间，实例化对象，将对象只想刚分配的内存空间 这三步

class Singleton{
    private static volatile Singleton instance;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();  // 关键行
                }
            }
        }
        return instance;
    }
}
