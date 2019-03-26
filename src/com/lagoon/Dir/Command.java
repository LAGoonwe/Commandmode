package com.lagoon.Dir;

/**
 * 该类为命令接口类,代表既可以执行命令，也可以撤销收回命令
 */
public interface Command {
    public abstract void execute(String name);
    public abstract void undo();
}
