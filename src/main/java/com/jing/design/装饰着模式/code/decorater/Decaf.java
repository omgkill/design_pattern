package com.jing.design.装饰着模式.code.decorater;

import com.jing.design.装饰着模式.code.Beverage;

public class Decaf implements Beverage {


    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public float cost() {
        return 33;
    }
}
