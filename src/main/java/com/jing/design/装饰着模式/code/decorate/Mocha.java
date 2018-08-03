package com.jing.design.装饰着模式.code.decorate;

import com.jing.design.装饰着模式.code.Beverage;
import com.jing.design.装饰着模式.code.CondimentDecorator;

/**
 * n.	摩卡咖啡
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage b){
        super(b);
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public float cost() {
        return 99+super.cost();
    }
}
