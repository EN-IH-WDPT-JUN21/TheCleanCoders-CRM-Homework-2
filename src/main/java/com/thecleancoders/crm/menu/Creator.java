package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.classes.Account;
import com.thecleancoders.crm.classes.Contact;
import com.thecleancoders.crm.classes.Lead;
import com.thecleancoders.crm.classes.Opportunity;
import com.thecleancoders.crm.enums.Industry;
import com.thecleancoders.crm.enums.Product;
import com.thecleancoders.crm.main.Main;

import java.sql.SQLOutput;

public class Creator {
    private Input input;
    private Printer printer;

    public Creator(Input input, Printer printer) {
        this.input = input;
        this.printer = printer;
    }

    public void createAccount(Lead lead) { //Method used automatically when LEAD is converted
        // asks user all the necessary info and then calls constructor
        System.out.println("\nAdditional information for the ACCOUNT. Please input the following:");
        System.out.println("\nChoose type of Industry:");
        Industry industry = input.chooseIndustry();
        System.out.println("\nNow input number of employees of the Company (Integer bigger than 0)");
        int employeeCount = input.getIntegerHigherThanZero();
        System.out.println("\nCity where the Company is based:");
        String city = input.getString();
        System.out.println("\nCountry where the Company is based:");
        String country = input.getString();
        Account account = new Account((Contact) Contact.allContacts.get(Contact.allContacts.size()-1),
                (Opportunity) Opportunity.allOpportunities.get(Opportunity.allOpportunities.size()-1),
                industry, employeeCount, city, country);
        System.out.println("\nNew ACCOUNT created:");
        System.out.println(account.toString());

    }

    public void createAccount() {
        //To create an account independently. Will have to request CONTACT id, OPPORTUNITY id
        System.out.println("\nCreating an independent ACCOUNT");
        System.out.println("\nPlease insert related CONTACT id number:");
        int contactId = input.getIntegerHigherThanZero();
        Contact contact = (Contact) Contact.getById(contactId, Contact.allContacts);
        System.out.println("\nPlease insert related OPPORTUNITY id number");
        int opportunityId = input.getIntegerHigherThanZero();
        Opportunity opportunity = (Opportunity) Opportunity.getById(opportunityId, Opportunity.allOpportunities);
        System.out.println("\nPlease choose the Industry of the related Company:");
        Industry industry = input.chooseIndustry();
        System.out.println("\nPlease insert number of employees of the Company (Integer higher than 0)");
        int employeeCount = input.getIntegerHigherThanZero();
        System.out.println("\nCity in which the Company is based:");
        String city = input.getString();
        System.out.println("And the base Country:");
        String country = input.getString();
        Account account = new Account(contact, opportunity, industry, employeeCount, city, country);
        System.out.println("\nNew ACCOUNT created:");
        System.out.println(account.toString());

    }

    //When a contact is created automatically by Lead conversion:
    public void createContact(Lead lead) {
        Contact contact = new Contact(lead);
    }

    //When a CONTACT is created independently, we'll overload the existing method. It will ask for a LEAD id.
    public void createContact() {
        System.out.println("\nCreating an new CONTACT.");
        System.out.println("\nPlease insert LEAD Id to be used:");
        int idLead = input.getIntegerHigherThanZero();
        Lead lead = (Lead) Lead.getById(idLead, Lead.allLeads);
        Contact contact = new Contact(lead);
        System.out.println("\nNew CONTACT created:");
        System.out.println(contact.toString());

    }

    public void createLead() {

        // asks user all the necessary info
        System.out.println("Please input the following:");
        System.out.println("Name:");
        String name = input.getString();
        System.out.println("Phone Number:");
        String phoneNumber = input.getString();
        System.out.println("Email:");
        String email = input.getString();
        System.out.println("Company Name:");
        String companyName = input.getString();
        Lead lead = new Lead(name, phoneNumber, email, companyName);

        //print a LEAD creation message, using Lead.toString method on the last element of leadsList, newly created
        System.out.println("\nA new LEAD was created with the following info:");
        System.out.println(lead.toString());

    }


    public void createOpportunity() {
        System.out.println("\nAdditional information for the Opportunity. Please input the following:");
        System.out.println("Product type:");
        Product product = input.chooseProduct();
        //Product product = Product.valueOf(input.getString().toUpperCase());
        System.out.println("Quantity of trucks (must be integer higher than 0");
        int quantity = input.getIntegerHigherThanZero(); // Added this method to Input class.

        //This method should be implemented right after the createContact method, and both are triggered by the
        // "convert <id number>" command. So it will use the last contact it was created in the allContactsList array.
        //Constructing the Opportunity object, and storing it in the allOpportunitiesList:
        Opportunity opportunity = new Opportunity(product, quantity,
                (Contact) Contact.allContacts.get(Contact.allContacts.size()-1));
        System.out.println("\n\nA new Opportunity was created as follows:");
        System.out.println(opportunity.toString());
    }



}
