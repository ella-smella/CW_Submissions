/**
 * This code is for Circle Objects. This class is made for the Shapes Project. 
 * It has data attributes for a circle, a constructor for circle objects, and 
 * various methods that calculate and/or print circle statistics. 
 */

public class Circle {
	
	//Data Attributes of pi and radius
	
	private final double pi = 3.14;
	private double radius;
	
	
	//Constructor for Circle
	
	/**
	 * Creates a circle object when given radius 
	 * @param r radius of circle
	 */
	public Circle(double r)
	{
		//Sets radius as r for parameters 
		radius = r;
	}
	
	
	//Functionality
	
	/**
	 * Sets radius
	 * @param r radius of circle
	 */
	public void setRadius(double r)
	{
		radius = r;
	}
	
	/**
	 * @return Radius of Circle Object
	 */
	public double getRadius()
	{
		//Returns radius
		return radius;
	}
	
	/**
	 * @return Diameter of Circle Object
	 */
	public double getDiameter()
	{
		//Calculates and returns diameter 
		return (radius * 2);
	}
	
	/**
	 * @return Circumference of Circle Object
	 */
	public double getCircumference()
	{
		//Calculates and returns circumference 
		return (2 * pi * radius);
	}
	
	/**
	 * @return Area of Circle Object
	 */
	public double getArea()
	{
		//Calculates and returns area
		return (pi * (radius * radius));
	}
	
	/**
	 * @return Returns the shape: Circle
	 */
	public static String getShape()
	{
		//Returns the word Circle
		return "Circle";
	}
	
	
}
