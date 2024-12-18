/**
 * This class is for creating a Character in the Make Your Choice Game Project. 
 * Data attributes inherent to NPCs are whether they are alive, whether the user has met them, their name, and their opinion on the user.
 * Data attributes determined by the user for their playable character are their age, their name, and whether they are a good person.
 * The class includes getters and setters for all the NPC attributes and user attributes. 
 * The class includes a method that returns the name of an NPC if the user hasn't met them yet and they are alive. 
 * There is also a method that returns the name of an NPC if they are alive.
 */
public class Character 
{
	
	//Data Attributes for NPCs
	private boolean isAlive;
	private boolean hasMet;
	private String charName;
	private int charOpinion;
	private boolean isAvailable = true;
	private boolean isPoison;
	
	//Data Attributes for user
	private static int userAge;
	private static String userName;
	private static boolean userGoodPerson;
	
	//Constructor for NPCs
	/**
	 * Creates a new Character object for all the NPCs
	 * @param alive passed boolean for whether an NPC is alive (true) or dead/unavailable (false)
	 * @param met passed boolean for whether the user has met the NPC (true) or not (false)
	 * @param name passed String for the NPC's name
	 */
	public Character(boolean alive, boolean met, String name, int opinion)
	{
		//Sets the inherent data attributes equal to what is passed through the method 
		isAlive = alive;
		hasMet = met;
		charName = name;
		charOpinion = opinion;
	}
	
	//Functionalities
	
	//Methods for NPCs
	
	/**
	 * Getter to return the living status of the NPC
	 * @return returns whether the NPC is alive (true) or dead/unavailable (false)
	 */
	public boolean charAlive()
	{
		//returns NPC's living status 
		return isAlive;
	}
	
	/**
	 * Setter to change the NPC's living status and return it 
	 * @param status the passed boolean that will become the NPC's living status: alive (true) or dead/unavailable (false)
	 * @return returns whether the NPC is alive (true) or dead/unavailable (false)
	 */
	public boolean charAlive(boolean status)
	{
		//sets NPC's living status as the passed boolean and returns it 
		isAlive = status;
		return isAlive;
	}
	
	/**
	 * Getter to return the met status of the NPC
	 * @return returns whether the user has met the NPC (true) or not (false)
	 */
	public boolean charMet()
	{
		//returns NPC's met status 
		return hasMet;
	}
	
	/**
	 * Setter to change the NPC's met status and return it
	 * @param status the passed boolean that will become the NPC's met status: user has met them (true) or hasn't (false)
	 * @return returns whether the user has met the NPC (true) or not (false)
	 */
	public boolean charMet(boolean status)
	{
		//sets NPC's met status as the passed boolean and returns it
		hasMet = status;
		return hasMet;
	}
	
	/**
	 * Getter to return the poison status of the NPC
	 * @return returns whether the NPC is poisoned (true) or not (false)
	 */
	public boolean charPoisoned()
	{
		//returns NPC's poison status 
		return isPoison;
	}
	
	/**
	 * Setter to change the NPC's poison status and return it
	 * @param status the passed boolean that will become the NPC's poison status
	 * @return returns whether the NPC is poisoned (true) or not (false)
	 */
	public boolean charPoisoned(boolean poison)
	{
		//sets NPC's poison status as the passed boolean and returns it
		isPoison = poison;
		return isPoison;
	}
	
	/**
	 * Getter to return the availability status of the NPC
	 * @return returns whether the NPC is available (true) or not (false)
	 */
	public boolean charAvailable()
	{
		//returns NPC's availability status 
		return isAvailable;
	}
	
	/**
	 * Setter to change the NPC's availability status and return it
	 * @param status the passed boolean that will become the NPC's availability status
	 * @return returns whether the NPC is avaiable (true) or not (false)
	 */
	public boolean charAvailable(boolean avail)
	{
		//sets NPC's availability status as the passed boolean and returns it
		isAvailable = avail;
		return isAvailable;
	}
	
