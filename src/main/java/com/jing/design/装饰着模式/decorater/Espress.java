package com.jing.design.装饰着模式.decorater;

import com.jing.design.装饰着模式.Beverage;

public class Espress extends Beverage {

    private Beverage bb;
    public Espress(Beverage b){
        bb = b;
    }

    @Override
    public double cost() {
        return bb.cost()+44;
    }
}
