/**
 * This code is for Cylinder Objects. This class is made for the Shapes Project. 
 * It has data attributes for a cylinder, a constructor for cylinder objects, and 
 * various methods that calculate and/or print cylinder statistics. 
 */

public class Cylinder {

	//Data Attributes of height, radius, and pi
	
	private final double pi = 3.14;
	private double height;
	private double radius;
	
	//Constructors for Cylinder 
	
	/**
	 * Creates a cylinder object when given height and radius
	 * @param h height of cylinder
	 * @param r radius of cylinder
	 */
	public Cylinder(double h, double r)
	{
		//Sets height as h and radius as r for parameters
		height = h;
		radius = r;
	}
	
	//Functionality
	
	/**
	 * @return Height of Cylinder Object
	 */
	public double getHeight()
	{
		//Returns height
		return height;
	}
	
	/**
	 * @return Radius of Cylinder Object
	 */
	public double getRadius()
	{
		//Returns radius
		return radius;
	}
	
	/**
	 * @return Volume of Cylinder Object
	 */
	public double getVolume()
	{
		//Calculates and returns volume of the cylinder
		return (pi * (radius * radius) * height);
	}
	
	/**
	 * @return Surface Area of Cylinder Object
	 */
	public double getSurfaceArea()
	{
		//Calculates and returns surface area of the cylinder
		return ((2 * pi * radius * height) + (2 * pi * (radius * radius)));
	}
	
	/**
	 * @return Lateral Surface Area of Cylinder Object
	 */
	public double getLateralSurfaceArea()
	{
		//Calculates and returns lateral surface area of the cylinder
		return (2 * pi * radius * height);
	}
	
	/**
	 * @return Returns the shape: Cylinder
	 */
	public static String getShape()
	{
		//Returns the word Cylinder
		return "Cylinder";
	}
	
	
}
