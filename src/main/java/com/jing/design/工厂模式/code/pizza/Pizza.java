package com.jing.design.工厂模式.code.pizza;

public interface Pizza {
    //准备原料
    void prepare();
    //烘烤
    void bake();
    //切分
    void cut();
    //装盒
    void box();

}
