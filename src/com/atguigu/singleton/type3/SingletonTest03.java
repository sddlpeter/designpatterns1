package com.atguigu.singleton.type3;

// 懒汉式：lazy loading
public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().hashCode());
    }
}


// 实现了lazy loading,但是线程不安全
// 当有多个线程同时调用getInstance方法的时候，会创建多个实例

class Singleton{
    private static Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}