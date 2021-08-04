package com.thecleancoders.crm.menu;

import org.apache.commons.validator.routines.EmailValidator;


public class Validator {

    public static boolean isPhoneNumberValid(String phoneNumber){
        boolean result = false;
        if (phoneNumber.matches("\\d{9}") || phoneNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}")) {
            result = true;
        } else {
            throw new IllegalArgumentException("The phone number must have 9 digits");
        }
        return result;
    }

    public static boolean isEmailValid(String email){
        boolean result = false;
        if(EmailValidator.getInstance().isValid(email)){
            result = true;
        } else {
            throw new IllegalArgumentException("The email address format is not valid.");
        }
        return result;
    }

    public static boolean isStringValid(String string){
        boolean result = false;
        if(string.length() > 1 && string.length() < 35 && string.matches("[a-zA-Z0-9]+")){
            result = true;
        } else {
            throw new IllegalArgumentException("Not a valid input.");
        }
        return result;
    }

}
