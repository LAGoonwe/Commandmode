package com.lagoon.command;

/**
 * 该类为main方法，演示一个指挥官下发命令如何请求三连偷袭敌人
 */
public class Application {
    public static void main(String[] args) {
        //创建接收者
        CompanyArmy 三连=new CompanyArmy();
        //创建具体命令并指定接收者
        Command command=new ConcreteCommand(三连);
        //创建请求者
        ArmySuperior 指挥官=new ArmySuperior();
        //下发命令
        指挥官.setCommand(command);
        //开始执行命令
        指挥官.startExecuteCommand();
        //执行结果：输出语句，我们知道如何偷袭敌人，保证完成任务！
    }
}
