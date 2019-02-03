package com.pattern.factorymethod;

/**
 * @author restep
 * @date 2019/2/3
 */
public class ConcreteCreator1 implements Creator {
    @Override
    public Product factory() {
        return new ConcreteProduct1();
    }
}
