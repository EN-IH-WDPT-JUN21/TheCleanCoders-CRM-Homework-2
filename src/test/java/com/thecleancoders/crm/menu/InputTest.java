package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.enums.Command;
import com.thecleancoders.crm.enums.ObjectTypes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {
    static Input input;

    @BeforeAll
    static void setUp() {
        input = new Input();
    }

    @Test
    void getCommandFromString() {
        assertEquals(Command.SHOW, input.getCommandFromString("SHOW"));
        assertEquals(Command.SHOW, input.getCommandFromString("show"));
        assertNull(input.getCommandFromString("abc"));
    }

    @Test
    void getObjectTypeFromStringSingular() {
        assertEquals(ObjectTypes.ACCOUNT, input.getObjectTypeFromStringSingular("ACCOUNT"));
        assertEquals(ObjectTypes.ACCOUNT, input.getObjectTypeFromStringSingular("account"));
        assertNull(input.getObjectTypeFromStringSingular("abc"));
    }

    @Test
    void getObjectTypeFromStringPlural() {
        assertEquals(ObjectTypes.ACCOUNT, input.getObjectTypeFromStringPlural("ACCOUNTS"));
        assertEquals(ObjectTypes.ACCOUNT, input.getObjectTypeFromStringPlural("accounts"));
        assertNull(input.getObjectTypeFromStringPlural("abc"));
    }
}