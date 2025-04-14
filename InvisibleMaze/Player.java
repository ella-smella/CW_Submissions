/**
 * This class is for the Player objects that represent the player's position in the invisible maze project. 
 * The object has two different int attributes to represent the player's row position and column position.
 * These attributes are 0 as default since the player will always start in the top left corner. 
 * Getters and setters are created for the 2 attributes individually
 */
public class Player {

	//DATA ATTRIBUTES
	//row position and column position initialized as 0 so player starts in the top left 
	private int rPos = 0;
	private int cPos = 0;
	
	//CONSTRUCTOR
	/**
	 * Creates a Player object with a default row and column position of 0
	 */
	public Player()
	{
		//sets the attributes of row and column position to 0
		rPos = 0;
		cPos = 0;
	}
	
	//FUNCTIONALITIES
	/**
	 * Sets row position
	 * @param r passed int that becomes the rPos
	 */
	public void setRPos(int r)
	{
		//sets the row position to the passed int
		rPos = r;
	}
	
	/**
	 * @return returns the row position
	 */
	public int getRPos()
	{
		//returns row position
		return rPos;
	}
	
	/**
	 * Sets column position
	 * @param c passed int that becomes the cPos
	 */
	public void setCPos(int c)
	{
		//sets the column position to the passed int
		cPos = c;
	}
	
	/**
	 * @return returns the column position
	 */
	public int getCPos()
	{
		//returns column position
		return cPos;
	}
}
