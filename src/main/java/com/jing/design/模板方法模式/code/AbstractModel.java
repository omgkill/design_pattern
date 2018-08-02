package com.jing.design.模板方法模式.code;


public abstract class AbstractModel {

    void action(){
        prepare();
        fixFlour();
        steam();
    }

    public abstract void prepare();
    public abstract  void fixFlour();
    public abstract  void steam();
}
