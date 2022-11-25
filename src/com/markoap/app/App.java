package com.markoap.app;

import java.math.MathContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PiCalculator pi = new PiCalculator();
		PiCalculatorUnlimited piu = new PiCalculatorUnlimited();
		MathContext mc = new MathContext(40);
		
		/*
		for(int i = 0; i < 100; i++) {
			System.out.println("Calculating to the " + i + ". term. Pi: " + pi.calculatePi(i) + ". Term: " + pi.getLastCalculatedTerm()
			+ ". Absolute error: " + pi.getCurrentPiAbsoluteError() + ". Relative error: "+ pi.getCurrentPiRelativeError() + ".");
			System.out.println("Calculating to the " + i + ". term. Pi: " + piu.calculatePi(i, mc).toString() + ". Term: "
					+ piu.getLastCalculatedTerm(mc).toString() + ". Absolute error: " + piu.getCurrentPiAbsoluteError(mc).toString()
					+ ". Relative error: " + piu.getCurrentPiRelativeError(mc).toString() + ".");
		}
		*/
		
		
		System.out.println("Calculating to the " + 51 + ". term. Pi: " + piu.calculatePi(51, mc).toString() + ". Term: "
				+ piu.getLastCalculatedTerm(mc).toString() + ". Absolute error: " + piu.getCurrentPiAbsoluteError(mc).toString()
				+ ". Relative error: " + piu.getCurrentPiRelativeError(mc).toString() + ".");
		
		
		/*
		String sPi = piu.calculatePi(10000, mc).toString();
		String sPi1 = sPi.substring(0, 2500);
		String sPi2 = sPi.substring(2500, sPi.length());
		
		String sLCT = piu.getLastCalculatedTerm(mc).toString();
		String sLCT1 = sLCT.substring(0, sLCT.length()/2);
		String sLCT2 = sLCT.substring(sLCT.length()/2, sLCT.length());
		
		String sAE = piu.getCurrentPiAbsoluteError(mc).toString();
		String sAE1 = sAE.substring(0, sAE.length()/2);
		String sAE2 = sAE.substring(sAE.length()/2, sAE.length());
		
		String sRE = piu.getCurrentPiRelativeError(mc).toString();
		String sRE1 = sRE.substring(0, sRE.length()/2);
		String sRE2 = sRE.substring(sRE.length()/2, sRE.length());
		
		System.out.println("Calculating to the " + 10000 + ". term.");
		
		System.out.print("Pi: " + sPi1);
		System.out.println(sPi2);
		
		System.out.print("Term: " + sLCT1);
		System.out.println(sLCT2);
		
		System.out.print("Absolute error: " + sAE1);
		System.out.println(sAE2);
		
		System.out.print("Relative error: " + sRE1);
		System.out.println(sRE2);
		*/
	}

}
