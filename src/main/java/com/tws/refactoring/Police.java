package com.tws.refactoring;

public class Police {
    public boolean checkDriverAge(Driver driver) {
        final int validDriverAge = 18;
        boolean driverAgeValid = false;

        if(driver.getDriverAge() >= validDriverAge){
            driverAgeValid = true;
        }
        return driverAgeValid;
    }
}
