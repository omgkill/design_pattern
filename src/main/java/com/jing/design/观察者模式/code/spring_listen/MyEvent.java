package com.jing.design.观察者模式.code.spring_listen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
/**
 *  这个类是做什么的呢？
 *  是传值吗？
 *  应该是对事件的区分，可以是发邮件，可以是app通知，可以是其他事件
 *  @author jingShuai
 */
public class MyEvent extends ApplicationEvent {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private String msg;

    public MyEvent(Object source, String message) {
        super(source);
        this.msg = message;
        log.info(message);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
