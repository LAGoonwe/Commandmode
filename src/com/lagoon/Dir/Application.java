package com.lagoon.Dir;

import java.util.Iterator;

/**
 * 该类为发射类
 */
public class Application {
    public static void main(String[] args) {
        //创建接收者
        MakeDir makeDir=new MakeDir();
        //创建具体命令并指定接收者
        Command command=new ConcreteCommand(makeDir);
        RequestMakeDir requestMakeDir=new RequestMakeDir();
        requestMakeDir.setCommand(command);
        //建立名字是java的目录
        requestMakeDir.startExecuteCommand("java");
        //建立名字是c的目录
        requestMakeDir.startExecuteCommand("c");
        //建立名字是c++的目录
        requestMakeDir.startExecuteCommand("c++");
        //撤销命令，删除名字是c++的目录
        requestMakeDir.undoCommand();
        //撤销命令，删除名字是c的目录
        requestMakeDir.undoCommand();

        //查看当前列表里的目录
        Iterator<String> iterator = ((ConcreteCommand) command).dirNameList.iterator();
        if (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //运行结果，输出一个列表目录，java，说明其他被撤销成功
    }
}
