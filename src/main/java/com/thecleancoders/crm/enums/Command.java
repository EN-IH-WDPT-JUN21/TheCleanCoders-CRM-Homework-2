package com.thecleancoders.crm.enums;

public enum Command {
    NEW("NEW"),
    SHOW("SHOW"),
    LOOKUP("LOOKUP"),
    CONVERT("CONVERT"),
    CLOSE_LOST("CLOSE-LOST"),
    CLOSE_WON("CLOSE-WON"),
    OPEN("OPEN"),
    EXIT("EXIT");

    private String expectedInput;

    Command(String expectedInput) {
        this.expectedInput = expectedInput;
    }

    public String getExpectedInput() {
        return expectedInput;
    }
}