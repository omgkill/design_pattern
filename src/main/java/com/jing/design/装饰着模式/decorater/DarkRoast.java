package com.jing.design.装饰着模式.decorater;

import com.jing.design.装饰着模式.Beverage;

public class DarkRoast extends Beverage {

    Beverage b;
    public DarkRoast(Beverage beverage){
        this.b = beverage;
    }
    @Override
    public double cost() {
        return b.cost()+11;
    }
}
