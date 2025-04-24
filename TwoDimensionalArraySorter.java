/**
 * This class is for the 2D Array Sorter 
 * It creates 2 different methods for sorting a double 2D array.
 * The first method sorts the arrays in row major order (left-right, top-down)
 * The second method sorts the arrays in column major order (top-down, left-right)
 * The sorting algorithm used in both of these methods is an adapted bubble sorting alogrithm for 2D arrays
 * In main, a tester double 2D array is created with values i randomly chose and the two algorithms 
 * are tested with this array and I print the array after each test to make sure it works just for my own sanity :3
 */
public class TwoDimensionalArraySorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//double 2D array to test my sorting method :3
		double[][] nums = {
				{9.0, 6.0, 2.4, 4.6},
				{8.7, 12.6, 7.9, 3.7},
				{7.1, 12.6, 8.0, -37.6}
		};
		
		//testing the row major sorting algorithm and printing it just to make sure 
		sortRowMajor(nums);
		printRowMajor(nums);
		
		//testing the column major sorting algorithm and printing it just to make sure 
		sortColumnMajor(nums);
		printRowMajor(nums);

	}

	/**
	 * Create a method that is passed a 2-D array of doubles and sorts it from left-right, top-down order.
	 * I decided to do Bubble Sort method because it was the easiest one for me to 
	 * @param nums the passed 2D array that the method will sort
	 * @return returns the final sorted array 
	 */
	public static double[][] sortRowMajor(double[][] nums)
	{
		//creates a counter starting as something that isn't 0 that will represent how many swaps occured
		//is not 0 so the loop runs properly off the bat 
		int counter = 1;
		//while loop that will run until the sorter makes zero swaps in a cycle 
		while (counter != 0)
		{
			//sets the counter to 0 at the beginning of each cycle 
			counter = 0;
			
			//for loop that traverses through every array in the 2D array
			for(int i = 0; i < nums.length; i++)
			{
				//for loop that traverses through every element in each array 
				for(int j = 0; j < nums[0].length; j++)
				{
					//if statement to check if the current element is the last one in the array
					if(j == nums[0].length - 1)
					{
						//if statement to check if the current array is not the last one
						//this is because if it is the last one and the last element, there is nothing else after it to swap with :3
						if(i != nums.length - 1)
						{
							//if statement to check if the first element of the next array (aka the next element in line) is smaller than the current element
							if(nums[i + 1][0] < nums[i][j])
							{
								//swaps the two elements 
								double temp = nums[i + 1][0];
								nums[i + 1][0] = nums[i][j];
								nums[i][j] = temp;
								
								//increases the swap counter by 1
								counter ++;
							}
						}
					}
					//else statement of if the current element is not the last one 
					else
					{
						//if statement to check if the element after the current one is smaller 
						if(nums[i][j + 1] < nums[i][j])
						{
							//swaps the two elements 
							double temp = nums[i][j + 1];
							nums[i][j + 1] = nums[i][j];
							nums[i][j] = temp;
							
							//increases the swap counter by 1
							counter ++;
						}
					}
				}
			}
		}
		
		//returns the final sorted 2D array 
		return nums;
	}
	
	/**
	 * Then create a method that is passed a 2-D array of doubles and sorts it from top-down, left-right order. 
	 * @param nums the passed 2D array that the method will sort
	 * @return returns the final sorted array 
	 */
	public static double[][] sortColumnMajor(double[][] nums)
	{
		//creates a counter starting as something that isn't 0 that will represent how many swaps occured
		//is not 0 so the loop runs properly off the bat 
		int counter = 1;
		//while loop that will run until the sorter makes zero swaps in a cycle 
		while (counter != 0)
		{
			//sets the counter to 0 at the beginning of each cycle 
			counter = 0;
			
			//for loop that traverses through every array in the 2D array
			for(int i = 0; i < nums.length; i++)
			{
				//for loop that traverses through every element in each array 
				for(int j = 0; j < nums[0].length; j++)
				{
					//if statement to check if the current array is the last array 
					if(i == nums.length - 1)
					{
						//if statement to check if the current element is not the last one
						//haha made you look lmaooooo
						//this is because if it is the last one and the last array, there is nothing else after it to swap with :3
						if(j != nums[0].length - 1)
						{
							//if statement to check if the next element of the first array (aka the next element in line) is smaller than the current element
							if(nums[0][j + 1] < nums[i][j])
							{
								//swaps the two elements 
								double temp = nums[0][j + 1];
								nums[0][j + 1] = nums[i][j];
								nums[i][j] = temp;
								
								//increases the swap counter by 1
								counter ++;
							}
						}
					}
					//else statement of if the current array is not the last one 
					else
					{
						//if statement to check if the element in the array after the current one is smaller 
						if(nums[i + 1][j] < nums[i][j])
						{
							//swaps the two elements 
							double temp = nums[i + 1][j];
							nums[i + 1][j] = nums[i][j];
							nums[i][j] = temp;
							
							//increases the swap counter by 1
							counter ++;
						}
					}
				}
			}
		}
		
		//returns the final sorted 2D array 
		return nums;
	}
	
	public static void printRowMajor (double[][] nums)
	{
		//for loop that traverses through the arrays 
		for (int i = 0; i < nums.length; i ++)
		{
			//for loop that traverses through the elements in the arrays
			for (int j =  0; j < nums[0].length; j++)
			{
				//prints out the current element of the current array
				System.out.print(nums[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
