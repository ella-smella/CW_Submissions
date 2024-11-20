
public class LoopsIntroPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Testing methods 
		System.out.println(countLetters("abqcdqefghqqijk", 'q'));
		System.out.println(countLetters("aaabaabaab", 'b'));
		System.out.println(countLetters("aaabaabaab", 'a'));
		
		System.out.println(getFactorial(5));
		System.out.println(getFactorial(10));
		
		System.out.println(printIfRepeats("abcde"));
		System.out.println(printIfRepeats("abcce"));
		System.out.println(printIfRepeats("abcec"));

	}

	//1. Create a method countLetters() that is passed a String and a char and returns how many times that passed char shows up in the passed String. 
	//Examples:
	//countLetters( "abqcdqefghqqijk" , q ) -----returns----> 4
	//countLetters ( "aaabaabaab" , b ) ----returns---> 3
	
	/**
	 * This method counts and returns the number of times a letter appears in a string
	 * @param str passed string that the method counts the letter in
	 * @param letter passed letter that the method counts in the passed string 
	 * @return returns the number of times a letter appears in a string
	 */
	public static int countLetters(String str, char letter)
	{
		//int variable that will represent the amount of times the letter appears in the string. Initialized as 0 since counting has not yet begun.
		int letterCount = 0;
		
		//for loop that creates an int i to represent an index of the string. 
		//as long as the index is less than the length of the string, the loop will run. 
		//if it is equal or higher, that means all indexs of the string have already been checked. 
		//after each loop, the index is increased by one so a new index can be checked by the loop.
		for (int i = 0; i < str.length(); i++)
		{
			//if the character at an index is equal to the letter that is being counted, the count increases by one.
			if (str.charAt(i) == letter)
			{
				//increases the letter count by one
				letterCount ++;
			}
		}
		//returns the final letter count after all indexes of the string have been checked
		return letterCount;
	}
	
	//2. Create a method getFactorial() that is passed an int and returns the factorial of that int (a factorial is a number multiplied by each number before it. For example, 5! = 5 x 4 x 3 x 2 x 1)
	//Examples:
	//getFactorial ( 5 ) ----returns---> 120
	
	/**
	 * This method calculates and returns the factorial of a passed num, which is a number multipled by each number coming before it 
	 * @param num passed number that the method calculates the factorial of
	 * @return returns the factorial of the passed num
	 */
	public static int getFactorial(int num)
	{
		//for loop that creates an int i that is one less than the passed number. 
		//as long as the int is greater than 0, the loop continues. if the i is equal or less than 0, then all numbers before the passed number have been multiplied.
		//after each loop, the int is decreased by one so the next number before the passed number can be multipled.
		for (int i = num - 1; i > 0; i--)
		{
			//multiplies the passed number by the i int and sets that product as the new num
			num *= i;
		}
		//returns the final product of num which is the passed number multipled by all the numbers before it
		return num;
	}
	
	//3. Create a method printIfRepeats() that will print true if the passed String has two of the same letter next to each other, and prints false if not.
	//Examples:
	//printIfRepeats ( "abcde" ) ---prints---> false
	//printIfRepeats ( "abcce" ) ---prints---> true
	
	/**
	 * This method checks and returns whether a string has any consecutively repeated letters by a value of true or false.
	 * @param str passed string that the method checks whether there is repeated letters in it
	 * @return returns true or false depending on if there are consecutively repeated letters
	 */
	public static boolean printIfRepeats(String str)
	{
		//for loop that creates an int i to represent an index of the string.
		//as long as the index is one less than the length of the string, the loop continues.
		//if the index is equal or bigger, than all indexes besides the last one of the string has been checked for repeats.
		//the last index does not need to be checked because if it is a part of the repeat, the index before it will be equal and will catch the repeat.
		//at the end of each loop, the index is increased by one so a new index can be checked by the loop
		for (int i = 0; i < str.length() - 1; i++)
		{
			//if the character at the index is the same as the character at the index before it, it returns true since there is a consecutively repeated letter
			if (str.charAt(i) == str.charAt(i + 1))
			{
				return true;
			}
		}
		
		//after the whole string is checked by the loop and no repeats are found, false is returned
		return false;
	
	}
}
