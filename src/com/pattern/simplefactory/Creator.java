package com.pattern.simplefactory;

/**
 * @author restep
 * @date 2019/1/19
 */
public class Creator {
    public static Product factory() {
        return new ConcreteProduct();
    }
}
