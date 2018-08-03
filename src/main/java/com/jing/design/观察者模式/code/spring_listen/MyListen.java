package com.jing.design.观察者模式.code.spring_listen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;

public class MyListen implements ApplicationListener<MyEvent> {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        String msg = myEvent.getMsg();
        log.info(msg);
    }
}
