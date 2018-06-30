package com.jing.design.装饰着模式.decorater;

import com.jing.design.装饰着模式.Beverage;

public class Decaf extends Beverage {

    Beverage be;

    public Decaf(Beverage b) {
        be = b;
    }

    @Override
    public double cost() {
        return 11+be.cost();
    }
}
