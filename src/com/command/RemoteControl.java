package com.command;

public class RemoteControl {
    // 如果想要多个命令插槽，方便以后扩展，那么就写成数组的形式
    Command onCommand;
    Command offCommand;
    Command undoCommand;

    public RemoteControl(Command onCommand, Command offCommand) {
        // 如果是数组的形式，为了不让有空指针，重新创建一个空命令
        // Command noCommand = new NoCommand();
        // onCommand[...] = noCommand;
        // offCommand[...] = noCommand;
        // undoCommand = noCommand;

        // 加载某电器的开关命令
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }


    /**
     * 开按钮
     */
    public void onButtonWasPressed() {
        onCommand.execute();
        // 撤回按钮需要知道前一个命令是什么
        undoCommand = onCommand;
    }

    /**
     * 关按钮
     */
    public void offButtonWasPressed() {
        offCommand.execute();
        // 撤回按钮需要知道前一个命令是什么
        undoCommand = offCommand;
    }

    /**
     * 撤回按钮
     */
    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

}
