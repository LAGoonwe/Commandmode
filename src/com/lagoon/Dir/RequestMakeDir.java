package com.lagoon.Dir;

/**
 * 该类为请求者角色
 */
public class RequestMakeDir {
    Command command;
    public void setCommand(Command command){
        this.command=command;
    }
    public void startExecuteCommand(String name){
        command.execute(name);
    }
    public void undoCommand(){
        command.undo();
    }
}
