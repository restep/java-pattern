package com.restep.builder;

/**
 * @author restep
 * @date 2019/3/9
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product() ;

    @Override
    public void buildPart1() {

    }

    @Override
    public void buildPart2() {

    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
