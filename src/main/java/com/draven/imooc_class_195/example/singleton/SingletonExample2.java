package com.draven.imooc_class_195.example.singleton;


import com.draven.imooc_class_195.annotations.ThreadSafe;

/**
 * 饿汉模式
 * 单例的实例在类装载时进行创建
 */
@ThreadSafe
public class SingletonExample2 {

    // 私有的构造函数
    private SingletonExample2() {
    }

    // 单例对象
    private static SingletonExample2 instance = new SingletonExample2();

    // 静态的工厂方法
    public static SingletonExample2 getInstance() {
        return instance;
    }

}
