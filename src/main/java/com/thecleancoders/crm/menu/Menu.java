package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.classes.*;
import com.thecleancoders.crm.enums.Command;
import com.thecleancoders.crm.enums.ObjectType;
import com.thecleancoders.crm.enums.Product;
import com.thecleancoders.crm.enums.Status;

import java.util.Arrays;

public class Menu {
    private Printer printer = new Printer();
    private Input input = new Input(printer);
    private Creator creator = new Creator(input, printer);

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
        switch (objectType) {
            case ACCOUNT:
                creator.createAccount();
                break;
            case CONTACT:
                creator.createContact(); //When a CONTACT is created independently, it will ask for a LEAD Id
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
        System.out.println("Lookups " + objectType + " with and id of " + id + ".");
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
    }

    public void convert(int id) {
        //When a Lead is converted, Contact, Opportunity and Account are automatically created, and the Lead must be
        //deleted
        System.out.println("\nConverting LEAD nr " + id + " to CONTACT, OPPORTUNITY and ACCOUNT\n");
        Lead lead = (Lead) Lead.getById(id, Lead.getAllLeads());
        creator.createContact(lead);
        creator.createOpportunity();
        creator.createAccount(lead);
        Lead.removeItem(lead);
    }

    public void changeStatus(Status status, int id) {
        System.out.println("Changes OPPORTUNITY with and id of " + id + " status to " + status + ".");
        Opportunity opportunity = (Opportunity) Opportunity.getById(id, Opportunity.getAllOpportunities());
        opportunity.setStatus(status);

    }
}