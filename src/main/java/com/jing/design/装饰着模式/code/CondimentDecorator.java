package com.jing.design.装饰着模式.code;


/**
 * 装饰类
 * 装饰者模式： 动态地将责任附加到对象上。若要扩展功能，装饰者提供了
 *              比继承更有弹性的替代方案
 *          或者可以这样说包装对象
 * CondimentDecorator继承Beverage，这是利用继承达到“类型匹配”
 *  而不是继承获得“行为”
 *
 *  对扩展开放，对修改关闭
 *
 *  缺点：1、当一个对象依赖特定的类型，然后忽然导入，导致错误。插入装饰者必须小心谨慎
 *      2、增加代码复杂度，使用者不知道到底导入了多少个装饰着
 *      3、装饰者导致设计中出现许多小对象，如果过度使用，会让程序变得很复杂
 *
 */

/**
 * n.	饮料
 */
public abstract class CondimentDecorator implements Beverage  {

    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public float cost() {
        return beverage.cost();
    }

}
