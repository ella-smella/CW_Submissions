//import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;

public class test_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myReader = new Scanner(System.in);

		//System.out.println(Integer.MIN_VALUE);
		//System.out.print(Integer.MAX_VALUE + 1);
		
		//Scanner myReader = new Scanner(System.in);
		//System.out.println(myReader.nextLine() + " Crazy? I was crazy once. They locked me in a room. A rubber room. A rubber room with rats. And rats make me crazy.");
		//myReader.close();
		
		//System.out.println("\"Hello World\"");
		//System.out.print("Hello \n World");
		//System.out.print("\"Hello\\World\"");

//I HATE IT HERE AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH 
		
		//System.out.print((int)(Math.random() * 10) + 1);
		
		
		//String something = "ABCD";
		
		//String string = something;
		//int stringLength = string.length();
		//int randomIndex = (int)(Math.random() * stringLength);
		//String beforeRemovedLetter = string.substring(0, randomIndex);
		//String afterRemovedLetter = string.substring(randomIndex + 1, stringLength);
		//String stringRemovedLetter = beforeRemovedLetter + afterRemovedLetter;
		//System.out.print(stringRemovedLetter);
		
		//System.out.print(true);
		//System.out.print(false && true || true);
		//System.out.print(false && (true > 1));

		//while(true){
			//System.out.println("Hi!");}
		
		//int x = 0;
		//while (x < 10){
			//System.out.println("hi!");
			//x ++;}
		
		//System.out.print(getMonth(13));
		String normal = "\033[0m";
		
		System.out.println("\033[38;5;14mHello\033[0m" + normal);
		System.out.println("\033[38;2;169;146;130mHello" + normal);
	
		
		//randomizeUntilNum(3, 6);
		
		//myReader.close();
		
		//int[] numss = {7, 8, 1, -43, 6, 2, 6};
		//for loop that traverses through each element of the copyArr except for the first one to avoid out of bounds error
		//for(int i = 1; i < numss.length; i++)
		//{
			//for loop that traverses through each element left of the current element 
		//for(int j = i; j > 0; j--)
		//{
		//if (numss[j] < numss[j - 1])
					//{
					//swaps the two elements
		//int temp = numss[j];
		//numss[j] = numss[j - 1];
		//numss[j - 1] = temp;
		//}

		//}
		//}

		//for (int number: numss)
		//{
		//System.out.print(number + ", ");
			//}
 		
		
			//ArrayList <String> arr = new ArrayList <String>();
			//arr.add("Alice");
			//arr.add("Bob");
			//arr.add("Charlie");
		//arr.add("Derek");
		
		//arr.add(arr.remove(0));
		
		//System.out.println(arr);
		
		
		//ArrayList <Integer> nums = new ArrayList <Integer>();
		//nums.add(4);
		//nums.add(5);
		//nums.add(5);
		//nums.add(2);
		//nums.add(1);

		//for (int i = nums.size() - 1; i >= 0; i--)
		//{
		//	nums.add(nums.remove(i));
		//}
		
		//System.out.println(nums);
		
		//nums.add(0, nums.remove(nums.size() - 1));

		//System.out.println(nums);

			
		//int[][] grid = new int [2][3];
		//grid[1][2] = 3;
		//System.out.println(grid[grid.length - 1][grid[0].length - 1]);
 	}
	
	/*
	 * This method returns a String name of a month that corresponds with the int number that is passed. 
	 * EX: January = 1; February = 2; March = 3...
	 * If the method is passed a number that isn't 1-12
	*/
	//public static String getMonth(int n)
		{
			//Creates a String that is the names of all the twelve months with spaces in between. This String is referred to in order to return the name of the month
			//String months = "January February March April May June July August September October November December ";

			//for loop that makes an int i that represents the month being checked. 
			//the loop runs as long as i is less than or equal to 12, since there are only 12 months to check for. 
			//at the end of each run, i increases by 1 to check for a new month
			//for (int i = 1; i <= 12; i++)
			{
				// int that is set as the index of a space character in the months String. This int is the index of where a month name ends. 
				//int sL = months.indexOf(' ');

				//if statement to check if the number being passed is the same as the number corresponding to the month being checked 
				//if (n == i)
				{
					//if the check is true, then the method returns from the first letter of the months String to where the first month name ends. basically it returns the first month name in the months String.
					//return months.substring(0, sL);
				}
				//else statement of if the passed number isn't the same as the checked month
				//else
				{
					//sets the months String to the same string starting from one character after the first space, which would be where the next month name starts. basically gets rid of the first month name in the months String.
					//months = months.substring(sL + 1);
				}
			}
			//Returns the final String of months after the loop finishes running, which will be nothing. This is because all numbers 1-12 are covered in the for loop. If it gets to this point, the passed number was not 1-12.
			//return months;
			
		}
		
		public static void randomizeUntilNum (int num, int iters)
		{
			for (int i = 0; i < iters; i ++)
			{
				int randNum = (int)(Math.random() * 9);
				System.out.print(randNum);
				while (randNum != num)
				{
					randNum = (int)(Math.random() * 9);
					System.out.print(randNum);
				}
				
				System.out.println("");
			}
		}
}

