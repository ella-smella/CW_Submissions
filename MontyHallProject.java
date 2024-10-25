/**
 * This class is for the Monty Hall Project. It is a recreation of the Monty Hall Game. 
 * It is a guessing game where the user is asked to select one of three doors. 
 * One of the three doors has a prize behind it, while the other two doors have nothing. 
 * The user is asked to respond with "one, two," or "three," in order to pick their first door.
 * When faced with an invalid response, the user is asked to answer again. 
 * Once the user selects a door, of the remaining two doors, a door with nothing behind it is
 * revealed as incorrect. Then the user is asked if they would like to switch their door to the
 * one unrevealed. Their response is done with an answering prompt of "yes" or "no."
 * Once they choose to stay or switch, they are finally told whether or not they have won. :3
 */

//imports a scanner for user input
import java.util.Scanner;
public class MontyHallProject {
	
	//Sets the scanner as a variable which can be used multiple times through different methods for user input 
	private static Scanner myReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print statements introducing the premise of the game
		System.out.println("WELCOME TO MY GAME SHOW! LOOKIE HERE! IT APPEARS THAT THREE DOORS ARE IN FRONT OF YOU!");
		System.out.println("Behind one of these doors lie the rewards of your dreams. Everything you've ever wanted! Behind the other two: NOTHING!!!");
		
		//Calls a method to pick the winning door that contains a "prize" behind it randomly and sets the winning door as a varaible 
		int winDoor = pickRandomDoor();
		
		//Calls a method prompting the user to pick a starting door by responding with one, two, or three and sets the player's door as a variable 
		int playerDoor = pickPlayerDoor();
		
		//Calls a method to reveal one of the other doors that the user didn't pick as an incorrect door and sets the revealed door as a variable 
		int revealedDoor = revealWrongDoor(playerDoor, winDoor);
		System.out.println(revealedDoor);
		
		//Calls a method giving the user the option to switch their door to the unrevealed door and sets that decision as their door. This means that if they choose to switch, their door's value is overwritten to the new value they switched to and if not, it stays the same. 
		playerDoor = switchDoor(playerDoor, revealedDoor);
		
		//Calls a method to reveal whether the door they picked was correct or incorrect, ending the game. If the player turns out to be incorrect, the method also tells them the correct door. 
		revealPickedDoor(playerDoor, winDoor);
		
