/**
 * This code is for Sphere Objects. This class is made for the Shapes Project. 
 * It has data attributes for a sphere, a constructor for sphere objects, and 
 * various methods that calculate and/or print sphere statistics. 
 */

public class Sphere {

	//Data Attributes of pi and radius
	
	private final double pi = 3.14;
	private double radius;
	
	//Constructors for Sphere
	
	/**
	 * Creates a sphere object when given radius
	 * @param r radius of sphere
	 */
	public Sphere(double r)
	{
		//Sets radius as r for parameters
		radius = r;
	}
	
	//Functionality
	
	/**
	 * @return Radius of Sphere Object
	 */
	public double getRadius()
	{
		//Returns radius
		return radius;
	}
	
	/**
	 * @return Diameter of Sphere Object
	 */
	public double getDiameter()
	{
		//Calculates and returns diameter
		return (radius * 2);
	}
	
	/**
	 * @return Volume of Sphere Object
	 */
	public double getVolume()
	{
		//Calculates and returns volume
		return (((double)4/3) * pi * (radius * radius * radius));
	}
	
	/**
	 * @return Surface Area of Sphere Object
	 */
	public double getSurfaceArea()
	{
		//Calculates and returns surface area
		return (4 * pi * (radius * radius));
	}
	
	/**
	 * @return Returns the shape: Sphere
	 */
	public static String getShape()
	{
		//Returns the word Sphere
		return "Sphere";
	}
}
