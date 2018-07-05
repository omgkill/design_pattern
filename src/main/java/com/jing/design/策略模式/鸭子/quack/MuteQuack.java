package com.jing.design.策略模式.鸭子.quack;

public class MuteQuack  implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("MuteQuack");
    }
}
