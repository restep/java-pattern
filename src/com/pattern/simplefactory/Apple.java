package com.pattern.simplefactory;

/**
 * @author restep
 * @date 2019/1/19
 */
public class Apple implements Fruit {
    private int treeAge;

    @Override
    public void grow() {
        System.out.println("apple grow()");
    }

    @Override
    public void harvest() {
        System.out.println("apple harvest()");
    }

    @Override
    public void plant() {
        System.out.println("apple plant()");
    }

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
