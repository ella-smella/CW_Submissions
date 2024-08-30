/*
 * This code is an adaptable calculator of the surface 
 * area and volume of a cube when given the side and 
 * prints the information. :3
 */

public class Intro_Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Declaring Side
		double side;
		side = 3.1;
		
//Calculating Surface Area and Volume
		double surfaceArea = 6 * (side * side);
		
		double volume = side * side * side; 
		
//Printing Values
		System.out.print("With a cube with a side length of " + (int)side + ", its surface area is " + (int)surfaceArea + " and the volume is " + (int)volume + ".");
		
		
	}

}
