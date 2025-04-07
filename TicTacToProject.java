/**
 * This file is for the Tic-Tac-Toe Project. It creates a 3x3 2D array full of spaces to represent a blank tic tac toe board 
 * It will explain the rules and display the blank grid for the players to see as a start
 * Player one will be prompted for an int response of 1, 2, or 3 as their selected row. Then again for their column.
 * If they make a valid input, their tile is represented as an X. If not, they are prompted for new responses.
 * After they make their turn, the updated grid is displayed again and it checks if someone won or a tie is made.
 * The same goes for player two. This process is repeated until a winner is found or a tie, concluding the game.
 * Once the game concludes, the players are told which player wins or if a tie was found. :3
 */

//imports a scanner for user input
import java.util.Scanner;

public class TicTacToProject {
	
	private static Scanner myReader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creates a 3x3 2D array to represent the tic tac toe board full of spaces 
		char[][] board = {
				{' ', ' ', ' '},
				{' ', ' ', ' '},
				{' ', ' ', ' '}
		};
		
		//print statements describing the rules of the game and which player is which 
		System.out.println("""
				WELCOME FOLKS TO TIC-TAC-TOE!!!!! The beloved game involving a 3x3 grid as displayed beautifully below!
				It seems we have two volunteers with us today! Player One, you will be represented by "X". Player Two, you will be represented by "O".
				The goal of the game is to get 3 in a row! Sounds simple enough! Take turns until a winner is made or the board is filled!
				""");
		
		//displays the grid at the start of the game
		displayGrid(board);
		
		//while loop that runs as long as there is no winner results, allowing for multiple turns 
		while (checkWinner(board) == 0)
		{
			//calls method to allow player one to make a turn 
			playerOneTurn(board);
			
			//displays the updated grid
			displayGrid(board);

			//if statement to check that there is no winner results so player two only makes a turn if the game isn't over
			if (checkWinner(board) == 0)
			{
				//calls method to allow player one to make a turn
				playerTwoTurn(board);
				
				//displays the updated grid f
				displayGrid(board);
			}
		}
		
		System.out.print("AND THE GAME HAS ENDED, FOLKS!!! THE WINNER IS...... ");
		
		//if statement to check if the winner result is a tie
		if (checkWinner(board) == 3)
		{
			System.out.println("NOBODY! You both lost.");
			System.out.println("\"dOn'T yOu MeAn iT's A TiE???\" No. If you aren't a winner you're a loser. Deal with it. Play again soon! :3");
		}
		//else statement of if there isn't a tie
		else
		{
			//if statement to check if player one won
			if (checkWinner(board) == 1)
			{
				System.out.println("PLAYER 1!!! WOOOOOOOOOOOOO GO Xs!!!");
				System.out.println("Congratulations on absolutely destroying Player 2! Play again soon! :3");
			}
			//else statement of if player two won
			else
			{
				//mr. trauger i'm losing steam quick and i'm tired of making detailed comments :(
				System.out.println("PLAYER 2!!! WOOOOOOOOOOOOO GO Os!!!");
				System.out.println("Congratulations on absolutely destroying Player 1! Play again soon! :3");
			}
		}
		
