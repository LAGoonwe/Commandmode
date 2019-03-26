package com.lagoon.Letter;

//该类为请求者角色
public class RequestMakedir {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void startExecuteCommand(){
        command.execute();
    }
}
