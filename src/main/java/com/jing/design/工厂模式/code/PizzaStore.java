package com.jing.design.工厂模式.code;

import com.jing.design.工厂模式.code.pizza.Pizza;

public abstract class PizzaStore {
    /**
     *
     * 工厂方法模式： 定义了一个创建对象的接口，
     * 但由于子类决定要实例化的类是哪一个。工厂方法
     * 让类把实例化推迟到子类
     *
     * 简单工厂于工厂模式的区别：  一个简单工厂不能变更正在创建的产品
     *
     * 工厂模式可将这些创建对象的代码用栅栏围起来，就像你把所有的羊毛堆到眼前
     * 一样，一旦围起来后，就可以保护这些创建对象的代码，如果让创建对象的代码
     * 导出乱跑，就无法收集了。
     * 倒置原则--依赖抽象，不要依赖具体的类
     * @param type
     * @return
     */

    public Pizza orderPizza(String type ) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected  abstract  Pizza createPizza(String type);
}
