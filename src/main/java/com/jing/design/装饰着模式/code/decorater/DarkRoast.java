package com.jing.design.装饰着模式.code.decorater;

import com.jing.design.装饰着模式.code.Beverage;

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
