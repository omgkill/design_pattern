package com.jing.design.模板方法模式.code;

public class client {

    private AbstractModel abstractModel = new Bun();
    public void test(){
        AbstractModel ab = new Bun();
        ab.action();
    }

}
