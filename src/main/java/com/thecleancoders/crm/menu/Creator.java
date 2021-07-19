package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.classes.Account;
import com.thecleancoders.crm.classes.Contact;
import com.thecleancoders.crm.classes.Lead;
import com.thecleancoders.crm.classes.Opportunity;

public class Creator {
    private Input input;
    private Printer printer;

    public Creator(Input input, Printer printer) {
        this.input = input;
        this.printer = printer;
    }

    public static Account createAccount() {
        // asks user all the necessary info and then calls constructor
        return new Account();
    }

    public static Contact createContact() {
        // asks user all the necessary info and then calls constructor
        return new Contact();
    }

    public static Lead createLead() {
        // asks user all the necessary info and then calls constructor
        return new Lead();
    }

    public static Opportunity createOpportunity() {
        // asks user all the necessary info and then calls constructor
        return new Opportunity();
    }
}
