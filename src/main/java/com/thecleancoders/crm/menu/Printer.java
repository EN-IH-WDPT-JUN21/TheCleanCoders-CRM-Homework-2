package com.thecleancoders.crm.menu;


import com.thecleancoders.crm.classes.*;
import java.sql.SQLOutput;

public class Printer {
    public void print(String text) {
        System.out.println(text);
    }

    public void printAllAccounts() {
        for (Item account : Account.allAccounts) {
            print(account.toString());
        }
    }

    public void printAllContacts() {
        for (Item contact : Contact.allContacts) {
            print(contact.toString());
        }
    }

    public void printAllLeads() {
        for(Item lead : Lead.allLeads) {
            print(lead.toString());
        }
    }

    public void printAllOpportunities() {
        for (Item opportunity : Opportunity.allOpportunities) {
            print(opportunity.toString());
        }
    }

    public void printTypoInfo(String wrongWord) {
        System.out.println("Incorrect command. Possible typo in the word \"" + wrongWord + "\". Please try again.");
    }

    public void printExportErrorInfo(String filename) {
        System.out.println("There was an error while exporting data to file " + filename);
    }

    public void printImportErrorInfo(String filename) {
        System.out.println("There was an error while importing data from file " + filename);
    }   

      
    public void welcomeMessage() {
        print("\n\n============================================================");
        print("                       Welcome to\n");
        print("                     theCleanCoders\n");
        print("            ########   #######     ##        ##");
        print("            ########   ########    ###      ###");
        print("            ##         ##     ##   ####    ####");
        print("            ##         ##     ##   ## ##  ## ##");
        print("            ##         ##     ##   ##   ##   ##");
        print("            ##         ########    ##   ##   ##");
        print("            ##         #######     ##        ##");
        print("            ##         ##   ##     ##        ##");
        print("            ##         ##    ##    ##        ##");
        print("            ########   ##     ##   ##        ##");
        print("            ########   ##      ##  ##        ##");
        print("\n\nTo start using our cleanCRM, type the commands below. Type \"HELP\" for instructions");
      
    }
      
      
    public void helpPage(){
        System.out.println("=================================================");
        System.out.println("            The cleanCRM Help page");
        System.out.println("=================================================");
        System.out.println("\n      Possible Commands:" );
        System.out.println(" NEW <Object type>                  Creates a new Object");
        System.out.println(" SHOW <Object type>                 Lists all Objects of the selected type");
        System.out.println(" LOOKUP <Object type> <Id Number>   Display the selected Object type with the indicated Id Number");
        System.out.println(" CONVERT <LEAD Id number>           Converts the selected LEAD in CONTACT, OPPORTUNITY and ACCOUNT");
        System.out.println(" CLOSE-WON <ACCOUNT Id Number>      Changes the selected ACCOUNT status to CLOSE-WON");
        System.out.println(" CLOSE-LOST <ACCOUNT Id Number>     Changes the selected ACCOUNT status to CLOSE-LOST");
        System.out.println(" OPEN <ACCOUNT Id Number>           Changes the selected ACCOUNT status to OPEN");
        System.out.println(" SAVE                               Saves data to files");
        System.out.println(" HELP                               Displays this help info");
        System.out.println(" EXIT                               Terminates the cleanCRM program");
        System.out.println("\n      Object Types available:");
        System.out.println(" LEAD\n CONTACT" +
                "\n OPPORTUNITY\n ACCOUNT\n");
        System.out.println("All Object types accepted in plural (e.g OPPORTUNITY and OPPORTUNITIES are " +
                "both accepted forms)");
        System.out.println("\nAll commands are case-insensitive\n\n");
    }
    
    
}
