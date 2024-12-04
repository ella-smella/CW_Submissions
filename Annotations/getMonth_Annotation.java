	/*
	 * This method returns a String name of a month that corresponds with the int number that is passed. 
	 * EX: January = 1; February = 2; March = 3...
	 * If the method is passed a number that isn't 1-12 it returns a blank String/space 
	*/
	public static String getMonth(int n)
		{
			//Creates a String that is the names of all the twelve months with spaces in between. This String is referred to in order to return the name of the month
			String months = "January February March April May June July August September October November December ";

			//for loop that makes an int i that represents the month being checked. 
			//the loop runs as long as i is less than or equal to 12, since there are only 12 months to check for. 
			//at the end of each run, i increases by 1 to check for a new month
			for (int i = 1; i <= 12; i++)
			{
				// int that is set as the index of a space character in the months String. This int is the index of where a month name ends. 
				int sL = months.indexOf(' ');

				//if statement to check if the number being passed is the same as the number corresponding to the month being checked 
				if (n == i)
				{
					//if the check is true, then the method returns from the first letter of the months String to where the first month name ends. basically it returns the first month name in the months String.
					return months.substring(0, sL);
				}
				//else statement of if the passed number isn't the same as the checked month
				else
				{
					//sets the months String to the same string starting from one character after the first space, which would be where the next month name starts. basically gets rid of the first month name in the months String.
					months = months.substring(sL + 1);
				}
			}
			//Returns the final String of months after the loop finishes running, which will be nothing. This is because all numbers 1-12 are covered in the for loop. If it gets to this point, the passed number was not 1-12.
			return months;
			
		}
