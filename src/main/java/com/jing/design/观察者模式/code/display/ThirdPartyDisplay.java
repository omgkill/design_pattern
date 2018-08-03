package com.jing.design.观察者模式.code.display;

import com.jing.design.观察者模式.code.DisplayElement;
import com.jing.design.观察者模式.code.Observer;

public class ThirdPartyDisplay implements Observer, DisplayElement {
    @Override
    public void display() {
        System.out.println();
    }

    @Override
    public void update() {

    }
}
