/**
 * This code is for Sphere Objects. This class is made for the Shapes Project. 
 * It has data attributes for an isosceles triangle, a constructor for isosceles triangle objects, and 
 * various methods that calculate and/or print isosceles triangle statistics. 
 */

public class Triangle {

	//Data Attributes of base and height
	
	private double base;
	private double height;
	private double side;
	
	
	//Constructors for Isosceles Triangle
	
	/**
	 * Creates an isosceles trangle object when given the base, height, and side length
	 * @param b base of triangle
	 * @param h height of triangle
	 * @param s side lenght of triangle
	 */
	public Triangle(double b, double h, double s)
	{
		//Sets base as b, height as h, and side length as s for parameters 
		base = b;
		height = h;
		side = s;
	}
	
	
	//Functionality 
	
	/**
	 * @return Base Length of Triangle Object
	 */
	public double getBase() 
	{
		//Returns base length
		return base;
	}
	
	/**
	 * @return Height of Triangle Object
	 */
	public double getHeight()
	{
		//Returns height
		return height;
	}
	
	/**
	 * @return Side Length of Triangle Object
	 */
	public double getSide()
	{
		//Returns side length
		return side;
	}
	
	/**
	 * @return Perimeter of Triangle Object
	 */
	public double getPerimeter()
	{
		//Calculates and returns perimeter of the triangle
		return ((2 * side) + base);
	}
	
	/**
	 * @return Area of Triangle Object
	 */
	public double getArea()
	{
		//Calculates and returns area of the triangle
		return ((base * height) / 2);
	}
	
	/**
	 * @return Returns the shape: Isosceles Triangle
	 */
	public static String getShape()
	{
		//Returns the words Isosceles Triangle
		return "Isosceles Triangle";
	}
}
