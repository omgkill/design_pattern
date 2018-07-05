package com.jing.design.策略模式.鸭子;

import com.jing.design.策略模式.鸭子.fly.FlyBehavior;
import com.jing.design.策略模式.鸭子.quack.QuackBehavior;

public class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }


    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
