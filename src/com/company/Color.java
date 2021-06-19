package com.company;

public enum Color {
    COLORFUL(1), BLACKWHITE(3);

    private double numVal;

    Color(double numVal) {
        this.numVal = numVal;
    }

    public double getNumVal() {
        return numVal;
    }
}
