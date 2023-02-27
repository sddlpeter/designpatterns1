package com.atguigu.singleton.type5;

public class SingletonTest05 {
    public static void main(String[] args) {

    }
}

// 按照上一个lazy loading的方法，此方法将同步代码移动到if条件里面去，这样反而会更差，
// 因为很多线程同时进入到if里面，会创建多个实例，同时多个线程再等待同步锁，会导致效率很低，
// 其实这里就表示要一个一个去创建instance实例

class Singleton {
    private static Singleton instance;
    private Singleton() {

    }
    public Singleton getInstance () {

        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
