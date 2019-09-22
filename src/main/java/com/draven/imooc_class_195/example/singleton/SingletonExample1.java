package com.draven.imooc_class_195.example.singleton;


import com.draven.imooc_class_195.annotations.NotThreadSafe;

/**
 * 懒汉模式
 * 单例的实例在第一次使用时进行创建
 */
@NotThreadSafe
public class SingletonExample1 {

    // 私有的构造函数
    private SingletonExample1() {
    }

    // 单例对象
    private static SingletonExample1 instance = null;

    // 静态的工厂方法
    public static SingletonExample1 getInstance() {
        if(instance == null){
            instance = new SingletonExample1();
        }
        return instance;
    }

}
