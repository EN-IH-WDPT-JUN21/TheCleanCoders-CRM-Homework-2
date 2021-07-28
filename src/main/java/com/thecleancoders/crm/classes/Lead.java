package com.thecleancoders.crm.classes;

import com.thecleancoders.crm.enums.Industry;
import com.thecleancoders.crm.enums.Product;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lead extends Item {

    // Properties

    private String name;
    private String phoneNumber;
    private String email;
    private String companyName;
    public static List<Item> allLeads = new ArrayList<>();

    // Constructor

    public Lead(String name, String phoneNumber, String email, String companyName) {
        super(allLeads);
        setName(name);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setCompanyName(companyName);
    }

    public Lead(int id, String name, String phoneNumber, String email, String companyName) {
        super(id, allLeads);
        setName(name);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setCompanyName(companyName);
    }

    // Methods

    public static void showLeads() {}

    public static void lookUpLeadId(int leadId) {}

    public void convertToOpportunity(Product product, int quantity, Industry industry, int empl, String city, String country) {
        Contact contact = new Contact(this);
        Opportunity opportunity = new Opportunity(product, quantity, contact);
        Account account = new Account(this, contact, opportunity, industry, empl, city, country);
        allLeads.remove(this);
    }

    // Getters and setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws NumberFormatException {
        try {
            if (Item.isNumeric(phoneNumber)) {
                this.phoneNumber = phoneNumber;
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            System.out.println("Wrong phone number. Please enter a digit number (eg. 123456789)");
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        try{
            Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
            Matcher m = p.matcher(email);
            boolean matchFound = m.matches();
            if (matchFound) {
                this.email = email;
            } else {throw new InputMismatchException();
            }
        } catch(InputMismatchException ex){
                System.out.println("Wrong email address");
            }
        }

        public String getCompanyName () {
            return this.companyName;
        }

        public void setCompanyName (String companyName){
            this.companyName = companyName;
        }

        public static List<Item> getAllLeads () {
            return allLeads;
        }

        @Override
        public String toString () {
            return "=== Lead " + getId() + " ===" + '\n' +
                    "· name : " + name + '\n' +
                    "· phone number : " + phoneNumber + '\n' +
                    "· email : " + email + '\n' +
                    "· company name : " + companyName + '\n';
        }

    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public static List<Item> getAllLeads() {
        return allLeads;
    }

    public static void removeItem(Lead lead) {
        for (int i = 0; i < allLeads.size(); i++) {
            if (lead.equals(allLeads.get(i))) {
                allLeads.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "=== Lead " + getId() + " ===" + '\n' +
                "· name : " + name + '\n' +
                "· phone number : " + phoneNumber + '\n' +
                "· email : " + email + '\n' +
                "· company name : " + companyName + '\n';
    }

}
