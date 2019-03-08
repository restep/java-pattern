package com.restep.singleton;

/**
 * @author restep
 * @date 2019/3/8
 */
public class RegSingletonTest {
    public static void main(String[] args) {
        System.out.println(RegSingleton.getInstance("com.restep.singleton.RegSingleton").about());
        System.out.println(RegSingleton.getInstance(null).about());

        System.out.println(RegSingleton.getInstance("com.restep.singleton.RegSingletonChild").about());
        System.out.println(RegSingletonChild.getInstance().about());
    }
}
