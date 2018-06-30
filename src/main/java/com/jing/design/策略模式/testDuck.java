package com.jing.design.策略模式;

import com.jing.design.策略模式.fly.FlyNoWay;

public class testDuck {
    /**
     *  多用组合，少用继承
     *  策略模式： 定义了算法族，分别封装起来，让它们之间可以相互替换
     *          ，此模式让算法的变化独立于使用算法的客户
     *  这个算法很常见，一个接口不同的实现就是策略模式啊
     *
     *  @author jingShuai
     *  @return void
     */
    public static void main(){
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly();
    }
}
