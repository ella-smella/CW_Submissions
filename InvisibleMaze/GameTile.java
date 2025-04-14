/**
 * This class is for the GameTile objects that make up the 2D array of the inivisble maze 
 * The object has three boolean attributes that represent if the tile is a wall, is revealed, or has the player on it
 * These attributes are false as default since walls will be manually set in main, tiles are revealed only if the player interacts with them, and player's positon changes 
 * Getters and setters are made for each of these attributes individually
 * A toString method returns what the tile is represented by as a String depending on it's attributes 
 */
public class GameTile {

	//DATA ATTRIBUTES
	private boolean isWall = false;
	private boolean isRevealed = false;
	private boolean hasPlayer = false;
	
	//CONSTRUCTOR
	/**
	 * Creates a GameTile object with the wall, reveal, and player status as false to start 
	 */
	public GameTile()
	{
		isWall = false;
		isRevealed = false;
		hasPlayer = false;
	}
	
	//FUNCTIONALITIES 
	
	/**
	 * Sets whether the tile is a wall
	 * @param wall passed boolean that represents whether it's a wall or not
	 */
	public void setIsWall(boolean wall)
	{
		//sets the wall atrribute to the passed boolean
		isWall = wall;
	}
	
	/**
	 * @return returns whether the tile is a wall or not
	 */
	public boolean getIsWall()
	{
		//returns the wall status
		return isWall;
	}
	
	/**
	 * Sets whether the tile is revealed
	 * @param reveal passed boolean that represents whether it's revealed or not
	 */
	public void setIsRevealed(boolean reveal)
	{
		//sets the revealed attribute to the passed boolean
		isRevealed = reveal;
	}
	
	/**
	 * @return returns whether the tile is revealed or not
	 */
	public boolean getIsRevealed()
	{
		//returns the revealed status
		return isRevealed;
	}
	
	/**
	 * Sets whether the tile has the player
	 * @param player passed boolean that represents whether it has the player or not
	 */
	public void setHasPlayer(boolean player)
	{
		//sets the player attribute to the passed boolean
		hasPlayer = player;
	}
	
	/**
	 * @return returns whether the tile has the player or not
	 */
	public boolean getHasPlayer()
	{
		//returns the player tile status
		return hasPlayer;
	}
	
	/**
	 * @return returns what the tile is displayed as depending on its statuses (color coded because i'm fancy and it's fun :3)
	 */
	public String toString()
	{
		//if statement to check if the tile object's player status is true 
		if (hasPlayer == true)
		{
			//returns the ":3" that represents the player 
			return "\033[38;5;14m:3 \033[0m";
		}
		//else if statement to check if the tile's revealed status is true 
		else if (isRevealed == true)
		{
			//if statement to check if the tile is a revealed wall 
			if (isWall == true)
			{
				//returns the "[X]" to that represents a wall 
				return "\033[38;5;1m[X]\033[0m";
			}
			//else statement of if the tile is a revealed safe tile 
			else
			{
				//returns the "[O]" that represents a safe tile 
				return "\033[38;5;2m[O]\033[0m";
			}
		}
		//else statement of if the tile doesn't have the tile and isn't revealed yet
		else
		{
			//returns the "[ ]" that represents a blank unrevealed tile 
			return "[ ]";
		}
	}
}
