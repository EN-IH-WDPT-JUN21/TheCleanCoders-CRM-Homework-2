package com.thecleancoders.crm.main;

import com.thecleancoders.crm.classes.Contact;
import com.thecleancoders.crm.classes.Lead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Initially, we could create an ArrayList with all leads, to be possible to work with.
    //Later, when we want to close the whole application, by inserting the command "exit", we could
    // make the program transfer everything in the Leads leadArray and any other arrays (like contactArray,
    // opportunityArray, etc) into the storage CSV files.
    public static ArrayList<Lead> leadsList = new ArrayList<Lead>();
    public static ArrayList<Contact> contactsList = new ArrayList<Contact>();

    public static void main(String[] args) throws FileNotFoundException {


        


       

    }
}
