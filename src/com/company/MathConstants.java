package com.company;

public enum MathConstants {
    PI(3.22, 3.45, 3.14), // PI constant
    C(1.12, 0.916, 0.873), // Catalan's constant
    K(2.685, 4.2, 9.66), // Khinchin's constant
    F(2.80777, 0.75, 10.227), // Fransen–Robinson constant
    Omega(0.95, 1.33, 0.567); //Omega constant

    private final double firstNumber;
    private final double secondNumber;
    private final double thirdNumber;

    MathConstants(double firstNumber, double secondNumber, double thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }
    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public double getThirdNumber() {
        return thirdNumber;
    }
}
