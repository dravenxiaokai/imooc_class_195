package com.draven.imooc_class_195.example.singleton;


import com.draven.imooc_class_195.annotations.NotRecommend;
import com.draven.imooc_class_195.annotations.ThreadSafe;

/**
 * 懒汉模式
 * 单例的实例在第一次使用时进行创建
 */
@ThreadSafe
@NotRecommend
public class SingletonExample3 {

    // 私有的构造函数
    private SingletonExample3() {
    }

    // 单例对象
    private static SingletonExample3 instance = null;

    // 静态的工厂方法
    public static synchronized SingletonExample3 getInstance() {
        if(instance == null){
            instance = new SingletonExample3();
        }
        return instance;
    }

}
