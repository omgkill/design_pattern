package com.jing.design.命令模式.code.receiver;

public class TV extends Receiver {


    @Override
    public void turnOn() {
        System.out.println("TV turnOff");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turnOff");
    }
}
