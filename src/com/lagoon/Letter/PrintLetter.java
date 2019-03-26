package com.lagoon.Letter;

/**
 * 该文件夹演示宏命令
 * 宏命令也是一个具体命令，只不过他包含了其他命令的引用
 * 执行一个宏命令，相当于执行了许多的具体命令
 * 该类为接收者角色
 * 问题描述：请求者可以请求只输出英文字母表，俄文字母表或1-n之间的偶数
 * 也可以请求三种都输出
 */
public class PrintLetter {
    public void printEnglish(){
        for (char c='a';c<='z';c++){
            System.out.println(" "+c);
        }
    }

    public void printRussian(){
        for (char c='а';c<='я';c++){
            System.out.println(" "+c);
        }
    }
}
