package com.company;

public class Main {

    public static void main(String[] args) {
	    MathConstants newPI = MathConstants.PI;
	    MathConstants newC = MathConstants.C;
	    MathConstants newK = MathConstants.K;
	    MathConstants newF = MathConstants.F;
	    MathConstants newOmega = MathConstants.Omega;
        System.out.println("The value of " + newPI + " is " + newPI.getThirdNumber());
		System.out.println("The value of " + newC + " is " + newC.getSecondNumber());
		System.out.println("The value of " + newK + " is " + newK.getFirstNumber());
		System.out.println("The value of " + newF + " is " + newF.getFirstNumber());
		System.out.println("The value of " + newOmega + " is " + newOmega.getThirdNumber());
    }
}