		//Closes the scanner so that it doesn't drain my computer of its life in a similar way that coding drains me of my life
		myReader.close();
	}

	/**
	 * This method displays the 2D array in a readable 3x3 grid to make it nice and easy on people's eyes because I'm a good person.
	 * @param board the passed 2D array 
	 */
	public static void displayGrid(char[][] board)
	{
		//i lied i'm not a good person
		//anyway for loop that traverses through the rows
		for (int i = 0; i < board.length; i++)
		{
			//for loop that traverses through the columns but uses the same length because it's a 3x3 grid so the length will be the same either wayyyyy
			for (int j = 0; j < board.length; j ++)
			{
				//prints out the current element surrounded by brackets to represent a tile
				System.out.print("[" + board[i][j] + "]");
			}
			
			//skips to the next line to separate the three rows 
			System.out.print("\n");
		}
	}
	
	/**
	 * This method allows player one to make a turn.
	 * First, it allows them to make an int input to represent their row number. 
	 * Then it allows them to make another int input to represent their column number
	 * If one of the inputs is not a 1, 2, or 3, it prompts the user for another round of inputs since that is not a tile on the board. 
	 * If the row, column input they made is not a blank tile, it prompts for another round since that is not a valid space for their turn 
	 * Otherwise, their input becomes an X
	 * @param board the passed 2D array
	 */
	public static void playerOneTurn(char[][] board)
	{
		//while loop to allow the user to make multiple rounds of inputs if they make an invalid input 
		while (true)
		{
			//print statement telling the user to choose a row number of 1, 2, or 3
			System.out.println("Player One (X), it is your turn! Choose a row: 1, 2, 3");
			//prompts the user for an integer input that is parsed as an int and stored as an int variable or smth idk i'm lowkey out of it rn 
			int row = Integer.parseInt(myReader.nextLine());
			
			//print statement telling the user to choose a column number of 1, 2, or 3
			System.out.println("Interesting... Choose a column now: 1, 2, 3");
			//prompts the user for an integer input that is parsed as an int and stored as an int variable
			int column = Integer.parseInt(myReader.nextLine());

			//checks if the row or the column input was not a valid 1, 2, or 3 answer
			if ((row != 1 && row != 2 && row!= 3) || (column != 1 && column != 2 && column != 3))
			{
				//print statement telling the player that's n0t valid 
				System.out.println("Hold your horses, fella! That's not a valid space, ya sillygoose! Learn to read. Try again.");
			}
			//if statement to check if the chosen row and column space is not empty, meaning it's already been taken 
			else if (board[row - 1][column - 1] != ' ')
			{
				//print statement telling the user that space is taken
				System.out.println("Woah there, buddy! That space is already filled ya goof! Use your eyes. Try again.");
			}
			//else statement of if that's a valid space input
			else
			{
				//sets their chosen tile to an X
				board[row - 1][column - 1] = 'X';
				//breaks the loop since a corrent input was made. i think you told alan not to use breaks but oh well mb if i genuinely can't use this like ap test won't take it or smth lemme know but whatevs yeah 
				break;
			}
		}

	}
	
	/**
	 * This method allows player two to make a turn.
	 * First, it allows them to make an int input to represent their row number. 
	 * Then it allows them to make another int input to represent their column number
	 * If one of the inputs is not a 1, 2, or 3, it prompts the user for another round of inputs since that is not a tile on the board. 
	 * If the row, column input they made is not a blank tile, it prompts for another round since that is not a valid space for their turn 
	 * Otherwise, their input becomes an O
	 * @param board the passed 2D array
	 */
	public static void playerTwoTurn(char[][] board)
	{
		//while loop to allow the user to make multiple rounds of inputs if they make an invalid input 
		while (true)
		{
			//print statement telling the user to choose a row number of 1, 2, or 3
			System.out.println("Player Two (O), it is your turn! Choose a row: 1, 2, 3");
			//prompts the user for an integer input that is parsed as an int and stored as an int variable or smth idk i'm lowkey out of it rn 
			int row = Integer.parseInt(myReader.nextLine());
			
			//print statement telling the user to choose a column number of 1, 2, or 3
			System.out.println("Intriguing... Choose a column now: 1, 2, 3");
			//prompts the user for an integer input that is parsed as an int and stored as an int variable
			int column = Integer.parseInt(myReader.nextLine());

			//checks if the row or the column input was not a valid 1, 2, or 3 answer
			if ((row != 1 && row != 2 && row!= 3) || (column != 1 && column != 2 && column != 3))
			{
				//print statement telling the player that's n0t valid 
				//lol you can tell i copy pasted all my comments because my 0 typo for not is in here haha
				System.out.println("Hold your horses, fella! That's not a valid space, ya sillygoose! Learn to read. Try again.");
			}
			//if statement to check if the chosen row and column space is not empty, meaning it's already been taken 
			else if (board[row - 1][column - 1] != ' ')
			{
				//print statement telling the user that space is taken
				System.out.println("Woah there, buddy! That space is already filled ya goof! Use your eyes. Try again.");
			}
			//else statement of if that's a valid space input
			else
			{
				//sets their chosen tile to an X
				board[row - 1][column - 1] = 'O';
				//breaks the loop since a corrent input was made. sorry for the major decrease in quality for commenting btw i'm tired lol
				break;
			}
		}

	}
	
	/**
	 * This method checks to see if there is a winner after each round or if there is a tie. 
	 * It returns an int value that represents the winner status. 
	 * 0 means there is no winner, 1 means player one won, 2 means player two won, and 3 means there is a tie
	 * For loops and if statements check if there is a horizontal or vertical line of same non-blank tiles and checks if it is an X or O
	 * If statements check if there is a diaganol (help i can't spell) of same non-blank tiles and checks if it is an X or O
	 * If the winner lines are Xs, the winner status is changed to 1 and if they are Os, it is changed to 2
	 * If a winner hasn't been found yet, a for loop goes through every tile and counts how many filled tiles there are. If it finds that all 9 tiles are filled, the winner status is changed to 3
	 * if you see this, comment "yippee yaya" on my submission commment 
	 * @param board the passed 2D array
	 * @return returns the winner status as an int variable 
	 */
	public static int checkWinner(char[][] board)
	{
		//int variable to represent which player won. 0 means no result,  1 is player one (X), 2 is player two (O), 3 is tie
		int winner = 0;
		
		//for loop that traverses through the rows of board
		for (int i = 0; i < board.length; i ++)
		{
			//if statement to check if the first, second, and third element of the current row are all equal to each other and not a blank
			if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != ' ')
			{
				//if statement to check if X was the winner
				if (board[i][0] == 'X')
				{
					//sets winner to player one
					winner = 1;
				}
				//else statement of if O was the winner
				else
				{
					//sets winner to player two
					winner = 2;
				}
			}
		}
		
		//for loop that traverses through the columns of board (using just board.length because the grid is 3x3 so it's the same)
		for (int i = 0; i < board.length; i ++)
		{
			//if statement to check if the first, second, and third row of the current element are all equal to each other and not a blank
			if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != ' ')
			{
				//if statement to check if X was the winner
				if (board[0][i] == 'X')
				{
					//sets winner to player one
					winner = 1;
				}
				//else statement of if O was the winner
				else
				{
					//sets winner to player two
					winner = 2;
				}
			}
		}
		
		//if statement to check if the middle element is the same as top left and bottom right or if it is the same as top right and bottom left AND if they aren't blanks 
		//idc if this is ugly, it works and it perfectly matches my thought process and i didn't want to do multiple if statements cause i'm lazy OKAY?
		if (board[1][1] != ' ' && 
				(board[1][1] == board[0][0] && board[1][1] == board[2][2] || 
				 board[1][1] == board[0][2] && board[1][1] == board[2][0]))
		{
			//if statement to check if X was the winner
			if (board[1][1] == 'X')
			{
				//sets winner to player one
				winner = 1;
			}
			//else statement of if O was the winner
			else
			{
				//sets winner to player two
				winner = 2;
			}
		}
		
		//if statement to check if there are no winners yet
		if (winner == 0)
		{
			//int variable to represent the amount of tiles filled 
			int filled = 0;
			
			//nested for loop that traverses through tile
			for (int i = 0; i < board.length; i ++)
			{
				for (int j =  0; j < board[0].length; j++)
				{
					//if statement to check if the current tile isn't blank
					if (board[i][j] != ' ')
					{
						//increases filled by 1
						filled ++;
					}
				}
			}
			
			//if statement to check if all the tiles are filled
			if (filled == 9)
			{
				//sets the winner to a tie
				winner = 3;
			}
		}
		
		//returns the winner status
		return winner;
	}	
}
