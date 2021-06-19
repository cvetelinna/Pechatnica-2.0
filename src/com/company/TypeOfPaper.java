package com.company;

public enum TypeOfPaper {
    NEWSPAPER(0.01), MAGAZINE(0.03), STANDARD(0.02);

    private double numVal;

    TypeOfPaper(double numVal) {
        this.numVal = numVal;
    }

    public double getNumVal() {
        return numVal;
    }

}
