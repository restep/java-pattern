package com.restep.simplefactory;

/**
 * 园丁
 * @author restep
 * @date 2019/1/19
 */
public class FruitGardener {
    public static Fruit factory(String which) {
        if ("apple".equals(which)) {
            return new Apple();
        } else if ("strawberry".equals(which)) {
            return new Strawberry();
        } else if ("grape".equals(which)) {
            return new Grape();
        }

        return null;
    }
}
