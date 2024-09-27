/**
 * This code is for the Shapes Project. It will print the mathematical statistics of six shapes.
 * One of the shapes will be a circle. The other five will be shapes of my choosing. 
 * The five shapes will be cubes, parallelograms, isosceles triangles, cylinders, and spheres. :3
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Circle Statistics (CLASSWORK) 
		//Creates Three Circle Objects by Calling Circle Constructors
		Circle circOne = new Circle(3.0);
		Circle circTwo = new Circle(20.0);
		Circle circThree = new Circle(-4.0);
		
		//Declaring Circle Shape and Printing
		String shape = Circle.getShape();
		System.out.println("The shape we are talking about is a " + shape);
		
		//Radius of Circles and Printing
		System.out.println ("The radius of Circle 1 is " + circOne.getRadius());
		System.out.println ("The radius of Circle 2 is " + circTwo.getRadius());
		System.out.println ("The radius of Circle 3 is " + circThree.getRadius());
		
		//Diameter of Circles and Printing
		System.out.println ("The diameter of Circle 1 is " + circOne.getDiameter());
		System.out.println ("The diameter of Circle 2 is " + circTwo.getDiameter());
		System.out.println ("The diameter of Circle 3 is " + circThree.getDiameter());
		
		
		//Circumference of Circles and Printing
		System.out.println ("The circumference of Circle 1 is " + circOne.getCircumference());
		System.out.println ("The circumference of Circle 2 is " + circTwo.getCircumference());
		System.out.println ("The circumference of Circle 3 is " + circThree.getCircumference());

		
		//Area of Circles and Printing
		System.out.println ("The area of Circle 1 is " + circOne.getArea());
		System.out.println ("The area of Circle 2 is " + circTwo.getArea());
		System.out.println ("The area of Circle 3 is " + circThree.getArea());
		
		//Create Space
		System.out.println(" ");

		
		//Cube Statistics 
		//Creates Three Cube Objects by Calling Cube Constructors
		Cube cubeOne = new Cube(3.0);
		Cube cubeTwo = new Cube(17.0);
		Cube cubeThree = new Cube(6.9);
		
		//Declaring Cube Shape and Printing
		shape = Cube.getShape();
		System.out.println("The shape we are talking about is a " + shape);

		//Side Length of Cubes and Printing
		System.out.println ("The side length of Cube 1 is " + cubeOne.getSide());
		System.out.println ("The side length of Cube 2 is " + cubeTwo.getSide());
		System.out.println ("The side length of Cube 3 is " + cubeThree.getSide());
		
		//Perimeter of Cubes and Printing
		System.out.println ("The perimeter of Cube 1 is " + cubeOne.getPerimeter());
		System.out.println ("The perimeter of Cube 2 is " + cubeTwo.getPerimeter());
		System.out.println ("The perimeter of Cube 3 is " + cubeThree.getPerimeter());
		
		//Volume of Cubes and Printing
		System.out.println ("The volume of Cube 1 is " + cubeOne.getVolume());
		System.out.println ("The volume of Cube 2 is " + cubeTwo.getVolume());
		System.out.println ("The volmue of Cube 3 is " + cubeThree.getVolume());
		
		//Face Area of Cubes and Printing
		System.out.println ("The area of a face of Cube 1 is " + cubeOne.getFaceArea());
		System.out.println ("The area of a face of Cube 2 is " + cubeTwo.getFaceArea());
		System.out.println ("The area of a face of Cube 3 is " + cubeThree.getFaceArea());
		
		//Create space
		System.out.println(" ");

		
		//Parallelogram Statistics
		//Creates Three Parallelogram Objects by Calling Parallelogram Constructors 
		Parallelogram paraOne = new Parallelogram(12.0, 6.0, 8.0);
		Parallelogram paraTwo = new Parallelogram(9.0, 6.0, 7.5);
		Parallelogram paraThree = new Parallelogram(4.0);
		
		//Declaring Parallelogram Shapes and Printing 
		shape = Parallelogram.getShape();
		System.out.println ("The shape we are talking about is a " + shape);
		
		//Base, Height, and Side Length of Parallelograms and Printing
		System.out.println ("The base of Parallelogram 1 is " + paraOne.getBase() + ", its height is " + paraOne.getHeight() + ", and its side length is " + paraOne.getSide());
		System.out.println ("The base of Parallelogram 2 is " + paraTwo.getBase() + ", its height is " + paraTwo.getHeight() + ", and its side length is " + paraTwo.getSide());
		System.out.println ("The base of Parallelogram 3 is " + paraThree.getBase() + ", its height is " + paraThree.getHeight() + ", and its side length is " + paraThree.getSide());

		//Perimeter of Parallelograms and Printing
		System.out.println ("The perimeter of Parallelogram 1 is " + paraOne.getPerimeter());
		System.out.println ("The perimeter of Parallelogram 2 is " + paraTwo.getPerimeter());
		System.out.println ("The perimeter of Parallelogram 3 is " + paraThree.getPerimeter());
		
		//Area of Parallelograms and Printing
		System.out.println ("The area of Parallelogram 1 is " + paraOne.getArea());
		System.out.println ("The area of Parallelogram 2 is " + paraTwo.getArea());
		System.out.println ("The area of Parallelogram 3 is " + paraThree.getArea());
		
		//All statistics and attributes of a Parallelogram in one method 
		System.out.println (paraOne.toString());

		
		//Create space
		System.out.println(" ");
		

		//Isosceles Triangles Statistics 
		//Creates Three Isosceles Triangle Objects by Calling Triangle Constructors 
		Triangle triOne = new Triangle(3.0, 5.0, 7.0);
		Triangle triTwo = new Triangle(6.0, 9.0, 14.0);
		Triangle triThree = new Triangle(8.0, 11.0, 16.0);
		
		//Declaring Isosceles Triangle Shape and Printing 
		shape = Triangle.getShape();
		System.out.println ("The shape we are talking about is an " + shape);
		
		//Base, Height, and Side Length of Triangles and Printing
		System.out.println ("The base of Triangle 1 is " + triOne.getBase() + ", its height is " + triOne.getHeight() + ", and its side length is " + triOne.getSide());
		System.out.println ("The base of Triangle 2 is " + triTwo.getBase() + ", its height is " + triTwo.getHeight() + ", and its side length is " + triTwo.getSide());
		System.out.println ("The base of Triangle 3 is " + triThree.getBase() + ", its height is " + triThree.getHeight() + ", and its side length is " + triThree.getSide());

		//Perimeter of Triangles and Printing
		System.out.println ("The perimeter of Triangle 1 is " + triOne.getPerimeter());
		System.out.println ("The perimeter of Triangle 2 is " + triTwo.getPerimeter());
		System.out.println ("The perimeter of Triangle 3 is " + triThree.getPerimeter());
		
		//Area of Parallelograms and Printing
		System.out.println ("The area of Triangle 1 is " + triOne.getArea());
		System.out.println ("The area of Triangle 2 is " + triTwo.getArea());
		System.out.println ("The area of Triangle 3 is " + triThree.getArea());

		//Create space
		System.out.println(" ");
		
		//Cylinder Statistics
		//Creates Three Cylinder Objects by Calling Cylinder Constructors
		Cylinder cylinOne = new Cylinder (7.2, 2.0);
		Cylinder cylinTwo = new Cylinder (15.8, 4.2);
		Cylinder cylinThree = new Cylinder (33, 5.5);
		
		//Declaring Cylinder Shape and Printing
		shape = Cylinder.getShape();
		System.out.println ("The shape we are talking about is a " + shape);
		
		//Height and Radius of Cylinders and Printing
		System.out.println ("The height of Cylinder 1 is " + cylinOne.getHeight() + " and its radius is " + cylinOne.getRadius());
		System.out.println ("The height of Cylinder 2 is " + cylinTwo.getHeight() + " and its radius is " + cylinTwo.getRadius());
		System.out.println ("The height of Cylinder 3 is " + cylinThree.getHeight() + " and its radius is " + cylinThree.getRadius());
		
		
		//Volume of Cylinders and Printing
		System.out.println ("The volume of Cylinder 1 is " + cylinOne.getVolume());
		System.out.println ("The volume of Cylinder 2 is " + cylinTwo.getVolume());
		System.out.println ("The volume of Cylinder 3 is " + cylinThree.getVolume());
		
		//Surface Area of Cylinders and Printing
		System.out.println ("The surface area of Cylinder 1 is " + cylinOne.getSurfaceArea());
		System.out.println ("The surface area of Cylinder 2 is " + cylinTwo.getSurfaceArea());
		System.out.println ("The surface area of Cylinder 3 is " + cylinThree.getSurfaceArea());
		
		//Lateral Surface Area of Cylinders and Printing
		System.out.println ("The lateral surface area of Cylinder 1 is " + cylinOne.getLateralSurfaceArea());
		System.out.println ("The lateral surface area of Cylinder 2 is " + cylinTwo.getLateralSurfaceArea());
		System.out.println ("The lateral surface area of Cylinder 3 is " + cylinThree.getLateralSurfaceArea());

		//Create space
		System.out.println(" ");

		//Sphere Statistics
		//Creates Three Sphere Objects by Calling Sphere Constructors
		Sphere sphereOne = new Sphere(76.8);
		Sphere sphereTwo = new Sphere(3.6);
		Sphere sphereThree = new Sphere(17.3);
		
		//Declaring Sphere Shape and Printing
		shape = Sphere.getShape();
		System.out.println ("The shape we are talking about is a " + shape);
		
		//Radius of Spheres and Printing
		System.out.println ("The radius of Sphere 1 is " + sphereOne.getRadius());
		System.out.println ("The radius of Sphere 2 is " + sphereTwo.getRadius());
		System.out.println ("The radius of Sphere 3 is " + sphereThree.getRadius());

		//Diameter of Spheres and Printing
		System.out.println ("The diameter of Sphere 1 is " + sphereOne.getDiameter());
		System.out.println ("The diameter of Sphere 2 is " + sphereTwo.getDiameter());
		System.out.println ("The diameter of Sphere 3 is " + sphereThree.getDiameter());

		//Volume of Spheres and Printing
		System.out.println ("The volume of Sphere 1 is " + sphereOne.getVolume());
		System.out.println ("The volume of Sphere 2 is " + sphereTwo.getVolume());
		System.out.println ("The volume of Sphere 3 is " + sphereThree.getVolume());
		
		//Surface Area of Spheres and Printing
		System.out.println ("The surface area of Sphere 1 is " + sphereOne.getSurfaceArea());
		System.out.println ("The surface area of Sphere 2 is " + sphereTwo.getSurfaceArea());
		System.out.println ("The surface area of Sphere 3 is " + sphereThree.getSurfaceArea());


	}

}
