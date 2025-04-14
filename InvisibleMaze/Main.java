/**
 * This class is the main file for the invisible maze project where all the logic and... and.. i guess you could say...
 * This is where the magic happens >:3
 * Anyway, it creates a 5x5 2D array of GameTile objects with wall, revealed, and player statuses as false as default. 
 * The tiles that are walls have their wall status manually set aftewards, hardcoding a path for the player. 
 * Instructions tell the player that walls are revealed when run into them and safe tiles are revealed after the player steps on them 
 * The board is displayed right off the bat.
 * A method is called that allows the player to make a W/A/S/D input to move their player position. 
 * If their input is out of the board's bounds, they are told so and immediately prompted for another input.
 * Their input is then checked if it is a wall. If it is, the player is told so and the wall's reveal status is set to be true.
 * If it isn't a wall, their current tile is set to be revealed and then their position is moved according to their input. 
 * Then the board is displayed with the updated tiles. If you are reading this, respond with blobobleem 
 * This repeats until the player reaches the bottom right corner. Then, print statements tell the player they won. 
 */

//imports a scanner for user input
import java.util.Scanner;
public class Main {
	
	//makes a scanner i can use in all the methods outside of main as well 
	private static Scanner myReader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//as a note, my code is not hard coded for 5x5s because i want to add a feature later to choose between a 5x5, 10x10, and 20x20 because i like mazes :3
		
		//creates a 5x5 2D array made of GameTile objects 
		GameTile[][] easyBoard = new GameTile[5][5];
		
		//filling the entire array of GameTile objects 
		//for loop that traverses through the arrays 
		for (int i = 0; i < easyBoard.length; i ++)
		{
			//for loop that traverses through the elements in the arrays
			for (int j = 0; j < easyBoard.length; j ++) 
			{
				//makes a new GameTile object for the current array with wall, revealed, and player statuses as false as default
				easyBoard[i][j] = new GameTile();
			}
		}
				
		//creates a player object with a position of 0,0 as default
		Player player = new Player();
		
		//changing only the tiles that need to be walls to have their wall status as true since they are false as default 
		easyBoard[0][1].setIsWall(true);
		easyBoard[1][3].setIsWall(true);
		easyBoard[2][1].setIsWall(true);
		easyBoard[3][1].setIsWall(true);
		easyBoard[3][3].setIsWall(true);
		easyBoard[4][3].setIsWall(true);
		
		//print statements telling the user the instructions for the game :3
		System.out.println("""
				Welcome new prisoner! This is my maze! "But where are the walls?" you may be wondering...
				There is none! At least... none that you can see >:)
				That is until you run into one of them. Then you can see them. Otherwise, that'd be cruel.
				As a little favor, I also made it so you can see where you've been! Aren't I super nice?
				You can tell where you are by the little ":3" face! The goal is to get to the bottom right corner.
				Sounds easy, right? Have fun! Or else...... >:)
				""");
		
		//displays the empty maze as a starting point 
		displayMaze(easyBoard, player);
		
		//while loop that runs as long as the player is not in the bottom right corner 
		while((player.getRPos() != easyBoard.length - 1) || (player.getCPos() != easyBoard.length - 1))
		{
			//calls a method that allows the player to move their position 
			playerMove(easyBoard, player);
			//displays the updated maze after their movement 
			displayMaze(easyBoard, player);
		}
		
		//print statements telling the user that the game is over and they won 
		System.out.println("""
				Congratulations!!! You made it out! Now you can go home to your family! 
				That is... if they made it out as well... >:)
				MUAHAHAHAHHAAHHAHHAHHAHAHAHAHAHHAHAHHAHAHAHAHAHAHAHHHAHAHAHAHAHHAHAHAHAHAHHAHAHAHHAHHAHAHAHAH
				HAHAHAHAHAHAHAHAHHAHAHHAHHHAHAHAHAHAHAHHAHAHAHAHHHAHAAHHAHAHAHAHAHHAHAHAHAHAHAHHAHAHAHAHHAHAA
				HAHAHAHHAHAHAHAHHAHAHAHAHAHHAHAHAHAHHAHHAAHHAHAHHAAHHAHHAHAHAHAHHAHAHAHHAHAHHAHAHAHAHAHHHAHAH
				AHHAHAHAHAHAHAHAHHAHAHAHAHHAHAHAHAHHAHAHHAHAHAHAHAHHHAHAHAHAHAHAHAHHAHAHAHAHHAHAHAHAHAHAHHAHA
				!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				Play again soon! :3
				""");
		
