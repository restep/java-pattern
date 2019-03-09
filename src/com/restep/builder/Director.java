package com.restep.builder;

/**
 * @author restep
 * @date 2019/3/9
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder = new ConcreteBuilder();

        builder.buildPart1();

        builder.buildPart2();

        builder.retrieveResult();
    }
}
