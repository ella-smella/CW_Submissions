/**
 * This class is for the Coverting array algs to ArrayList algs Assignment. 
 * It completes 3 ArrayList methods tasks that we've done with arrays before.
 */

//imports ArrayList library :3
import java.util.ArrayList;
public class ArraysToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creates an Arraylist to test the methods with 
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(17);
		numbers.add(5);
		numbers.add(4);
		numbers.add(5);
		numbers.add(-69);
		numbers.add(4);
		
		
		//testing methods :3
		System.out.println(checkFor4(numbers));
		
		ridAllFives(numbers);
		System.out.println(numbers);
		
		bubbleSort(numbers);
		System.out.println(numbers);

		
	}
	
	//For the following problems, all ArrayLists will store references to Integer objects.
	
	
	/**
	 * 	1. Create a method checkFor4() that is passed an ArrayList and returns the index of the first 4 if that array has a 4 and -1 if that array has no 4's. 
	 * @param nums the passed ArrayList that the method goes through 
	 * @return returns the index of the first 4 or -1 if there aren't any 4s
	 */
	public static int checkFor4(ArrayList<Integer> nums)
	{
		//creates an int variable that represents the index of the first 4, instantiated as -1 since we haven't checked for 4s yet
		int indexOf4 = -1;
		
		//for loop that goes through each element of the ArrayList and ends the loop once indexOf4 is no longer -1 because that means we found a 4 and we should stop checking since we only want the first one
		for (int i = 0; i < nums.size() && indexOf4 == -1; i ++)
		{
			//if statement to check if the current element is a 4
			if (nums.get(i) == 4)
			{
				//sets the indexOf4 to the index of the current element
				indexOf4 = i;
			}
		}
		
		//returns our final index
		return indexOf4;
	}
	

	/**
	 * 2. Create a method ridAllFives() that is passed an ArrayList nums and altars that ArrayList without returning anything. The ArrayList will have any 5’s deleted from nums.
	 * Ex: subtract5FromAll4( {5, 5, 0, 8, 5, 20}  )   -------turns nums into----->     {0, 8, 20}
	 * @param nums the passed ArrayList that the method goes through
	 */
	public static void ridAllFives(ArrayList<Integer> nums)
	{
		//for loop that goes through each element of the array, starting from the end and going backwards to work around an out of bounds error when we remove elements 
		for (int i = nums.size() - 1; i >= 0; i--)
		{
			//if statement to check if the current element is a 5
			if (nums.get(i) == 5)
			{
				//removes the current element 
				nums.remove(i);
			}
		}
		
	}
	
	//3. Create a method bubbleSort() that is passed an ArrayList and sorts it using bubblesort.
	public static void bubbleSort(ArrayList<Integer> nums)
	{
		
		//creates a counter starting as something that isn't 0 that will represent how many swaps occured
		//is not 0 so the loop runs properly off the bat 
		int counter = 1;
		//while loop that will run until the sorter makes zero swaps in a cycle 
		while (counter != 0)
		{
			//sets the counter to 0 at the beginning of each cycle 
			counter = 0;
			
			//for loop that goes through each element of the array except for the last
			for (int i = 0; i < nums.size() - 1; i ++)
			{
				//if statement to check if the current element and the one after it is out of order
				if (nums.get(i) > nums.get(i + 1))
				{
					//swaps the two elements
					nums.set(i, nums.set(i + 1, nums.get(i)));
					
					//increses the swap counter by one
					counter ++;
				}
			}
		}
	}
}
