/**
 * This class is for the Basic Wordle Project. It is a basic version of the Wordle game where users
 * try to guess a five letter word by inputting guesses and recieving feedback on their accuracy.
 * In this game, "X" is a wrong letter; "?" is right letter, wrong spot; and a right letter, right spot
 * it shown as is. The solution to this game is hardcoded, meaning there is only one solution. 
 * This game does not accept gueses that are not five characters, prompting the user to reguess. 
 * This game also does not accept repeated characters within guesses, prompting the user to reguess. 
 */

//imports a scanner for user input
import java.util.Scanner;
public class BasicWordle {
	
	//Creates new scanner as myReader to scan for input 
	static Scanner myReader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//User instructions on what kind of input to type and explaining the basic rules of the game
		System.out.println("Hello! Welcome to Wordle! Please input a guess. Please make your guess five characters long, no repeating letters, and in all lowercase!");
		System.out.println("\"X\" means that letter isn't in the word. \"?\" means that letter is in the wrong spot. A correct letter is shown as is. Have fun!");

		//Determines what the answer should be
		String solution = "fungi";
		
		//Creates a boolean to determine if the player has input an invalid guess and sets it as false off the bat 
		boolean hasFailed = false;
		
		//Calls a method to run the game 
		playGame(solution, hasFailed);
		
