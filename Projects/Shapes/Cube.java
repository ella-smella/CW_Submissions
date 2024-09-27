/**
 * This code is for Cube Objects. This class is made for the Shapes Project. 
 * It has data attributes for a cube, a constructor for cube objects, and 
 * various methods that calculate and/or print cube statistics. 
 */

public class Cube {

	//Data Attributes of side
	
	public void setSide(double side) 
	{
		this.side = side;
	}

	private double side;
	
	
	//Constructor for Cube
	
	/**
	 * Creates a cube object when given the length of a side 
	 * @param s side length of cube
	 */
	public Cube(double s)
	{
		//Sets side as s for parameters 
		side = s;
	}
	
	
	//Functionality
	
	/**
	 * @return Side Length of Cube Object
	 */
	public double getSide()
	{
		//Returns side length
		return side;
	}
	
	/**
	 * @return Perimeter of Cube Object
	 */
	public double getPerimeter()
	{
		//Calculates and returns perimeter of the cube
		return (12 * side);
	}
	
	/**
	 * @return Volume of Cube Object
	 */
	public double getVolume()
	{
		//Calculates and returns volume of the cube
		return (side * side * side);
	}
	
	/**
	 * @return Area of one of the Faces of the Cube Object
	 */
	public double getFaceArea()
	{
		//Calculates and returns a face area of the cube 
		return (side * side);
	}
	
	/**
	 * @return Returns the shape: Cube
	 */
	public static String getShape()
	{
		//Returns the word Cube
		return "Cube";
	}
}
