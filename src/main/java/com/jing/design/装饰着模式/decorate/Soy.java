package com.jing.design.装饰着模式.decorate;

import com.jing.design.装饰着模式.Beverage;
import com.jing.design.装饰着模式.CondimentDecorator;

public class Soy extends CondimentDecorator {

    private Beverage b;

    public Soy(Beverage beverage) {
        b = beverage;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 11+b.cost();
    }
}
