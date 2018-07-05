package com.jing.design.命令模式;

public class Invoke {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }

    private Command[] commands;

    private Command backCommand;

    public void setCommands(Command[] commands) {
        this.commands = commands;
    }

    public void on(int i){
        commands[i].execute();
        backCommand = commands[i];
    }

    public void off(int i) {
       // undoCommands[i].undo();
    }

    public void undo(){
       // backCommand.undo();
    }
}
