package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.classes.*;

public class Printer {
    public void print(String text) {
        System.out.println(text);
    }

    public void printAllAccounts() {
        for (Item account : Account.allAccounts) {
            print(account.toString());
        }
    }

    public void printAllContacts() {
        for (Item contact : Contact.allContacts) {
            print(contact.toString());
        }
    }

    public void printAllLeads() {
        for(Item lead : Lead.allLeads) {
            print(lead.toString());
        }
    }

    public void printAllOpportunities() {
        for (Item opportunity : Opportunity.allOpportunities) {
            print(opportunity.toString());
        }
    }

    public void printTypoInfo(String wrongWord) {
        System.out.println("Incorrect command. Possible typo in the word \"" + wrongWord + "\". Please try again.");
    }

    public void printExportErrorInfo(String filename) {
        System.out.println("There was an error while exporting data to file " + filename);
    }

    public void printImportErrorInfo(String filename) {
        System.out.println("There was an error while importing data from file " + filename);
    }
}