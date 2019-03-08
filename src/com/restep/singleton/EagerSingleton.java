package com.restep.singleton;

/**
 * 饿汉式
 *
 * @author restep
 * @date 2019/3/8
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    /**
     * 私有的默认构造函数
     */
    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
