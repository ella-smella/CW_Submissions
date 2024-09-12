/*
 * This code is for the Methods Intro Practice assignment. It will create a few methods. 
 * The first set of methods will print certain characteristics of mine.
 * The second set of methods will print statistics of a circle.
 * The third set of methods will print some math stuff. :3
 */
public class Methods_Intro_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task 1 Called Methods
		stateName();
		stateHairStyle();
		stateFavoriteFood();
		
		//Task 2 Called Method
		printCircleStats(4.0);
		
		//Task 3 Called Method
		printMathStuffs(4, 2);
		
	}
	
	
// Task 1: Name and personal characteristics 
	
	/**
	 * States my name
	 */
	public static void stateName()
	{
		System.out.println("My name is Ella Dumbrique! :3");
	}
	
	/**
	 * States my eye color
	 */
	public static void stateEyeColor()
	{
		System.out.println("My eye color is a dark brown. I got them asian eyes X3");
	}
	
	/**
	 * States my hair style
	 */
	public static void stateHairStyle()
	{
		System.out.println("My hair style is a grown out, dark brown bixie. Although my hair is naturally straight, I curl my hair a bit each morning! ^u^");
	}
	
	/**
	 * States my best friend
	 */
	public static void stateBestFriend()
	{
		System.out.println("My best friend is my pookie wookie baby girl, Lyzelle Ronduen! <3 (Screw Keola)");
	}
	
	/**
	 * States my favorite food
	 */
	public static void stateFavoriteFood()
	{
		System.out.println("My favorite food is sinigang TwT");
	}
	
// Task 2: Calculates and prints the radius, diameter, circumference, and area of a circle when given its radius
	/**
	 * Prints and calculates circle statistics 
	 */
	public static void printCircleStats(double radius)
	{
		final double pi = 3.1415;
		
		//Calculates diameter 
		double diameter = radius * 2;
		
		//Calculates circumference 
		double circ = 2 * pi * radius;
		
		//Calculates area
		double area = pi * (radius * radius);
		
		//Printing 
		System.out.println("If a circle's radius is " + radius + ", then the diameter is " + diameter + ", the circumference is " + circ + ", and the area is " + area + ".");
	}
	
// Task 3: Calculates and prints the sum, difference, product, quotient, and the remainder of two given integers 
	/**
	 * Prints and calculates various math results 
	 */
	public static void printMathStuffs(int numOne, int numTwo)
	{
		//Sum
		int sum = numOne + numTwo;
		
		//Difference 
		int dif = numOne - numTwo;
		
		//Product
		int pro = numOne * numTwo;
		
		//Quotient
		int quo = numOne / numTwo; 
		
		//Remainder
		int rem = numOne % numTwo;
		
		//Printing 
		System.out.println("When given the number " + numOne + " and " + numTwo + ", the sum is " + sum +", the difference is " + dif + ", the product is " + pro + ", the quotient is " + quo + ", and the remainder of this quotient is " + rem + ".");
	}
	
}
