package com.pattern.simplefactory;

/**
 * 葡萄
 * @author restep
 * @date 2019/1/19
 */
public class Grape implements Fruit {
    /**
     * 是否有籽
     */
    private boolean seedless;

    @Override
    public void grow() {
        System.out.println("grape grow()");
    }

    @Override
    public void harvest() {
        System.out.println("grape harvest()");
    }

    @Override
    public void plant() {
        System.out.println("grape plant()");
    }

    public boolean getSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }
}
