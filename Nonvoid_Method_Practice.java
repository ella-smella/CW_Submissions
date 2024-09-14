/*
 * This code is for the Nonvoid Method Practice assignment! It will create a few methods 
 * that return various data types which will be printed to the console through the main method. 
 * The first set of methods will return certain characteristics of mine.
 * The second set of methods will return statistics of a circle.
 * The third set of methods will return some math stuff. :3
 */
public class Nonvoid_Method_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task 1 Printing Called Methods
		System.out.println(stateName());
		System.out.println(stateHairStyle());
		System.out.println(stateFavoriteFood());
		System.out.println(" ");
		
		//Task 2 Printing Called Methods
		double radius = 4.0;
		System.out.println("If a circle has a radius of " + radius + ", its diameter is " + calcDiameter(radius) + ".");
		System.out.println("Its circumference will be " + calcCircumference(radius));
		System.out.println("Its area is " + calcArea(radius));
		System.out.println(" ");
		
		//Task 3 Printing Called Methods
		int numOne = 4;
		int numTwo = 2;
		System.out.println("When given the numbers " + numOne + " and " + numTwo + ", the sum is " + calcAddition(numOne, numTwo) + ".");
		System.out.println("Its difference would be " + calcSubtraction(numOne, numTwo) + ".");
		System.out.println("Its product would be " + calcProduct(numOne, numTwo) + ".");
		System.out.println("Its quotient would be " + calcQuotient(numOne, numTwo) + " and its remainder would be " + calcRemainder(numOne, numTwo) + ".");
		
	}
	
	
// Task 1: Name and personal characteristics 
	
	/**
	 * Returns my name
	 */
	public static String stateName()
	{
		return "My name is Ella Dumbrique! :3";
	}
	
	/**
	 * Returns my eye color
	 */
	public static String stateEyeColor()
	{
		return "My eye color is a dark brown. I got them asian eyes X3";
	}
	
	/**
	 * Returns my hair style
	 */
	public static String stateHairStyle()
	{
		return "My hair style is a grown out, dark brown bixie. Although my hair is naturally straight, I curl my hair a bit each morning! ^u^";
	}
	
	/**
	 * Returns my best friend
	 */
	public static String stateBestFriend()
	{
		return "My best friend is my pookie wookie baby girl, Lyzelle Ronduen! <3 (Screw Keola)";
	}
	
	/**
	 * Returns my favorite food
	 */
	public static String stateFavoriteFood()
	{
		return "My favorite food is sinigang TwT";
	}
	
// Task 2: Calculates the radius, diameter, circumference, and area of a circle when given its radius
	/**
	 * Calculates circle diameter and returns  
	 */
	public static double calcDiameter(double radius)
	{
		return (radius * 2);
	}
	
	/**
	 * Calculates circle circumference and returns  
	 */
	public static double calcCircumference(double radius)
	{
		final double pi = 3.1415;
		return (radius * 2 * pi);
	}
	
	/**
	 * Calculates circle area and returns  
	 */
	public static double calcArea(double radius)
	{
		final double pi = 3.1415;
		return (pi * (radius * radius));
	}
	

	
// Task 3: Calculates the sum, difference, product, quotient, and the remainder of two given integers 
	/**
	 * Calculates addition
	 */
	public static int calcAddition(int numOne, int numTwo)
	{
		return (numOne + numTwo);
	}
	
	/**
	 * Calculates subtraction
	 */
	public static int calcSubtraction(int numOne, int numTwo)
	{
		return (numOne - numTwo);
	}
	
	/**
	 * Calculates product
	 */
	public static int calcProduct(int numOne, int numTwo)
	{
		return (numOne * numTwo);
	}
	
	/**
	 * Calculates quotient
	 */
	public static int calcQuotient(int numOne, int numTwo)
	{
		return (numOne / numTwo);
	}
	
	/**
	 * Calculates remainder
	 */
	public static int calcRemainder(int numOne, int numTwo)
	{
		return (numOne % numTwo);
	}
	
}
