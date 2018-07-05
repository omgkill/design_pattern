package com.jing.design.命令模式;

/**
 * 抽象或接口类都可以
 */
public abstract class Command {

    /**
     * 将请求封装成对象，这可以让你使用不同的请求、队列，或者日志请求
     * 来参数化其他对象。命令模式可以支持撤销操作
     */

    public abstract  void execute();
//    void on();
//    void off();
//    void back();

}
