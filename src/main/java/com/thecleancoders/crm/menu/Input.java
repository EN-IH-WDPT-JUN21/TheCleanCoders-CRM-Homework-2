package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.enums.Command;
import com.thecleancoders.crm.enums.ObjectType;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    private Printer printer;

    public Input(Printer printer) {
        this.printer = printer;
    }

    public String getString() {
        return scanner.nextLine();
    }

    public int getInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

    public int getIntegerHigherThanZero() {
        int intValue = -1;
        do {
            String input = scanner.next();
            try {
                intValue = Integer.parseInt(input);
            } catch (NumberFormatException exp) {
                System.out.println("Must be Integer higher than 0");
            }
        } while (intValue <= 0);

        return intValue;
    }


    public void close() {
        scanner.close();
    }

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

    // method to convert case insensitive string (in singular form) to ObjectTypes Enum
    public ObjectType getObjectTypeFromStringSingular(String string) {
        string = string.toUpperCase();
        for (ObjectType objectType : ObjectType.values()) {
            if (string.equals(objectType.getSingularForm())) {
                return objectType;
            }
        }
        return null;
    }

    // method to convert case insensitive string (in plural form) to ObjectTypes Enum
    public ObjectType getObjectTypeFromStringPlural(String string) {
        string = string.toUpperCase();
        for (ObjectType objectType : ObjectType.values()) {
            if (string.equals(objectType.getPluralForm())) {
                return objectType;
            }
        }
        return null;
    }
}