		//Closes the scanner so that it doesn't drain my computer of its life in a similar way that coding drains me of my life
		myReader.close();

	}

	/**
	 * This method starts by setting the hasFailed boolean to false to reset the user's guess status when the code is rerun.
	 * Then it prompts the user to type a guess. Their guess is stored as a String variable.
	 * The method runs a check to see if the user's input is five characters. If it is, the method continues. 
	 * If it isn't, hasFailed is set to true so the rest of the body is ignored. Then it tells the user why their guess is invalid and calls the method again to allow for another guess. 
	 * The method runs a check to see if the user's input has repeating letters. If it doesn't, the method continues.
	 * If it does, hasFailed is set to true to the rest of the body is ignored. Then it tells the user why their guess is invalid and calls the method again to allow for another guess. 
	 * Once the user inputs a valid guess, a series of if statements checks to see if each character of the user's guess is the same as each character of the solution.
	 * If a character is the same, it prints the user's character. If a character is the same as any other characters, it prints "?" to indicate right letter, wrong spot.
	 * If a charater is not in the solution, it prints an "X" to indicate so. Then it calls the method again to allow for another guess.
	 * Once the user's input is the same as the solution, the game ends and tells the user they are correct and restates the solution.
	 * @param solution 5 character String that is the intended solution of the game
	 * @param hasFailed boolean to check if the user has input an invalid guess before 
	 */
	public static void playGame(String solution, boolean hasFailed)
	{
		//Sets hasFailed to false to allow the code to rerun properly when the method is called again for another guess. 
		hasFailed = false;
		//Print statement prompting the user to type a guess
		System.out.println("Type your guess!");
		
		//Sets the users input as a String variable, "userInput,"  aka the user's guess 
		String userInput = new String(myReader.nextLine());
		
		//METHODS TO CHECK IF GUESS IS VALID
		
		//CHECK IF GUESS IS VALID LENGTH
		//Finds the length of the user's input and sets it as an int variable
		int inputLength = userInput.length();
				
		//if statement to check if the user's input is not 5 characters long. If it is not, the method tells the user so and to try again. Then it recalls the method so the user can reguess. 
		if (inputLength != 5)
		{
			//Print statement telling the user their guess is invalid due to length and to guess again
			System.out.print("Hey! That's not five characters, silly! Try again. ");
			//Sets hasFailed to true to indicate that the user has input an invalid guess
			hasFailed = true;
			//Recalls method so user can guess again
			playGame(solution, hasFailed);
		}
		
		//CHECK IF GUESS HAS REPETITIONS 
		//if statement to check if the user has input an invalid guess before. if they haven't, the game proceeds. if they have, this code doesn't run until the user puts a valid guess in.
		if (hasFailed == false)
		{
			//Sets each character of the user's guess as a seperate variable to check for repetitions
			char frstChar = userInput.charAt(0);
			char scndChar = userInput.charAt(1);
			char thrdChar = userInput.charAt(2);
			char frthChar = userInput.charAt(3);
			char ffthChar = userInput.charAt(4);
			
			//if statement to check any other characters are the same as the first character. If any are, the method tells the user so and to try again. Then it recalls the method so the user can reguess. 
			if ((frstChar == scndChar) || (frstChar == thrdChar) || (frstChar == frthChar) || (frstChar == ffthChar))
			{
				//Print statement telling the user their guess is invalid due to repetitions and to guess again
				System.out.print("Hey! That's has some repeating letters, silly! Try again. ");
				//Sets hasFailed to true to indicate that the user has input an invalid guess
				hasFailed = true;
				//Recalls method so user can guess again
				playGame(solution, hasFailed);
			}
			//else if statement to check any other characters are the same as the second character, regarding any previous checks. If any are, the method tells the user so and to try again. Then it recalls the method so the user can reguess. 
			else if ((scndChar == thrdChar) || (scndChar == frthChar) || (scndChar == ffthChar))
			{
				//Print statement telling the user their guess is invalid due to repetitions and to guess again
				System.out.print("Hey! That's has some repeating letters, silly! Try again. ");
				//Sets hasFailed to true to indicate that the user has input an invalid guess
				hasFailed = true;
				//Recalls method so user can guess again
				playGame(solution, hasFailed);
			}
			//else if statement to check any other characters are the same as the third character, regarding any previous checks. If any are, the method tells the user so and to try again. Then it recalls the method so the user can reguess. 
			else if ((thrdChar == frthChar) || (thrdChar == ffthChar))
			{
				//Print statement telling the user their guess is invalid due to repetitions and to guess again
				System.out.print("Hey! That's has some repeating letters, silly! Try again. ");
				//Sets hasFailed to true to indicate that the user has input an invalid guess
				hasFailed = true;
				//Recalls method so user can guess again
				playGame(solution, hasFailed);
			}
			//else if statement to check if the fourth and fifth character are the same. If they are, the method tells the user so and to try again. Then it recalls the method so the user can reguess. 
			else if (frthChar == ffthChar)
			{
				//Print statement telling the user their guess is invalid due to repetitions and to guess again
				System.out.print("Hey! That's has some repeating letters, silly! Try again. ");
				//Sets hasFailed to true to indicate that the user has input an invalid guess
				hasFailed = true;
				//Recalls method so user can guess again
				playGame(solution, hasFailed);
			}
		}
		
		
		//PLAYING THE ACTUAL GAME NOW
		//if statement to check if the user has input an invalid guess before. if they haven't, the game proceeds. if they have, this code doesn't run until the user puts a valid guess in.
		if (hasFailed == false)
		{
			//Sets each character of the user's guess as a seperate variable
			char frstChar = userInput.charAt(0);
			char scndChar = userInput.charAt(1);
			char thrdChar = userInput.charAt(2);
			char frthChar = userInput.charAt(3);
			char ffthChar = userInput.charAt(4);
			//Sets each character of the solution as a seperate variable
			char frstCharSoln = solution.charAt(0);
			char scndCharSoln = solution.charAt(1);
			char thrdCharSoln = solution.charAt(2);
			char frthCharSoln = solution.charAt(3);
			char ffthCharSoln = solution.charAt(4);
			
			//if statement to check if the user's guess is the solution. If it is, than the code tells the user they are correct and what the solution was
			if (userInput.equals(solution))
			{
				System.out.print("CONGRATULATIONS!!! YOU GUESSED THE WORD X3!!! The correct answer was " + solution + "!");
			}
			//else statement of if the user's guess is not equal to the solution. The method tells the user the status of their input and allows them to guess again. 
			else
			{
				//if statement to check if the first character of the user's guess is the same as the first character of the solution. If it is, then the user's character is printed as is.
				if (frstChar == frstCharSoln)
				{
					//Prints out the first character of the user's guess
					System.out.print(frstChar);
				}
				//else if statement to check if the first character of the user's guess is the same as any other characters of the solution. If it is, then a "?" is printed to indicate right letter, wrong spot
				else if ((frstChar == scndCharSoln) || (frstChar == thrdCharSoln) || (frstChar == frthCharSoln) || (frstChar == ffthCharSoln))
				{
					//Prints out a "?" to indicate right letter, wrong spot
					System.out.print("?");
				}
				//else statement of if the first character of the user's guess is not present in the solution. Then it prints an "X"
				else
				{
					//Prints out an "X" to indicate the letter is not present in the solution
					System.out.print("X");
				}
				
				//if statement to check if the second character of the user's guess is the same as the second character of the solution. If it is, then the user's character is printed as is.
				if (scndChar == scndCharSoln)
				{
					//Prints out the second character of the user's guess
					System.out.print(scndChar);
				}
				//else if statement to check if the second character of the user's guess is the same as any other characters of the solution. If it is, then a "?" is printed to indicate right letter, wrong spot
				else if ((scndChar == frstCharSoln) || (scndChar == thrdCharSoln) || (scndChar == frthCharSoln) || (scndChar == ffthCharSoln))
				{
					//Prints out a "?" to indicate right letter, wrong spot
					System.out.print("?");
				}
				//else statement of if the second character of the user's guess is not present in the solution. Then it prints an "X"
				else
				{
					//Prints out an "X" to indicate the letter is not present in the solution
					System.out.print("X");
				}
				
				//if statement to check if the third character of the user's guess is the same as the third character of the solution. If it is, then the user's character is printed as is.
				if (thrdChar == thrdCharSoln)
				{
					//Prints out the third character of the user's guess
					System.out.print(thrdChar);
				}
				//else if statement to check if the third character of the user's guess is the same as any other characters of the solution. If it is, then a "?" is printed to indicate right letter, wrong spot
				else if ((thrdChar == frstCharSoln) || (thrdChar == scndCharSoln) || (thrdChar == frthCharSoln) || (thrdChar == ffthCharSoln))
				{
					//Prints out a "?" to indicate right letter, wrong spot
					System.out.print("?");
				}
				//else statement of if the third character of the user's guess is not present in the solution. Then it prints an "X"
				else
				{
					//Prints out an "X" to indicate the letter is not present in the solution
					System.out.print("X");
				}
				
				//if statement to check if the fourth character of the user's guess is the same as the fourth character of the solution. If it is, then the user's character is printed as is.
				if (frthChar == frthCharSoln)
				{
					//Prints out the fourth character of the user's guess
					System.out.print(frthChar);
				}
				//else if statement to check if the fourth character of the user's guess is the same as any other characters of the solution. If it is, then a "?" is printed to indicate right letter, wrong spot
				else if ((frthChar == frstCharSoln) || (frthChar == scndCharSoln) || (frthChar == thrdCharSoln) || (frthChar == ffthCharSoln))
				{
					//Prints out a "?" to indicate right letter, wrong spot
					System.out.print("?");
				}
				//else statement of if the fourth character of the user's guess is not present in the solution. Then it prints an "X"
				else
				{
					//Prints out an "X" to indicate the letter is not present in the solution
					System.out.print("X");
				}	
				
				//if statement to check if the fifth character of the user's guess is the same as the fifth character of the solution. If it is, then the user's character is printed as is.
				if (ffthChar == ffthCharSoln)
				{
					//Prints out the fifth character of the user's guess
					System.out.println(ffthChar);
				}
				//else if statement to check if the fifth character of the user's guess is the same as any other characters of the solution. If it is, then a "?" is printed to indicate right letter, wrong spot
				else if (ffthChar == (frstCharSoln) || (ffthChar == scndCharSoln) || (ffthChar == thrdCharSoln) || (ffthChar == frthCharSoln))
				{
					//Prints out a "?" to indicate right letter, wrong spot
					System.out.println("?");
				}
				//else statement of if the fifth character of the user's guess is not present in the solution. Then it prints an "X"
				else
				{
					//Prints out an "X" to indicate the letter is not present in the solution
					System.out.println("X");
				}
				
				//Recalls method so user can guess again
				playGame(solution, hasFailed);
			}
			
		}

	}
	
}
