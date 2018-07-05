package com.jing.design.模板方法模式;

/**
 * 模板方法模式
 *
 * 6. 模板模式的优点
 　（1）具体细节步骤实现定义在子类中，子类定义详细处理算法是不会改变算法整体结构。

 　（2）代码复用的基本技术，在数据库设计中尤为重要。

 　（3）存在一种反向的控制结构，通过一个父类调用其子类的操作，通过子类对父类进行扩展增加新的行为，符合“开闭原则”。

 7. 不足
 每个不同的实现都需要定义一个子类，会导致类的个数增加，系统更加庞大。

概念：
 在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。
 模板方法使得子类可以再不改变算法结构的情况下，重新定义算法中的某些步骤。
 */
public abstract class AbstractModel {

    void action(){

    }

    public abstract void prepare();
    public abstract  void fixFlour();
    public abstract  void steam();
}
