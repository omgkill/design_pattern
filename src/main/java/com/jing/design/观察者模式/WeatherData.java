package com.jing.design.观察者模式;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    /**
     * 在对象之间定义一对多的依赖，这样依赖，当一个对象改变状态时
     * ，它的所有依赖者都会收到通知并自动更新
     */
    private List<Observer> list = new ArrayList<>();

    @Override
    public void registerObserver(Observer ob) {
        list.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        list.remove(ob);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : list) {
            o.update();
        }

    }

    public String getTemperature(){
        return "";
    }
    public String getHudmidity(){
        return "";
    }
    public String getPressure(){
        return "";
    }
    public String measurementsChanged(){
        return "";
    }
}
