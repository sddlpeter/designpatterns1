package com.atguigu.prototype.deepcopy;

import java.io.*;

public class DeepPrototype implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype() {
        super();
    }


    // 深拷贝 - 方式1 使用clone方法

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 完成对基本数据类型(属性)和字符串的克隆
        deep = super.clone();
        // 对引用类型的属性，进行单独处理
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepPrototype;
    }


    // 深拷贝 - 方式2 使用对象的序列化和反序列化
    public Object deepClone() {
        // 输出流： 将内存里的object序列化到磁盘上
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        // 输入流： 将磁盘上的信息反序列化到内存里
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos); //把字节数组输出流，转换成对象输出流
            oos.writeObject(this); // 把当前对象以对象流的方式输出


            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype copy = (DeepPrototype) ois.readObject();

            return copy;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }
}
