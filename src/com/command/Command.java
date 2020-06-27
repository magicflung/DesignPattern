package com.command;

public interface Command {
    /**
     * 执行
     */
    void execute();

    /**
     * 撤销
     */
    void undo();
}
