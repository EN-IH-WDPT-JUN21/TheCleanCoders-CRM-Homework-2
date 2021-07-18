package com.thecleancoders.crm.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Initially, we could create an ArrayList with all leads, to be possible to work with.
        //Later, when we want to close the whole application, by inserting the command "exit", we could
        // make the program transfer everything in the Leads leadArray and any other arrays (like contactArray,
        // opportunityArray, etc) into the storage CSV files.
        Scanner scanner = new Scanner(new File("leads.csv"));
        ArrayList<String[]> leadsArray = new ArrayList<String[]>();

        while (scanner.hasNextLine()) {
        String[] leadLine = scanner.nextLine().split(",");
        leadsArray.add(leadLine);
        }
        scanner.close();

        //Just to check
        System.out.println(leadsArray.get(2)[1]); //should return "Ned Flanders"

    }
}
