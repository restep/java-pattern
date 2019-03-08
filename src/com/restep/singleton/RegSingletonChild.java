package com.restep.singleton;

/**
 * @author restep
 * @date 2019/3/8
 */
public class RegSingletonChild extends RegSingleton {
    public RegSingletonChild() {

    }

    static public RegSingletonChild getInstance() {
        return (RegSingletonChild) RegSingleton.getInstance("com.restep.singleton.RegSingletonChild");
    }

    @Override
    public String about() {
        return "RegSingletonChild";
    }

}
