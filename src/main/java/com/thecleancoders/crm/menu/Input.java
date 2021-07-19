package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.enums.Command;

public class Input {
    // method to convert case insensitive string to Command Enum
    public Command getCommandFromString(String string) {
        string = string.toUpperCase();
        for (Command command : Command.values())
            if (string.equals(command.getExpectedInput())) {
                return command;
            }
        return null;
    }
}