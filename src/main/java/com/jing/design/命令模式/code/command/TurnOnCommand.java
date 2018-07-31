package com.jing.design.命令模式.code.command;

import com.jing.design.命令模式.code.receiver.Receiver;

public class TurnOnCommand extends AbstractCommand {

    private Receiver receiver;

    public TurnOnCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOn();
    }
}
