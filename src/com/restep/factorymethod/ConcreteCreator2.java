package com.restep.factorymethod;

/**
 * @author restep
 * @date 2019/2/3
 */
public class ConcreteCreator2 implements Creator {
    @Override
    public Product factory() {
        return new ConcreteProduct2();
    }
}
