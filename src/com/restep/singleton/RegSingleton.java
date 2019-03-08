package com.restep.singleton;

import java.util.HashMap;

/**
 * 登记式单例类
 * @author restep
 * @date 2019/3/8
 */
public class RegSingleton {
    private static HashMap registry = new HashMap();

    protected RegSingleton() {
        
    }

    static {
        RegSingleton regSingleton = new RegSingleton();
        registry.put(regSingleton.getClass().getName(), regSingleton);
    }

    static public RegSingleton getInstance(String name) {
        if (name == null) {
            name = "com.restep.singleton.RegSingleton";
        }

        if (registry.get(name) == null) {
            try {
                registry.put(name, Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return (RegSingleton) (registry.get(name));
    }

    public String about() {
        return "RegSingleton";
    }
}
