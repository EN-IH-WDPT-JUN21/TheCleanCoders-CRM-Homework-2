package com.thecleancoders.crm.main;

import com.thecleancoders.crm.menu.Menu;
import com.thecleancoders.crm.menu.Printer;

public class Main {
    
//    public static ArrayList<Lead> allLeads = new ArrayList<Lead>();
//    public static ArrayList<Contact> allContactsList = new ArrayList<Contact>();
//    public static ArrayList<Opportunity> allOpportunitiesList = new ArrayList<Opportunity>();





    
    public static void main(String[] args) {

        Menu menu = new Menu();
        Printer printer = new Printer();
        printer.welcomeMessage();
        menu.controlLoop();
    }
}
