package com.thecleancoders.crm.main;

import com.thecleancoders.crm.classes.Account;
import com.thecleancoders.crm.classes.Contact;
import com.thecleancoders.crm.classes.Lead;
import com.thecleancoders.crm.classes.Opportunity;
import com.thecleancoders.crm.enums.Industry;
import com.thecleancoders.crm.enums.Product;
import com.thecleancoders.crm.io.FileManager;
import com.thecleancoders.crm.menu.Menu;
import com.thecleancoders.crm.menu.Printer;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
//    public static ArrayList<Lead> allLeads = new ArrayList<Lead>();
//    public static ArrayList<Contact> allContactsList = new ArrayList<Contact>();
//    public static ArrayList<Opportunity> allOpportunitiesList = new ArrayList<Opportunity>();





    
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.controlLoop();
    }
}
