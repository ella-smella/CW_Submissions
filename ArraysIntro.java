
public class ArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task 1
		//Create an empty array that is meant to represent doubles. Name it doubArr.Repeat this for arrays that represent ints, booleans, String objects, and Circle objects. 
		double[] doubArr;
		int[] intArr;
		boolean[] boolArr;
		String[] strArr;
		Circle[] circArr;
		
		//Task 2
		//Create an array of ints with the following represented values: 7, -12, 88, -88, 0, 5, 2000.
		int[] numArr = {7, -12, 88, -88, 0, 5, 2000};
		
		//Task 3
		// Create an array that represents 5 String objects with default values. Name the array fruitsArr. In the comment for this task, state what each element's default value is. 
		//State what the default value for ints, doubles, booleans, and any reference data type is as well. 
		String [] fruitsArr = new String[5];
		//The default value for Strings are null
		//The default value for ints are 0
		//The default value for doubles are 0.0
		//The default value for booleans are false 
		//The default value for reference data type are null
		
		//Task 4
		//Change the 2nd element in fruitsArr to "Bapple"
		fruitsArr[1] = "Bapple";
		
		//Task 5
		// Change the last element in fruitsArr to "Zanana"
		//Accomplish this without typing the number "4" and instead accessing the arrays length.
		fruitsArr[fruitsArr.length - 1] = "Zanana";
		
		//Task 6
		//To verify you did number 4 correctly, print out the second element of fruitsArr
		System.out.println(fruitsArr[1]);
		
		//Task 7
		//Create a loop that one by one prints out each element in fruitsArr
		for (int i = 0; i < fruitsArr.length; i++)
		{
			System.out.println(fruitsArr[i]);
		}
		
	}

}
