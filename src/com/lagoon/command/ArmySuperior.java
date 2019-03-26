package com.lagoon.command;

/**
 * 这个类代表请求者，也就是指挥官的角色
 */
public class ArmySuperior {

    Command command;  //用来存放具体命令的引用
    public void setCommand(Command command){
        this.command=command;
    }
    public void startExecuteCommand(){
        command.execute();
    }
}
