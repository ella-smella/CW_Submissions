/*
 * This method returns a String name of a month that corresponds with the int number that is passed. 
 * EX: January = 1; February = 2; March = 3...
 * 
*/
public static String getMonth(int n)
	{
		//
		String months = "January February March April May June "
				+ "July August September October November December ";

    //
		for (int i = 1; i <= 12; i++)
		{
			// 
			int sL = months.indexOf(' ');

      //
			if (n == i)
			{
        //
				return months.substring(0, sL);
			}
      //
			else
			{
        //
				months = months.substring(sL + 1);
			}
		}
		//
		return " /* What String would you put here? */ ";
		
	}
