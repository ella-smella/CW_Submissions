/**
 * This class is for the Algirthms Project assignment. It creates 10 different methods to complete 10 different tasks.
 */
public class AlgorithmsProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	//Create methods that are passed an array of ints and accomplish the following tasks:

	/**
	 * 1. Return the smallest number in the array. 
	 * @param nums the passed array that the method searches through to find min
	 * @return returns the smallest int in the array 
	 */
	public static int smallestNum (int[] nums)
	{
		//int variable to represent the smallest element in the array
		//initialized as the first element as a starting point
		int smallNum = nums[0];
				
		//for loop to search through every element of the array except for the first one since that is what smallNum is
		for (int i = 1; i < nums.length; i ++)
		{
			//if statement to check if the current element is smaller than what smallNum is currently set to 
			if (nums[i] < smallNum)
			{
				//sets smallNum equal to the current element
				smallNum = nums[i];
			}
		}
		
		//returns smallNum
		return smallNum;
	}
	
	/**
	 * 2. Return the index of the smallest number in the array.  
	 * @param nums the passed array that the method searches through to find min and its index
	 * @return returns the index of the smallest int in the array 
	 */
	public static int smallestIndex (int[] nums)
	{
		//int variable to represent the smallest element in the array
		//initialized as the first element as a starting point
		int smallNum = nums[0];
		
		//int variable to represent the index of the smallest element in the array 
		//initialized as 0 for the first index as a starting point
		int smallIndex = 0;
				
		//for loop to search through every element of the array except for the first one since that is what smallNum is
		for (int i = 1; i < nums.length; i ++)
		{
			//if statement to check if the current element is smaller than what smallNum is currently set to 
			if (nums[i] < smallNum)
			{
				//sets smallNum equal to the current element
				smallNum = nums[i];
				
				//sets smallIndex to the index of the current element
				smallIndex = i;
			}
		}
		
		//returns smallIndex
		return smallIndex;
	}
			
	/**
	 * 	3. Return the average of all numbers in the array.
	 * @param nums the passed array that the method searches through to 
	 * @return returns the average of all elements in the passed array as an int
	 */
	public static int arrayAverage(int[] nums)
	{
		//int variable that represents the sum of all elements in the array
		//initialized as 0 since we haven't started adding anything yet
		int numsSum = 0;
		
		//int variable that represents the average 
		int numsAverage = 0;
		
		//for loop that traverses through each element in the array 
		for (int i = 0; i < nums.length; i ++)
		{
			//adds the current element to the sum of the elements
			numsSum += nums[i];
		}
		
		//sets the average to the sum divided by how many elements there are in the array 
		numsAverage = numsSum / nums.length;
		
		//returns the numsAverage 
		return numsAverage;
	}
			
	/**
	 * 4. Return true if all numbers in the array are even, and return false otherwise.
	 * @param nums the passed array that the method searches through to 
	 * @return returns whether all elements in the array are even or not 
	 */
	public static boolean evenArr(int[] nums)
	{
		//boolean variable that represents whether all elements are even
		//initialized as true since we will be checking if any element is odd and we haven't started checking yet
		boolean allEven = true;
		
		//for each loop that goes through every element in the array but only for this problem BECAUSE IFORGOT THAT THESE EXISTED AHHHHHHHHH
		for(int num: nums)
		{
			//if statement to check if the current element cannot be divided by two equally. basically if it's odd
			if (num % 2 == 1)
			{
				//sets allEven to false since there's at least one odd element
				allEven = false;
			}
		}
		
		//returns allEven
		return allEven;
	}

	/**
	 * 	5. If the array ever has two consecutive 5's, change them to 0's. (For example, passing {4, 5, 5, 2, 1} changes the array to {4, 0, 0, 2, 1} ).
	 * @param nums the passed array that the method searches through to
	 * @return returns the passed array but with the double consecutive 5s as 0s
	 */
	public static int[] doubleFives(int[] nums)
	{
		//for loop that traverses through every element of the copyArr except for the last one to avoid an out of bounds error
		for (int i = 0; i < nums.length - 1; i++)
		{
			//if statement to check if the current element and the one after it is both equal to 5
			if (nums[i] == 5 && nums[i + 1] == 5)
			{
				//sets the elements to 0
				nums[i] = 0;
				nums[i + 1] = 0;
			}
		}
		
		//returns nums
		return nums;
	}
	
	/**
	 * 6. Return true if any number shows up three times in a row, and return false otherwise. 
	 * @param nums the passed array that the method searches through to
	 * @return returns whether there is a triple element in the passed array 
	 */
	public static boolean tripleNumber(int[] nums)
	{
		//returns false if the passed num isn't at least three numbers since there can't be triple numbers 
		if (nums.length < 3)
		{
			return false;
		}
		
		//creates a boolean to represent whether there are triple numbers. it is initialzied as false since we haven't checked for triple numbers yet
		boolean tripleNums = false;
		
		//for loop that goes through every element in the passed array except for the last two to avoid an out of bounds error
		for (int i = 0; i < nums.length - 2; i ++)
		{
			//if statement to check if the current element is the same as the next two after it 
			if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
			{
				//sets tripleNums to true since a triple number has been found
				tripleNums = true;
			}
		}
		
		return tripleNums;
	}
	
	/**
	 * 7. Pass an array of ints and an int to be searched for. Return how many times that int shows up in the array. (For example, passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice)
	 * @param nums the passed array that the method searches through to
	 * @param num the passed int that the method looks for in each element of the passed array
	 * @return returns the amount of times the passed int appears int eh passed array
	 */
	public static int countNumArr (int[] nums, int num)
	{
		//creates an int counter that represents how many times the passed int appears in the passed array. initialized as 0 since counting has not yet begun
		int counter = 0;
		
		//for each loop that goes through every element in the passed array
		for (int number: nums)
		{
			//if statement to check if the current element is the same as the passed int
			if (number == num)
			{
				//increaes the counter by one since the passed int was found
				counter ++;
			}
		}
		
		//returns the final counter
		return counter;
	}
		
	/**
	 * 	8. Alter an array so that is the backwards version of the array initially passed (for example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 5, 5, 4})
	 * @param nums the passed array that the method searches through to
	 * @return returns the passed array but the elements are ordered backwards
	 */
	public static int[] backwardsArr (int[] nums)
	{
		//creates a copyArr that is the same length as the passed array
		int[] copyArr = new int [nums.length];
		
		//for loop that traverses through each element of the passed array backwards and each element of the copyArr forwards
		for (int i = nums.length - 1, j = 0; i >= 0; i --, j++)
		{
			//sets the current copyArr element to the current passed array element
			copyArr[j] = nums[i];
		}
		
		//makes nums equal to copyArr and returns it
		nums = copyArr;
		return nums;
	}
	
	/**
	 * 	9. Shift all elements in an array to the right. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 4, 5, 5, 2})
	 * @param nums the passed array that the method searches through to
	 * @return returns the passed array but the elements are all shifted to the right
	 */
	public static int[] rightShiftArr (int[] nums)
	{
		//creates a copyArr that is the same length as the passed array
		int[] copyArr = new int [nums.length];
		
		//sets the first element of the copyArr to the last element of the passed array 
		copyArr[0] = nums[nums.length - 1];
		
		//for loop that traverses through each element of the array except for the first one since we already changed it 
		for(int i = 1; i < nums.length; i ++)
		{
			//sets the current element of the copyArr to the one before it in the passed array
			copyArr[i] = nums[i - 1];
		}
		
		//makes nums equal to copyArr and returns it
		nums = copyArr;
		return nums;
	}
			
	/**
	 * 10. Use either selection sort or insertion sort to sort an array. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5})	
	 * @param nums the passed array that the method searches through to
	 * @return returns the passed array but sorted in numerical order
	 */
	public static int[] insertionSort (int[] nums)
	{
		//for loop that traverses through each element of the copyArr except for the first one to avoid out of bounds error
		for(int i = 1; i < nums.length; i++)
		{
			//for loop that traverses through each element left of the current element 
			for(int j = i; j > 0 && nums[j] < nums[j - 1]; j--)
			{
				//swaps the two elements
				int temp = nums[j];
				nums[j] = nums[j - 1];
				nums[j - 1] = temp;
			}
		}
		
		//returns nums;
		return nums;
	}
}
