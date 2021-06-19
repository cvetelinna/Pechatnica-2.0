package com.company;

public enum EmployeeType {
    WORKER(1), BOSS(2);

    private int numVal;

    EmployeeType(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
