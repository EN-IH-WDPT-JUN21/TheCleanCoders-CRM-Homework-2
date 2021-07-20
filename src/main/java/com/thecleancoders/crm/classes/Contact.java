package com.thecleancoders.crm.classes;

import com.thecleancoders.crm.main.Main;

public class Contact {
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
    private Lead lead;

    public Contact(Lead lead) {
        //The id must be an increment of the last one created. Let's assume there is an ArrayList
        //of Contact Objects.So, the id of this object will be the id of the last object of the array
        // plus one.
        if (Main.contactsList.size() < 1) {
            this.id = 0;
        } else {
            this.id = Main.contactsList.get(Main.contactsList.size() - 1).getId() + 1;
        }
        // The new Contact object will have the same name, phoneNumber and emailAddress as the Lead from which
        // it comes to existence, using it's getters
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

