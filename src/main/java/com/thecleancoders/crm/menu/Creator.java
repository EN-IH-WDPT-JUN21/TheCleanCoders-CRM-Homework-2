package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.classes.Account;
import com.thecleancoders.crm.classes.Contact;
import com.thecleancoders.crm.classes.Lead;
import com.thecleancoders.crm.classes.Opportunity;
import com.thecleancoders.crm.enums.Product;

public class Creator {
    private Input input;
    private Printer printer;

    public Creator(Input input, Printer printer) {
        this.input = input;
        this.printer = printer;
    }

    public void createAccount() {
        // asks user all the necessary info and then calls constructor
    }

    public void createContact() {
        // asks user all the necessary info and then calls constructor
    }

    public void createLead() {
        // asks user all the necessary info and then calls constructor
    }

    public void createOpportunity() {
        // asks user all the necessary info and then calls constructor
    }

    public void createOpportunityFromLead(Lead lead) {
        // asks user about product type and quantity
//        lead.convertToOpportunity(product, quantity);
    }

}
