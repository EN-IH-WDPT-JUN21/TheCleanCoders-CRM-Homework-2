package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.enums.Command;
import com.thecleancoders.crm.enums.ObjectType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {
    static Input input;

    @BeforeAll
    static void setUp() {
        input = new Input(new Printer());
    }

    @Test
    void getCommandFromString() {
        assertEquals(Command.SHOW, input.getCommandFromString("SHOW"));
        assertEquals(Command.SHOW, input.getCommandFromString("show"));
        assertNull(input.getCommandFromString("abc"));
    }

    @Test
    void getObjectTypeFromStringSingular() {
        assertEquals(ObjectType.ACCOUNT, input.getObjectTypeFromStringSingular("ACCOUNT"));
        assertEquals(ObjectType.ACCOUNT, input.getObjectTypeFromStringSingular("account"));
        assertNull(input.getObjectTypeFromStringSingular("abc"));
    }

    @Test
    void getObjectTypeFromStringPlural() {
        assertEquals(ObjectType.ACCOUNT, input.getObjectTypeFromStringPlural("ACCOUNTS"));
        assertEquals(ObjectType.ACCOUNT, input.getObjectTypeFromStringPlural("accounts"));
        assertNull(input.getObjectTypeFromStringPlural("abc"));
    }
}