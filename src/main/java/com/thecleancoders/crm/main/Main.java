package com.thecleancoders.crm.main;

import com.thecleancoders.crm.menu.Menu;
import com.thecleancoders.crm.menu.Printer;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        Printer printer = new Printer();
        printer.welcomeMessage();
        menu.controlLoop();
    }
}
