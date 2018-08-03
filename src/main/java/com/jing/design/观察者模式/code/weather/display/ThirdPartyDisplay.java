package com.jing.design.观察者模式.code.weather.display;

import com.jing.design.观察者模式.code.weather.DisplayElement;
import com.jing.design.观察者模式.code.weather.Observer;

public class ThirdPartyDisplay implements Observer, DisplayElement {
    @Override
    public void display() {
        System.out.println();
    }

    @Override
    public void update() {

    }
}
