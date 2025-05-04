/**
 * This class is a superclass for Dog objects
 * It has age, name, and adoption status as data attributes 
 * The methods that come with this superclass is a getter for adoption status, 
 * a method that prints out the age and name of the dog, a method to increase the age of the dog,
 * an overrided toString method, and an overrided equals method 
 */
public class Dog {
	
	//DATA ATTRIBUTES
	protected int age;
	protected String name;
	protected boolean isAdopted; 
	
	//CONSTRUCTOR
	/**
	 * Constructor for the Dog objects
	 * haha made you look 
	 * @param a passed int that represents age
	 * @param name passed String that represents name
	 * @param ad passed boolean that represents adoption status
	 */
	public Dog(int a, String name, boolean ad)
	{
		//sets all the data attributes to the parameters 
		age = a;
		this.name = name;
		isAdopted = ad;
	}
	
	/**
	 * Getter for the Dog's adoption status
	 * @return returns the adoption status as a boolean 
	 */
	public boolean getAdoptionStatus()
	{
		//returns Dog's adoption status
		return isAdopted;
	}
	
	/**
	 * Prints out the name and age of the dog in years 
	 */
	public void stateAge()
	{
		//prints out Dog's name and age
		System.out.println(name + " is " + age + " years old! :3");
	}
	
	/**
	 * Increases the age of the Dog
	 */
	public void increaseAge()
	{
		//increases the dog's age by one 
		age++;
	}
	
	/**
	 * Override of the toString method that prints out the dog's name and age and returns their adoption status in a String statement
	 */
	public String toString()
	{
		//calls a method to state the name and age of the Dog in years
		stateAge();
		
		//if statement to check if the dog has been adopted
		if (isAdopted)
		{
			//returns a String saying they're adopted
			return "I have been chosen for a new family!!! X3";
		}
		//else statement of if the dog has not been adopted
		else
		{
			//returns a String saying they're not adopted
			return "I haven't been adopted yet... Please adopt me </3";
		}
	}
	
	/**
	 * Override of the equals method that compares the data attributes of a Dog and the passed Dog and returns whether they are all the same 
	 * @param dawg the passed Dog object that the Dog is compared to 
	 * @return returns whether the two Dogs have the same data attributes as a boolean 
	 */
	public boolean equals(Dog dawg)
	{
		//if statement to check if the age, name, and adoption status of this dog are the same as the compared dog
		if(this.age == dawg.age && this.name.equals(dawg.name) && this.isAdopted == dawg.isAdopted)
		{
			//returns true :3
			return true;
		}
		//else statement of if at least one of those parameters are not the same as the compared dog
		else
		{
			//returns false :3
			return false;
		}
	}

}
