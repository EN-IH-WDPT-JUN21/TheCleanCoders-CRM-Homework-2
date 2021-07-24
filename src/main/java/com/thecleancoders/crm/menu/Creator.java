package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.classes.Account;
import com.thecleancoders.crm.classes.Contact;
import com.thecleancoders.crm.classes.Lead;
import com.thecleancoders.crm.classes.Opportunity;
import com.thecleancoders.crm.enums.Product;
import com.thecleancoders.crm.main.Main;

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
        // asks user all the necessary info
//        System.out.println("\n Lead Creation\n"+"Please input the following:\n");
//        System.out.println("Name:");
//        String name = input.getString();
//        System.out.println("Phone Number:");
//        String phoneNumber = input.getString();
//        System.out.println("Email:");
//        String email = input.getString();
//        System.out.println("Company Name:");
//        String companyName = input.getString();
//
//        //Lead will be instantiated directly as a member of the leadsList ArrayList in the Main Class
//        Main.leadsList.add(new Lead(name, phoneNumber, email, companyName));
//
//        //print a Lead creation Message, using Lead.toString method on the last element of leadsList, newly created
//        System.out.println("\nA new Lead was created with the following info:");
//        Main.leadsList.get(Main.leadsList.size()-1).toString();
//


    }

    public void createOpportunity() {
        // asks user all the necessary info and then calls constructor
    }

    public void createOpportunityFromLead(Lead lead) {
        // asks user about product type and quantity
//        lead.convertToOpportunity(product, quantity);
    }

}
