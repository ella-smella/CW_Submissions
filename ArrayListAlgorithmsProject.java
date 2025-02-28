/**
 * This class is for the Converting arr algs to ArrayList algs Project Assignment.
 * It completes all 7 tasks that were done in the Algorithms Project but using ArrayLists instead of arrays.
 * i want to go home.
 */

//imports the ArrayList library :3
import java.util.ArrayList;
public class ArrayListAlgorithmsProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Create methods that are passed an ArrayList of Integers and accomplish the following tasks:

	/**
	 * 1. Return the smallest number in the array. 
	 * @param nums the passed ArrayList that the method searches through to find min
	 * @return returns the smallest Integer in the ArrayList 
	 */
	public static int smallestNum(ArrayList<Integer> nums)
	{
		//int variable to represent the smallest element in the Arraylist
		//initialized as the first element as a starting point
		int smallNum = nums.get(0);
				
		//for loop to search through every element of the ArrayList except for the first one since that is what smallNum is
		for (int i = 1; i < nums.size(); i ++)
		{
			//if statement to check if the current element is smaller than what smallNum is currently set to 
			if (nums.get(i) < smallNum)
			{
				//sets smallNum equal to the current element
				smallNum = nums.get(i);
			}
		}
		
		//returns our final smallNum
		return smallNum;
	}

	/**
	 * 2. Return the index of the smallest number in the ArrayList.  
	 * @param nums the passed ArrayList that the method searches through to find min and its index
	 * @return returns the index of the smallest int in the ArrayList 
	 */
	public static int smallestIndex (ArrayList<Integer> nums)
	{
		//int variable to represent the smallest element in the ArrayList
		//initialized as the first element as a starting point
		int smallNum = nums.get(0);
		
		//int variable to represent the index of the smallest element in the ArrayList 
		//initialized as 0 for the first index as a starting point
		int smallIndex = 0;
				
		//for loop to search through every element of the ArrayList except for the first one since that is what smallNum is
		for (int i = 1; i < nums.size(); i ++)
		{
			//if statement to check if the current element is smaller than what smallNum is currently set to 
			if (nums.get(i) < smallNum)
			{
				//sets smallNum equal to the current element
				smallNum = nums.get(i);
				
				//sets smallIndex to the index of the current element
				smallIndex = i;
			}
		}
		
		//returns smallIndex
		return smallIndex;
	}
	
	/**
	 * 	3. Return the average of all numbers in the ArrayList.
	 * @param nums the passed ArrayList that the method searches through to 
	 * @return returns the average of all elements in the passed ArrayList as an int
	 */
	public static int arrayListAverage(ArrayList<Integer> nums)
	{
		//int variable that represents the sum of all elements in the ArrayList
		//initialized as 0 since we haven't started adding anything yet
		int numsSum = 0;
		
		//int variable that represents the average 
		int numsAverage = 0;
		
		//for loop that traverses through each element in the ArrayList 
		for (int i = 0; i < nums.size(); i ++)
		{
			//adds the current element to the sum of the elements
			numsSum += nums.get(i);
		}
		
		//sets the average to the sum divided by how many elements there are in the ArrayList 
		numsAverage = numsSum / nums.size();
		
		//returns the numsAverage 
		return numsAverage;
	}
	
	/**
	 * 4. Return true if all numbers in the ArrayList are even, and return false otherwise.
	 * @param nums the passed ArrayList that the method searches through to 
	 * @return returns whether all elements in the ArrayList are even or not 
	 */
	public static boolean evenArrayList(ArrayList<Integer> nums)
	{
		//boolean variable that represents whether all elements are even
		//initialized as true since we will be checking if any element is odd and we haven't started checking yet
		boolean allEven = true;
		
		//for loop that goes through each element in the ArrayList
		for(int i = 0; i < nums.size(); i++)
		{
			//if statement to check if the current element cannot be divided by two equally. basically if it's odd
			if ((nums.get(i) % 2) == 1)
			{
				//sets allEven to false since there's at least one odd element
				allEven = false;
			}
		}
		
		//returns allEven
		return allEven;
	}

	/**
	 * 	5. If the ArrayList ever has two consecutive 5's, change them to 0's. (For example, passing {4, 5, 5, 2, 1} changes the ArrayList to {4, 0, 0, 2, 1} ).
	 * @param nums the passed ArrayList that the method searches through to
	 * @return returns the passed ArrayList but with the double consecutive 5s as 0s
	 */
	public static ArrayList<Integer> doubleFives(ArrayList<Integer> nums)
	{
		//for loop that traverses through every element of the ArrayList except for the last one to avoid an out of bounds error
		for (int i = 0; i < nums.size() - 1; i++)
		{
			//if statement to check if the current element and the one after it is both equal to 5
			if (nums.get(i) == 5 && nums.get(i + 1) == 5)
			{
				//sets the elements to 0
				nums.set(i, 0);
				nums.set(i + 1, 0);
			}
		}
		
		//returns nums
		return nums;
	}
	
	/**
	 * 6. Return true if any number shows up three times in a row, and return false otherwise. 
	 * @param nums the passed ArrayList that the method searches through to
	 * @return returns whether there is a triple element in the passed ArrayList 
	 */
	public static boolean tripleNumber(ArrayList<Integer> nums)
	{
		//returns false if the passed num isn't at least three numbers since there can't be triple numbers 
		if (nums.size() < 3)
		{
			return false;
		}
		
		//creates a boolean to represent whether there are triple numbers. it is initialzied as false since we haven't checked for triple numbers yet
		boolean tripleNums = false;
		
		//for loop that goes through every element in the passed ArrayList except for the last two to avoid an out of bounds error
		for (int i = 0; i < nums.size() - 2; i ++)
		{
			//if statement to check if the current element is the same as the next two after it 
			if (nums.get(i) == nums.get(i + 1) && nums.get(i) == nums.get(i + 2))
			{
				//sets tripleNums to true since a triple number has been found
				tripleNums = true;
			}
		}
		
		return tripleNums;
	}
	
	/**
	 * 7. Pass an ArrayList of Integers and an Integer to be searched for. Return how many times that Integer shows up in the ArrayList. (For example, passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice)
	 * @param nums the passed ArrayList that the method searches through to
	 * @param num the passed Integer that the method looks for in each element of the passed ArrayList
	 * @return returns the amount of times the passed Integer appears in the passed ArrayList
	 */
	public static int countNumArrayList (ArrayList<Integer> nums, Integer num)
	{
		//creates an int counter that represents how many times the passed Integer appears in the passed ArrayList. initialized as 0 since counting has not yet begun
		int counter = 0;
		
		//for loop that goes through every element in the passed ArrayList
		for (int i = 0; i < nums.size(); i ++)
		{
			//if statement to check if the current element is the same as the passed Integer
			if (nums.get(i) == num)
			{
				//increaes the counter by one since the passed Integer was found
				counter ++;
			}
		}
		
		//returns the final counter
		return counter;
	}
	
	/**
	 * 8. Alter an ArrayList so that is the backwards version of the ArrayList initially passed (for example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 5, 5, 4})
	 * @param nums the passed ArrayList that the method searches through to
	 * @return returns the passed ArrayList but the elements are ordered backwards
	 */
	public static ArrayList<Integer> backwardsArrayList(ArrayList<Integer> nums)
	{
		//for loop that loops through each element of the ArrayList backwards
		for (int i = nums.size() - 1; i >= 0; i--)
		{
			//removes the current element then adds it back. so it adds all the elements one by one, backwards cus the for loop is facing that way and deletes the original in the process to avoid the duplicates 
			nums.add(nums.remove(i));
		}
		
		//returns nums
		return nums;
	}
	
	//9. Shift all elements in an ArrayList to the right. (For example, passing {4, 5, 5, 2, 1} changes the ArrayList to {1, 4, 5, 5, 2})
	public static ArrayList<Integer> rightShiftArrayList(ArrayList<Integer> nums)
	{
		//removes the last element in the ArrayList and adds it back in as the first element
		//this is a test. if you are reading this, leave a comment on my submission saying "bobble head bimgus"
		nums.add(0, nums.remove(nums.size() - 1));
		
		//returns nums
		return nums;
	}

	/**
	 * 10. Use either selection sort or insertion sort to sort an ArrayList. (For example, passing {4, 5, 5, 2, 1} changes the ArrayList to {1, 2, 4, 5, 5})	
	 * @param nums the passed ArrayList that the method searches through to
	 * @return returns the passed ArrayList but sorted in numerical order
	 */
	public static ArrayList<Integer> insertionSort (ArrayList<Integer> nums)
	{
		//for loop that traverses through each element of the ArrayList except for the first one to avoid out of bounds error
		for(int i = 1; i < nums.size(); i++)
		{
			//for loop that traverses through each element left of the current element except for the first element to avoid out of bounds error
			for(int j = i; j > 0; j--)
			{
				//checks if the current element is smaller than the one before it
				if (nums.get(j) < nums.get(j - 1))
				{
					//swaps the two elements (j and j - 1)
					nums.set(j, nums.set(j - 1, nums.get(j)));
				}

			}
		}
		
		//returns nums
		return nums;
	}
}
