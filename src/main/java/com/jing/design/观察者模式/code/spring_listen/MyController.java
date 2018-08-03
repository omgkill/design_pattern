package com.jing.design.观察者模式.code.spring_listen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    @Autowired
    private MyPublish myPublish;

    public void myTest(){
        //完成操作
        myPublish.publish();
    }
}
