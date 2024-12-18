/**
 * This class is for creating Food objects for Room 16
 * Data attributes inheret to objects are whether they've been ordered and their name. Getters are made for both of these
 * A setter is made for the ordered boolean. There is also a method that prints out the name of the food if it can be ordered (aka hasn't been ordered yet)
 */
public class Food {

	//Data Attributes for foods
	private boolean wasOrdered;
	private String foodName;
	
	//Constructor for NPCs
	/**
	 * Creates a new Food object for all the foods 
	 * @param ordered passed boolean of whether the food has been ordered or not
	 * @param name passed String that is the name of the food 
	 */
	public Food(boolean ordered, String name)
	{
		//Sets the inherent data attributes equal to what is passed through the method 
		wasOrdered = ordered;
		foodName = name;
	}

	/**
	 * Getter to return the ordered status of the food 
	 * @return returns whether the food was ordered (true) or not (false)
	 */
	public boolean foodOrdered() 
	{
		//returns the ordered status of the food
		return wasOrdered;
	}

	/**
	 * Setter to change the food's ordered status and return it
	 * @param ordered the passed boolean that will become the food's ordered status 
	 * @return returns whether the food was ordered (true) or not (false)
	 */
	public boolean foodOrdered(boolean ordered) 
	{
		//sets the ordered status of the food to the passed boolean and returns it 
		wasOrdered = ordered;
		return wasOrdered;
	}
	
	/**
	 * Getter to return the name of the food 
	 * @return returns the name of the food
	 */
	public String foodName() 
	{
		//returns the name of the food 
		return foodName;
	}
	
	/**
	 * Prints out the name of the food if the food can still be ordered 
	 * @param ordered passed boolean to check if the food hasn't been ordered 
	 * @param name passed String of the name of the food 
	 */
	public static void canOrder(boolean ordered, String name)
	{
		//if statement to check if the food has not been ordered
		if (ordered == false)
		{
			//Prints out the name of the food
			System.out.println(name);
		}
	}
}
