/**
 * This class is a subclass of the Dog superclass
 * It inherits the age, name, and adoption status attributes from the Dog class and also has an fed status attribute
 * All methods from the Dog class are inheritied in this class, but a few of them have been overrided to 
 * accomodate for the puppy dog's fed status 
 */
public class PuppyDog extends Dog {

	//DATA ATTRIBUTES
	//all the other attributes have been inherited from the Dog class
	//PuppyDogs have an isFed attribute because puppies are small lil babies and need to be fed more specifically
	private boolean isFed; 
	
	//CONSTRUCTOR
	public PuppyDog(int a, String n, boolean ad, boolean f)
	{
		//uses super keyword to call the constructor from the Dog class so we don't have to remake it all over again with the same stuffs 
		super(a, n, ad);
		//includes isFed as a part of the contructor because PuppyDogs are special :3
		isFed = f;
	}
	
	/**
	 * Overrided method for the Dog's stateAge method because PuppyDog ages are measuered in months, not ages 
	 */
	public void stateAge()
	{
		//prints out Dog's name and age
		System.out.println(name + " is " + age + " months old! :3");
	}
	
	/**
	 * Method that feeds the PuppyDog and sets the fed status to true
	 */
	public void feedPup()
	{
		//fed status is true now because Puppy has been fed like a good lil boy
		isFed = true;
	}
	
	/**
	 * Overrided method for the Dog's increaseAge method because PuppyDog's fed status is reset every month 
	 * since they need to be fed properly every month 
	 */
	public void increaseAge()
	{
		//uses the super keyword to call the increaseAge method from the Dog class so, again, we don't have to remake it 
		super.increaseAge();
		//sets the fed status to false since it's a new month for the PuppyDog
		isFed = false;
	}
	
	/**
	 * Override of the toString method that returns their name, age, adoption status, and whether they've been fed this month in a String statement
	 */
	public String toString()
	{
		//if statement to check if the PuppyDog has been fed properly this month 
		if (isFed)
		{
			//calls the super keyword of the toString method from the Dog class so we don't have to remake all that info and adds a print statement saying the puppydog has been fed
			return super.toString() + " I have been fed some super duper yummy food this month!";
		}
		//else statement of if the PuppyDog has not been fed properly this month
		else
		{
			//calls the super keyword of the toString method again and a print statement saying the puppydog has not been fed
			return super.toString() + " I haven't been fed properly this month. Help.";
		}
	}
	
	/**
	 * Override of the equals method in the Dog class since PuppyDog's have an extra parameter to compare
	 * @param dawg the passed PuppyDog object that the PuppyDog is compared to 
	 * @return returns whether the two PuppyDogs have the same data attributes as a boolean 
	 */
	public boolean equals(PuppyDog dawg)
	{
		//calls the super keyword of the equals method in the Dog class to see if all the other parameters are the same and if the fed status is the same as the compared puppy
		if (super.equals(dawg) && this.isFed == dawg.isFed)
		{
			//returns true :3
			return true;
		}
		//else statement of if at least one of those parameters are not the same as the compared puppydog
		else
		{
			//returns false :3
			return false;
		}
	}
	
}
