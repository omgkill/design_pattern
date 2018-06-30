package com.jing.design.装饰着模式.decorater;

import com.jing.design.装饰着模式.Beverage;

public class HouseBlend extends Beverage {

    private Beverage beverage;

    public HouseBlend(Beverage b){
        this.beverage = b;

    }    @Override
    public double cost() {
        return 33+beverage.cost();
    }
}
