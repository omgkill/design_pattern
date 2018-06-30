package com.jing.design.装饰着模式.decorate;

import com.jing.design.装饰着模式.Beverage;
import com.jing.design.装饰着模式.CondimentDecorator;

/**
 * 装饰
 */
public class Milk extends CondimentDecorator {

    private Beverage b;

    public Milk(Beverage be){
        b = be;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 33+b.cost();
    }
}
