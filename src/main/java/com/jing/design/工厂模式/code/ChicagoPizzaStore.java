package com.jing.design.工厂模式.code;

import com.jing.design.工厂模式.code.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    /**
     * 通过type来生成对象
     * @param type
     * @return
     */
    @Override
    protected Pizza createPizza(String type) {
        return null;
    }
}
