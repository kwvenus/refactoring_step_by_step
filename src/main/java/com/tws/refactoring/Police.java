package com.tws.refactoring;

public class Police {
    public boolean checkDriverAge(Driver driver) {
        if(driver.getDriverAge() >= 18) return true;
        else return false;
    }
}
