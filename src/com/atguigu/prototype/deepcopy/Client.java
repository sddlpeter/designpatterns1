package com.atguigu.prototype.deepcopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.name = "Tom";
        deepPrototype.deepCloneableTarget = new DeepCloneableTarget("Tom's Friend", "Jerry");


        // 方式一： 完成深拷贝
//        DeepPrototype deepPrototype1 = (DeepPrototype) deepPrototype.clone();
//        System.out.println(deepPrototype1.name + " " +  deepPrototype1.deepCloneableTarget.hashCode());
//        System.out.println(deepPrototype.name + " " + deepPrototype.deepCloneableTarget.hashCode());


        // 方式二： 完成深拷贝

        DeepPrototype deepPrototype1 = (DeepPrototype) deepPrototype.deepClone();
        System.out.println(deepPrototype1.name + " " +  deepPrototype1.deepCloneableTarget.hashCode());
        System.out.println(deepPrototype.name + " " + deepPrototype.deepCloneableTarget.hashCode());

    }
}
