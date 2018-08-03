package com.jing.design.观察者模式.code.weather;

public interface Subject {

    void registerObserver(Observer ob);

    void removeObserver(Observer ob);

    void notifyObserver();
}
