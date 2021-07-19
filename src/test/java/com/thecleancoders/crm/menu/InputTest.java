package com.thecleancoders.crm.menu;

import com.thecleancoders.crm.enums.Command;
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
}