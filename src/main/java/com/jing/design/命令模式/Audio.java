package com.jing.design.命令模式;

public class Audio extends Receiver  {

    @Override
    public void doSomething() {
        System.out.println("Audio doSomething");
    }

    @Override
    public void doSomething2() {
        System.out.println("Audio doSomething2");
    }
}
