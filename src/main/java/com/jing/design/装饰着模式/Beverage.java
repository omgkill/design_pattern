package com.jing.design.装饰着模式;

public abstract class Beverage {
   private  String  description;
   public String getDescription(){
       return description;
   }
    public abstract double cost();
}
