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

    public Account createAccount() {
        // asks user all the necessary info and then calls constructor
        return null;
    }

    public Contact createContact() {
        // asks user all the necessary info and then calls constructor
        return null;
    }

    public Lead createLead() {
        // asks user all the necessary info and then calls constructor
        return null;
    }

    public Opportunity createOpportunity() {
        // asks user all the necessary info and then calls constructor
        return null;
    }
}
