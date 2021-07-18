package com.thecleancoders.crm.classes;

import com.thecleancoders.crm.enums.Industry;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private static int index = 0;
    private int accountId;
    private String companyName;
    private Industry industry;
    private int employeeCount;
    private String city;
    private String country;
    private List<Contact> contactList = new ArrayList<>();
    private List<Opportunity> opportunityList = new ArrayList<>();

    // Constructor

    public Account(Lead lead, Contact contact, Opportunity opportunity, Industry industry, int employeeCount, String city, String country) {
        index++;
        setAccountId(index);
        // The CRM takes the Company name from Lead Object
        setCompanyName(lead.getCompanyName());
        // The CRM prompts user for the industry, number of employees, city, and country of Mike’s company.
        setIndustry(industry);
        setEmployeeCount(employeeCount);
        setCity(city);
        setCountry(country);
        // The CRM adds the Contact to the contactList of the Account and the new Opportunity to the opportunityList of the Account.
        this.contactList.add(contact);
        this.opportunityList.add(opportunity);
    }

    // getters and setters
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) { this.accountId = accountId; }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<Opportunity> getOpportunityList() {
        return opportunityList;
    }

    public void setOpportunityList(List<Opportunity> opportunityList) {
        this.opportunityList = opportunityList;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", industry=" + industry +
                ", employeeCount=" + employeeCount +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
