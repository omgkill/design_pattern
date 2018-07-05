package com.jing.design.装饰着模式.decorate;

import com.jing.design.装饰着模式.Beverage;
import com.jing.design.装饰着模式.CondimentDecorator;

/**
 * 装饰
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Milk";
    }

    @Override
    public float cost() {
        return super.cost()+2;
    }
}
