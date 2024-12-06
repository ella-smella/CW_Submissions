	/**
	  * This method is not static. What does this mean about how the method works? After code tracing, also answer
   	* the following question: what does this method do?
    *
    * Since the method is not static, that means the method depends on an object and runs differently depedning on the object
    * str | "testing"
    * c | 'i'
    * l | 7
    * i | 0, 1, 2, 3, 4 
    * if | F, F, F, F, T <-return
    * This method finds the index of the char that is passed to it in a String 
    */
	public int doesSomething(char c)
	{
		/*
		 * This line below works even though str was not instantiated in the method.
		 * What conclusion can you draw from this fact?
		 * 
		 * str was declared and initialized outside of this method 
		 * 
		 * */

		int l = str.length();
		
		/*
		 * Why might executing the loop below result in a syntax error?
		 * 
		 * It would result in a syntax error because the loop can run when i is the same as the length, which would be, one more than the last character.
     * It would create an error because it runs charAt with an index that is one more than allowed 
		 */
		for (int i = 0; i <= l; i++)
		{
			
			/*
			 * What is this line checking for? What does it return if it is true?
			 * 
			 * This line is checking if the character at the index of i is the same as the passed character
       * If it is true, it returns the index, which is i 
			 */
			if (str.charAt(i) == c)
			{
				return i;
			}
			
		}
		/*
		 * What is the purpose of this line below? 
		 * Think about what needs to happen for it to be reached. 
		 * 
		 * The purpose of this line is to return something when the passed char isn't a part of str. 
     * For it to be reached, the for loop would have to run through every char and check for the passed char until the end of str 
     * and find nothing, ending the loop without a return 
     * It returns -1 becaus there is no index where the passed char is 
		 */
		return -1;
		
	}
