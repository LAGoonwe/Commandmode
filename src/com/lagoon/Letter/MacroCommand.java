package com.lagoon.Letter;

import java.util.ArrayList;

//宏命令，执行所有命令
public class MacroCommand implements Command{

    ArrayList<Command> commandArrayList;  //把所有的命令存进数组

    public MacroCommand(ArrayList<Command> commandArrayList) {
        this.commandArrayList = commandArrayList;
    }

    @Override
    public void execute() {
        for (int k=0;k<commandArrayList.size();k++){
            Command command=commandArrayList.get(k);  //循环定位到命令
            command.execute(); //执行命令
        }
    }
}
