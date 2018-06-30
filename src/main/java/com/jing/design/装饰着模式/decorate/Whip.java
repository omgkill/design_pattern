package com.jing.design.装饰着模式.decorate;

import com.jing.design.装饰着模式.Beverage;
import com.jing.design.装饰着模式.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private Beverage be;
    public Whip(Beverage b){
        be = b;

    }


    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 33+be.cost();
    }
}