		//Closes the scanner so that it doesn't drain my computer of its life in a similar way that coding drains me of my life
		myReader.close();
	}
	
	/**
	 * Returns a random int from 1 to 3 that corresponds with one of the three doors available in the game. This value will determine the door with the prize behind it for each run of the game. 
	 * @return returns a random int value from 1 to 3
	 */
	private static int pickRandomDoor()
	{
		//Random int generator from 1 to 3 as a variable that represents the randomly chosen door and returns that value 
		int randomDoor = ((int)(Math.random() * 3) + 1);
		return randomDoor;
	}
	
	/**
	 * Prompts the user for an input that will determine which out of the three doors they pick first. 
	 * It also tells the user the expected responses are "one, two" or "three"
	 * Depending on the response the user inputs, the method returns the int value of that response 
	 * e.g. If the player types "one," return 1
	 * If the player types an invalid response, the method tells the user so and prompts them to try again
	 * @return returns an int value of the door that the player (from 1 to 3)
	 */
	private static int pickPlayerDoor()
	{
		//Print statement asking the user for a response and telling them the expected responses are "one, two," or "three"
		System.out.println("Which door would you like to choose??? Your options are: \"one\" \"two\" or \"three\"");
		
		//Sets the user's input as a string variable that is used to determine which int value to return 
		String pickedDoor = new String(myReader.nextLine());
		
		//if statement to check if the user inputs "one," then return 1
		if (pickedDoor.equals("one"))
		{
			//returns 1 to represent door 1 has been picked
			return 1;
		}
		//else if the user inputs "two," then return 2
		else if (pickedDoor.equals("two"))
		{
			//returns 2 to represent door 2 has been picked
			return 2;
		}
		//else if the user inputs "three," then return 3
		else if (pickedDoor.equals("three"))
		{
			//returns 3 to represent door 3 has been picked 
			return 3;
		}
		//if the user inputs a response that isn't "one, two," or "three," allows user to reinput a guess 
		else
		{
			//Print statement telling the user their input is invalid and to retype another input 
			System.out.print("Oh, I'm sorry. I don't believe I quite heard you correctly! Try again. ");
			//Returns the method again, allowing for the user to do another input 
			return pickPlayerDoor();
		}		
	}
	
	/**
	 * Tells the user that a wrong door will be revealed to them. 
	 * The method generates a makeshift coin flip by using a random int generator of either 0 or 1. 
	 * This "coin flip" result is set as a variable which is used to help determine which door to reveal.
	 * If statements check for the door that the player picked so the computer doesn't reveal that one.
	 * For each corresponding possibile door that the player picks, more if statments check for the winner door so the computer doesn't reveal that one.
	 * The method returns the int value of which ever door is left after ruling out the picked and winner door. 
	 * If the picked door is the winner, leaving two possible options of wrong doors to reveal, the possible outcomes of the coin flip is used to determine which door to reveal. 
	 * @param playerDoor value of the player's picked door 
	 * @param winDoor value of the winning door 
	 * @return returns an int value of a door that was revealed to the player that has no prize behind it (from 1 to 3)
	 */
	private static int revealWrongDoor(int playerDoor, int winDoor)
	{
		//Random int generator that returns either 0 or 1 set as a variable to make a makeshift coin flip 
		int coinFlip = (int)(Math.random() * 2);
		
		//Print statements telling the player that a wrong door will be revealed and which door number it is 
		System.out.println("OH HO HO! INTERESTING CHOICE!!! WANNA KNOW WHAT WILL MAKE THIS EVEN MORE INTERESTING????");
		System.out.print("I shall reveal to you a wrong door! One of the wrong doors is DOOR NUMBER ");
		
		//if statement to check if the player's door is door 1. if it is, then the computer will return either 2 or 3 depending on the winner door
		if (playerDoor == 1)
		{
			//if statetement to check if the winner door is door 2 so that door isn't revealed and reveals door 3 instead. Also checks for another possibility where door 3 is revealed which is if door 1 is the winner door and the coin flip lands on 0. 
			if (winDoor == 2 || (winDoor == 1 && coinFlip == 0))
			{
				//returns 3 to represent door 3 has been revealed 
				return 3;
			}
			//else statement of if the winner door is door 3 so that door isn't revealed and reveals door 2 instead. Also includes another possibility where door 2 is revealed which is if door 1 is the winner door and the coin flip lands on 1. 
			else 
			{
				//returns 2 to represent door 2 has been revealed 
				return 2;
			}
		}
		//else if statement to check if the player's door is door 2. if it is, then the computer will return either 1 or 3 depending on the winner door
		else if (playerDoor == 2)
		{
			//if statetement to check if the winner door is door 1 so that door isn't revealed and reveals door 3 instead. Also checks for another possibility where door 3 is revealed which is if door 2 is the winner door and the coin flip lands on 0. 
			if (winDoor == 1 || (winDoor == 2 && coinFlip == 0))
			{
				//returns 3 to represent door 3 has been revealed 
				return 3;
			}
			//else statement of if the winner door is door 3 so that door isn't revealed and reveals door 1 instead. Also includes another possibility where door 1 is revealed which is if door 2 is the winner door and the coin flip lands on 1. 
			else 
			{
				//returns 1 to represent door 1 has been revealed 
				return 1;
			}
		}
		//else statment of if the player's door is door 3. if it is, then the computer will return either 1 or 2 depending on the winner door
		else
		{
			//if statetement to check if the winner door is door 1 so that door isn't revealed and reveals door 2 instead. Also checks for another possibility where door 2 is revealed which is if door 3 is the winner door and the coin flip lands on 0. 
			if (winDoor == 1 || (winDoor == 3 && coinFlip == 0))
			{
				//returns 2 to represent door 2 has been revealed 
				return 2;
			}
			//else statement of if the winner door is door 2 so that door isn't revealed and reveals door 1 instead. Also includes another possibility where door 1 is revealed which is if door 3 is the winner door and the coin flip lands on 1. 
			else 
			{
				//returns 1 to represent door 1 has been revealed
				return 1;
			}
		}
	}
	
	/**
	 * Asks the user whether or not they want to switch their current door to a different, unrevealed door. 
	 * The method creates a variable to represent which door the player switches to and changes its value depending on their current door and revealed door.
	 * If statements check which door the player has and which one was previously revealed so the player switches to the one other door. 
	 * The method tells the user which door they have and which door they will be switching to. 
	 * Then, the method asks the user if they want to switch by allowing them an input of either "yes" or "no"
	 * Answering yes sets the player's door as the switch door and returns that value. Answering no returns the player's door as is. 
	 * If the player inputs and invalid response, the method tells them so and prompts them to answer again. 
	 * @param playerDoor value of the player's door
	 * @param revealedDoor value of the wrong door that was revealed 
	 * @return returns an int value of the player's new door after being asked to switch. if player does not switch, returns the int value of the player's door beforehand. 
	 */
	private static int switchDoor (int playerDoor, int revealedDoor)
	{
		//Print statement prompting the user for a response of whether they would like to switch which door they picked or not. Tells them the expected responses are "yes" or "no"
		System.out.println("Now, would you like to switch your door? Answer, me \"yes\" or \"no\".");
		
		//Instantiates an int variable to represent the value of the door that the user is asked to switch to or not 
		int switchDoor;
		
		//The following if statements check which door the player picked and which door was revealed to determine which door the player potentially switches to since they can't switch to either one. Then sets the switchDoor value appropriately. 
		//if statement to check if the player picked door 1. 
		if (playerDoor == 1)
		{
			//if statement to check if the revealed door is door 3. If it is, then the switch door can only be door 2.
			if (revealedDoor == 3)
			{
				//sets the switch door to 2 to represent the 2nd door 
				switchDoor = 2;
			}
			//else statement of if the revealed door is door 2. If it is, then the switch door can only be door 3.
			else
			{
				//sets the switch door to 3 to represent the 3rd door 
				switchDoor = 3;
			}
		}
		//else if statement to check if the player picked door 2. 
		else if (playerDoor == 2)
		{
			//if statement to check if the revealed door is door 3. If it is, then the switch door can only be door 1.
			if (revealedDoor == 3)
			{
				//sets the switch door to 1 to represent the 1st door 
				switchDoor = 1;
			}
			//else statement of if the revealed door is door 1. If it is, then the switch door can only be door 3.
			else
			{
				//sets the switch door to 3 to represent the 3rd door 
				switchDoor = 3;
			}
		}
		//else statement of if the player picked door 3.
		else
		{
			//if statement to check if the revealed door is door 2. If it is, then the switch door can only be door 1.
			if (revealedDoor == 2)
			{
				//sets the switch door to 1 to represent the 1st door 
				switchDoor = 1;
			}
			//else statement of if the revealed door is door 1. If it is, then the switch door can only be door 2.
			else
			{
				//sets the switch door to 2 to represent the 2nd door 
				switchDoor = 2;
			}
		}
		
		//Print statement telling the user which door the currently have picked and which door they will switch to if they agree 
		System.out.println("You'll be switching from Door " + playerDoor + " to Door " + switchDoor);
		
		//Sets the user's input as a string variable that is used to determine which int value to return 
		String switchDecision = new String(myReader.nextLine());

		//if statement to check if the player types "yes," agreeing to switch their door. Then it sets their player door value as the value of the door they switch to 
		if (switchDecision.equals("yes"))
		{
			//changes the player's door value to the door value of the one they switch to
			playerDoor = switchDoor;
			//returns the new value of their door, which has been switched 
			return playerDoor;
		}
		//else if statement to check if the player types "no," not wanting to switch their door. Then it returns the value of their current door. 
		else if (switchDecision.equals("no"))
		{
			//returns the value of their original door pick
			return playerDoor;
		}
		//if the user inputs a response that isn't "yes" or "no," allows user to reinput a guess 
		else
		{
			//Print statement telling the user their input is invalid and prompts them to answer again 
			System.out.print("Uhh.... Say that again? ");
			//Returns the method again, allowing for the user to do another input 
			return switchDoor(playerDoor, revealedDoor);
		}
	}
	
	/**
	 * Reveals whether or not the player has won the game by checking if their door is the same as the winning one. 
	 * @param playerDoor value of the player's door
	 * @param winDoor value of the winning door 
	 */
	private static void revealPickedDoor (int playerDoor, int winDoor)
	{
		//Print statement telling the user the game is done and reveals the status of the door they currently have picked 
		System.out.println("Well, well, well. Now that your decisions have been made, the game has come to an end!");
		System.out.print("I SHALL NOW REVEAL THAT YOUR DOOR IS ");
		
		//if statment to check if the player's door is the winning door 
		if (playerDoor == winDoor)
		{
			//Print statement telling the user their door is correct and have won 
			System.out.print("CORRECT!!!! CONGRATULATIONS! YOU HAVE NOW RECIEVED THE PRIZE OF YOUR DREAMS!!!! \nPlease, play again soon! :)");
		}
		//else statement of if the player's door is not the winning door. 
		else
		{
			//Print statement telling the user their door is incorrect and which door was the correct one 
			System.out.print("INCORRECT! Deepest apologies. You certainly tried your best! \nThe correct door was Door " + winDoor + "! \nBetter luck next time!!! Please, play again soon! :)");
		}
	}
}
