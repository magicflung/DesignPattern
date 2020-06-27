package com.command;

public class Client {

    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl(lightOnCommand, lightOffCommand);
        remoteControl.onButtonWasPressed();
        remoteControl.offButtonWasPressed();
        remoteControl.undoButtonWasPressed();
    }
}
