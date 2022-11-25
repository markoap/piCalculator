package com.markoap.app;

public class PiCalculator {
	private double piOverTwelve;
	private long currentTermNumber;
	private double currentTerm;
	private double currentCoefficientNumerator;
	private double currentCoefficientDenominator;
	private double currentTermDenominatorPartOne;
	private double currentTermDenominatorPartTwo;
	private boolean isTermOdd;
	private final double squareRootOfThreeOverEight = 1.7320508075688772935274463d/8.0d;
	
	public PiCalculator() {
		super();
		piOverTwelve = 0.5d - squareRootOfThreeOverEight;
		currentTermNumber = 1;
		currentTerm = 0.0d;
		currentCoefficientNumerator = 1.0d;
		currentCoefficientDenominator = 1.0d;
		currentTermDenominatorPartOne = 1.0d;
		currentTermDenominatorPartTwo = 2.0d;
		isTermOdd = true;
	}

	public double calculatePi(int numberOfTerms) {
		for(;currentTermNumber <= numberOfTerms; currentTermNumber++) {
			currentCoefficientNumerator *= 0.5d - (double)currentTermNumber + 1.0d;
			currentCoefficientDenominator *= (double)currentTermNumber;
			currentTermDenominatorPartOne += 2;
			currentTermDenominatorPartTwo *= 4;
			currentTerm = (currentCoefficientNumerator / currentCoefficientDenominator) * (1.0d / currentTermDenominatorPartOne)
					* (1.0d / currentTermDenominatorPartTwo);
			if(isTermOdd) {
				piOverTwelve -= currentTerm;
				isTermOdd = false;
			}else {
				piOverTwelve += currentTerm;
				isTermOdd = true;
			}
		}
		return getPi();
	}
	
	public double getLastCalculatedTerm() {
		return Math.abs(currentTerm);
	}
	
	public double getCurrentPiRelativeError() {
		return getCurrentPiAbsoluteError()/Math.PI;
	}
	
	public double getCurrentPiAbsoluteError() {
		return Math.abs(Math.PI - getPi());
	}
	
	public double getPi() {
		return piOverTwelve*12.0d;
	}
}
