package com.jing.design.命令模式.code;

import com.jing.design.命令模式.code.command.AbstractCommand;
import com.jing.design.命令模式.code.command.TurnOnCommand;
import com.jing.design.命令模式.code.receiver.Receiver;
import com.jing.design.命令模式.code.receiver.TV;

public class RemoteControl {
    public static void main(String[] args) {

        Receiver receiver = new TV();
        AbstractCommand command = new TurnOnCommand(receiver);

        Invoke invoke = new Invoke();
        invoke.setCommand(command);
        invoke.action();
    }

}
