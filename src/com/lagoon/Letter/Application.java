package com.lagoon.Letter;

import java.util.ArrayList;

//发射类，main方法
public class Application {
    public static void main(String[] args) {
        ArrayList<Command> list= new ArrayList<>();
        //创建请求者
        RequestMakedir requestMakedir=new RequestMakedir();
        //创建命令具体接收者
        Command command1=new PrintEnglishCommand(new PrintLetter());
        Command command2=new PrintRussianCommand(new PrintLetter());

        //整合命令
        list.add(command1);
        list.add(command2);


        //创宏命令
        Command macroCommand=new MacroCommand(list);

        System.out.println("单独输出英文字母表:");
        requestMakedir.setCommand(command1);
        requestMakedir.startExecuteCommand();

        System.out.printf("%n用一个宏命令输出所有:%n");
        requestMakedir.setCommand(macroCommand);
        requestMakedir.startExecuteCommand();
    }
}
