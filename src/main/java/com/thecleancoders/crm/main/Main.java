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

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.controlLoop();
    }
}
