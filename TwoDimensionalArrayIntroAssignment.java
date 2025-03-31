/**
 * This class is for the 2D Array Intro Assignment. It instantiates two 2D arrays and completes various tasks
 * for both of these 2D arrays. It then creates a few methods that do funny 2D array related things. hahaha :3
 */
public class TwoDimensionalArrayIntroAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 
		
		int[][] gridNums = new int[4][6];
		
		//2. Instantiate a 2-D array with the following values:
		//4   5    7
		//2  -1   8
		//0  1   3
		
		int[][] grid = {
			{ 4, 5, 7},
			{2, -1, 8},
			{0, 1, 3}
		};

		//For the following problems, print out those elements before and after to verify it worked. 

		//3. For both of those arrays, change the element in the first row, first column to a 17.
		
		//prints original first row, first column of the two 2D arrays
		System.out.println(gridNums[0][0] + ", " + grid[0][0]);
		
		//changes them to 17
		gridNums[0][0] = 17;
		grid[0][0] = 17;
		
		//prints them after the change :3
		System.out.println(gridNums[0][0] + ", " + grid[0][0]);

		//4. For both of those arrays, change the element in the second row, third column into a 20. 
		
		//prints original second row, third column of the two 2D arrays
		System.out.println(gridNums[1][2] + ", " + grid[1][2]);
		
		//changes them to 20
		gridNums[1][2] = 20;
		grid[1][2] = 20;
		
		//prints them after the change >:[]
		System.out.println(gridNums[1][2] + ", " + grid[1][2]);

		//5. For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length 

		//prints original first row, last column of the two 2D arrays
		System.out.println(gridNums[0][gridNums[0].length - 1] + ", " + grid[0][grid[0].length - 1]);
		
		//changes them to -5
		gridNums[0][gridNums[0].length - 1] = -5;
		grid[0][grid[0].length - 1] = -5;
		
		//prints them after the change :3
		System.out.println(gridNums[0][gridNums[0].length - 1] + ", " + grid[0][grid[0].length - 1]);
		
		//6. For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length 

		//prints original last row, first column of the two 2D arrays
		System.out.println(gridNums[gridNums.length - 1][0] + ", " + grid[grid.length - 1][0]);

		//changes them to -7
		gridNums[gridNums.length - 1][0] = -7;
		grid[grid.length - 1][0] = -7;
		
		//prints them after the change :3
		System.out.println(gridNums[gridNums.length - 1][0] + ", " + grid[grid.length - 1][0]);
		
		//7. For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 
		
		//prints original last row, last column of the two 2D arrays
		System.out.println(gridNums[gridNums.length - 1][gridNums[0].length - 1] + ", " + grid[grid.length - 1][grid[0].length - 1]);
		
		//changes them to -30
		gridNums[gridNums.length - 1][gridNums[0].length - 1] = -30;
		grid[grid.length - 1][grid[0].length - 1] = -30;

		//prints them after the change :3
		System.out.println(gridNums[gridNums.length - 1][gridNums[0].length - 1] + ", " + grid[grid.length - 1][grid[0].length - 1]);

		//testing the methods >:[]
		printFirstRow(grid);
		printFirstColumn(grid);
		printRowMajor(grid);
		printColumnMajor(grid);
	}
	
	/**
	 * 8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 
	 * @param nums the passed 2D array 
	 */
	public static void printFirstRow (int[][] nums)
	{
		//for loop that traverses through each element of the first array 
		for (int i = 0; i < nums[0].length; i ++)
		{
			//prints out the current element of the first row
			System.out.println(nums[0][i]);
		}
	}
	
	/**
	 * 	9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
	 * @param nums the passed 2D array 
	 */
	public static void printFirstColumn (int[][] nums)
	{
		//if u see this, comment "ella was here" on vincent's submission. for loop that traverses through the arrays in the 2D array
		for (int i = 0; i < nums.length; i++)
		{
			//prints out the first element of the current row
			System.out.println(nums[i][0]);
		}
	}
	
	/**
	 * 	10. Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order. 
	 * @param nums the passed 2D array 
	 */
	public static void printRowMajor (int[][] nums)
	{
		//for loop that traverses through the arrays 
		for (int i = 0; i < nums.length; i ++)
		{
			//for loop that traverses through the elements in the arrays
			for (int j =  0; j < nums[0].length; j++)
			{
				//prints out the current element of the current array
				System.out.println(nums[i][j]);
			}
		}
	}
	
	/**
	 * 	11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order. 
	 * @param nums the passed 2D array
	 */
	public static void printColumnMajor (int[][] nums)
	{
		//for loop that traverses through the elements in the arrays 
		for (int i = 0; i < nums[0].length; i ++)
		{
			//for loop that traverses through the arrays
			for (int j = 0; j < nums.length; j ++) 
			{
				//prints out the current element of the current array 
				System.out.println(nums[j][i]);
			}
		}
	}
	
}
