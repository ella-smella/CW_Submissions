/**
	 * This method prompts the user for a response, prints out what they've inputted, 
	 * then a number representing how many times the loop has run. Then it repeats. 
	 * If the user types "stop", the loop ends 
	 */
	public static void userInputs()
	{
		//boolean to act as the while loop test 
		boolean test = true;
		//int that represents how many times the loop has run. starts as one for the first time it runs.
		int loopCount = 1;
		
		//while loop that prompts for a response and prints things over and over unless the user types "stop"
		while (test)
		{
			//print statement prompting the user for a response. also tells the user to type "stop" to end the loop
			System.out.println("Type something fun! If you don't want to, type \"stop\"");
			
			//Sets the user's input as a string variable that will be reprinted to the user or checked if the user typed "stop"
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user typed "stop"
			if (input.equals("stop"))
			{
				//if the check works, sets test as false so that the loop stops 
				test = false;
			}
			//else statement of if the user didn't type "stop"
			else
			{
				//print statement telling the user what they have typed 
				System.out.println("You have typed: " + input);
				//print statement telling the user how many times the loop has run 
				System.out.println("This loop has run this many times: " + loopCount);
				
				//increases the loop count by one for when the loop runs again 
				loopCount ++;
			}
		}
		
	}
	
	/**
	 * This method prompts the user for a double five separate times and adds all those doubles to the sphere's radius.
	 * At the end of the method, a print statement tells the user what the original radius was and what the new one is 
	 */
	public void addRadiusFiveTimes()
	{
		//creates a double for the new radius and sets it as the original radius to start with 
		double newRadius = radius;
		
		//for loop that creates an int i to represent the amount of times the loop has run, aka how many times the user was prompted a response
		//the loops runs as long as i is less than or equal to 5. once it succeeds 5, the user has been prompted 5 times thus ending the loop
		//at the end of each loop run, i is increased by 1 to count for another loop run 
		for (int i = 1; i <= 5; i++)
		{
			//prompts the user for a double response that will be added to the sphere's radius
			System.out.println("Please input a double to add to the sphere's radius.");
			
			//Sets the user's input as a double variable that will be added to the sphere's radius
			Double input = new Double(myReader.nextDouble());
			
			//adds the user's input to the new radius 
			newRadius += input;
		}
		
		//print statement telling the user the sphere's original radius and new radius 
		System.out.println("The sphere's original radius was " + radius + " and now it is " + newRadius);
	
		//sets sphere's radius to the new radius 
		radius = newRadius;
		
		//Closes the scanner so that it doesn't drain my computer of its life in a similar way that coding drains me of my life
		myReader.close();
		
	}
