package com.jing.design.观察者模式.display;

import com.jing.design.观察者模式.DisplayElement;
import com.jing.design.观察者模式.Observer;

public class ThirdPartyDisplay implements Observer, DisplayElement {
    @Override
    public void display() {
        System.out.println();
    }

    @Override
    public void update() {

    }
}