		//Closes the scanner so that it doesn't drain my computer of its life in a similar way that coding drains me of my life
		myReader.close();
	}

	/**
	 * This method displays the maze board out of the 2D array of GameTile objects
	 * A nested for loop prints out the elements of the board in row major order. 
	 * Before an element is printed, a check is made to see where the player's position is so it can be updated for the display. 
	 * If the current element is where the player is, the player status is set to true. if not, it's set to false.
	 * This way, the perfect little board is displayed with perfectly updated tiles :3
	 * @param board the passed 2D array of GameTile objects that is the board for the maze
	 * @param player the passed Player object that represents their position 
	 */
	public static void displayMaze(GameTile[][] board, Player player)
	{
		//for loop that traverses through the arrays 
		for (int i = 0; i < board.length; i ++)
		{
			//for loop that traverses through the elements in the arrays
			for (int j = 0; j < board.length; j ++) 
			{
				//if statement to check if the current element is where the player's position is
				if(player.getRPos() == i && player.getCPos() == j)
				{
					//sets the current tile's player status to true so it'll display properly
					board[i][j].setHasPlayer(true);
				}
				//else statement of if the player is not on the current tile 
				else
				{
					//sets the current tile's player status to false so it'll display properly 
					board[i][j].setHasPlayer(false);
				}
				
				//prints out the current element
				System.out.print(board[i][j]);
			}
			//moves on to next line to show the difference between rows 
			System.out.println("");
		}
	}
	
	/**
	 * This method allows the user to make a valid input to move their position with W/A/S/D
	 * Various if statements checks the player's row and column position to see if their input makes their position out of bounds.
	 * If so, they are informed that they cannot go there and is immediately prompted for a new response. 
	 * Then, various if statements check which direction the user wants to go in. 
	 * Inside each of these if statements, another if statements check if the tile the player is trying to move to is a wall.
	 * If is is, they are told it's a wall, the wall is revealed, and their position does not change. 
	 * If it isn't, their current tile is revealed and their position is changed in the direction they want. 
	 * If the player makes an input that isn't W/A/S/D, they are told that isn't a valid input and is immediately prompted for a new response 
	 * @param board the passed 2D array of GameTile objects that is the board for the maze
	 * @param player the passed Player object that represents their position 
	 */
	public static void playerMove(GameTile[][] board, Player player)
	{
		//while loop that allows the user to make multiple inputs if an invalid input is put in 
		while (true)
		{
			//print statemenet prompting the user for an input and telling them the allowed inputs 
			System.out.println("Where would you like to move? Type your answer using the W/A/S/D system!");
			
			//allows the user to make a string input 
			String input = myReader.nextLine();
			
			//if statement to check if the user is in the first row and tries to go up 
			if (player.getRPos() == 0 && input.equalsIgnoreCase("W"))
			{
				//print statement telling the user that's not possible 
				System.out.print("Uh oh! You can't go there! ");
			}
			//else if statement to check if the user is in the last row and tries to go down 
			else if (player.getRPos() == board.length - 1 && input.equalsIgnoreCase("S"))
			{
				//print statement telling the user that's not possible 
				System.out.print("Uh oh! You can't go there! ");
			}
			//else if statement to check if the user is in the first column and tries to go left 
			else if (player.getCPos() == 0 && input.equalsIgnoreCase("A"))
			{
				//print statement telling the user that's not possible 
				System.out.print("Uh oh! You can't go there! ");
			}
			//else if statement to check if the user is in the last column and tries to go right 
			else if (player.getCPos() == board[0].length - 1 && input.equalsIgnoreCase("D"))
			{
				//print statement telling the user that's not possible 
				System.out.print("Uh oh! You can't go there! ");
			}
			//else if statement of if the user chose to go up
			else if (input.equalsIgnoreCase("W"))
			{
				//if statement to check if the tile above the player's current position is a wall
				if (board[player.getRPos() - 1][player.getCPos()].getIsWall() == true)
				{
					//tells the user there's a wall there and reveals it 
					System.out.println("Uh oh! That's a wall!");
					board[player.getRPos() - 1][player.getCPos()].setIsRevealed(true);
				}
				//else statement of if that tile isn't a wall
				else
				{
					//reveals the player's current tile and then moves them up a tile 
					board[player.getRPos()][player.getCPos()].setIsRevealed(true);
					player.setRPos(player.getRPos() - 1);
				}
				//breaks the loop since a valid input was made and the maze can be reprinted again
				break;
			}
			//else if statement of if the user chose to go down 
			else if (input.equalsIgnoreCase("S"))
			{
				//if statement to check if the tile below the player's current position is a wall
				if (board[player.getRPos() + 1][player.getCPos()].getIsWall() == true)
				{
					//tells the user there's a wall there and reveals it 
					System.out.println("Uh oh! That's a wall!");
					board[player.getRPos() + 1][player.getCPos()].setIsRevealed(true);
				}
				//else statement of if that tile isn't a wall
				else
				{
					//reveals the player's current tile and then moves them down a tile 
					board[player.getRPos()][player.getCPos()].setIsRevealed(true);
					player.setRPos(player.getRPos() + 1);
				}
				//breaks the loop since a valid input was made and the maze can be reprinted again
				break;
			}
			//else if statement of if the user chose to go left
			else if (input.equalsIgnoreCase("A"))
			{
				//if statement to check if the tile left of the player's current position is a wall
				if (board[player.getRPos()][player.getCPos() - 1].getIsWall() == true)
				{
					//tells the user there's a wall there and reveals it 
					System.out.println("Uh oh! That's a wall!");
					board[player.getRPos()][player.getCPos() - 1].setIsRevealed(true);
				}
				//else statement of if that tile isn't a wall
				else
				{
					//reveals the player's current tile and then moves them left a tile 
					board[player.getRPos()][player.getCPos()].setIsRevealed(true);
					player.setCPos(player.getCPos() - 1);
				}
				//breaks the loop since a valid input was made and the maze can be reprinted again
				break;
			}
			//else if statement of if the user chose to go right 
			else if (input.equalsIgnoreCase("D"))
			{
				//if statement to check if the tile right of the player's current position is a wall
				if (board[player.getRPos()][player.getCPos() + 1].getIsWall() == true)
				{
					//tells the user there's a wall there and reveals it 
					System.out.println("Uh oh! That's a wall!");
					board[player.getRPos()][player.getCPos() + 1].setIsRevealed(true);
				}
				//else statement of if that tile isn't a wall
				else
				{
					//reveals the player's current tile and then moves them right a tile 
					board[player.getRPos()][player.getCPos()].setIsRevealed(true);
					player.setCPos(player.getCPos() + 1);
				}
				//breaks the loop since a valid input was made and the maze can be reprinted again
				break;
			}
			//else statement of if the user didn't type W/A/S/D
			else
			{
				//tells the player that input is not a thing bro 
				System.out.print("I... don't understand. ");
			}
		}
	}
}
