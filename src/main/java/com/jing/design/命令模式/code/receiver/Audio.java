package com.jing.design.命令模式.code.receiver;

public class Audio extends Receiver  {

    @Override
    public void turnOn() {
        System.out.println("Audio turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio turnOff");
    }
}
