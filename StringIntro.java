/**
 * This class is for the String Intro Assignment. This code scans what a user types in as an input
 * using a scanner. It then uses an if statement to see if the length of the input is more than 6 
 * characters. If it is, then the code prints out multiple stats about the input. These include the
 * String's second and last letter, the index of the first 'e' or 'E' in the String, the length of 
 * the String, and the first three letters and the last three letters of the String. If the input 
 * is not more than 6 characters, the code will tell the user so and not print out any stats. 
 */

//imports a scanner for user input
import java.util.Scanner;
public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print statement to ask the user for an input 
		System.out.println("Please type a String that is more than 6 characters! :3");
		
		//Creates new scanner as myReader to scan for input 
		Scanner myReader = new Scanner(System.in);
		
		//Sets the users input as a String variable, "userInput" that can be used for all the methods 
		String userInput = new String(myReader.nextLine());
		
		//Sets the input's length as an int variable that can be used in the following if statement
		int inputLength = userInput.length();
		
		//if statement to check if the input's length is more than 6 characters. If it is, then calls various methods and prints stats about the string
		if (inputLength > 6)
		{
			//Calls a method to print the second and last letter of the user's input 
			printSecondAndLastLetter(userInput);
			
			//if statement to check if there isn't an e (lowercare or capital) in the user's input by checking if the e index is equal to -1. If there isn't an e, then a print statement tells the user so
			if (getThatE(userInput) == -1)
			{
				System.out.println("Hey, so, there's no \"e\" or \"E\" in your String. I'm not mad, I didn't say there had to be... but maybe next time? :)");
			}
			//This statement runs if the check for no e character fails, meaning there in an e. Then a print statment tells the user the index of the first occuring e (lowercase or capital) found by calling a method
			else 
			{
				System.out.println("Another cool thing! The first \"e\" or \"E\" in your String appears at index " + getThatE(userInput));
			}
			
			//Print statement that tells user the length of their input which if found by calling a method
			System.out.println("Wanna know another fun fact? Yes? Perfect! Your String is " + getLength(userInput) + " characters long! How dope!!!");
			
			//Calls a method to print the first three letters of the input and the last three letters of the input 
			printFirstAndLastThree(userInput);
		}
		//If the input's length is not more than six, this statement checks if the length is equal to 6 and prints a statement telling the user it is
		else if (inputLength == 6)
		{
			System.out.println("That is not more than 6.... That IS 6!!! >:[");
		}
		//This statement runs if the input's length is not equal or more than 6, 
		else 
		{
			System.out.println("THAT IS LESS THAN 6!!! YOU DINGLEBERRY! >:(");
		}
		
		//Closes the scanner so that it doesn't drain my computer of its life in a similar way that coding drains me of my life
		myReader.close();
	}

	/**
	 * Prints the second and last letter of a given String
	 * @param input the String the method uses for second/last letter 
	 */
	public static void printSecondAndLastLetter(String input)
	{
		//Sets the length of a string as an int variable so that the last index of the String can be calculated 
		int inputLength = input.length();
		
		//Prints a statement telling the user the second letter by finding the character at index 1 and the last letter by finding the character at the last index: calculated as one less than the String's length
		System.out.println("Wanna know something cool? The second letter in your String is \"" + input.charAt(1) + "\" and the last letter is \"" + input.charAt(inputLength - 1) + "\". How sick, yeah?");
	}
	
	/**
	 * @param input the String the method uses for second/last letter 
	 * @return Returns the index that the first e occurs at, whether capital or lowercase 
	 */
	public static int getThatE(String input)
	{
		//Temporarily converts the String to all lowercase and returns the index that the first "e" occurs at so that the method is not case sensitive
		return input.toLowerCase().indexOf('e');
	}
	
	/**
	 * @param input the String the method uses for second/last letter 
	 * @return Returns the length of the String as the amount of characters in it 
	 */
	public static int getLength(String input) 
	{
		//retunrs the length of the given String 
		return input.length();
	}
	
	/**
	 * Prints the first three letters of the String and the last three letters of the String
	 * @param input the String the method uses for second/last letter 
	 */
	public static void printFirstAndLastThree (String input)
	{
		//Sets the length of a string as an int variable so that the last three letters of the String can be calculated 
		int inputLength = input.length();
		
		//Prints a statment telling the user the first three letters by finding a substring from index 0 to 3 and the last three letters by finding a substring from the 4th to last index and so on by subtracting 3 from the String length
		System.out.println("Here's some more dopalicious things about your String. The first three letters of it are \"" + input.substring(0, 3) + "\" and the last three are \"" + input.substring(inputLength - 3) + "\"");
	}
	
	
}
