package com.jing.design.观察者模式.code.spring_listen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyPublish {

    @Autowired
    ApplicationContext applicationContext;

    public void publish() {
        MyEvent myEvent = new MyEvent(this, "ceshi");
        applicationContext.publishEvent(myEvent);
    }
}
