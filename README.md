# piCalculator
A calculator for pi based on Newton's algorithm

-PiCalculator and PiCalculatorUnlimited classes basically do the same thing but PiCalculator uses double to store values while PiCalculatorUnlimited uses BigDecimal to store values so the ultimate precision of the final value is not limited by the precision of double variables

-App.java contains the main method and some basic ways to test the workings of the pi calculator

-Huge walls of numbers are constants copied from WolframAlpha, one is pi and is only used for the purpose of determining how accurate is the value I get and another is a constant that needs to be calculated over and over so it's just stored there to (hopefully) make the algorithm run a bit faster

-Sorry for the code readability, nobody other than myself was originally meant to look at it
