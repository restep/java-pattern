package com.restep.builder;

/**
 * @author restep
 * @date 2019/3/9
 */
public  abstract class Builder {
    public abstract void buildPart1();

    public abstract void buildPart2();

    public abstract Product retrieveResult();
}
