package com.lagoon.Letter;

//具体命令之输出英文字母表命令
public class PrintEnglishCommand implements Command{
    PrintLetter letter;

    public PrintEnglishCommand(PrintLetter letter) {
        this.letter = letter;
    }
    public void execute(){
        letter.printEnglish();
    }
}
