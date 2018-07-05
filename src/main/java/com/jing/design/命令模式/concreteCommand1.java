package com.jing.design.命令模式;

public class concreteCommand1 extends Command {

    private Receiver receiver;

    concreteCommand1(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
