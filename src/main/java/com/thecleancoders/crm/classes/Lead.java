package com.thecleancoders.crm.classes;

import com.thecleancoders.crm.enums.Product;

import java.util.ArrayList;
import java.util.List;

public class Lead extends Item{

    // Properties

    private String name;
    private String phoneNumber;
    private String email;
    private String companyName;
    protected static List<Item> allLeads = new ArrayList<>();

    // Constructor

    public Lead(String name, String phoneNumber, String email, String companyName) {
        super(allLeads);
        setName(name);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setCompanyName(companyName);
    }

    // Methods

    public static void addLeadToList(Lead lead){
        allLeads.add(lead);
    }

    public static void showLeads(){}

    public static void lookUpLeadId(int leadId){}

    public void convertToOpportunity(Product product, int quantity){
        Contact contact = new Contact(this);
        Contact.addContactToList(contact);
        Opportunity opportunity = new Opportunity(product, quantity, contact);
        Opportunity.addOpportunityToList(opportunity);
        allLeads.remove(this);
    }

    public void removeLead(){
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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public static List<Item> getAllLeads() {
        return allLeads;
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
