package com.jing.design.策略模式.鸭子;

import com.jing.design.策略模式.鸭子.fly.FlyWithWings;
import com.jing.design.策略模式.鸭子.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
