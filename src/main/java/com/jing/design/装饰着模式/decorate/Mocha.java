package com.jing.design.装饰着模式.decorate;

import com.jing.design.装饰着模式.Beverage;
import com.jing.design.装饰着模式.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage be;
    public Mocha(Beverage b){
        be = b;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 99+be.cost();
    }
}
