package com.lagoon.command;

/**
 * 这个类扮演的是具体命令的角色
 */
public class ConcreteCommand implements Command{

    CompanyArmy companyArmy;  //含有接收者的引用
    ConcreteCommand(CompanyArmy companyArmy){
        this.companyArmy=companyArmy;
    }

    @Override
    public void execute() {  //封装着指挥官的请求
        companyArmy.sneakAttack();  //偷袭敌人

    }
}
