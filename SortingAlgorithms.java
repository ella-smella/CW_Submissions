/**
 * This class is for the different sorting algorithms that we are going over in class.
 * As of right now, onyl bubble sort is in here. 
 */
public class SortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creates an unsorted array to sort
		int[] nums = {4, 3, 2, 4, 8};
		//creates an array that calls the bubbleSort method to create a sorted version of nums
		int[] numsSort = bubbleSort(nums);
		
		//for each loop to print out the elements of the sorted array 
		for(int num: numsSort)
		{
			System.out.print(num);
		}
		
	}

	/**
	 * This method is a bubble sort algorithm
	 * @param nums the passed array that will be sorted
	 * @return returns the sorted array
	 */
	public static int[] bubbleSort(int[] nums)
	{
		//creates a copyArr of the same length as the passed array so it isn't damaged
		int[] copyArr = new int [nums.length];
		//for loop to make the copyArr have the same elements as the passed array 
		for (int i = 0; i < nums.length; i ++)
		{
			//sets the element of copyArr to the respective element of passed array
			copyArr[i] = nums[i];
		}
		
		//creates a counter starting as something that isn't 0 that will represent how many swaps occured
		//is not 0 so the loop runs properly off the bat 
		int counter = 1;
		//while loop that will run until the sorter makes zero swaps in a cycle 
		while (counter != 0)
		{
			//sets the counter to 0 at the beginning of each cycle 
			counter = 0;
			
			//for loop that goes through each element of the array except for the last
			for (int i = 0; i < copyArr.length - 1; i ++)
			{
				//if statement to check if the current element and the one after it is out of order
				if (copyArr[i] > copyArr[i + 1])
				{
					//swaps the two elements
					int temp = copyArr[i];
					copyArr[i] = copyArr[i + 1];
					copyArr[i + 1] = temp;
					
					//increses the swap counter by one
					counter ++;
				}
			}
		}
		
		//returns the sorted array 
		return copyArr;
	}
}
