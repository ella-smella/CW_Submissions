/**
 * This code is for Parallelogram Objects. This class is made for the Shapes Project. 
 * It has data attributes for a parallelogram, a constructor for parallelogram objects, and 
 * various methods that calculate and/or print parallelogram statistics. 
 */
public class Parallelogram {

	//Data Attributes of base, side length, and height
	
	private double base;
	private double side; 
	private double height;
	
	
	//Contructor for Parallelogram
	
	/**
	 * Creates a parallelogram object when given the base, side length, and height
	 * @param b base length of parallelogram
	 * @param s side length of parallelogram
	 * @param h height of parallelogram
	 */
	public Parallelogram(double b, double s, double h)
	{
		//Sets base as b, side as s, and height as h for parameters 
		base = b;
		side = s;
		height = h;
	}
	
	/**
	 * Creates a parallelogram object when given the same length for all sides 
	 * @param l length of all sides 
	 */
	public Parallelogram(double l)
	{
		//Sets base, side, and height as l for parameters 
		base = l;
		side = l;
		height = l;
	}
	
	//Functionality
	
	/**
	 * @return Base Length of Parallelogram Object
	 */
	public double getBase()
	{
		//Returns base length
		return base;
	}
	
	/**
	 * @return Side Length of Parallelogram Object
	 */
	public double getSide()
	{
		//Returns side length
		return side;
	}
	
	/**
	 * @return Height of Parallelogram Object
	 */
	public double getHeight()
	{
		//Returns height
		return height;
	}
	
	/**
	 * @return Perimeter of Parallelogram Object
	 */
	public double getPerimeter()
	{
		//Calculates and returns perimeter of the parallelogram
		return 2 * (base + side);
	}
	
	/**
	 * @return Area of Parallelogram Object
	 */
	public double getArea()
	{
		//Calculates and returns area of the parallelogram
		return (base * height);
	}
	
	/**
	 * @return Returns the shape: Parallelogram
	 */
	public static String getShape()
	{
		//Returns the word Parallelogram
		return "Parallelogram";
	}
	
	/**
	 * This turns everything about the parallelogram object into a String
	 */
	public String toString()
	{
		//All parallelogram statistics printed as one String
		return "Parallelogram 1 is a " + getShape() + " with a base of " + base + ", side length of " + side + ", height of " + height 
				+ ", perimeter of " + getPerimeter() + ", and an area of " + getArea();
	}
}
