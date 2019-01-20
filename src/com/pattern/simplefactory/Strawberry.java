package com.pattern.simplefactory;

/**
 * 草莓
 * @author restep
 * @date 2019/1/19
 */
public class Strawberry implements Fruit {
    @Override
    public void grow() {
        System.out.println("strawberry grow()");
    }

    @Override
    public void harvest() {
        System.out.println("strawberry harvest()");
    }

    @Override
    public void plant() {
        System.out.println("strawberry plant()");
    }
}
