package com.tws.refactoring;

public class Police {
    public boolean checkDriverAge(Driver driver) {
        final int validDriverAge = 18;

        if(driver.getDriverAge() >= validDriverAge) return true;
        else return false;
    }
}
