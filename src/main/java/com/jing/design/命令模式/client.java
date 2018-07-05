package com.jing.design.命令模式;

public class client {
    public static void main(String[] args) {
        Receiver receiver = new TV();
        Command command = new concreteCommand1(receiver);
        Invoke invoke = new Invoke();
        invoke.setCommand(command);
        invoke.action();
    }

}
