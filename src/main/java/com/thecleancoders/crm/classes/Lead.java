package com.thecleancoders.crm.classes;

import com.thecleancoders.crm.enums.Product;

import java.util.ArrayList;
import java.util.List;

public class Lead {
    private static int index = 0;
    private int leadId;
    private String name;
    private String phoneNumber;
    private String email;
    private String companyName;
    private static List<Lead> allLeads = new ArrayList<>();

    //constructor

    public Lead(String name, String phoneNumber, String email, String companyName) {
        index++;
        this.leadId = index;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.companyName = companyName;
    }

    //getters and setters

    public int getLeadId() {
        return leadId;
    }

    public void setLeadId(int leadId) {
        this.leadId = leadId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Lead> getLeadsList() {
        return allLeads;
    }

    public void setLeadsList(List<Lead> leadsList) {
        this.allLeads = leadsList;
    }

    public static void showLeads(){}

    public static void lookUpLeadId(int leadId){}

    public static void convertToOpportunity(Product product, int quantity){}

    public static void remove(){}


    @Override
    public String toString() {
        return "Lead{" +
                "leadId=" + leadId +
                ", name=" + name +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }


}
