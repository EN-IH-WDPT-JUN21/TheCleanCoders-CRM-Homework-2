package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.enums.Command;
import com.thecleancoders.crm.enums.ObjectTypes;

public class Input {
    // method to convert case insensitive string to Command Enum
    public Command getCommandFromString(String string) {
        string = string.toUpperCase();
        for (Command command : Command.values()) {
            if (string.equals(command.getExpectedInput())) {
                return command;
            }
        }
        return null;
    }

    public ObjectTypes getObjectTypeFromStringSingular(String string) {
        string = string.toUpperCase();
        for (ObjectTypes objectType : ObjectTypes.values()) {
            if (string.equals(objectType.getSingularForm())) {
                return objectType;
            }
        }
        return null;
    }

    public ObjectTypes getObjectTypeFromStringPlural(String string) {
        string = string.toUpperCase();
        for (ObjectTypes objectType : ObjectTypes.values()) {
            if (string.equals(objectType.getPluralForm())) {
                return objectType;
            }
        }
        return null;
    }
}