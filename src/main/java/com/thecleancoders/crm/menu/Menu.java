package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.classes.Account;
import com.thecleancoders.crm.classes.Contact;
import com.thecleancoders.crm.classes.Lead;
import com.thecleancoders.crm.classes.Opportunity;
import com.thecleancoders.crm.enums.Command;
import com.thecleancoders.crm.enums.ObjectType;
import com.thecleancoders.crm.enums.Status;

import java.util.Objects;

public class Menu {
    private final Printer printer = new Printer();
    private final Input input = new Input(printer);
    private final Creator creator = new Creator(input, printer);

    public Menu() {
    }

    public void controlLoop() {
        Command command;
        do {
            String[] inputList = input.getString().trim().split(" ");
            command = input.getCommandFromString(inputList[0]);
            if (Objects.isNull(command)) {
                printer.printTypoInfo(inputList[0]);
            } else {
                try {
                    interpretInput(inputList);
                } catch (NullPointerException exception) {
                    printer.print(exception.getMessage());
                } catch (NumberFormatException exception) {
                    printer.print("Incorrect format of id. Please try again.");
                }
            }
        } while (command != Command.EXIT);
        input.close();
    }

    public void interpretInput(String[] inputList) {
        Command command = input.getCommandFromString(inputList[0]);
        ObjectType objectType;
        int id;

        switch (command) {
            case NEW:
                objectType = input.getObjectTypeFromStringSingular(inputList[1]);
                if (Objects.isNull(objectType)) {
                    printer.printTypoInfo(inputList[1]);
                } else {
                    create(objectType);
                }
                break;
            case SHOW:
                objectType = input.getObjectTypeFromStringPlural(inputList[1]);
                if (Objects.isNull(objectType)) {
                    printer.printTypoInfo(inputList[1]);
                } else {
                    show(objectType);
                }
                break;
            case LOOKUP:
                objectType = input.getObjectTypeFromStringSingular(inputList[1]);
                if (Objects.isNull(objectType)) {
                    printer.printTypoInfo(inputList[1]);
                } else {
                    id = Integer.parseInt(inputList[2]);
                    lookup(objectType, id);
                }
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
    }

    public void create(ObjectType objectType) {
        System.out.println("New " + objectType + " gets created");
        switch (objectType) {
            case ACCOUNT:
                creator.createAccount();
                break;
            case CONTACT:
                creator.createContact();
                break;
            case LEAD:
                creator.createLead();
                break;
            case OPPORTUNITY:
                creator.createOpportunity();
                break;
        }
    }

    public void show(ObjectType objectType) {
        System.out.println("Shows all " + objectType.getPluralForm() + ".");
        switch (objectType) {
            case ACCOUNT:
                printer.printAllAccounts();
                break;
            case CONTACT:
                printer.printAllContacts();
                break;
            case LEAD:
                printer.printAllLeads();
                break;
            case OPPORTUNITY:
                printer.printAllOpportunities();
                break;
        }
    }

    public void lookup(ObjectType objectType, int id) {
        switch (objectType) {
            case ACCOUNT:
                printer.print(Account.getById(id, Account.getAllAccounts()).toString());
                break;
            case CONTACT:
                printer.print(Contact.getById(id, Contact.getAllContacts()).toString());
                break;
            case LEAD:
                printer.print(Lead.getById(id, Lead.getAllLeads()).toString());
                break;
            case OPPORTUNITY:
                printer.print(Opportunity.getById(id, Opportunity.getAllOpportunities()).toString());
                break;
        }
        System.out.println("Lookups " + objectType + " with and id of " + id + ".");
    }

    public void convert(int id) {
        System.out.println("Converts LEAD with an id of " + id + " to OPPORTUNITY and lots of other stuff happens too.");
        Lead lead = (Lead) Lead.getById(id, Lead.getAllLeads());
        creator.createOpportunityFromLead(lead);
    }

    public void changeStatus(Status status, int id) {
        System.out.println("Changes OPPORTUNITY with and id of " + id + " status to " + status + ".");
        Opportunity opportunity = (Opportunity) Opportunity.getById(id, Opportunity.getAllOpportunities());
        opportunity.setStatus(status);

    }
}