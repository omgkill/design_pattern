package com.jing.design.命令模式.code;

import com.jing.design.命令模式.code.command.AbstractCommand;

import java.util.Queue;

/**
 *  调用者： 命令的请求者，是命令模式中最重要的角色。这个角色用来对各个命令进行控制。
 *  这个调用方法的作用是什么呢????
 *  （1）可以做一些额外的操作，比如日志，或者权限的限制
 *  @author jingShuai
 */
public class Invoke {

    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
