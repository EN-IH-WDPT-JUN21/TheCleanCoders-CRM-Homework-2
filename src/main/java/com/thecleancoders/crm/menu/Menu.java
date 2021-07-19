package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.enums.Command;
import com.thecleancoders.crm.enums.ObjectType;
import com.thecleancoders.crm.enums.Status;

public class Menu {
    private Printer printer = new Printer();
    private Input input = new Input(printer);

    public Menu() {
    }

    public void controlLoop() {
        Command command;
        ObjectType objectType;
        int id;

        do {
            String[] inputList = input.getString().trim().split(" ");
            command = input.getCommandFromString(inputList[0]);

            switch (command) {
                case NEW:
                    objectType = input.getObjectTypeFromStringSingular(inputList[1]);
                    create(objectType);
                    break;
                case SHOW:
                    objectType = input.getObjectTypeFromStringPlural(inputList[1]);
                    show(objectType);
                    break;
                case LOOKUP:
                    objectType = input.getObjectTypeFromStringSingular(inputList[1]);
                    id = Integer.parseInt(inputList[2]);
                    lookup(objectType, id);
                    break;
                case CONVERT:
                    id = Integer.parseInt(inputList[1]);
                    convert(id);
                    break;
                case CLOSE_LOST:
                    id = Integer.parseInt(inputList[1]);
                    changeStatus(Status.CLOSED_LOST, id);
                    break;
                case CLOSE_WON:
                    id = Integer.parseInt(inputList[1]);
                    changeStatus(Status.CLOSED_WON, id);
                    break;
                case OPEN:
                    id = Integer.parseInt(inputList[1]);
                    changeStatus(Status.OPEN, id);
                    break;
            }
        } while (command != Command.EXIT);

        input.close();
    }

    public void create(ObjectType objectType) {
        System.out.println("New " + objectType + " gets created");
    }

    public void show(ObjectType objectType) {
        System.out.println("Shows all " + objectType.getPluralForm() + ".");
    }

    public void lookup(ObjectType objectType, int id) {
        System.out.println("Lookups " + objectType + " with and id of " + id + ".");
    }

    public void convert(int id) {
        System.out.println("Converts LEAD with an id of " + id + " to OPPORTUNITY and lots of other stuff happens too.");
    }

    public void changeStatus(Status status, int id) {
        System.out.println("Changes OPPORTUNITITY with and id of " + id + " status to " + status + ".");
    }
}