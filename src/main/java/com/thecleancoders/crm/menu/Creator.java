package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.classes.Account;
import com.thecleancoders.crm.classes.Contact;
import com.thecleancoders.crm.classes.Lead;
import com.thecleancoders.crm.classes.Opportunity;
import com.thecleancoders.crm.enums.Industry;
import com.thecleancoders.crm.enums.Product;
import com.thecleancoders.crm.output.Style;

public class Creator {
    private Input input;
    private Printer printer;

    public Creator(Input input, Printer printer) {
        this.input = input;
        this.printer = printer;
    }

    // Method used automatically when LEAD is converted
    public void createAccount(Lead lead) {
        // Asks user all the necessary info and then calls constructor
        System.out.println("Additional information for the" + Style.OCHER + " ACCOUNT." + Style.DEFAULT + " Please input the following:");

        System.out.println("\nChoose type of Industry:");
        Industry industry = input.chooseIndustry();

        System.out.println("\nNow input number of employees of the Company (Integer bigger than 0)");
        int employeeCount = input.getIntegerHigherThanZero();

        System.out.println("\nCity where the Company is based:");
        String city = input.getString();
        do {
            try {
                Validator.isStringValid(city);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Input is whether empty or too long, or it may contain not valid characters.");
            }
            System.out.println("City where the Company is based:");
            city = input.getString();
        } while (Validator.isStringValid(city) != true);

        System.out.println("\nCountry where the Company is based:");
        String country = input.getString();
        do {
            try {
                Validator.isStringValid(country);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Input is whether empty or too long, or it may contain not valid characters.");
            }
            System.out.println("Country where the Company is based:");
            country = input.getString();
        } while (Validator.isStringValid(country) != true);

        Account account = new Account((Contact) Contact.allContacts.get(Contact.allContacts.size()-1),
                (Opportunity) Opportunity.allOpportunities.get(Opportunity.allOpportunities.size()-1),
                industry, employeeCount, city, country);
        System.out.println("\nNew ACCOUNT created:");
        System.out.println(account.toString());

    }

    // Method used to create an ACCOUNT independently.
    public void createAccount() {
        // It will request CONTACT id, OPPORTUNITY id
        System.out.println(Style.OCHER + "Creating an independent ACCOUNT" + Style.DEFAULT);

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

        System.out.println("\nCity where the Company is based:");
        String city = input.getString();
        do {
            try {
                Validator.isStringValid(city);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Input is whether empty or too long, or it may contain not valid characters.");
            }
            System.out.println("City where the Company is based:");
            city = input.getString();
        } while (Validator.isStringValid(city) != true);

        System.out.println("\nCountry where the Company is based:");
        String country = input.getString();
        do {
            try {
                Validator.isStringValid(country);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Input is whether empty or too long, or it may contain not valid characters.");
            }
            System.out.println("Country where the Company is based:");
            country = input.getString();
        } while (Validator.isStringValid(country) != true);

        Account account = new Account(contact, opportunity, industry, employeeCount, city, country);
        System.out.println("\nNew ACCOUNT created:");
        System.out.println(account.toString());

    }

    //  Method that creates a CONTACT automatically when LEAD is converted
    public void createContact(Lead lead) {
        Contact contact = new Contact(lead);
    }

    // Method used to create a CONTACT independently.
    public void createContact() {
        // It will request LEAD id
        System.out.println(Style.OCHER + "Creating a new CONTACT." + Style.DEFAULT);

        System.out.println("\nPlease insert LEAD Id to be used:");
        int idLead = input.getIntegerHigherThanZero();
        Lead lead = (Lead) Lead.getById(idLead, Lead.allLeads);
        Contact contact = new Contact(lead);

        System.out.println("\nNew CONTACT created:");
        System.out.println(contact.toString());

    }

    public void createLead() {
        // Asks user all the necessary info
        System.out.println(Style.OCHER + "Creating an independent OPPORTUNITY." + Style.DEFAULT);
        System.out.println("Please input the following:");

        System.out.println("\nName:");
        String name = input.getString();
        do {
            try {
                Validator.isStringValid(name);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Input is whether empty or too long, or it may contain not valid characters.");
            }
            System.out.println("Name:");
            name = input.getString();
        } while (Validator.isStringValid(name) != true);


        System.out.println("\nPhone Number:");
        String phoneNumber = input.getString();
        do {
            try {
                Validator.isPhoneNumberValid(phoneNumber);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("The phone number must have 9 digits.");
            }
            System.out.println("Phone Number:");
            phoneNumber = input.getString();
        } while (Validator.isPhoneNumberValid(phoneNumber) != true);


        System.out.println("\nEmail:");
        String email = input.getString();
        do {
            try {
                Validator.isEmailValid(email);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("The email address format is not valid.");
            }
            System.out.println("Email:");
            email = input.getString();
        } while (Validator.isEmailValid(email) != true);


        System.out.println("\nCompany Name:");
        String companyName = input.getString();
        do {
            try {
                Validator.isStringValid(companyName);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Input is whether empty or too long, or it may contain not valid characters.");
            }
            System.out.println("Company Name:");
            companyName = input.getString();
        } while (Validator.isStringValid(companyName) != true);

        Lead lead = new Lead(name, phoneNumber, email, companyName);

        // Print a LEAD creation message, using Lead.toString method on the last element of leadsList, newly created
        System.out.println("\nA new LEAD was created with the following info:");
        System.out.println(lead.toString());

    }

    public void createOpportunityByLeadConversion() {
        System.out.println("Additional information for the" + Style.OCHER + " OPPORTUNITY." + Style.DEFAULT + " Please input the following:");
        System.out.println("\nProduct type:");
        Product product = input.chooseProduct();

        System.out.println("\nQuantity of trucks (must be integer higher than 0)");
        int quantity = input.getIntegerHigherThanZero(); // Added this method to Input class.

        //This method should be implemented right after the createContact method, and both are triggered by the
        // "convert <id number>" command. So it will use the last contact it was created in the allContactsList array.
        //Constructing the Opportunity object, and storing it in the allOpportunitiesList:
        Opportunity opportunity = new Opportunity(product, quantity,
                (Contact) Contact.allContacts.get(Contact.allContacts.size()-1));
        System.out.println("\n\nA new Opportunity was created as follows:");
        System.out.println(opportunity.toString());
    }

    // Method used when an OPPORTUNITY is created independently, it still depends on a CONTACT id
    public void createOpportunity() {
        System.out.println(Style.OCHER + "Creating an independent OPPORTUNITY. " + Style.DEFAULT);
        System.out.println("\nPlease insert the Id number of the CONTACT to be associated: ");
        int contactId = input.getIntegerHigherThanZero();

        System.out.println("\nPlease choose the product");
        Product product = input.chooseProduct();

        System.out.println("\nQuantity of trucks (Integer higher than 0)");
        int quantity = input.getIntegerHigherThanZero();

        Opportunity opportunity = new Opportunity(product, quantity,
                (Contact) Contact.getById(contactId, Contact.allContacts));
        System.out.println("\nNew OPPORTUNITY created as follows:");
        System.out.println(opportunity.toString());
    }

}
