package com.thecleancoders.crm.main;

import com.thecleancoders.crm.classes.Contact;
import com.thecleancoders.crm.classes.Lead;
import com.thecleancoders.crm.classes.Opportunity;
import com.thecleancoders.crm.enums.Product;
import com.thecleancoders.crm.menu.Menu;

import java.util.ArrayList;

public class Main {
    
    public static ArrayList<Lead> leadsList = new ArrayList<Lead>();
    public static ArrayList<Contact> contactList = new ArrayList<Contact>();



    public static ArrayList<Contact> contactsList = new ArrayList<Contact>();

    
    public static void main(String[] args) {

//        Lead lead = new Lead("Travis", "666778899", "travis@onecompany.com", "Company One");
//        Lead lead2 = new Lead("Laia", "666778899", "laia@twocompany.com", "Company Two");
//
//        Contact contact = new Contact(lead);
//        Contact contact2 = new Contact(lead2);
//
//        Opportunity opportunity = new Opportunity(Product.BOX, 200, contact);
//        Opportunity opportunity2 = new Opportunity(Product.BOX, 100, contact2);
//
//        System.out.println(Opportunity.getAllOpportunities());
//        System.out.println(Lead.getAllLeads());

        Menu menu = new Menu();
        menu.controlLoop();
    }
}
