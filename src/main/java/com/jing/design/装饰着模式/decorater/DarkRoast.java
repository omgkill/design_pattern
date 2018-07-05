package com.jing.design.装饰着模式.decorater;

import com.jing.design.装饰着模式.Beverage;

public class DarkRoast implements Beverage {

    private final String description = "DarkRoast";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float cost() {
        return 33;
    }
}
