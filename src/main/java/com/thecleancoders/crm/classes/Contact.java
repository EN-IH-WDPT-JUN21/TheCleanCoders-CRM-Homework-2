package com.thecleancoders.crm.classes;

public class Contact {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Lead lead;

    public Contact(Lead lead) {
        // The new Contact object will have the same name, phoneNumber and emailAddress as the Lead from which
        // it comes to existence, using it's getters
        this.name = lead.getName();
        this.phoneNumber = lead.getPhoneNumber();
        this.emailAddress = lead.getEmailAddress();
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