	/**
	 * Getter to return the name of the NPC
	 * @return returns the NPC's name
	 */
	public String charName()
	{
		//returns the NPC's name
		return charName;
	}
	
	/**
	 * Prints out the passed name of an NPC if the user hasn't met them and they are alive. 
	 * If either of these checks are false, no name is printed out. 
	 * @param hasMet passed boolean used to check if the user hasn't met the NPC 
	 * @param isAlive passed boolean used to check if the NPC is alive
	 * @param charName passed name of the NPC that is printed out if the checks are true
	 */
	public static void canMeet(boolean hasMet, boolean isAlive, String charName)
	{
		//if statement to check if the NPC's met status is false and their living status is true
		if (hasMet == false && isAlive == true)
		{
			//Prints out the name of the NPC
			System.out.println(charName);
		}
	}
	
	/**
	 * Prints out the passed name of an NPC if they are alive.
	 * If they aren't, no name is printed out.
	 * @param isAlive passed boolean used to check if the NPC is alive
	 * @param charName passed name of the NPC that is printed out if the check is true
	 */
	public static void isAlive(boolean isAlive, boolean isAvailable, String charName)
	{
		//if statement to check if the NPC's living status is true
		if (isAlive == true && isAvailable == true)
		{
			//Prints out name of the NPC
			System.out.println(charName);
		}
	}
	
	/**
	 * Getter to return the opinion the NPC has of the user.
	 * More positive is like the user, more negative is dislike the user. 0 is a neutral opinion.
	 * @return returns the number representing the opinion the NPC has of the user
	 */
	public int charOpinion()
	{
		//returns the NPC opinion as a number 
		return charOpinion;
	}
	
	/**
	 * Adds a passed number to the opinion the NPC has of the user.
	 * @param add the passed int that will be added to the NPC opinion
	 */
	public void addOpinion(int add)
	{
		//adds the passed int to the NPC's opinion of the user 
		charOpinion += add;
	}
	
	/**
	 * Subtracts a passed number from the opinion the NPC has of the user.
	 * @param sub the passed int that will be subtracted from the NPC opinion
	 */
	public void subOpinion(int sub)
	{
		//subtracts the passed int from the NPC's opinion of the user 
		charOpinion -= sub;
	}
	
	
	//Methods for user 
	
	/**
	 * Getter to return the user's age that they input
	 * @return returns the user's age
	 */
	public static int userAge()
	{
		//returns user's age
		return userAge;
	}
	
	/**
	 * Setter to change the user's age to their input and return it
	 * @param input the int that the user typed to represent their age
	 * @return returns the user's age
	 */
	public static int userAge(int input)
	{
		//sets the user's age to their input and returns it 
		userAge = input;
		return userAge;
	}
	
	/**
	 * Getter to return the user's name that they input
	 * @return returns the user's name
	 */
	public static String userName()
	{
		//returns user's name
		return userName;
	}
	
	/**
	 * Setter to change the user's name to their input and returns it
	 * @param input the String that the user typed to represent their name
	 * @return returns the user's name
	 */
	public static String userName(String input)
	{
		//sets the user's name to their input and returns it 
		userName = input;
		return userName;
	}
	
	/**
	 * Getter to return the user's decision of whether they are a good person or not
	 * @return returns whether the user is a good person (true) or bad person (false)
	 */
	public static boolean userGoodPerson()
	{
		//returns whether the user is a good or bad person
		return userGoodPerson;
	}
	
	/**
	 * Setter to change whether the user is a good or bad person to what they input and returns it
	 * @param input the boolean that corresponds to the user's input of whether they are a good person (true) or bad person (false)
	 * @return
	 */
	public static boolean userGoodPerson(boolean input)
	{
		//sets the user's status of a good person to their boolean-represented input and returns it
		userGoodPerson = input;
		return userGoodPerson;
	}
	
	
}
