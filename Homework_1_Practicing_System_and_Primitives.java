/*
 * This code is for the first homework. It will complete three tasks that include ASCII art, computing code, and an adaptable computing code. :3
 */


public class Homework_1_Practicing_System_and_Primitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Task 1: Print my name, Ella, with the letter O in ASCII art. 
		System.out.println("OOOOOO   O      O        O");
		System.out.println("O        O      O       O O");
		System.out.println("OOOOOO   O      O      OOOOO");
		System.out.println("O        O      O      O   O");
		System.out.println("OOOOOO   OOOO   OOOO   O   O");
		
		System.out.println(" ");
		
		// Task 2: Write a statement that prints the given equation 
		
		System.out.println((6.0 * 3.5 - 1.5 * 5)/(55.6 - 30.2));
		
		System.out.println(" ");
		
		// Task 3: Write adaptable code that prints the circumference and area of a circle with a radius of 4.0
		
		final double pi = 3.1519 ;
		double rad = 4.0;
		double cir = 2.0 * pi * rad;
		double area = pi * (rad * rad);
		
		System.out.print("The circumference of the circle is " + cir + " and the area of the circle is " + area + ".");
		
		
	}

}
