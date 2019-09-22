package com.draven.imooc_class_195.example.singleton;

import com.draven.imooc_class_195.annotations.Recommend;
import com.draven.imooc_class_195.annotations.ThreadSafe;

/**
 * 枚举模式：最安全
 * 相比较于懒汉模式，安全性更得到保证
 * 相比较于饿汉模式，它可以在实例调用的时候，才做最开始的初始化，在后续使用的时候可以直接取到这里面的值，不会造成资源的浪费
 */
@ThreadSafe
@Recommend
public class SingletonExample7 {

    // 私有的构造函数
    private SingletonExample7() {
    }

    // 静态的工厂方法
    public static SingletonExample7 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;

        private SingletonExample7 singleton;

        // JVM保证这个方法绝对只调用一次
        Singleton() {
            singleton = new SingletonExample7();
        }

        public SingletonExample7 getInstance() {
            return singleton;
        }
    }
}
