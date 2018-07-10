package com.jing.design.抽象工厂模式;

public interface PizzaIngredientFactory {
    /**
     * 抽象工厂模式： 提供一个接口，用于创建相关或依赖对象的家族，而不需要
     * 明确指定具体类
     *
     * c场景：当需要多个对象，每个对象都有不同的类型
     */

    String createDough();
    String createSauce();
    String createCheese();
    String createVeggies();
    String createPeperoni();
    String createClam();
}
