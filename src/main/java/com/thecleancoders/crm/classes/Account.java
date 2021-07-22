package com.thecleancoders.crm.classes;

import com.thecleancoders.crm.enums.Industry;

import java.util.ArrayList;
import java.util.List;

public class Account extends Item{

    // Properties

    private String companyName;
    private Industry industry;
    private int employeeCount;
    private String city;
    private String country;
    private static List<Item> allAccounts = new ArrayList<>();

    private List<Contact> contactList = new ArrayList<>();
    private List<Opportunity> opportunityList = new ArrayList<>();

    // Constructor

    public Account(Lead lead, Contact contact, Opportunity opportunity, Industry industry, int employeeCount, String city, String country) {
        super(allAccounts);
        // The CRM takes the Company name from Lead Object
        setCompanyName(lead.getCompanyName());
        // The CRM prompts user for the industry, number of employees, city, and country of Mike’s company.
        setIndustry(industry);
        setEmployeeCount(employeeCount);
        setCity(city);
        setCountry(country);
        // The CRM adds the Contact to the contactList of the Account and the new Opportunity to the opportunityList of the Account.
        addContactToList(contact);
        addOpportunityToList(opportunity);
    }

    // Methods

    public static void addAccountToList(Account account){
        allAccounts.add(account);
    }

    public void addContactToList(Contact contact) {
        contactList.add(contact);
    }

    public void addOpportunityToList(Opportunity opportunity) {
        opportunityList.add(opportunity);
    }

    // Getters and setters

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Industry getIndustry() {
        return this.industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public int getEmployeeCount() {
        return this.employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static List<Item> getAllAccounts() {
        return allAccounts;
    }

    public List<Contact> getContactList() {
        return this.contactList;
    }

    public List<Opportunity> getOpportunityList() {
        return this.opportunityList;
    }

    @Override
    public String toString() {
        return "=== Account" + getId() + " ===" + '\n' +
                "· industry : " + industry + '\n' +
                "· employeeCount : " + employeeCount + '\n' +
                "· city : " + city + '\n' +
                "· country : " + country + '\n';
    }
}
