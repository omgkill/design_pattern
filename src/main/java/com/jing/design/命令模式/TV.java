package com.jing.design.命令模式;

public class TV extends Receiver {


    @Override
    public void doSomething() {
        System.out.println("TV doSomething");
    }

    @Override
    public void doSomething2() {
        System.out.println("TV doSomething2");
    }
}
