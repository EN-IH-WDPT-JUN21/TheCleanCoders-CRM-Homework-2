package com.thecleancoders.crm.menu;

public class Printer {
    public void print(String text) {
        System.out.println(text);
    }

    public void printAllAccounts() {

    }

    public void printAllContacts() {

    }

    public void printAllLeads() {

    }

    public void printAllOpportunities() {

    }

    public void printTypoInfo(String wrongWord) {
        System.out.println("Incorrect command. Possible typo in the word \"" + wrongWord + "\". Please try again.");
    }
}