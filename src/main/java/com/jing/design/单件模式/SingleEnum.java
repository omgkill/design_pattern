package com.jing.design.单件模式;

public enum  SingleEnum {
     instance;

    private Object obj;

    SingleEnum(){
        obj = new Object();
    }


    public Object getInstance(){

        return obj;
    }
}
