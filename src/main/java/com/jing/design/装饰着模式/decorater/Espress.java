package com.jing.design.装饰着模式.decorater;

import com.jing.design.装饰着模式.Beverage;

public class Espress implements Beverage {

    private final String description = "Espress";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float cost() {
        return 33;
    }
}
