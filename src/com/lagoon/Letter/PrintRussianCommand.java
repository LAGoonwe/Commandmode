package com.lagoon.Letter;

//具体命令之输出俄文字母表
public class PrintRussianCommand implements Command{
    PrintLetter letter;

    public PrintRussianCommand(PrintLetter letter) {
        this.letter = letter;
    }

    @Override
    public void execute() {
        letter.printRussian();
    }

}
