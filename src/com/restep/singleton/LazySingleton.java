package com.restep.singleton;

/**
 * @author restep
 * @date 2019/3/8
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    /**
     * 私有的默认构造函数 保证外界无法直接实例化
     */
    private LazySingleton() {

    }

    /**
     * 静态工厂方法 返还此类的惟一实例
     * @return
     */
    public synchronized static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }

        return instance;
    }
}
