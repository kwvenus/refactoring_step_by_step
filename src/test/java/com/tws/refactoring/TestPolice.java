package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestPolice {

    @Test
    public void testPolice_CheckDriverFunction() {
        Police police = new Police();
        boolean driverShouldValid = police.checkDriverAge(new Driver(18));
        boolean driverShouldNotValid = police.checkDriverAge(new Driver(17));
        assertTrue(driverShouldValid);
        assertFalse(driverShouldNotValid);
    }
}