package com.thecleancoders.crm.classes;

import com.thecleancoders.crm.main.Main;

public class Contact {
    private static int index = 0;
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
    private Lead lead;

    public Contact(Lead lead) {
        index++;
        setId(index);
        this.name = lead.getName();
        this.phoneNumber = lead.getPhoneNumber();
        this.email = lead.getEmail();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setEmailAddress(String emailAddress) {
        this.email = email;
    }

}

