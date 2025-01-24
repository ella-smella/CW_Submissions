//This class is for the Searching Arrays Intro assignment. 
public class SearchingArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creates different int arrays to test the methods with 
		int[] nums1 = {0, 4, 5, 7, 19, 4, 11, 4, 3, 33, 4};
		int[] nums2 = {0, 40, 5, 7, 19, 41, 11, 42, 3, 33, 43};
		int[] nums3 = {0, 4, 5, 7, 19, 4, 11, 4, 3, 33, 4, 4, 4, 4, 4};
		
		//checks checkFor4 methods
		System.out.println(checkFor4(nums1));
		System.out.println(checkFor4(nums2));
		System.out.println(checkFor4(nums3));
		
		//checks countFor4 methods
		System.out.println(countFor4(nums1));
		System.out.println(countFor4(nums2));
		System.out.println(countFor4(nums3));
		
		//checks checkForFour4 methods 
		System.out.println(checkForFour4(nums1));
		System.out.println(checkForFour4(nums2));
		System.out.println(checkForFour4(nums3));
	}

	//1. Create a method checkFor4() that is passed an int array and returns true if that array has a 4 and false if that array has no 4's. 

	/**
	 * This method checks the passed array has at least one element that is equal to 4
	 * @param arr the passed array 
	 * @return returns whether the array has a 4 as false or true
	 */
	public static boolean checkFor4 (int[] arr)
	{
		//creates a new int array that is equal to the passed array for safety reasons
		int[] copyArr = arr;
		//creates a boolean to represent whether the array has a four in it and is initialzied as false since checks have not begun and so far no four has been found
		boolean hasFour = false;
		
		//for loop that traverses through each element of the array one by one 
		for (int i = 0; i < arr.length; i++)
		{
			//if statement to check if the element of the current index is equal to 4
			if (copyArr[i] == 4)
			{
				//sets the hasFour boolean to true since a four has been found 
				hasFour = true;
			}
		}
		
		//returns the boolean that represents if there's a four 
		return hasFour;
	}
	
	//2. Create a method countFor4() that is passed an int array and returns how many times 4 shows up in the array. 

	/**
	 * This method counts the amount of times a four appears in the passed array 
	 * @param arr the passed array
	 * @return returns the amount of times there's a four 
	 */
	public static int countFor4 (int[] arr)
	{
		//creates a new int array that is equal to the passed array for safety reasons
		int[] copyArr = arr;
		//creates an int counter to represent the amount of fours there are and is initialzied as 0 since checks have not begun and no fours have been counted
		int counter = 0;
		
		//for loop that traverses through each element of the array one by one 
		for (int i = 0; i < arr.length; i ++)
		{
			//if statement to check if the element of the current index is equal to 4
			if (copyArr[i] == 4)
			{
				//increases the counter by one since a four has been found
				counter ++;
			}
		}
		
		//returns the int that represents the amount of fours in the array 
		return counter;
	}
	
	//3. Create a method checkForFour4() that is passed an int array and return true if the array has exactly four 4's in it. 
	
	public static boolean checkForFour4 (int[] arr)
	{
		//creates a new int array that is equal to the passed array for safety reasons
		int[] copyArr = arr;
		//creates an int counter to represent the amount of fours there are and is initialzied as 0 since checks have not begun and no fours have been counted
		int counter = 0;
		//creates a boolean to represent whether the array has four fours in it and is initialzied as false since checks have not begun and so far no four has been found
		boolean hasFour4 = false;
		
		//for loop that traverses through each element of the array one by one 
		for (int i = 0; i < arr.length; i ++)
		{
			//if statement to check if the element of the current index is equal to 4
			if (copyArr[i] == 4)
			{
				//increases the counter by one since a four has been found
				counter ++;
			}
		}
		
		//if statement to check if the counter is equal to four 
		if (counter == 4)
		{
			//sets hasFor4 to true since there are exactly four fours found 
			hasFour4 = true;
		}
		
		//returns the boolean that represents whether there were four fours 
		return hasFour4;
	}
}
