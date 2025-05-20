/**
 * This class contains methods to represent each of the 20 rooms in the Make Your Choice Game Project.
 * The class also includes two methods that makes a list of availble characters for selection. 
 * The first method allows the user to meet the friends they have available and haven't met before. 
 * The second allows the user to select a friend that is still alive which is used during in-game decisions. 
 * This class also creates and contains the objects that represent the 10 indiviual NPCs. 
 */

//imports a scanner for user input
import java.util.Scanner;
public class Room {
	
	//Sets the scanner as a variable which can be used multiple times through different methods for user input 
	private static Scanner myReader = new Scanner(System.in);
	
	//Creates 10 different Character objects through the Character class that all start off as dead/unavaiable, haven't been met, and a neutral opinion on user. Each character has a unique name.
	static Character doctor = new Character (false, false, "Doctor", 0);
	static Character littleGirl = new Character (false, false, "Little Girl", 0);
	static Character dog = new Character (false, false, "Dog", 0);
	static Character pastor = new Character (false, false, "Pastor", 0);
	static Character woman = new Character (false, false, "Attractive Woman", 0);
	static Character jeff = new Character (false, false, "Jeff", 0);
	static Character granny = new Character (false, false, "Granny", 0);
	static Character businessman = new Character (false, false, "Businessman", 0);
	static Character cat = new Character (false, false, "Cat", 0);
	static Character teacher = new Character (false, false, "Teacher", 0);

	//Creates 10 String variables for each character that is set to a escape sequence to give each character a unique color and another String variable for default text 
	static String doctorCol = "\033[38;5;153m";
	static String girlCol = "\033[38;5;217m";
	static String dogCol = "\033[38;5;221m";
	static String pastorCol = "\033[38;5;188m";
	static String womanCol = "\033[38;5;210m";
	static String jeffCol = "\033[38;5;75m";
	static String grannyCol = "\033[38;5;180m";
	static String businessCol = "\033[38;5;109m";
	static String catCol = "\033[38;5;3m";
	static String teachCol = "\033[38;5;183m";
	static String normal = "\033[0m";
	
	/**
	 * This method counts how many characters are still alive and returns that value as an int
	 * @return int that represents the number of characters that are alive
	 */
	public static int charsAlive()
	{
		//int variable to represent the count of alive characters
		int aliveCount = 0;
		
		//if statements checking if each character's alive status is true
		if (doctor.charAlive() == true)
		{
			//increses the alive count by 1 
			aliveCount ++;
		}
		if (littleGirl.charAlive() == true)
		{
			aliveCount ++;
		}
		if (dog.charAlive() == true)
		{
			aliveCount ++;
		}
		if (pastor.charAlive() == true)
		{
			aliveCount ++;
		}
		if (woman.charAlive() == true)
		{
			aliveCount ++;
		}
		if (jeff.charAlive() == true)
		{
			aliveCount ++;
		}
		if (granny.charAlive() == true)
		{
			aliveCount ++;
		}
		if (businessman.charAlive() == true)
		{
			aliveCount ++;
		}
		if (cat.charAlive() == true)
		{
			aliveCount ++;
		}
		if (teacher.charAlive() == true)
		{
			aliveCount ++;
		}
		
		//returns the count of alive characters
		return aliveCount;
	}
	
	
	/**
	 * This method allows the user to meet all the characters. 
	 * It starts with a print statement asking the user to type the name of the friend they will like to meet.
	 * The method prints a list of all the characters that the user is allowed to meet.
	 * A print statment tells the user that they can only meet a character once and to type "No" to stop meeting characters. 
	 * A while loop is used to allow the user to type and meet multiple characters at once. 
	 * In the loop, if statements check if the user's input is equal to any character names, the character is alive, and the character hasn't been met.
	 * Then a print statement tells the user the character's respective introduction lines and asks them if they would like to meet more friends.
	 * If the user's input is "No", then the while loop is broken and the method ends. 
	 * If the input is not equal to any names or is a name that has already been met, a print statement says so and the loop repeats to allow another input.
	 */
	public static void meetCharacters()
	{
		//Print statement telling the user the instructions on how to meet a friend and telling them that the following strings are a list of options.
		System.out.println("\033[0m\033[1mWould you like to meet your friends? Type who you'll meet. \nBelow are your options:\033[0m");
		
		//Calling the canMeet method in the Character class to print a list of all the meetable characters to inform the user what to type as an input
		Character.canMeet(doctor.charMet(), doctor.charAlive(), doctor.charName());
		Character.canMeet(littleGirl.charMet(), littleGirl.charAlive(), littleGirl.charName());
		Character.canMeet(dog.charMet(), dog.charAlive(), dog.charName());
		Character.canMeet(pastor.charMet(), pastor.charAlive(), pastor.charName());
		Character.canMeet(woman.charMet(), woman.charAlive(), woman.charName());
		Character.canMeet(jeff.charMet(), jeff.charAlive(), jeff.charName());
		Character.canMeet(granny.charMet(), granny.charAlive(), granny.charName());
		Character.canMeet(businessman.charMet(), businessman.charAlive(), businessman.charName());
		Character.canMeet(cat.charMet(), cat.charAlive(), cat.charName());
		Character.canMeet(teacher.charMet(), teacher.charAlive(), teacher.charName());	
		
		//Print statement telling the user the instructions on how to stop meeting friends and that friends can only be met once.
		System.out.println("Type \"No\" if not or when done. You can only meet a friend once.");
		
		//while statement to create a loop that requires a valid answer from the user to be broken and allows the user to meet multiple characters
		while (true)
		{
			//Sets the user's input as a string variable that is checked to see which character they have chosen to meet or if they don't want to meet any
			String pick = new String(myReader.nextLine());
			
			//if statement to check if the character wants to meet the doctor, if the doctor is alive, and the doctor hasn't been met already
			if (pick.equalsIgnoreCase("Doctor") && doctor.charAlive() == true && doctor.charMet() == false)
			{
				//sets the doctor's met status to true so he can't be met again
				doctor.charMet(true);
				//doctor introduction and print statement asking the user for another input
				System.out.println(doctorCol + "He is a skilled doctor with many, many years of medical experience. He is oddly calm about the situation. As if he has been expecting this..." + normal);
				System.out.println("Would you like to meet more friends? Type who.");
			}
			//else if statement to check if the character wants to meet the little girl, if the little girl is alive, and the little girl hasn't been met already
			else if (pick.equalsIgnoreCase("Little Girl") && littleGirl.charAlive() == true && littleGirl.charMet() == false)
			{
				//sets the little girl's met status to true so he can't be met again
				littleGirl.charMet(true);
				//little girl introduction and print statement asking the user for another input
				System.out.println(girlCol + "She is 10 years old. Her puffy eyes suggest she was crying earlier. As you approach her, she yells \"Stranger danger!\" and calls for her mommy." + normal);
				System.out.println("Would you like to meet more friends? Type who.");
			}
			//else if statement to check if the character wants to meet the dog, if the dog is alive, and the dog hasn't been met already
			else if (pick.equalsIgnoreCase("Dog") && dog.charAlive() == true && dog.charMet() == false)
			{
				//sets the dog's met status to true so he can't be met again
				dog.charMet(true);
				System.out.println(dogCol + "A yellow labrador retriever. He wags his tail at everyone and looks eager to play. He seems to be hungry though." + normal);
				System.out.println("Would you like to meet more friends? Type who.");
			}
			//else if statement to check if the character wants to meet the pastor, if the pastor is alive, and the pastor hasn't been met already
			else if (pick.equalsIgnoreCase("Pastor") && pastor.charAlive() == true && pastor.charMet() == false)
			{
				//sets the pastor's met status to true so he can't be met again
				pastor.charMet(true);
				//pastor introduction and print statement asking the user for another input
				System.out.println(pastorCol + "You try to approach him but he screams and backs away from you. He is grasping the cross hanging from his neck. He seems scared. More than is expected." + normal);
				System.out.println("Would you like to meet more friends? Type who.");
			}
			//else if statement to check if the character wants to meet the attractive woman, if the attractive woman is alive, and the attractive woman hasn't been met already
			else if (pick.equalsIgnoreCase("Attractive Woman") && woman.charAlive() == true && woman.charMet() == false)
			{
				//sets the hot woman's met status to true so he can't be met again
				woman.charMet(true);
				//attractive woman introduction and print statement asking the user for another input
				System.out.println(womanCol + "She is very attractive. She looks like the woman of your dreams. Exactly your type. Exactly... She doesn't want to talk about her job." + normal);
				System.out.println("Would you like to meet more friends? Type who.");
			}
			//else if statement to check if the character wants to meet jeff, if jeff is alive, and jeff hasn't been met already
			else if (pick.equalsIgnoreCase("Jeff") && jeff.charAlive() == true && jeff.charMet() == false)
			{
				//sets jeff's met status to true so he can't be met again
				jeff.charMet(true);
				//jeff introduction and print statement asking the user for another input
				System.out.println(jeffCol + "He seems like a generic dude. No defining features. His job is a cashier at some fast food place. He's oddly cheerful. And he keeps talking about golf." + normal);
				System.out.println("Would you like to meet more friends? Type who.");
			}
			//else if statement to check if the character wants to meet the granny, if the granny is alive, and the granny hasn't been met already
			else if (pick.equalsIgnoreCase("Granny") && granny.charAlive() == true && granny.charMet() == false)
			{
				//sets the granny's met status to true so he can't be met again
				granny.charMet(true);
				//granny introduction and print statement asking the user for another input
				System.out.println(grannyCol + "Her warm smile instantly improves your mood. You attempt to talk about the rooms but she keeps talking about her grandkids and her famous cookies." + normal);
				System.out.println("Would you like to meet more friends? Type who.");
			}
			//else if statement to check if the character wants to meet the businessman, if the businessman is alive, and the businessman hasn't been met already
			else if (pick.equalsIgnoreCase("Businessman") && businessman.charAlive() == true && businessman.charMet() == false)
			{
				//sets the businessman's met status to true so he can't be met again
				businessman.charMet(true);
				//businessman introduction and print statement asking the user for another input
				System.out.println(businessCol + "He doesn't seem interested in any sort of conversation. He paces back and forth, clearly in some sort of hurry. You overhear him mumbling about an \"important meeting.\"" + normal);
				System.out.println("Would you like to meet more friends? Type who.");
			}
			//else if statement to check if the character wants to meet the cat, if the cat is alive, and the cat hasn't been met already
			else if (pick.equalsIgnoreCase("Cat") && cat.charAlive() == true && cat.charMet() == false)
			{
				//sets the cat's met status to true so he can't be met again
				cat.charMet(true);
				//cat introduction and print statement asking the user for another input
				System.out.println(catCol + "She hisses at you as you approach. Then she starts licking herself. Then she walks away. She seems... \"friendly.\"" + normal);
				System.out.println("Would you like to meet more friends? Type who.");
			}
			//else if statement to check if the character wants to meet the teacher, if the teacher is alive, and the teacher hasn't been met already
			else if (pick.equalsIgnoreCase("Teacher") && teacher.charAlive() == true && teacher.charMet() == false)
			{
				//sets the teacher's met status to true so he can't be met again
				teacher.charMet(true);
				//teacher introduction and print statement asking the user for another input
				System.out.println(teachCol + "She is a kindergarten teacher. You try asking her questions, but she keeps spinning them around on you. She seems very interested in finding out what's going on." + normal);
				System.out.println("Would you like to meet more friends? Type who.");
			}
			//else if statement to check if the user has chosen to not meet any more characters
			else if (pick.equalsIgnoreCase("No"))
			{
				//breaks the loop so the user doesn't have to put any more inputs in
				break;
			}
			//else statement of if the user inputs something that isn't "No" or an NPC name or if the name they input has already been met or not alive.
			else
			{
				//print statement telling the user that their input is not the name of a friend/friend is dead or they've already met and prompts them for another input
				System.out.println("Friend not found or already met. Try again.");
			}
		}
		
	}

	
	/**
	 * This method allows the user to choose one of the characters for a decision
	 * It starts with a print statement asking the user who they'll choose and gives a list of the characters they can choose.
	 * A while is used to allow the user to make another input if their original input is invalid.
	 * if the user makes an input that is the name of any of the available characters, the method returns that character's name
	 * if the user makes an invalid input, a print statement tells them so and prompts them for another input.
	 * if the user has no friends left alive to choose, the method returns "None"
	 * @return returns the name of the NPC that the user has chosen
	 */
	public static String makeYourChoice()
	{
		//print statement asking the user who they'll choose and telling them that the following strings are a list of options
		System.out.println("\033[0m\033[1mWho would you like to choose? Below are your options:\033[0m");
		
		//if statement to check if the user has no friends left alive to choose 
		if (doctor.charAlive() == false && littleGirl.charAlive() == false && dog.charAlive() == false && pastor.charAlive() == false && woman.charAlive() == false && jeff.charAlive() == false && granny.charAlive() == false && businessman.charAlive() == false && cat.charAlive() == false && teacher.charAlive() == false)
		{
			//print statement telling the user they have no friends left
			System.out.println("You have no friends. How unlucky... Isn't it?");
			//returns none 
			return "None";
		}
		
		//Calling the method isAlive to print a list of all the characters that are alive to inform the user what to type as an input
		Character.isAlive(doctor.charAlive(), doctor.charAvailable(), doctor.charName());
		Character.isAlive(littleGirl.charAlive(), littleGirl.charAvailable(), littleGirl.charName());
		Character.isAlive(dog.charAlive(), dog.charAvailable(), dog.charName());
		Character.isAlive(pastor.charAlive(), pastor.charAvailable(), pastor.charName());
		Character.isAlive(woman.charAlive(), woman.charAvailable(), woman.charName());
		Character.isAlive(jeff.charAlive(), jeff.charAvailable(), jeff.charName());
		Character.isAlive(granny.charAlive(), granny.charAvailable(), granny.charName());
		Character.isAlive(businessman.charAlive(), businessman.charAvailable(), businessman.charName());
		Character.isAlive(cat.charAlive(), cat.charAvailable(), cat.charName());
		Character.isAlive(teacher.charAlive(), teacher.charAvailable(), teacher.charName());

		//while loop to allow the user to make an input again if they make an invalid input
		while (true)
		{
			//Sets the user's input as a string variable that is checked to see which character they have chosen 
			String pick = new String(myReader.nextLine());
			
			//if statement to check if the user has chosen the doctor and the doctor is alive
			if (pick.equalsIgnoreCase("Doctor") && doctor.charAlive() == true && doctor.charAvailable() == true)
			{
				//returns the name of the doctor
				return "Doctor";
			}
			//else if statement to check if the user has chosen the little girl and the little girl is alive
			else if (pick.equalsIgnoreCase("Little Girl") && littleGirl.charAlive() == true && littleGirl.charAvailable() == true)
			{
				//returns the name of the little girl
				return "Little Girl";
			}
			//else if statement to check if the user has chosen the dog and the dog is alive
			else if (pick.equalsIgnoreCase("Dog") && dog.charAlive() == true && dog.charAvailable() == true)
			{
				//returns the name of the dog
				return "Dog";
			}
			//else if statement to check if the user has chosen the pastor and the pastor is alive
			else if (pick.equalsIgnoreCase("Pastor") && pastor.charAlive() == true && pastor.charAvailable() == true)
			{
				//returns the name of the pastor
				return "Pastor";
			}
			//else if statement to check if the user has chosen the attractive woman and the attractive woman is alive
			else if (pick.equalsIgnoreCase("Attractive Woman") && woman.charAlive() == true && woman.charAvailable() == true)
			{
				//returns the name of the attractive woman
				return "Attractive Woman";
			}
			//else if statement to check if the user has chosen jeff and jeff is alive
			else if (pick.equalsIgnoreCase("Jeff") && jeff.charAlive() == true && jeff.charAvailable() == true)
			{
				//returns the name of jeff
				return "Jeff";
			}
			//else if statement to check if the user has chosen the granny and the granny is alive
			else if (pick.equalsIgnoreCase("Granny") && granny.charAlive() == true && granny.charAvailable() == true)
			{
				//returns the name of the granny
				return "Granny";
			}
			//else if statement to check if the user has chosen the businessman and the businessman is alive
			else if (pick.equalsIgnoreCase("Businessman") && businessman.charAlive() == true && businessman.charAvailable() == true)
			{
				//returns the name of the businessman
				return "Businessman";
			}
			//else if statement to check if the user has chosen the cat and the cat is alive
			else if (pick.equalsIgnoreCase("Cat") && cat.charAlive() == true && cat.charAvailable() == true)
			{
				//returns the name of the cat
				return "Cat";
			}
			//else if statement to check if the user has chosen the teacher and the teacher is alive
			else if (pick.equalsIgnoreCase("Teacher") && teacher.charAlive() == true && teacher.charAvailable() == true)
			{
				//returns the name of the teacher
				return "Teacher";
			}
			//else statement of if the user input something that isn't the name of any character or the character isn't alive
			else
			{
				//print statement telling the user what they input is not a friend that can be found and prompts them for another response 
				System.out.println("Friend not found or unavailable. Try again.");
			}
		}
		
	}

	
	/**
	 * This method is room 0 that the user plays through. AKA the introduction and interview scene.
	 * There is various print statements building the story of a voice interviewing the user for answers about themselves.
	 * The first question is for the user's age and a try catch is used to require a number input from the user.
	 * The next question is for the user's name. The next question is whether the user is a good person or not.
	 * if statements and a while loop is used to require a yes or no input for the user.
	 * The method ends with a print statement building the story that the user has been injected to fall asleep, concluding the interview.
	 */
	public static void roomZero()
	{
		//print statement introducing the interview 
		System.out.print("You hear voices. Your vision is blurry and your hearing is slightly muffled but you can make out what they are saying.\n\"");
		
		//while loop to allow the user to make multiple inputs until they input a correct answer 
		while (true)
		{
			//try catch statement to check if the user inputs an int for their age. if they don't, it creates an error which is catched. 
			try
			{
				//print statement asking the user for their age 
				System.out.print("\033[3mHow old are you?\"\n" + normal);
				//Sets the user's input as a string variable which is then parsed as an int
				String ageInput = new String(myReader.nextLine());
				int userAge = Integer.parseInt(ageInput);
				
				//sets the user's age as what they input 
				Character.userAge(userAge);
				
				//breaks loop once there's a correct input
				break;

			}
			//runs if the user's input cannot be parsed an in int
			catch (Exception e)
			{
				//print statement telling the user to input a number
				System.out.print("\033[3m\"I need a whole number for your age. ");
			}
		}	
		
		//print statements continuing the story and adding more to the interview. then the user is asked for their name.
		System.out.println("You hear the scribbling of a pen. You hear different voices now, somewhere farther off.");
		System.out.println("\033[3m\033[38;5;247m\"We don't care about their job, do we?\"\n\"No, I don't believe so.\"" + normal);
		System.out.println("The same voice from before is speaking now.");
		System.out.println("\033[3m\"What is your name?\"" + normal);
		
		
		//Sets the user's input as a string variable which is set as the user's name
		Character.userName(new String(myReader.nextLine()));
		
		//print statement continuing the story. then the user is asked if they are a good person
		System.out.println("More scribbling of a pen. You hear a door open as someone walks in. The same voice speaks again.");
		System.out.println("\033[3m\"Are you a good person?\"" + normal);

		//while loop to allow the user to make multiple inputs until they input a "yes" or "no" answer
		while (true)
		{
			//Sets the user's input as a string variable which is checked for a yes or no answer
			String inputGoodPerson = new String(myReader.nextLine());
			
			//if statement to check if the user input "yes"
			if (inputGoodPerson.equalsIgnoreCase("Yes"))
			{
				//sets the user's good person status to true since they are good
				Character.userGoodPerson(true);
				
				//adds 5 to all characters' opinion of the user just for being a good person :3
				doctor.addOpinion(5);
				littleGirl.addOpinion(5);
				dog.addOpinion(5);
				pastor.addOpinion(5);
				woman.addOpinion(5);
				jeff.addOpinion(5);
				granny.addOpinion(5);
				businessman.addOpinion(5);
				cat.addOpinion(5);
				teacher.addOpinion(5);

				//breaks the loop once a correct answer is input
				break;
			}
			//else if statement to check if the user input "no" 
			else if (inputGoodPerson.equalsIgnoreCase("No"))
			{
				//sets the user's good person status to false since they are bad
				Character.userGoodPerson(false);
				
				//subtracts 5 from all characters' opinion of the user just for being a bad person >:(
				doctor.subOpinion(5);
				littleGirl.subOpinion(5);
				dog.subOpinion(5);
				pastor.subOpinion(5);
				woman.subOpinion(5);
				jeff.subOpinion(5);
				granny.subOpinion(5);
				businessman.subOpinion(5);
				cat.subOpinion(5);
				teacher.subOpinion(5);
				
				//breaks the loop once a correct answer is input
				break;
			}
			//else statement of if the user input something that isn't "yes" or "no"
			else
			{
				//print statement prompting the user for a "yes" or "no" answer and asks the question again
				System.out.println("\033[3m\"We need a yes or no answer. Are you a good person?\"" + normal);
			}
		}
		
		//print statement concluding the interview 
		System.out.println("More scribbling of a pen. You hear footsteps approaching you. Then, a sharp sting in your neck. Everything starts to fade to black...\n");
		
	}

	
	/**
	 * This method is room 1 that the user plays through. AKA the first room  
	 * Print statements introduce the room to the user and introduces four characters: doctor, little girl, dog, and pastor
	 * The user is then prompted with the option to meet their friends. 
	 * Then the user is prompted to choose one character to ask how they got there. 
	 * Then there are print statements that further progress the story and asks the user if they want to continue into the next room. doesn't matter, they go through lol. 
	 */
	public static void roomOne()
	{
		//print statement telling the user what room they are in
		System.out.println("\033[1mYou are in Room 1." + normal);
		
		//print statements intoducing the room and describing the surroundings to the user. the user is introduced to four characters: doctor, little girl, dog, and pastor
		System.out.println("You awake in a white room. It is empty. The only thing you see is a door with a green sign hanging above labeled \"Room 2\".");
		System.out.println("As you look around, you see four other individuals in the room. They seem to have no clue what is going on either.");
		System.out.println("A man in a white coat and glasses. A blonde child in a red dress and pigtails. A yellow dog wagging his tail. A man in a black robe with a cross.");

		//sets the alive status of the four characters to true since they are now a part of the game and the user can interact with them
		doctor.charAlive(true);
		littleGirl.charAlive(true);
		dog.charAlive(true);
		pastor.charAlive(true);

		//creates a space between lines for organization
		System.out.println("");

		//calls the method that allows the user to meet their available friends 
		meetCharacters();
		
		//creates a space between lines for organization
		System.out.println("");
		//print statement telling the user to pick one of their friends to ask how they got here
		System.out.println("You realize you don't remember how you got here. Only that interview. You consider asking one of them what they remember before they got here.");
		
		//calls the method that allows the user to pick a friend and sets their answer as a String variable
		String charPick = makeYourChoice();
		
		//if statement to check if the user picked to ask the doctor
		if (charPick.equals("Doctor"))
		{
			//doctor's response of what he remembers before getting to this area
			System.out.println(doctorCol + "\"Hm... Last I remember, I was... taking a smoke break. It was outside the hospital after a tough surgery.\"\n\"Next thing I know, there's a voice asking me all sorts of questions. Age, job, whether I'm a good person. Then I woke up here.\"" + normal);
		}
		//else if statement to check if the user picked to ask the little girl
		else if (charPick.equals("Little Girl"))
		{
			//little girl's response of what she remembers before getting to this area
			System.out.println(girlCol + "\"STRANGER DANGER! I want my mommy! I want to go home! I don't like this park anymore!\"" + normal + "\nShe starts to cry and you can't make out any more words from her.");
		}
		//else if statement to check if the user picked to ask the dog
		else if (charPick.equals("Dog"))
		{
			//dog's response of what he remembers before getting to this area
			System.out.println(dogCol + "\"Woof! Woof woof woof!\"" + normal + "\nThe dog wags his tail at you. That wasn't a very productive conversation.");
		}
		//else statement of if the user picked to ask the pastor
		else
		{
			//pastor's response of what he remembers before getting to this area
			System.out.println(pastorCol + "\"W-What? I don't know! I don't remember anything! I wasn't doing anything before this! Just hosting mass. That's all.\"" + normal + "\nHe walks away, clutching his cross, before you can ask him anything else.");
		}
		//creates a space between lines for organization
		System.out.println("");

		//print statements that further progress the story and tells the user that the end goal of the game is to reach room 20. then asks the user if they would like to continue
		System.out.println("Just as you were about to ask someone else, a voice interrupts. It booms and echoes. You try to find where it's coming from but it sounds like it's coming from everywhere.");
		System.out.println("\033[3m\033[38;5;247m\"Please proceed into Room 2. The experiment will continue further. Thank you for participating! If you would like to opt out, please head to Room 20.\"" + normal);
		System.out.println("You look around. There's no door labeled \"Room 20\". Continue into Room 2? Yes or No?");

		//sets the user's response to a String variable 
		String roomPick = new String(myReader.nextLine());
		
		//if statement to check if the user input "yes"
		if (roomPick.equalsIgnoreCase("Yes"))
		{
			//print statement progressing the user to the next room
			System.out.println("You and all your friends walk through the door.");
		}
		//else if statement to check if the user input "no"
		else if (roomPick.equalsIgnoreCase("No"))
		{
			//print statement ALSO progressing the user to the next room 
			System.out.println("Before you have a chance to walk away, an invisible force pushes you and all your friends through the door.");
		}
		//else statement of if the user didn't input "yes" or "no"
		else
		{
			//print statement ALSO ALSO progressing the user to the next room! the illusion of choice >:]
			System.out.println("You stand around aimlessly. Then, an invisible force pushes you and all your friends through the door.");
		}
		
		//creates a space between lines for organization
		System.out.println("");
	}

	
	/**
	 * This method is room 2 that the user plays through. AKA the button room
	 * Print statments introduce the room. There is a button that the user is prompted to send one of their friends to stand on.
	 * if the user sends the dog, the dog explodes. anyone else and that friend almost falls of the bridge as it disappears and everyone else is on the other side.
	 * the user is asked if they want to help their friend up or not. if they do, the friend's opinon increases. if not, it decreases. 
	 * the friend is helped up by the others regardless. then the user continues into the next room. 
	 */
	public static void roomTwo()
	{
		//print statement telling the user what room they are in
		System.out.println("\033[1mYou are in Room 2." + normal);
				
		//print statements introducing the room to the player and telling them about the button and sign. 
		System.out.println("This room appears to be a giant grass field. There are trees around, but they look odd. Almost like plastic. The rest of the room is a big screen playing a video of a blue sky.");
		System.out.println("In the middle of the room is a giant chasm that runs from wall to wall. There appears to be no way around. \nOn the other side of the chasm, you spot a door. Above it, the same exit sign as before.");
		System.out.println("On your side of the chasm is a big red button on the ground. Next to it is a sign that reads:");
		System.out.println("\033[38;5;1m\"STAND.On.Me.TWO.Reach.The.Other.Side.\"\033[0m");
		
		//creates a space between lines for organization
		System.out.println("");

		//print statement prompting the user to choose one of their friends to stand on the button
		System.out.println("You think about sending one of your friends to stand on the button.");
		//calls a method that allows the user to choose a friend and sets their input as a String variable 
		String input = makeYourChoice();
		//while statement that allows the user to make another choice if they choose the dog
		while (true)
		{
			//if statement that checks if the user chose the dog 
			if (input.equals("Dog"))
			{
				//print statement that tells the user that the dog explodes and that they were supposed to send someone with two legs and to try again
				System.out.println("As the dog begins stepping onto the button, a bridge appears connecting the two sides of the chasm. You are about to take a step onto the bridge when it disappears.");
				System.out.println("You look to the dog who now has all four of his legs on the button. Then, out of nowhere, the dog explodes.");
				System.out.println("The booming voice from before speaks: \"Please send up someone with TWO legs to STAND on the button. Thank you!\"");
				//sets dog's alive status to false since he exploded lol
				dog.charAlive(false);
				//calls the method again allowing the user to make another choice and resets their input to it 
				input = makeYourChoice();
			}
			//else statement of if the user chose anyone but the dog
			else
			{
				//print statement progressing the story. tells the user that the friend they chose needs to hold the button down. 
				System.out.println("You send the " + input + " to stand on the button. As they do, a bridge appears connecting the two sides of the chasm. You are about to take a step onto the bridge when it disappears.");
				System.out.println("You look to the " + input + " and see they have stepped off the button to try join you on the bridge. You connect the dots that the button must be held.");
				//breaks the loop since this is the choice that progresses the story
				break;
			}
		}
		
		//creates a space between lines for organization
		System.out.println("");
		
		//if statement of if the user picked the doctor to stand on the button
		if (input.equals("Doctor"))
		{
			//print statement where the doctor says everyone should cross the bridge while he holds it and he will run across afterwards. 
			System.out.println("The Doctor speaks up. " + doctorCol + "\"Go cross the bridge. It takes a few seconds for the bridge to disappear. Long enough for me to run across.\"" + normal);
		}
		//else statement of if the user picked anyone else
		else
		{
			//print statement where the doctor says everyone should cross the bridge while the user's pick holds it and can run across.
			System.out.println("The Doctor speaks up. " + doctorCol +  "\"We should cross the bridge. It takes a few seconds for the bridge to disappear. Long enough for the " + input + " to run across. Just be ready on the other side if otherwise.\"" + normal);
		}

		//print statements progressing the story, telling the user that as their friend runs across
		System.out.println("Trusting his judgment, you and all your other friends cross the bridge. The " + input + " gets ready to run across.");
		
		//if statement to check if the user chose the doctor
		if (input.equals("Doctor"))
		{
			//print statement telling the user the doctor safely makes it across the chasm 
			System.out.println("As they do, the bridge starts to deteriorate behind them. As they get to the end, they are barely able to reach the end of the chasm, safely making it across to the other side.");
		}
		//else statement of if the user chose anyone else 
		else
		{
			//print statement telling the user their friend barely make it and are holding onto the ledge. then they are prompted whether they help them up
			System.out.println("As they do, the bridge starts to deteriorate behind them. As they get to the end, the bridge fully disappears. They are barely able to make it far enough to grab onto the ledge without falling.\nDo you help the " + input + " up?");
			
			//while statement to allow the user to make multiple inputs if they input something unexpected
			while (true)
			{
				//sets the user's input as a String variable 
				String helpUp = new String(myReader.nextLine());
				
				//if statement to check if the user input "yes"
				if (helpUp.equalsIgnoreCase("Yes"))
				{
					//print statement telling the user that their friend is grateful towards them
					System.out.println("You along with your other friends help the " + input + " up onto the ledge safely. The " + input + " is grateful towards you.");
					
					//if statements that check which friend the character chose. then it increases the opinion of that friend. 
					if (input.equals("Little Girl"))
					{
						littleGirl.addOpinion(7);
					}
					else if (input.equals("Pastor"))
					{
						pastor.addOpinion(5);
					}
					//breaks loop since a correct answer was input 
					break;
				}
				//else if statement to check if the user input "no"
				else if (helpUp.equalsIgnoreCase("No"))
				{
					//print statement telling the user that their friend is upset with them
					System.out.println("You turn to walk towards the door. You see all your other friends rush to help the " + input + " up. As they are pulled up to safety, they give you an angry look.");
					
					//if statements that check which friend the character chose. then it decreases the opinion of that friend.
					if (input.equals("Little Girl"))
					{
						littleGirl.subOpinion(3);
					}
					else if (input.equals("Pastor"))
					{
						pastor.subOpinion(5);
					}
					//breaks loop since a correct answer was input
					break;
				}
				//else statement of if the user didn't input "yes" or "no"
				else
				{
					//print statement asking the user for a "yes" or "no" anser. they are asked the question again
					System.out.println("Yes or No. Do you help the " + input + " up?");
				}
			}
		}
		
		//creates a space between lines for organization
		System.out.println("");
		
		//print statement asking the user if they want to proceed into the next room
		System.out.println("With all of you on the new side of the chasm. You look to the exit door. This door is labeled \"Room 3\". Still not Room 20.\nContinue into Room 3? Yes or No?");
		
		//sets the user's input as a String variable
		String roomPick = new String(myReader.nextLine());
		
		//if statement to check if the user input "yes"
		if (roomPick.equalsIgnoreCase("Yes"))
		{
			//print statement that tells the user they continued into the next room
			System.out.println("You and all your friends walk through the door.");
		}
		//else if statement to check if the user input "no"
		else if (roomPick.equalsIgnoreCase("No"))
		{
			//print statement that tells the user they continued into the next room
			System.out.println("You turn around. There is nothing else on this side of the chasm. Nowhere else to go. Your friends drag you through the door.");
		}
		//else statement of if the user didn't put "yes" or "no"
		else
		{
			//print statement that tells the user they continued into the next room
			System.out.println("...You walk through the door.");
		}
		
		//creates a space between lines for organization
		System.out.println("");
	}

	
	/**
	 * This method is room 3 that the user plays through. AKA the monty hall room
	 * Print statements introduce the room and the entity, Monty, a sentient TV 
	 * The user is explained the rules of the game which is to choose a door from 1-3, get told a wrong door, and have the option to switch to the unrevealed door
	 * The user has to get the correct door 3 times in a row to progress to the next room. 
	 * If they get the wrong door, they are told a random fun fact out of 9 possible facts 
	 * Once the user gets three doors in a row correct, they are allowed an input to move into the next room. they do regardless. 
	 */
	public static void roomThree()
	{
		//print statement telling the user what room they are in
		System.out.println("\033[1mYou are in Room 3." + normal);
		
		//creates a String variable for monty's text color and italic
		String monty = "\033[38;5;81m\033[3m";
		
		//print statements introducing the user to the room and monty, who prompts the user for a response
		System.out.println("You see three doors lined up. None of them have the same exit sign as before. You consider walking up to one of the doors and opening it at random until a robotic voice speaks up.\n"
				+ "His voice sounds eerily familiar and it has a slight echo.");
		System.out.println(monty + "\"STOP! Don’t open those doors yet, friend! I still have to explain the RULES, silly!\"" + normal);
		System.out.println("A TV with legs appears from seemingly nowhere. On its screen is a yellow smiley face whose mouth flaps open and close as it speaks. As he does, a fun little jingle plays.");
		System.out.println(monty + "\"My name is MONTY! Welcome to my HALL of doors! Get it?\"" + normal);
		
		//allows the user to make an input
		new String(myReader.nextLine());
		
		//print statement of monty explaining the rules and asking the user if they understand
		System.out.println(monty + """
				\"I DON’T CARE! The game is simple! One of these doors leads to the next room. The other two, NOTHING! All you have to do is choose a door.\" 
				\"Once you choose one, I will tell you a WRONG DOOR! What a twist! Then I’ll ask if you want to switch your door or not! Get it?\"""" + normal);

		//sets the user's input as a String variable 
		String input = new String(myReader.nextLine());
		
		//if statement to check if the user input yes 
		if (input.equalsIgnoreCase("Yes"))
		{
			//print statement of monty's reaction
			System.out.print(monty + "\"AMAZING! ");
		}
		//else if statement to check if the user input no
		else if (input.equalsIgnoreCase("No"))
		{
			System.out.print(monty + "\"TOO BAD! ");
		}
		//else statement of if the user didn't input yes or no
		else 
		{
			System.out.print(monty + "\"...okay! ");
		}
		
		//print statement of monty telling the user they need a correct door three times in a row to move on and starting the game 
		System.out.println("Alright, let’s start! Also, you have to guess the correct door 3 TIMES IN A ROW! Now start!\"" + normal);
		
		//for loop that creates an int i to represent the correct door streak of the user 
		//the loop runs as long as i is less than 3
		for (int i = 0; i < 3; System.out.println(""))
		{
			//int variables for the monty hall games
			//randomly generated value from 1-3 to represent which door is the correct one
			int winDoor = ((int)(Math.random() * 3) + 1);
			//int value of the user's door
			int pickedDoor = 0;
			//int value of the door that is revealed to the user 
			int revealedDoor = 0;
			//randomlt generated value from 1-9 to represent which random fact to reveal to the user 
			int randomFact = ((int)(Math.random() * 9) + 1);
			
			//while loop to allow the user to make multiple inputs until they input a correct answer
			while (true)
			{
				//Print statement asking the user for a response and telling them the expected responses are "one, two," or "three"
				System.out.println(monty + "\"Which door would you like to choose??? Your options are: 'One' 'Two' or 'Three'\"!" + normal);
				
				//Sets the user's input as a string variable that is used to determine which int value to return 
				String pick = new String(myReader.nextLine());
				
				//if statement to check if the user inputs "one," then return 1
				if (pick.equalsIgnoreCase("One") || pick.equals("1"))
				{
					//returns 1 to represent door 1 has been picked
					pickedDoor = 1;
					//breaks loop since a correct answer was input
					break;
				}
				//else if the user inputs "two," then return 2
				else if (pick.equalsIgnoreCase("Two") || pick.equals("2"))
				{
					//returns 2 to represent door 2 has been picked
					pickedDoor = 2;
					break;
				}
				//else if the user inputs "three," then return 3
				else if (pick.equalsIgnoreCase("Three") || pick.equals("3"))
				{
					//returns 3 to represent door 3 has been picked 
					pickedDoor = 3;
					break;
				}
				//if the user inputs a response that isn't one, two, three or 1, 2, 3 allows user to reinput a guess 
				else
				{
					//Print statement telling the user their input is invalid and to retype another input 
					System.out.println(monty + "\"Oh, I'm sorry. I don't believe I quite heard you correctly! TRY AGAIN!\"");
				}
			}
			
			//Random int generator that returns either 0 or 1 set as a variable to make a makeshift coin flip 
			int coinFlip = (int)(Math.random() * 2);
			
			//Print statements telling the player that a wrong door will be revealed and which door number it is 
			System.out.println(monty + "\"OH HO HO! INTERESTING CHOICE!!! WANNA KNOW WHAT WILL MAKE THIS EVEN MORE INTERESTING????\"");
			System.out.print("\"I shall reveal to you a wrong door! One of the wrong doors is DOOR NUMBER ");
			
			//if statement to check if the player's door is door 1. if it is, then the revealed door is 2 or 3 depending on the winner door
			if (pickedDoor == 1)
			{
				//if statetement to check if the winner door is door 2 so that door isn't revealed and reveals door 3 instead. Also checks for another possibility where door 3 is revealed which is if door 1 is the winner door and the coin flip lands on 0. 
				if (winDoor == 2 || (winDoor == 1 && coinFlip == 0))
				{
					//sets revealed door to 3
					revealedDoor = 3;
				}
				//else statement of if the winner door is door 3 so that door isn't revealed and reveals door 2 instead. Also includes another possibility where door 2 is revealed which is if door 1 is the winner door and the coin flip lands on 1. 
				else 
				{
					//sets revealed door to 2 
					revealedDoor = 2;
				}
			}
			//else if statement to check if the player's door is door 2. if it is, then the revealed door is either 1 or 3 depending on the winner door
			else if (pickedDoor == 2)
			{
				//if statetement to check if the winner door is door 1 so that door isn't revealed and reveals door 3 instead. Also checks for another possibility where door 3 is revealed which is if door 2 is the winner door and the coin flip lands on 0. 
				if (winDoor == 1 || (winDoor == 2 && coinFlip == 0))
				{
					//sets revealed door to 3
					revealedDoor = 3;
				}
				//else statement of if the winner door is door 3 so that door isn't revealed and reveals door 1 instead. Also includes another possibility where door 1 is revealed which is if door 2 is the winner door and the coin flip lands on 1. 
				else 
				{
					//sets revealed door to 1
					revealedDoor = 1;
				}
			}
			//else statment of if the player's door is door 3. if it is, then the revelaed door is either 1 or 2 depending on the winner door
			else
			{
				//if statetement to check if the winner door is door 1 so that door isn't revealed and reveals door 2 instead. Also checks for another possibility where door 2 is revealed which is if door 3 is the winner door and the coin flip lands on 0. 
				if (winDoor == 1 || (winDoor == 3 && coinFlip == 0))
				{
					//sets revealed door to 2
					revealedDoor = 2;
				}
				//else statement of if the winner door is door 2 so that door isn't revealed and reveals door 1 instead. Also includes another possibility where door 1 is revealed which is if door 3 is the winner door and the coin flip lands on 1. 
				else 
				{
					//sets revealed door to 1
					revealedDoor = 1;
				}
			}
			
			//print statement of the revealed door number
			System.out.println(revealedDoor + "!\"" + normal);
			
			//Print statement prompting the user for a response of whether they would like to switch which door they picked or not. Tells them the expected responses are "yes" or "no"
			System.out.println(monty + "\"Now, would you like to switch your door? Answer, me 'Yes' or 'No'.\"");
				
			//Instantiates an int variable to represent the value of the door that the user is asked to switch to or not 
			int switchDoor;
				
			//The following if statements check which door the player picked and which door was revealed to determine which door the player potentially switches to since they can't switch to either one. Then sets the switchDoor value appropriately. 
			//if statement to check if the player picked door 1. 
			if (pickedDoor == 1)
			{
				//if statement to check if the revealed door is door 3. If it is, then the switch door can only be door 2.
				if (revealedDoor == 3)
				{
					//sets the switch door to 2 to represent the 2nd door 
					switchDoor = 2;
				}
				//else statement of if the revealed door is door 2. If it is, then the switch door can only be door 3.
				else
				{
					//sets the switch door to 3 to represent the 3rd door 
					switchDoor = 3;
				}
			}
			//else if statement to check if the player picked door 2. 
			else if (pickedDoor == 2)
			{
				//if statement to check if the revealed door is door 3. If it is, then the switch door can only be door 1.
				if (revealedDoor == 3)
				{
					//sets the switch door to 1 to represent the 1st door 
					switchDoor = 1;
				}
				//else statement of if the revealed door is door 1. If it is, then the switch door can only be door 3.
				else
				{
					//sets the switch door to 3 to represent the 3rd door 
					switchDoor = 3;
				}
			}
			//else statement of if the player picked door 3.
			else
			{
				//if statement to check if the revealed door is door 2. If it is, then the switch door can only be door 1.
				if (revealedDoor == 2)
				{
					//sets the switch door to 1 to represent the 1st door 
					switchDoor = 1;
				}
				//else statement of if the revealed door is door 1. If it is, then the switch door can only be door 2.
				else
				{
					//sets the switch door to 2 to represent the 2nd door 
					switchDoor = 2;
				}
			}
				
			//Print statement telling the user which door the currently have picked and which door they will switch to if they agree 
			System.out.println("\"You would be switching from Door " + pickedDoor + " to Door " + switchDoor + "!\"" + normal);
			
			//while loop to allow the user to make multiple inputs until they input a correct answer
			while (true)
			{
				//Sets the user's input as a string variable that is used to determine which int value to return 
				String switchDecision = new String(myReader.nextLine());
	
				//if statement to check if the player types "yes," agreeing to switch their door. Then it sets their player door value as the value of the door they switch to 
				if (switchDecision.equalsIgnoreCase("Yes"))
				{
					//changes the player's door value to the door value of the one they switch to
					pickedDoor = switchDoor;
					//breaks loop since a correct answer was input
					break;
				}
				//else if statement to check if the player types "no," not wanting to switch their door. Then it returns the value of their current door. 
				else if (switchDecision.equalsIgnoreCase("No"))
				{
					break;
				}
				//if the user inputs a response that isn't "yes" or "no," allows user to reinput a guess 
				else
				{
					//Print statement telling the user their input is invalid and prompts them to answer again 
					System.out.println(monty + "\"Uhh.... Say that again?\"" + normal);
				}
			}
			
			//Print statement telling the user the game is done and reveals the status of the door they currently have picked 
			System.out.println(monty + "\"Well, well, well. Now that your decisions have been made, this round has come to an end!\"");
			System.out.print("\"I SHALL NOW REVEAL THAT YOUR DOOR IS ");
			
			//if statment to check if the player's door is the winning door 
			if (pickedDoor == winDoor)
			{
				//Print statement telling the user their door is correct and have won 
				System.out.print("CORRECT!!!! CONGRATULATIONS! ");
				//increases the user's correct answer streak by 1
				i ++;
				
				//if statements checking what correct answer streak the user has 
				if (i == 1)
				{
					//print statement of monty's reaction to the user's correct door depending on their streak 
					System.out.println("But, oh dear! The exit isn't here! Remember, THREE IN A ROW! Let's try again, shall we?\"" + normal);
				}
				else if (i == 2)
				{
					System.out.println("However, the exit’s not here either! But that's TWO DOWN! Only ONE to go! Let’s try again!\"" + normal);
				}
				else
				{
					System.out.println("AND LOOK AT THAT! THE EXIT! Well it’s about time!\"" + normal);
				}
			}
			//else statement of if the player's door is not the winning door. 
			else
			{
				//Print statement telling the user their door is incorrect and which door was the correct one 
				System.out.println("INCORRECT! Deepest apologies. You certainly tried your best! The correct door was Door " + winDoor + "!\"");
				//sets the user's correct answer streak back to 0 since they didn't get a correct door
				i = 0;
				
				//print statement telling the user that monty will reveal to them a fun fact for getting it wrong
				System.out.println("\"How unfortunate. Guess it's time to start from the beginning! THREE IN A ROW! But do not worry! I won't let you go with NOTHING! How about a fun fact to cheer you up?\"");
				
				//if statements to check the value of the randomFact int to know which fact to reveal
				if (randomFact == 1)
				{
					//print statement of the fun fact that corresponds with the int value 
					System.out.println("\"Tomatoes are disgusting! They are a fruit sent by the devil himself! Don’t trust me? THAT’S FAIR!\"" + normal);
				}
				else if (randomFact == 2)
				{
					System.out.println("\"My favorite color is RED! What do you mean you didn’t need to know that? I thought it was fun!\"" + normal);
				}
				else if (randomFact == 3)
				{
					System.out.println("\"Scotland loves unicorns due to the symbolism of POWER and PURITY according to Celtic mythology!\"" + normal);
				}
				else if (randomFact == 4)
				{
					System.out.println("\"The square root of TWO is an irrational number, so it has no end! If I had to estimate it though, I'd say around 1.41421356237!\"" + normal);
				}
				else if (randomFact == 5)
				{
					System.out.println("\"Our Solar System has only one star, the Sun, but most systems have MORE!\"" + normal);
				}
				else if (randomFact == 6)
				{
					System.out.println("\"When they are SCARED, ostriches will lie down in an attempt to hide in its surroundings!\"" + normal);
				}
				else if (randomFact == 7)
				{
					System.out.println("\"The scientific name for RATS is rattus!\"" + normal);
				}
				else if (randomFact == 8)
				{
					System.out.println("\"Your ACTIONS have CONSEQUENCES! You never know what’s going to happen!\"" + normal);
				}
				else
				{
					System.out.println("\"Your friends are WATCHING! Every single one! And they react to what you do, so be careful!\"" + normal);
				}
			}
		}
		
		//print statement telling the user about the exit and asking them if they want to go through 
		System.out.println("""
				You open the last door and see another door behind it. This time, you see the same exit sign above. This is it. 
				You turn around to take one last look at all the doors you had to open to get here. However, you see nothing. Just an empty room with the door you walked through to get here. 
				Not even Monty is here anymore. It's all empty. A blank slate. It must be time to walk through the door now. Continue into Room 4? Yes or No?""");
		
		//sets the user's input to a String variable
		String roomPick = new String(myReader.nextLine());
		
		//if statement to check if the user input yes
		if (roomPick.equalsIgnoreCase("Yes"))
		{
			//progresses the user into the next room
			System.out.println("You and all your friends walk through the door.");
		}
		//else if statement to check if the user input no
		else if (roomPick.equalsIgnoreCase("No"))
		{
			System.out.println("You wait for a moment. Nothing happens. You walk through the door.");
		}
		//else statement of if the user didn't input yes or no
		else
		{
			System.out.println("You walk through the door anyway.");
		}

		//creates a space between lines for organization 
		System.out.println("");		
	}
	
	
	/**
	 * This method is room 5 that the user plays through. AKA the moral angel room
	 * The print statements introduce the room and the angelic being and tells the user that they are to judge their friends from best to worst.
	 * The user is given the option to ask all their friends what the worst thing they've ever done is. 
	 * Once the user is done takling or chooses not to, they rank their friends from best to worst.
	 * Then the angel asks the user if they want to spare the friend they ranked as the worst. If so, they die, if not, they live. Then the user continues to the next room.
	 */
	public static void roomFive()
	{
		//print statement telling the user what room they are in
		System.out.println("\033[1mYou are in Room 5." + normal);
		
		//creates a String variable for the angel's text color and italic 
		String angel = "\033[3m\033[38;5;229m";
		
		//print statements intoducing the room and the angelic being.
		System.out.println("An angelic being stands in the middle of the room. You try to make out features, but its holy glowing fills your vision with white. \nAll you can tell is that the being is very tall, as tall as a skyscraper. It speaks with a clear and echoey voice:");
		System.out.println(angel + "\"Welcome, children. You wish to continue into the next room, but first, justice must be served. One among you has a tainted heart and must answer for their sins.\"");
		System.out.print(normal + "The angel turns to you. ");
		
		//if statement to check if the user is a good person
		if (Character.userGoodPerson() == true)
		{
			//print statement telling the user that they are to rank their friends because they are good 
			System.out.println(angel + "\"I sense a light within your soul. Surely you have the judgment to rank each of your hearts.\"");
		}
		//else if statement to check if the user is a bad person
		else if (Character.userGoodPerson() == false)
		{
			//print statement telling the user that they are to rank their friends because they are bad and could tell who is bad 
			System.out.println(angel + "\"I sense impurity within your soul. Surely you have the experience to judge each of your hearts.\"");
		}
		
		//print statement telling the user they have the option to talk to their friends and they have to rank their friends from best to worst
		System.out.println(angel + "\"If you wish, converse with your friends. May your conversation guide your heart while you judge. Please list to me your friends in order from the purest heart to the darkest heart.\"");
		
		//creates a space between lines for organization
		System.out.println("");
		
		//creates int variables to keep track of how many times the user has talked to a character
		int girlTalkTo = 0;
		int doctorTalkTo = 0;
		int pastorTalkTo = 0;
		//creates a boolean to keep track of whether the user has talked to the pastor after the doctor said to
		boolean pastorInfo = false;
		
		//while loop to allow the user to talk to multiple friends
		while (true)
		{
			//print statement prompting the user for a response. the user is to type the name of the person they'll talk to or type "no" to stop talking
			System.out.println("\033[0m\033[1mDo you wish to ask your friends what's the worst thing they've ever done? Type who you'll talk to. Type \"No\" if not.\033[0m");
		
			//sets the user's input to a String variable
			String talkTo = new String(myReader.nextLine());
			
			//if statement to check if the user chose to talk to the dog and the dog is still alive
			if (talkTo.equalsIgnoreCase("Dog") && dog.charAlive())
			{
				//print statement of dog's dialogue
				System.out.println(dogCol + "\"Woof!\" " + normal + "He wags his tail again. What a good boy.");
			}
			//else if statement of if the user chose to talk to the little girl
			else if (talkTo.equalsIgnoreCase("Little Girl"))
			{
				//if statement to check if the user hasn't talked to the little girl before
				if (girlTalkTo == 0)
				{
					//print statement of little girl's worst sin. then she asks if she is a bad person, prompting the user for a response
					System.out.println(girlCol + "\"Uhm… I told my mommy I didn’t eat a cookie when I did.. I’m sorry. Am I bad?\"" + normal);
					//while loop to allow the user to make multiple inputs until they put a correct one
					while (true)
					{
						//sets the user's input to a String variable 
						String girlBad = new String(myReader.nextLine());
						//if statement to check if the user input "yes" 
						if (girlBad.equalsIgnoreCase("Yes"))
						{
							//print statement of the little girl's reaction and subtracts from her opinion by 3
							System.out.println("She frowns and starts to tear up.");
							littleGirl.subOpinion(3);
							//breaks the loop since a correct answer was input
							break;
						}
						//else if statement of if the user input "no"
						else if (girlBad.equalsIgnoreCase("No"))
						{
							//print statement of the little girl's reaction and adds to her opinion by 5
							System.out.println("She smiles at you.");
							littleGirl.addOpinion(5);
							//breaks the loop since a correct answer was input
							break;
						}
						//else statement of if the user didn't input "yes" or "no"
						else
						{
							//print statement telling the user to type "yes" or "no" and asks the question again
							System.out.println("Yes or No, is she a bad?");
						}
					}
					//increases the amount of times the user has talked to the little girl by one
					girlTalkTo++;
				}
				//else statement of if the user has talked to the little girl before
				else 
				{
					//print statement of little girl's repeat dialogue
					System.out.println(girlCol + "\"I told you! I ate cookies, remember?\"" + normal);
				}
			}
			//else if statement of if the user has chosen to talk to the doctor
			else if (talkTo.equalsIgnoreCase("Doctor"))
			{
				//if statement of if the user hasn't talked to the doctor before
				if (doctorTalkTo == 0)
				{
					//print statement telling the user the doctor is silent and asks them if they want to ask him again, prompting a "yes" response 
					System.out.println(doctorCol + "\"...\" " + normal + "He remains silent. He’s hiding something. But what? Do you ask him again? Type \"Yes\" if so.");
					//sets user's input as a String variable
					String askDoctor = new String(myReader.nextLine());
					
					//if statement to check if the user input "yes"
					if (askDoctor.equalsIgnoreCase("Yes"))
					{
						//print statement of doctor's response and tells the user to talk to the pastor
						System.out.println(doctorCol + "\"I’ve done some horrible things. In my mind, it’s justified. But that doesn’t mean I’m proud of it. I’m willing to be honest with you, but first, speak to the Pastor. He’s done worse things.\"" + normal);
					}
					else
					{
						//print statement of the doctor's dialogue and tells the user to talk to the pastor 
						System.out.println("You are about to walk away, but he speaks up. " + doctorCol + "\"I’ve done some horrible things. Things I am not proud of. I’ve justified it in my mind, but I understand you may not.\"\n\"I won’t speak further. If you want my advice though, speak to the Pastor.\" " + normal + "He walks away.");
					}
					//increases the amount of times the user has talked to the doctor by one
					doctorTalkTo++;
				}
				//if statement to check if the user has talked to the doctor 2 times (one from inital convo, one from after they talk to the pastor)
				else if (doctorTalkTo == 2)
				{
					//print statement of doctor's repeated dialogue
					System.out.println(doctorCol + "\"I've said all there is to say.\"" + normal);				
				}
				//else if statement to check if the user has talked to the pastor after the doctor 
				else if (pastorInfo == true)
				{
					//print statement of the doctor's dialogue
					System.out.println(doctorCol + "\"I see you’ve spoken to him. Well, I am a man of my word. During my many years working, I’ve lost a few patients. Some were not accidents.\"\n\"It’s horrible—having to tell someone I did all I could, knowing it was a lie.\"\n\"It was for my best interest. People paid me to do it, threatened my life, and I was deep in debt. I’m not proud, but it’s the truth. Make your judgment.\"" + normal);
					//adds 3 to the doctor's opinon 
					doctor.addOpinion(3);
					//increases the amount of times the user has talked to the doctor by one
					doctorTalkTo++;
				}
				//else statement of if the user has only talked to the doctor once and hasn't talked to the pastor after the doctor 
				else
				{
					//print statement of the doctor's response
					System.out.println(doctorCol + "\"Speak to the Pastor first.\" " + normal + "He walks away.");
				}
			}
			//else if statement to check if the user has chosen to talk to the pastor
			else if (talkTo.equalsIgnoreCase("Pastor"))
			{
				//if statement to check if the user hasn't talked to the pastor before
				if (pastorTalkTo == 0)
				{
					//print statement of the pastor's response
					System.out.println(pastorCol + "\"What? The worst thing I’ve ever done? Ha! How much evil do you think I could do? I-I’m a man of God! My sins are forgiven!\"" + normal);
					//increases the amount of times the user has talked to the pastor by one 
					pastorTalkTo ++;
				}
				//else statement of if the user has talked to the pastor before
				else
				{
					//print statement of the pastor's repeated dialogue
					System.out.println(pastorCol + "\"Aha... I- Uhm- think you've already spoken to me. I don't think there's much else to talk about!\"" + normal);
				}
				
				//if statement to check if the user has talked to the doctor and if they haven't spoken to the pastor after the doctor said to 
				if (doctorTalkTo == 1 && pastorInfo == false)
				{
					//print statement of the pastor's deflecting response and asks if the user wants to ask him again, prompting a "yes" response 
					System.out.println("You tell him the Doctor said you should talk to him. " + pastorCol + "\"H-He said that? Ah- Well- You see… I- Uh-\" " + normal + "He stutters anxiously. He’s hiding something. Do you ask him again? Type \"Yes\" if so.");
					//sets the user's input as a String 
					String askPastor = new String(myReader.nextLine());
					
					//if statement to check if the user input "yes"
					if (askPastor.equalsIgnoreCase("Yes"))
					{
						//print statement of the pastor's response
						System.out.println(pastorCol + "\"I’ve… killed someone. But I’ve repented! All is forgiven. I-I mean, sure, he didn’t deserve it, but I’m clean!\" " + normal + "He’s scared. He’s starting to ramble now. " + pastorCol + "\n\"He was just there, and he was in my way. But I swear, I’m not a bad person! Where I’ve hid the body, it’s no place the police could find… I…\" " + normal + "\nHe’s silent now. It seems he’s realized he said too much.");
						//subtracts 7 from the pastor's opinion because he doesn't like people finding out that he's secretly a bad person >:(
						pastor.subOpinion(7);
					}
					//else statement to check if the user input anything but "yes"
					else
					{
						//print statement of the pastor's response
						System.out.println("You walk away. " + pastorCol + "\"Y-Yes, you best move on! No bother speaking to me, haha!\"" + normal);
						//adds 1 to the pastor's opinion
						pastor.addOpinion(1);
					}
					//sets boolean to true since the user has talked to the pastor after talking to the doctor
					pastorInfo = true;
				}
			}
			//else if statement to check if the user input "no" 
			else if (talkTo.equalsIgnoreCase("No"))
			{
				//breaks loop so the user stops talking to friends
				break;
			}
			//else statement of if the user input something that wasn't the name of an available friend or "no"
			else
			{
				//print statement telling them their input is invalid and to try again
				System.out.println("Friend not found. Try again.");
			}
		}
		
		//creates a space between lines for organization
		System.out.println("");
		
		//creates Strings that represent the judgment ranking spots. four of them for the four friends max the user can judge
		String judge1;
		String judge2;
		String judge3;
		String judge4;
		
		//if statement to check if the dog is alive. if so, then the user has four people to judge
		if (dog.charAlive())
		{
			//print statement telling the user it is time to rank their friends from best to worst and prompts them to type the name of their first choice
			System.out.print("The angel speaks again. ");
			System.out.println(angel + "\"I see... Then it must be time to make judgments. Name to me your friends in order from purest heart to darkest heart. Which friend is first?\"");
			//calls a method so the user can choose who to rank first and sets their input as the judge1 variable
			judge1 = makeYourChoice();
			//if statement checking who the character chose to judge first
			if (judge1.equals("Little Girl"))
			{
				//sets the character's availability to false
				littleGirl.charAvailable(false);
			}
			else if (judge1.equals("Doctor"))
			{
				doctor.charAvailable(false);
			}
			else if (judge1.equals("Dog"))
			{
				dog.charAvailable(false);
			}
			else if (judge1.equals("Pastor"))
			{
				pastor.charAvailable(false);
			}
			
			//print statement prompting the user to choose who to rank next
			System.out.println(angel + "\"Interesting decision. Which of your friends is next?\"");
			//while loop that allows the user to make multiple inputs if they make a repeated choice
			while (true)
			{
				//calls a method so the user can choose who to rank second and sets their input as the judge2 variable
				judge2 = makeYourChoice();
				//if statement to check if their second judegment was the same as their first judegment
				if (judge2.equals(judge1))
				{
					//print statement telling the user they cannot repeat names and to try again
					System.out.println(angel + "\"You've already named this friend. Name me a different one.\"");
				}
				//else statement of if their second judegment is unique
				else
				{
					//breaks loop since there was a correct input
					break;
				}
			}
			//if statement checking who the character chose to judge second
			if (judge2.equals("Little Girl"))
			{
				//sets the character's availability to false
				littleGirl.charAvailable(false);
			}
			else if (judge2.equals("Doctor"))
			{
				doctor.charAvailable(false);
			}
			else if (judge2.equals("Dog"))
			{
				dog.charAvailable(false);
			}
			else if (judge2.equals("Pastor"))
			{
				pastor.charAvailable(false);
			}
			
			//print statement prompting the user to choose who to rank next
			System.out.println(angel + "\"Which of your friends is next?\"");
			//while loop that allows the user to make multiple inputs if they make a repeated choice
			while (true)
			{
				//calls a method so the user can choose who to rank third and sets their input as the judge3 variable
				judge3 = makeYourChoice();
				//if statement to check if their third judegment was the same as their first or second judegment
				if (judge3.equals(judge1) || judge3.equals(judge2))
				{
					//print statement telling the user they cannot repeat names and to try again
					System.out.println(angel + "\"You've already named this friend. Name me a different one.\"");
				}
				//else statement of if their third judegment is unique
				else
				{
					//breaks loop since there was a correct input
					break;
				}
			}
			//if statement checking who the character chose to judge third
			if (judge3.equals("Little Girl"))
			{
				//sets the character's availability to false
				littleGirl.charAvailable(false);
			}
			else if (judge3.equals("Doctor"))
			{
				doctor.charAvailable(false);
			}
			else if (judge3.equals("Dog"))
			{
				dog.charAvailable(false);
			}
			else if (judge3.equals("Pastor"))
			{
				pastor.charAvailable(false);
			}
			
			//print statement prompting the user to choose who to rank last
			System.out.println(angel + "\"Which of your friends is last?\"");
			//while loop that allows the user to make multiple inputs if they make a repeated choice
			while (true)
			{
				//calls a method so the user can choose who to rank last and sets their input as the judge4 variable
				judge4 = makeYourChoice();
				//if statement to check if their last judegment was the same as their first, second, or third judegment
				if (judge4.equals(judge1) || judge4.equals(judge2) || judge4.equals(judge3))
				{
					//print statement telling the user they cannot repeat names and to try again
					System.out.println(angel + "\"You've already named this friend. Name me a different one.\"");
				}
				//else statement of if their last judegment is unique
				else
				{
					//breaks loop since there was a correct input
					break;
				}
			}
			//if statement checking who the character chose to judge last
			if (judge4.equals("Little Girl"))
			{
				//sets the character's availability to false
				littleGirl.charAvailable(false);
			}
			else if (judge4.equals("Doctor"))
			{
				doctor.charAvailable(false);
			}
			else if (judge4.equals("Dog"))
			{
				dog.charAvailable(false);
			}
			else if (judge4.equals("Pastor"))
			{
				pastor.charAvailable(false);
			}
			
			//creates a space between lines for organization
			System.out.println("");
			
			//if statement to check if the user put either the little girl or the dog as their last judgment
			if(judge4.equals("Little Girl") || judge4.equals("Dog"))
			{
				//print statement of the angel's response 
				System.out.println(angel + "\"I see… You claim the " + judge4 + " is the worst one of all. I sense light within their soul. But, if this is the choice you want, I will go through. Justice shall be served.");
			}
			//else if statement to check if the user put the doctor as their last judgment
			else if (judge4.equals("Doctor"))
			{
				//print statement of the angels response
				System.out.println(angel + "\"I see… You claim the Doctor is the worst one of all. I understand, for there is certainly a darkness in their soul.\"\n\"The darkest soul, however, I don’t sense in him. Any case, justice shall be served.");
			}
			//else statement of if the user put the pastor as their last judgment
			else
			{
				//print statements of the angel's response and the pastor's response
				System.out.println(angel + "\"I see… The Pastor is the worst one of all. No matter the darkness in the other’s hearts, for this one is the worst. I sense no regret in this man. Justice shall be served.\"");
				System.out.print(normal + "The Pastor interrupts. " + pastorCol + "\"B-But I’m a forgiven man!\"" + normal + "\nThe angel responds, ");
				System.out.println(angel + "\"Did God forgive you, or did you forgive yourself in the name of God?\"");
			}
			
			//print statement asking the user if they want to spare their last choice or not, prompting a yes or no response
			System.out.println(normal + "The angel turns to you and asks if the " + judge4 + " should be forgiven for their sins. Do you spare the " + judge4 + "?");
			//while loop that allows the user to make multiple inputs if don't input yes or no
			while (true)
			{
				//sets the user's input as a String variable 
				String forgive = new String(myReader.nextLine());
				
				//if statement to check if the user input "yes"
				if (forgive.equalsIgnoreCase("Yes"))
				{
					//print statement of the angel's response 
					System.out.println(angel + "\"Very well. I trust your judgment. May what you’ve learned in this room guide you through your journey. Go forth.\"");
					//breaks loop since there was a correct input
					break;
				}
				//else if statement to check if the user input "no"
				else if (forgive.equalsIgnoreCase("No"))
				{
					//print statement of the angel killing the user's last choice 
					System.out.println(normal + "The angel sends forth a bright beam of light onto the " + judge4 + ".\nAs the light dissipates, you see that the " + judge4 + " is nowhere to be seen. Justice has been served.");
					
					//if statement to check if the user picked the little girl as their last choice
					if(judge4.equals("Little Girl"))
					{
						//sets the little girl's alive status as dead
						littleGirl.charAlive(false);
					}
					//else if statement to check if the user picked the doctor as their last choice
					else if(judge4.equals("Doctor"))
					{
						//sets the doctor's alive status as dead
						doctor.charAlive(false);
					}
					//else if statement to check if the user picked the pastor as their last choice
					else if(judge4.equals("Pastor"))
					{
						//sets the pastor's alive status as dead
						pastor.charAlive(false);
					}
					//else if statement to check if the user picked the dog as their last choice
					else
					{
						//sets the dog's alive status as dead
						dog.charAlive(false);
					}
					//breaks the loop since there was a correct input
					break;
				}
				//else statement of if the user didn't input yes or no
				else
				{
					//print statement telling the user to type yes or no and asks the question again
					System.out.println(normal + "Yes or No, do you spare the " + judge4 + "?");
				}
			}
			
		}
		//else statement of if the dog isn't alive. the user has three people to judge
		else 
		{
			//print statement telling the user it is time to rank their friends from best to worst and prompts them to type the name of their first choice
			System.out.print("The angel speaks again." );
			System.out.println(angel + "\"I see... Then it must be time to make judgments. Name to me your friends in order from purest heart to darkest heart. Which friend is first?\"");
			//calls a method so the user can choose who to rank first and sets their input as the judge1 variable
			judge1 = makeYourChoice();
			//if statement checking who the character chose to judge first
			if (judge1.equals("Little Girl"))
			{
				//sets the character's availability to false
				littleGirl.charAvailable(false);
			}
			else if (judge1.equals("Doctor"))
			{
				doctor.charAvailable(false);
			}
			else if (judge1.equals("Dog"))
			{
				dog.charAvailable(false);
			}
			else if (judge1.equals("Pastor"))
			{
				pastor.charAvailable(false);
			}
			
			//print statement prompting the user to choose who to rank next
			System.out.println(angel + "\"Interesting decision. Which of your friends is next?\"");
			//while loop that allows the user to make multiple inputs if they make a repeated choice
			while (true)
			{
				//calls a method so the user can choose who to rank second and sets their input as the judge2 variable
				judge2 = makeYourChoice();
				//if statement to check if their second judegment was the same as their first judegment
				if (judge2.equals(judge1))
				{
					//print statement telling the user they cannot repeat names and to try again
					System.out.println(angel + "\"You've already named this friend. Name me a different one.\"");
				}
				//else statement of if their second judegment is unique
				else
				{
					//breaks loop since there was a correct input
					break;
				}
			}
			//if statement checking who the character chose to judge second
			if (judge2.equals("Little Girl"))
			{
				//sets the character's availability to false
				littleGirl.charAvailable(false);
			}
			else if (judge2.equals("Doctor"))
			{
				doctor.charAvailable(false);
			}
			else if (judge2.equals("Dog"))
			{
				dog.charAvailable(false);
			}
			else if (judge2.equals("Pastor"))
			{
				pastor.charAvailable(false);
			}
			
			//print statement prompting the user to choose who to rank last
			System.out.println(angel + "\"Which of your friends is last?\"");
			//while loop that allows the user to make multiple inputs if they make a repeated choice
			while (true)
			{
				//calls a method so the user can choose who to rank last and sets their input as the judge3 variable
				judge3 = makeYourChoice();
				//if statement to check if their last judegment was the same as their first or second judegment
				if (judge3.equals(judge1) || judge3.equals(judge2))
				{
					//print statement telling the user they cannot repeat names and to try again
					System.out.println(angel + "\"You've already named this friend. Name me a different one.\"");
				}
				//else statement of if their last judegment is unique
				else
				{
					//breaks loop since there was a correct input
					break;
				}
			}
			//if statement checking who the character chose to judge last
			if (judge3.equals("Little Girl"))
			{
				//sets the character's availability to false
				littleGirl.charAvailable(false);
			}
			else if (judge3.equals("Doctor"))
			{
				doctor.charAvailable(false);
			}
			else if (judge3.equals("Dog"))
			{
				dog.charAvailable(false);
			}
			else if (judge3.equals("Pastor"))
			{
				pastor.charAvailable(false);
			}
			
			//creates a space between lines for organization
			System.out.println("");
			
			//if statement to check if the user put the little girl as their last judgment
			if(judge3.equals("Little Girl"))
			{
				//print statement of the angels response
				System.out.println(angel + "\"I see… You claim the " + judge3 + " is the worst one of all. I sense light within their soul. But, if this is the choice you want, I will go through. Justice shall be served.");
			}
			else if (judge3.equals("Doctor"))
			{
				//print statement of the angels response
				System.out.println(angel + "\"I see… You claim the Doctor is the worst one of all. I understand, for there is certainly a darkness in their soul.\"\n\"The darkest soul, however, I don’t sense in him. Any case, justice shall be served.");
			}
			//else statement of if the user put the pastor as their last judgment
			else
			{
				//print statement of the angels response and pastor's response
				System.out.println(angel + "\"I see… The Pastor is the worst one of all. No matter the darkness in the other’s hearts, for this one is the worst. I sense no regret in this man. Justice shall be served.\"");
				System.out.print(normal + "The Pastor interrupts. " + pastorCol + "\"B-But I’m a forgiven man!\"" + normal + "\nThe angel responds, ");
				System.out.println(angel + "\"Did God forgive you, or did you forgive yourself in the name of God?\"");
			}
			
			//print statement asking the user if they want to spare their last choice or not, prompting a yes or no response
			System.out.println(normal + "The angel turns to you and asks if the " + judge3 + " should be forgiven for their sins. Do you spare the " + judge3 + "?");
			//while loop that allows the user to make multiple inputs if don't input yes or no
			while (true)
			{
				//sets the user's input as a String variable 
				String forgive = new String(myReader.nextLine());
				
				//if statement to check if the user input "yes"
				if (forgive.equalsIgnoreCase("Yes"))
				{
					//print statement of the angel's response 
					System.out.println(angel + "\"Very well. I trust your judgment. May what you’ve learned in this room guide you through your journey. Go forth.\"");
					
					//breaks loop since there was a correct input
					break;
				}
				//else if statement to check if the user input "no"
				else if (forgive.equalsIgnoreCase("No"))
				{
					//print statement of the angel killing the user's last choice 
					System.out.println(normal + "The angel sends forth a bright beam of light onto the " + judge3 + ".\nAs the light dissipates, you see that the " + judge3 + " is nowhere to be seen. Justice has been served.");
					
					//if statement to check if the user picked the little girl as their last choice
					if(judge3.equals("Little Girl"))
					{
						//sets the little girl's alive status as dead
						littleGirl.charAlive(false);
					}
					//else if statement to check if the user picked the doctor as their last choice
					else if(judge3.equals("Doctor"))
					{
						//sets the doctor's alive status as dead
						doctor.charAlive(false);
					}
					//else if statement to check if the user picked the pastor as their last choice
					else
					{
						//sets the pastor's alive status as dead
						pastor.charAlive(false);
					}
					//breaks loop since there was a correct input
					break;
				}
				//else statement of if the user didn't input yes or no
				else
				{
					//print statement telling the user to type yes or no and asks the question again
					System.out.println(normal + "Yes or No, do you spare the " + judge3 + "?");
				}
			}
		}
		
		//sets the character's availability back to true
		doctor.charAvailable(true);
		littleGirl.charAvailable(true);
		dog.charAvailable(true);
		pastor.charAvailable(true);

		
		//print statements of the room's ending and forcing the player into the next door
		System.out.println(normal + "The angel glows brighter, forcing you and all your friends to shut your eyes. Once you open them again, you see the exit door labeled \"Room 6\".");
		System.out.println("You consider your possibilities. You realize there's no other choice. You and all your friends walk through the door.");
		//creates a space between lines for organization
		System.out.println("");
	}

	
	
	/**
	 * This method is room 7 that the user plays through. AKA the lever room
	 * The print statements introduce the room and tells the user about the color coded levers. 
	 * Then the user is introduced to two new friends: attractive woman and jeff, and they are given the option to meet their friends
	 * The user is presented with a color coded sign with facts and the woman tells the user some of the facts are false and tells them yellow is one of them
	 * Then the user chooses one of their friends to ask for help for more information of the facts. 
	 * The user is presented with color coded buttons that tell the user statements on which levers to switch.
	 * Then the user has to choose which levers to switch in order to get the right combination to continue to the next room.
	 */
	public static void roomSeven()
	{

		//print statement telling the user what room they are in
		System.out.println("\033[1mYou are in Room 7." + normal);
		
		//print statement introducing the room and the new friends available to the player: attractive woman and jeff (i love jeff)
		System.out.println("""
				The first thing you notice about this room is that there are levers of different colors scattered around the room.
				They lie on the walls and on the floors. You see the exit door, but it's locked tight. It seems to be waiting for the right combination of levers to be opened.
				In the center of the room stand two individuals who are inspecting the levers. A woman dressed in red who is very attractive and a man in a blue polo shirt and khaki pants.
				""");
		
		//sets the alive status of the attractive woman and jeff to true 
		woman.charAlive(true);
		jeff.charAlive(true);
		
		//calls method to allow the user to meet their friends 
		meetCharacters();
		
		//creates a space between lines for organization
		System.out.println("");
		
		//print statement showing the user the color coded fact sign 
		System.out.println("""
				After looking around the room more, you notice a sign on one of the walls. You go to read it. Each line is in a different color which corresponds to one of the levers around the room. It reads:
				\033[38;5;1mThe square root of two is approximately 1.41421356237. 
				\033[38;5;3mAmelia Earhart is remembered as the first female aviator to fly solo across the Pacific Ocean. 
				\033[38;5;117mMost solar systems are binary, so they contain more than one star orbiting each other.
				\033[38;5;2mJames Watson and Francis Crick are credited with discovering the shape of DNA being a double helix. 
				\033[38;5;218mThe Inuits have a hundred different words for the word “snow.” 
				\033[38;5;172mTraces of cyanide can be determined by a bitter almond smell. 
				\033[38;2;255;154;0mThe Great Wall of China is visible from space. 
				\033[38;5;246mThe fur of a polar bear is white. 
				\033[38;5;177mWhen scared, ostriches will bury their heads in the sand. 
				\033[38;5;50mThe national animal of Scotland is a unicorn. 
				""" + normal);
		
		//print statement of the woman's dialogue telling the user some facts aren't true and the truth status of one of the facts 
		System.out.println("After you finish reading it, the Attractive Woman walks up to you.");
		System.out.print(womanCol + "\"You read it too? It’s weird. I get the feeling some of those facts are true and some aren’t. \nYellow for sure isn’t right. She flew across the Atlantic ocean. I’m unsure about everything else.\" " + normal);
		//print statement telling the user they are to ask one friend for more information, prompting a response 
		System.out.println("""
				She walks away.
				This information could be useful. You consider asking your other friends if they know anything about these facts, but this puzzle might take a while. 
				You want to get out of here as soon as possible. You decide to only ask one friend for help. 
				""");
		
		//calls the method allowing the user to choose a friend and sets the result as a String variable 
		String input = makeYourChoice();
		
		//if statement checking if the user chose the doctor 
		if (input.equals("Doctor"))
		{
			//doctor's information dialogue
			System.out.println(doctorCol + "\"I see. These facts are interesting. I can tell you that the green fact and the brown fact are true. I am unsure about the rest. I wish you luck on the puzzle.\"" + normal);
		}
		//else if statement checking if the user chose the pastor
		else if (input.equals("Pastor"))
		{
			//pastor's information dialogue
			System.out.print(pastorCol + "\"Ah… I see… Well, I know that turquoise is true! Took a trip to Scotland. Beautiful place…\" " + normal);
			System.out.println("He begins to ramble about his trip to Scotland. You walk away.");
		}
		//else if statement checking if the user chose the dog
		else if (input.equals("Dog"))
		{
			//dog's information dialogue
			System.out.print(dogCol + "\"Woof!\" " + normal);
			System.out.println("You get the sense that this dog might not be a useful source of information.");
		}
		//else if statement checking if the user chose the little girl
		else if (input.equals("Little Girl"))
		{
			//little girl's information dialogue
			System.out.println(girlCol + "Uhm… I don’t know… I-I remember my mommy telling me things about animals, but I don’t remember everything. I think purple and gray are wrong? My mommy worked at a zoo." + normal);
		}
		//else if statement checking if the user chose the attractive woman
		else if (input.equals("Attractive Woman"))
		{
			//attractive woman's information dialogue
			System.out.print(womanCol + "\"You’re asking me for help? I already told you everything I know. Not sure how else to help.\" " + normal);
			System.out.println("That was unproductive.");
		}
		//else statement of if the user chose jeff
		else
		{
			//jeff's information dialogue
			System.out.println(jeffCol + "\"Well, of course I can help ya, buddy! Lemme see… Mhm… Mhm…… Well these seem to be some fun facts! All in different colors. Glad I could help!\"" + normal);
			System.out.println("Jeff walks away. He just told you things you already knew.");
		}
		
		//creates a space between lines for organization
		System.out.println("");
		
		//print statement telling the user about the buttons 
		System.out.println("""
				You turn your attention away from the sign. On the other side of the room, you see ten buttons lined up in a row. The same number of facts and levers. Below each is a speaker. 
				Seems like if you press a button, something will play out of the speakers. You press each button in order. After each one, a voice plays out of the speaker. 
				This is what you hear after pressing all the buttons:""");
		//print statement telling the user what the buttons say color coded and that they have to start pressing levers 
		System.out.println("""
				\033[3m\033[38;5;1mThe red lever should be switched. 
				\033[38;5;3mAll truth-colored levers should be switched. 
				\033[38;5;117mThe pink lever shouldn’t be switched. 
				\033[38;5;2mSix levers should be switched. 
				\033[38;5;218mYellow shouldn’t be switched. 
				\033[38;5;172mThe lever of the same color as this fact should be switched. 
				\033[38;2;255;154;0mThe gray lever should be switched. 
				\033[38;5;246mThe turquoise lever shouldn’t be switched. 
				\033[38;5;177mThe colors that make up the color of this fact shouldn’t be switched. 
				\033[38;5;50mThe purple lever should be switched. 
				
				\033[0mThis information could be useful. You figure it’s time to start switching levers. You approach each lever in order of the colors on the sign.
				""");
		
		//while loop allowing the user to make multiple lever combo inputs if they are wrong 
		while (true)
		{
			//creates a String variable that acts as the user's lever combo declared as black since there are no inputs yet
			String leverInput = "";
			
			//for loop that allows the user to decide if they want to switch ten differen levers
			//creates an int i that represents the lever number
			//loops as long as i is less than or equal to 10 to allow 10 runs for 10 levers
			//i is increased by one after each run to present a new lever to switch 
			for (int i = 1; i <= 10; i++)
			{
				//if statements checking which lever number the user is currently on and changes the color of the text so it corresponds with the lever color 
				if (i == 1)
				{
					System.out.print("\033[38;5;1m");
				}
				else if (i == 2)
				{
					System.out.print("\033[38;5;3m");
				}
				else if (i == 3)
				{
					System.out.print("\033[38;5;117m");
				}
				else if (i == 4)
				{
					System.out.print("\033[38;5;2m");
				}
				else if (i == 5)
				{
					System.out.print("\033[38;5;218m");
				}
				else if (i == 6)
				{
					System.out.print("\033[38;5;172m");
				}
				else if (i == 7)
				{
					System.out.print("\033[38;2;255;154;0m");
				}
				else if (i == 8)
				{
					System.out.print("\033[38;5;246m");
				}
				else if (i == 9)
				{
					System.out.print("\033[38;5;177m");
				}
				else
				{
					System.out.print("\033[38;5;50m");
				}
				
				//print statement telling the user which lever number they are at and asks them if they want to switch it, prompting a response 
				System.out.println("\033[1mYou are currently looking at Lever " + i + ". Do you want to switch it?" + normal);
				
				//while loop that allows the user to make multiple inputs if they make an incorrect input
				while (true)
				{
					//sets the user's input to a String variable
					String pick = new String(myReader.nextLine());
					
					//if statement to check if the user input yes 
					if (pick.equalsIgnoreCase("Yes"))
					{
						//adds an "X" to the user's lever input String to represent a switched lever
						leverInput += "X";
						//breaks the loop since a ncorrect answer was input
						break;
					}
					//else if statement to check if the user input no
					else if (pick.equalsIgnoreCase("No"))
					{
						//adds an "O" to the user's lever input String to represent an unswitched lever
						leverInput += "O";
						//breaks the loop since a correct answer was input
						break;
					}
					//else statement of if the user didn't put yes or no
					else
					{
						//tells the user a yes or no answer is needed and reasks the question 
						System.out.println("Yes or No, do you want to switch Lever " + i + "?");
					}
				}
			}
			
			//creates a space between lines for organization
			System.out.println("");
			
			//if statement to check if the user's lever combination is the correct String
			if(leverInput.equals("XXXOOXOOXX"))
			{
				//breaks the loop since the correct lever combo was input 
				break;
			}
			//else statement of if the user's lever combo is wrong 
			else
			{
				//print statement telling the user their combo is wrong. then it gives them the option to look at the sign or the buttons again, prompting a response
				System.out.println("The door hasn't opened. It seems like this was the wrong combination. You go back and make sure all the levers are unflipped now and start again.");
				System.out.println("Before you start flipping levers again, do you want to look back at the sign or the buttons? If so type \"Sign\" or \"Buttons\". If not, type \"No\".");
				
				//while statement allowing the user to make multiple inputs to view multiple options or make multiple inputs if theirs was incorrect
				while (true)
				{
					//sets the user's input to a String variable 
					String look = new String(myReader.nextLine());
					
					//if statement to check if the user chose to look at the sign 
					if (look.equalsIgnoreCase("Sign"))
					{
						//print statement showing the user the color coded fact sign 
						System.out.println("""
								\033[38;5;1mThe square root of two is approximately 1.41421356237. 
								\033[38;5;3mAmelia Earhart is remembered as the first female aviator to fly solo across the Pacific Ocean. 
								\033[38;5;117mMost solar systems are binary, so they contain more than one star orbiting each other.
								\033[38;5;2mJames Watson and Francis Crick are credited with discovering the shape of DNA being a double helix. 
								\033[38;5;218mThe Inuits have a hundred different words for the word “snow.” 
								\033[38;5;172mTraces of cyanide can be determined by a bitter almond smell. 
								\033[38;2;255;154;0mThe Great Wall of China is visible from space. 
								\033[38;5;246mThe fur of a polar bear is white. 
								\033[38;5;177mWhen scared, ostriches will bury their heads in the sand. 
								\033[38;5;50mThe national animal of Scotland is a unicorn. 
								""" + normal);
						
						//print statement telling the user they also have the option to look at the buttons or to type no if they don't want to, prompting a response 
						System.out.println("Type \"Buttons\" to press the buttons again. Type \"No\" if not.");
					}
					//else if statement to check if the user chose to look at the buttons
					else if (look.equalsIgnoreCase("Buttons"))
					{
						//print statement telling the user what the buttons say color coded
						System.out.println("""
								\033[3m\033[38;5;1mThe red lever should be switched. 
								\033[38;5;3mAll truth-colored levers should be switched. 
								\033[38;5;117mThe pink lever shouldn’t be switched. 
								\033[38;5;2mSix levers should be switched. 
								\033[38;5;218mYellow shouldn’t be switched. 
								\033[38;5;172mThe lever of the same color as this fact should be switched. 
								\033[38;2;255;154;0mThe gray lever should be switched. 
								\033[38;5;246mThe turquoise lever shouldn’t be switched. 
								\033[38;5;177mThe colors that make up the color of this fact shouldn’t be switched. 
								\033[38;5;50mThe purple lever should be switched. 
								""" + normal);
						
						//print statement telling the user they also have the option to look at the sign or to type no if they don't want to, prompting a response 
						System.out.println("Type \"Sign\" to press look at the sign again. Type \"No\" if not.");
					}
					//else if statement to check if the user input no
					else if (look.equalsIgnoreCase("No"))
					{
						//breaks the loop since the user chose to not view anything else 
						break;
					}
					//else statement of if the user input something unexpected 
					else
					{
						//print statement telling the user their input is invalid and to try again 
						System.out.println("Invalid input. Try again.");
					}
				}
				
				//creates a space between lines for organization
				System.out.println("");
			}
		}
		
		//print statement telling the user their combination was correct and the door is open. then the user continues into the next room
		System.out.println("""
				You hear a loud beep coming from the exit door as it swings open on its own. Seems like that was the right combination. 
				Before you get the chance to, the Attractive Woman and Jeff bolt through the door, eager to leave the room. It occurs to you that you never asked how long the two were in this room. 
				You and the rest of your friends walk through the door. 
				""");
	}
	
	
	
	/**
	 * This method is room 11 that the user plays through. AKA the rubber rat room
	 * Print statements introduce the room and the puzzle to the user, which is a word scramble. The user is told the first scrambled sentence and then prompted to correctly unscramble it. 
	 * If the user doesn't make the correct input, they are to try again until they do. Once they do, the user is told the next scrambled sentence and prompted again for an input.
	 * The same thing happens and the user is told the third scrambled sentence. Then they are to do it one last time.
	 * Once the user unscrambles the three sentences, the door opens. Before the user continues into the next room, they are stopped by either the doctor or themself if the doctor died.
	 * They are prompted with the choice to help the rat man in the corner. if they don't, the continue into the next room. if they do, the rat mans waves a shiv at the user.
	 * The user is asked one last time if they want to help him. if they do, the rat man stabs himself to death. if not, the continue. the doctor's (if alive) opinion changes accordingly. 
	 */
	public static void roomEleven()
	{
		//print statement telling the user what room they are in
		System.out.println("\033[1mYou are in Room 11." + normal);
		
		//print statements introducing the room to the user 
		System.out.println("""
				The walls, the floors, the ceiling: They are all covered in foam rubber. It looks like the kind of room a mental asylum would have. To make matters worse, there are dozens of rats.
				It's a rubber room filled with rats. In the corner, you see a man wearing an animal fur coat that looks like a rat. He is rocking in the corner mumbling to himself.
				You try to get closer to him to talk. Once he sees you, he screams and hisses at you. As you back away, you are able to barely make out his insane ramblings.
				""");
		System.out.println("\033[3m\033[38;5;247m\"Crazy? I was crazy once. They locked me in a room. A rubber room. A rubber room with rats. And rats make me crazy...\" " + normal + "Over and over and over and over...");
		
		//print statements intoducing the puzzle to the user 
		System.out.println("""
				
				You and all your friends start to go crazy. You can no longer see straight and your hearing is distorted. You see what looks like a door with a sign above. It must be the exit. 
				There's a keypad with three lights blocking the door from opening. You go to take a closer look and see it needs an alphabetic input.
				Next to it is a piece of paper that has a few words scribbled on it. This be must the password. In all your craziness, however, the words are all jumbled up and weird.  You manage to make out:""");
				
		//print statement telling the user the first scambled sentence
		System.out.println("\033[3m\033[38;2;169;146;130mTeh eiscsntti rerefs ot atrs twhi hrtei ngsue aemn ratuts." + normal);
		
		//creates a space between lines for organization
		System.out.println("");
		
		//print statement telling the user they should pick a friend to ask about the puzzle
		System.out.println("You try to ask one of your friends if they understand the written words.");
		
		//calls the method that allows the user to pick who to talk to and sets it as a String variable 
		String pick = makeYourChoice();
		
		//if statements to check which character the user picked to talk to 
		if (pick.equals("Doctor"))
		{
			//print statements telling the user the character's scrambled dialogue 
			System.out.println(doctorCol + "\"I cn'at drea ayn fo thsi... lAl hte trtlsee era bseacrdml.\"" + normal);
			System.out.println("You have no clue what he said.");
		}
		else if (pick.equals("Little Girl"))
		{
			System.out.println(girlCol + "\"Is tsih a rodw alerbsmc? I loev dwor sablcsmer! I sude ot od ehmt whit my mymom lla eth tmei. I swa evner dgoo at tmeh hhtgou... ryrSo...\"" + normal);
			System.out.println("You have no clue what she said. She looks sad though.");
		}
		else if (pick.equals("Dog"))
		{
			System.out.println(dogCol + "\"oWof!\"" + normal);
			System.out.println("It sounded weird but you know exactly what he said. What he always says. Not the best one to ask.");
		}
		else if (pick.equals("Pastor"))
		{
			System.out.println(pastorCol + "\"Ah- I vahe no ulec... ohtSgemni tauob satr?\"" + normal);
			System.out.println("You have no clue what he said.");
		}
		else if (pick.equals("Attractive Woman"))
		{
			System.out.println(womanCol + "\"I cnat' edra ttha. ohW od uyo tnhik I ma?\"" + normal);
			System.out.println("You have no clue what she said but her tone was a little hostile.");
		}
		else if (pick.equals("Jeff"))
		{
			//print statement of jeff's normal dialogue. what a fun lil dude :3
			System.out.println(jeffCol + "\"Looks like a word scramble. Good luck!\"" + normal);
			System.out.println("His voice is oddly clear. Everything looks and sounds all messed up, but Jeff seems perfectly normal. Unfortunately, he just told you what you already knew.");
		}
		else if (pick.equals("Granny"))
		{
			System.out.println(grannyCol + "\"Oh eadr... I tinkh I nede ym sleassg... eWreh are hety won...\"" + normal);
			System.out.println("You have no clue what she said. She starts looking around elsewhere though. She seems distracted with her own things.");
		}
		
		//print statement telling the user it is time to start solving the puzzle 
		System.out.println("That wasn't the most productive. You turn back to the words and try to make sense of it.");
		
		//creates a space between lines for organization
		System.out.println("");
		
		//while loop to allow the user to make multiple inputs if they type something wrong
		while (true)
		{
			//print statement prompting the user for their keypad input
			System.out.println("\033[1mMake your input into the keypad." + normal);
			
			//sets the user's input to a String variable
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user input the correct unscrambled sentence 
			if (input.equalsIgnoreCase("The scientist refers to rats with their genus name rattus."))
			{
				//breaks the loop since the correct answer was typed 
				break;
			}
			//else statement of if the user didn't input the right sentence
			else
			{
				//print statement telling the user their input was wrong and to try again 
				System.out.println("");
				System.out.println("The keypad makes a loud incorrect buzzer noise. Seems like that wasn't right. You figure you better try again. There's nothing else to do.");
			}
		}
		
		//print statement telling the user that they got the first scramble right and that there is now another one 
		System.out.println("""
				
				You hear a small \033[3mding\033[0m noise coming from the keypad as one of the lights turn green. I guess that was right. 
				You look back at the piece of paper on the wall. The writing looks different now. Still jumbled and weird, but different nonetheless. Now it reads:""");
		
		//print statement telling the user the second scrambled sentence
		System.out.println("\033[3m\033[38;2;169;146;130mdoerlonPg xpoeeusr ot astr tnsed ot easuc ianiytns ni tepsitan." + normal);
		
		//creates a space between lines for organization
		System.out.println("");
		
		//while loop to allow the user to make multiple inputs if they type something wrong
		while (true)
		{
			//print statement prompting the user for their keypad input
			System.out.println("\033[1mMake your input into the keypad." + normal);
			
			//sets the user's input to a String variable
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user input the correct unscrambled sentence 
			if (input.equalsIgnoreCase("Prolonged exposure to rats tends to cause insanity in patients."))
			{
				//breaks the loop since the correct answer was typed 
				break;
			}
			//else statement of if the user didn't input the right sentence
			else
			{
				//print statement telling the user their input was wrong and to try again 
				System.out.println("");
				System.out.println("The keypad makes a loud incorrect buzzer noise. Seems like that wasn't right. You figure you better try again. There's nothing else to do.");
			}
		}
	
		//print statement telling the user that they got the second scramble right and that there is now another one 
		System.out.println("""
				
				You hear another small \033[3mding\033[0m noise as a second light turns green. It seems you are on the right track. 
				You look back at the piece of paper. A different, still scrambled, sentence is written on it. You read:""");
		
		//print statement telling the user the third scrambled sentence
		System.out.println("\033[3m\033[38;2;169;146;130murbbeR smoor aer tnendedi orf rczya epoepl hwo jynoe sart." + normal);

		//creates a space between lines for organization
		System.out.println("");
		
		//while loop to allow the user to make multiple inputs if they type something wrong
		while (true)
		{
			//print statement prompting the user for their keypad input
			System.out.println("\033[1mMake your input into the keypad." + normal);
			
			//sets the user's input to a String variable
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user input the correct unscrambled sentence 
			if (input.equalsIgnoreCase("Rubber rooms are intended for crazy people who enjoy rats."))
			{
				//breaks the loop since the correct answer was typed 
				break;
			}
			//else statement of if the user didn't input the right sentence
			else
			{
				//print statement telling the user their input was wrong and to try again 
				System.out.println("");
				System.out.println("The keypad makes a loud incorrect buzzer noise. Seems like that wasn't right. You figure you better try again. There's nothing else to do.");
			}
		}
		
		//print statement telling the user that the puzzle is done and that they are no longer crazy and can see straight now. They are about to continue through when they are stopped 
		System.out.println("""
				
				For the final time, you hear a small \033[3mding\033[0m noise as the last light turns green. The keypad plays a little jingle that sounds eerily familiar as the door swings open.
				As you take a deep breath, the air feels clearer. You didn't notice it before, but there must have been something in the air that was making you go crazy. 
				Maybe it was the rats. Maybe it was something else. Whatever it was, you're glad it's gone. You are about to walk through the door when something stops you. 
				""");
		
		//if statement to check if the doctor is still alive 
		if (doctor.charAlive() == true)
		{
			//print statement telling the user they are stopped by the doctor because he wants the user to help the rat man, prompting a response 
			System.out.println("""
					The Doctor puts his hand on your shoulder. As you turn to look at him, he has a look of concern on his face. Both of you turn your glance to the rat man.
					He continues to rock back and forth, mumbling the same phrase. Over and over and over... Even though the air is clear, he still is crazy. 
					He must have been here too long.""");
			System.out.println(doctorCol + "\"Can you help him? Do something, say something, I don't know. I've let so many people die in my life, I don't know if I can do it one more time.\"" + normal);
				
			//while loop to allow the user to make multiple inputs if they type something wrong
			while (true)
			{
				//sets the user's input to a String variable 
				String help = new String(myReader.nextLine());
					
				//if statement to check if the user input yes
				if (help.equalsIgnoreCase("Yes"))
				{
					//print statement of the user approaching the rat man but the rat man stops them. they user is asked if they want to continue helping him, promtping a response 
					System.out.println("You approach the rat man. As you do, he pulls out what looks like a homemade shiv. He yells at you to get back, swinging his shiv at you. Do you try to help him still?");
						
					//while loop to allow the user to make multiple inputs if they type something wrong
					while (true)
					{
						//sets the user's input to a String variable 
						String helpAgain = new String(myReader.nextLine());
							
						//if statement to check if the user input yes
						if (helpAgain.equalsIgnoreCase("Yes"))
						{
							//print statement of the user getting closer until the rat man kills himself. tells the user the doctor's reaction and continues them into the next room.
							System.out.println("As you get closer, he makes a shrill scream. He takes his shiv and stabs himself until he dies.");
							System.out.println("The Doctor turns away, clearly upset. You tried your best. That's what you tell yourself. You and all your friends continue into the next room.");
							//breaks the loop since a correct answer was input 
							break;
						}
						//else if statement to check if the user input no
						else if (helpAgain.equalsIgnoreCase("No"))
						{
							//print statement of the user backing away from the rat mat. tells the user the doctor's reaction and continues them into the next room.
							System.out.println("You back away from the rat man. He might be beyond help. As you do, he turns away from you and continues to rock back and forth, mumbling.");
							System.out.println("The Doctor gives you an understanding look but he still seems upset at the outcome. Maybe there was more you could've done. You and all your friends continue into the next room.");
							//subtracts 1 from the doctor's opinion
							doctor.subOpinion(1);
							//breaks the loop since a correct answer was input 
							break;
						}
						//else statement of if the user didn't type yes or no
						else
						{
							//tells the user to type yes or no and asks the question again, prompting a response
							System.out.println("Yes or No, do you help the rat man?");
						}
					}
					//breaks the loop since a correct answer was input 
					break;
				}
				//else if statement to check if the user input no
				else if (help.equalsIgnoreCase("No"))
				{
					//print statement of the user walking away from the rat man and continuing into the next room. tells the user the doctor's reaction
					System.out.println("You turn away from the rat man. He's beyond help. As you walk through the door, the Doctor glares at you. You hear him curse at you under his breath.");
					//subtracts 7 from the doctor's opinion
					doctor.subOpinion(7);
					//breaks the loop since a correct answer was input 
					break;
				}
				//else statement of if the user didn't type yes or no
				else
				{
					//tells the user to type yes or no and asks the question again, prompting a response
					System.out.println("Yes or No, do you help the rat man?");
				}
			}
		}
		//else statement of if the doctor isn't alive 
		else
		{
			//print statement where the user is looking back at the rat man and considering helping him, prompting a response 
			System.out.println("""
					You turn to look at the rat man. He continues to rock back and forth, mumbling the same phrase. Over and over and over... Even though the air is clear, he still is crazy. 
					He must have been here too long. Despite that, maybe you can still help him. Talk to him, persuade him to come with, and save a life. This time, you could save a life. Do you help him?""");
			
			//while loop to allow the user to make multiple inputs if they type something wrong
			while (true)
			{
				//sets the user's input to a String variable 
				String help = new String(myReader.nextLine());
					
				//if statement to check if the user input yes
				if (help.equalsIgnoreCase("Yes"))
				{
					//print statement of the user approaching the rat man but the rat man stops them. they user is asked if they want to continue helping him, promtping a response 
					System.out.println("You approach the rat man. As you do, he pulls out what looks like a homemade shiv. He yells at you to get back, swinging his shiv at you. Do you try to help him still?");
						
					//while loop to allow the user to make multiple inputs if they type something wrong
					while (true)
					{
						//sets the user's input to a String variable 
						String helpAgain = new String(myReader.nextLine());
							
						//if statement to check if the user input yes
						if (helpAgain.equalsIgnoreCase("Yes"))
						{
							//print statement of the user getting closer until the rat man kills himself. continues them into the next room.
							System.out.println("As you get closer, he makes a shrill scream. He takes his shiv and stabs himself until he dies.");
							System.out.println("You tried your best. That's what you tell yourself. You and all your friends continue into the next room.");
							//breaks the loop since a correct answer was input 
							break;
						}
						//else if statement to check if the user input no
						else if (helpAgain.equalsIgnoreCase("No"))
						{
							//print statement of the user backing away from the rat mat. continues them into the next room.
							System.out.println("You back away from the rat man. He might be beyond help. As you do, he turns away from you and continues to rock back and forth, mumbling.");
							System.out.println("You tell yourself you did all you could. Maybe. You aren't sure anymore. You and all your friends continue into the next room.");
							//breaks the loop since a correct answer was input 
							break;
						}
						//else statement of if the user didn't type yes or no
						else
						{
							//tells the user to type yes or no and asks the question again, prompting a response
							System.out.println("Yes or No, do you help the rat man?");
						}
					}
					//breaks the loop since a correct answer was input 
					break;
				}
				//else if statement to check if the user input no
				else if (help.equalsIgnoreCase("No"))
				{
					//print statement of the user walking away from the rat man and continuing into the next room.
					System.out.println("You turn away from the rat man. He's beyond help. You and all your friends continue into the next room.");
					//breaks the loop since a correct answer was input 
					break;
				}
				//else statement of if the user didn't type yes or no
				else
				{
					//tells the user to type yes or no and asks the question again, prompting a response
					System.out.println("Yes or No, do you help the rat man?");
				}
			}
		}
		
		System.out.println("");
		
	}
	
	
	//Creates 15 different Food objects through the Food class that all start off as not ordered. Each food has a unique name. Literally only exists for room 16, i hate my life, why do i do this.
	static Food fettucine = new Food(false, "Fettucine Alfredo");
	static Food chicken = new Food(false, "Fried Chicken");
	static Food tomatoSoup = new Food(false, "Tomato Soup");
	static Food sushi = new Food(false, "Sushi");
	static Food spaghetti = new Food(false, "Spaghetti Bolognese");
	static Food ramen = new Food(false, "Miso Ramen");
	static Food oatmeal = new Food(false, "Oatmeal");
	static Food chickenSoup = new Food(false, "Chicken Noodle Soup");
	static Food salad = new Food(false, "Caprese Salad");
	static Food pizza = new Food(false, "Pizza");
	static Food sandwich = new Food(false, "Pulled Pork Sandwich");
	static Food pie = new Food(false, "Apple Pie");
	static Food ratatouille = new Food(false, "Ratatouille");
	static Food rice = new Food(false, "Fried Rice");
	static Food tempura = new Food(false, "Tempura");
	
	/**
	 * This method allows the user to choose one of the foods for a decision
	 * It starts with a print statement asking the user what food they'll choose and gives a list of the foods they can choose.
	 * A while is used to allow the user to make another input if their original input is invalid.
	 * if the user makes an input that is the name of any of the available foods, the method returns that food's name
	 * if the user makes an invalid input, a print statement tells them so and prompts them for another input.
	 * @return returns the name of the food that the user has chosen
	 */
	public static String chooseFood()
	{
		//print statement asking the user who they'll choose and telling them that the following strings are a list of options
		System.out.println("\033[0m\033[1mWhat food would you like to choose? Below are your options:\033[0m");
		
		Food.canOrder(fettucine.foodOrdered(), fettucine.foodName());
		Food.canOrder(chicken.foodOrdered(), chicken.foodName());
		Food.canOrder(tomatoSoup.foodOrdered(), tomatoSoup.foodName());
		Food.canOrder(sushi.foodOrdered(), sushi.foodName());
		Food.canOrder(spaghetti.foodOrdered(), spaghetti.foodName());
		Food.canOrder(ramen.foodOrdered(), ramen.foodName());
		Food.canOrder(oatmeal.foodOrdered(), oatmeal.foodName());
		Food.canOrder(chickenSoup.foodOrdered(), chickenSoup.foodName());
		Food.canOrder(salad.foodOrdered(), salad.foodName());
		Food.canOrder(pizza.foodOrdered(), pizza.foodName());
		Food.canOrder(sandwich.foodOrdered(), sandwich.foodName());
		Food.canOrder(pie.foodOrdered(), pie.foodName());
		Food.canOrder(ratatouille.foodOrdered(), ratatouille.foodName());
		Food.canOrder(rice.foodOrdered(), rice.foodName());
		Food.canOrder(tempura.foodOrdered(), tempura.foodName());
		
		//while loop to allow the user to make an input again if they make an invalid input
		while (true)
		{
			//Sets the user's input as a string variable that is checked to see which food they have chosen 
			String pick = new String(myReader.nextLine());
			
			//if statement to check which food the user input and if the food has not been ordered yet
			if (pick.equalsIgnoreCase("Fettucine Alfredo") && fettucine.foodOrdered() == false)
			{
				//returns the food's code name bc i'm lazyyyyyy
				return "fettucine";
			}
			else if (pick.equalsIgnoreCase("Fried Chicken") && chicken.foodOrdered() == false)
			{
				return "chicken";
			}
			else if (pick.equalsIgnoreCase("Tomato Soup") && tomatoSoup.foodOrdered() == false)
			{
				return "tomatoSoup";
			}
			else if (pick.equalsIgnoreCase("Sushi") && sushi.foodOrdered() == false)
			{
				return "sushi";
			}
			else if (pick.equalsIgnoreCase("Spaghetti Bolognese") && spaghetti.foodOrdered() == false)
			{
				return "spaghetti";
			}
			else if (pick.equalsIgnoreCase("Miso Ramen") && ramen.foodOrdered() == false)
			{
				return "ramen";
			}
			else if (pick.equalsIgnoreCase("Oatmeal") && oatmeal.foodOrdered() == false)
			{
				return "oatmeal";
			}
			else if (pick.equalsIgnoreCase("Chicken Noodle Soup") && chickenSoup.foodOrdered() == false)
			{
				return "chickenSoup";
			}
			else if (pick.equalsIgnoreCase("Caprese Salad") && salad.foodOrdered() == false)
			{
				return "salad";
			}
			else if (pick.equalsIgnoreCase("Pizza") && pizza.foodOrdered() == false)
			{
				return "pizza";
			}
			else if (pick.equalsIgnoreCase("Pulled Pork Sandwich") && sandwich.foodOrdered() == false)
			{
				return "sandwich";
			}
			else if (pick.equalsIgnoreCase("Apple Pie") && pie.foodOrdered() == false)
			{
				return "pie";
			}
			else if (pick.equalsIgnoreCase("Ratatouille") && ratatouille.foodOrdered() == false)
			{
				return "ratatouille";
			}
			else if (pick.equalsIgnoreCase("Fried Rice") && rice.foodOrdered() == false)
			{
				return "rice";
			}
			else if (pick.equalsIgnoreCase("Tempura") && tempura.foodOrdered() == false)
			{
				return "tempura";
			}
			//else statement of if the user input something that isn't the name of any food or the food was already ordered
			else
			{
				//print statement telling the user what they input is not a food that can be found and prompts them for another response 
				System.out.println("Food not found or already ordered. Try again.");
			}
		}
	}
	
	
	/**
	 * This method is room 16 that the user plays through. AKA the cafeteria room
	 * Print statements introduce the room and tells the user everyone needs to eat
	 * The user has to choose a friend and choose a food to give them. friends are only fed once and foods can only be ordered once
	 * If the user chooses the dog, they have the option to feed the dog some dog food. if they do, the dog dies from cyanide. if not, the dog can be fed human food and tomato rule applies
	 * Afterwards, the user is told that tomatoes are dangerous and are told which characters die from tomato poisoning. then they move on
	 */
	public static void roomSixteen() 
	{
		//print statement telling the user what room they are in
		System.out.println("\033[1mYou are in Room 16." + normal);
		
		//print statements introducing the room to the user and telling them they have to feed all their friends
		System.out.println("""
				It is a giant cafeteria. The exit door is across the room with no obstacles. You consider just leaving the room, but you feel an uncontrollable urge to eat something. Anything.
				You head to the self-service counter filled with food. There’s a sign on it with a yellow smiley face that reads \"Help Yourself!\"
				There are dishes from all across the world. You and all your friends start to get extremely hungry. You all need to eat. Your friends look to you. You should you feed?
				""");
		
		//for loop to allow the user to feed all their friends. creates an int i to represent how many characters the user has fed 
		//runs as long as i is less than or equal to the amount of friends the user has alive still
		//increases i by one after each run
		for (int i = 1; i <= charsAlive(); i ++)
		{	
			//calls a method to allow the user to choose a friend to feed and sets it to a String variable 
			String fed = makeYourChoice();
			
			//if statement to check if the user chose to feed the dog
			if (fed.equals("Dog"))
			{
				//print statement telling the user about the dog food and asks the user if they want to feed it to the dog
				System.out.println("""
						You are about to offer the dog some of the human food but then you notice a bag of dog food on the side. As you go to open it, the Dog starts barking with glee and wagging his tail.
						The bag has a picture of a cartoon yellow labrador on it, the same breed as the Dog. \"Meaty, Nutty, Nutritious!\" Interesting slogan. 
						The Dog seems very excited for it. Do you feed him the dog food?""");
				
				//while loop to allow the user to make multiple inputs if they type something incorrect
				while (true)
				{
					//allows the user to make an input and sets it to a String variable
					String input = new String(myReader.nextLine());
					
					//if statement to check if the user input yes
					if (input.equalsIgnoreCase("Yes"))
					{
						//print statement of the dog dying by food poisoning and suggests to the user that it was laced with cyanide
						System.out.println("""
								He happily eats the dog food. He eats and eats like he's never eaten before. He must have been really hungry. 
								You are about to move on to something else when the Dog starts coughing and choking. The dog drops dead.
								There must have been something in the dog food. You go to take a look at the packaging when you smell something off. It smells like bitter almonds.""");
						//sets the dog's alive status to dead 
						dog.charAlive(false);
						//breaks the loop since a correct answer was input
						break;
					}
					//else if statement to check if the user input no
					else if (input.equalsIgnoreCase("No"))
					{
						//print statement telling the user they have the option to feed the dog human food instead
						System.out.println("You deny the Dog the ability to eat the dog food. He whines, pleading for food. You consider feeding him some human food instead.");
						//sets the dog's availability status to false since the dog was chosen 
						dog.charAvailable(false);
						//calls a method to allow the user to choose a food and sets that as a String variable
						String food = chooseFood();
					
						//if statement to check if the user chose a food that contains tomato
						if (food.equals("tomatoSoup") || food.equals("spaghetti") || food.equals("salad") || food.equals("pizza") || food.equals("ratatouille"))
						{
							//sets the dog's poisoned status to true
							dog.charPoisoned(true);
						}
						
						//if statement to check which food the user chose
						if (food.equals("fettucine"))
						{
							//sets the food's ordered status to true
							fettucine.foodOrdered(true);
						}
						else if (food.equals("chicken"))
						{
							chicken.foodOrdered(true);
						}
						else if (food.equals("tomatoSoup"))
						{
							tomatoSoup.foodOrdered(true);
						}
						else if (food.equals("sushi"))
						{
							sushi.foodOrdered(true);
						}
						else if (food.equals("ramen"))
						{
							ramen.foodOrdered(true);
						}
						else if (food.equals("spaghetti"))
						{
							spaghetti.foodOrdered(true);
						}
						else if (food.equals("oatmeal"))
						{
							oatmeal.foodOrdered(true);
						}
						else if (food.equals("chickenSoup"))
						{
							chickenSoup.foodOrdered(true);
						}
						else if (food.equals("salad"))
						{
							salad.foodOrdered(true);
						}
						else if (food.equals("pizza"))
						{
							pizza.foodOrdered(true);
						}
						else if (food.equals("sandwich"))
						{
							sandwich.foodOrdered(true);
						}
						else if (food.equals("pie"))
						{
							pie.foodOrdered(true);
						}
						else if (food.equals("ratatouille"))
						{
							ratatouille.foodOrdered(true);
						}
						else if (food.equals("rice"))
						{
							rice.foodOrdered(true);
						}
						else if (food.equals("tempura"))
						{
							tempura.foodOrdered(true);
						}
						
						//breaks the loop since a correct input was made
						break;
					}
					//else statement of if the user didnt input yes or no
					else
					{
						//print statement telling the user their input was invalid and asks the question again
						System.out.println("Yes or No, do you feed him the dog food?");
					}
				 }
			}
			//else statement of if the user didn't choose the dog
			else
			{
				//calls a method to allow the user to choose a food and sets that as a String variable
				String food = chooseFood();
					
				//if statement to check which character the user chose and if they fed the character a food that has tomatoes 
				if (fed.equals("Doctor") && (food.equals("tomatoSoup") || food.equals("spaghetti") || food.equals("salad") || food.equals("pizza") || food.equals("ratatouille")))
				{
					//sets the character's poisoned status to true
					doctor.charPoisoned(true);
				}
				else if (fed.equals("Little Girl") && (food.equals("tomatoSoup") || food.equals("spaghetti") || food.equals("salad") || food.equals("pizza") || food.equals("ratatouille")))
				{
					littleGirl.charPoisoned(true);
				}
				else if (fed.equals("Pastor") && (food.equals("tomatoSoup") || food.equals("spaghetti") || food.equals("salad") || food.equals("pizza") || food.equals("ratatouille")))
				{
					pastor.charPoisoned(true);
				}
				else if (fed.equals("Attractive Woman") && (food.equals("tomatoSoup") || food.equals("spaghetti") || food.equals("salad") || food.equals("pizza") || food.equals("ratatouille")))
				{
					woman.charPoisoned(true);
				}
				else if (fed.equals("Jeff") && (food.equals("tomatoSoup") || food.equals("spaghetti") || food.equals("salad") || food.equals("pizza") || food.equals("ratatouille")))
				{
					jeff.charPoisoned(true);
				}
				else if (fed.equals("Granny") && (food.equals("tomatoSoup") || food.equals("spaghetti") || food.equals("salad") || food.equals("pizza") || food.equals("ratatouille")))
				{
					granny.charPoisoned(true);
				}
				else if (fed.equals("Businessman") && (food.equals("tomatoSoup") || food.equals("spaghetti") || food.equals("salad") || food.equals("pizza") || food.equals("ratatouille")))
				{
					businessman.charPoisoned(true);
				}
				else if (fed.equals("Cat") && (food.equals("tomatoSoup") || food.equals("spaghetti") || food.equals("salad") || food.equals("pizza") || food.equals("ratatouille")))
				{
					cat.charPoisoned(true);
				}
				else if (food.equals("tomatoSoup") || food.equals("spaghetti") || food.equals("salad") || food.equals("pizza") || food.equals("ratatouille"))
				{
					teacher.charPoisoned(true);
				}
			
				//if statement to check which food the user chose
				if (food.equals("fettucine"))
				{
					//sets the food's ordered status to true
					fettucine.foodOrdered(true);
				}
				else if (food.equals("chicken"))
				{
					chicken.foodOrdered(true);
				}
				else if (food.equals("tomatoSoup"))
				{
					tomatoSoup.foodOrdered(true);
				}
				else if (food.equals("sushi"))
				{
					sushi.foodOrdered(true);
				}
				else if (food.equals("ramen"))
				{
					ramen.foodOrdered(true);
				}
				else if (food.equals("spaghetti"))
				{
					spaghetti.foodOrdered(true);
				}
				else if (food.equals("oatmeal"))
				{
					oatmeal.foodOrdered(true);
				}
				else if (food.equals("chickenSoup"))
				{
					chickenSoup.foodOrdered(true);
				}
				else if (food.equals("salad"))
				{
					salad.foodOrdered(true);
				}
				else if (food.equals("pizza"))
				{
					pizza.foodOrdered(true);
				}
				else if (food.equals("sandwich"))
				{
					sandwich.foodOrdered(true);
				}
				else if (food.equals("pie"))
				{
					pie.foodOrdered(true);
				}
				else if (food.equals("ratatouille"))
				{
					ratatouille.foodOrdered(true);
				}
				else if (food.equals("rice"))
				{
					rice.foodOrdered(true);
				}
				else if (food.equals("tempura"))
				{
					tempura.foodOrdered(true);
				}
			
				//if statment to check which character the user chose
				if (fed.equals("Doctor"))
				{
					//sets the character's availability status to false
					doctor.charAvailable(false);
				}
				else if (fed.equals("Little Girl"))
				{
					littleGirl.charAvailable(false);
				}
				else if (fed.equals("Pastor"))
				{
					pastor.charAvailable(false);
				}
				else if (fed.equals("Attractive Woman"))
				{
					woman.charAvailable(false);
				}
				else if (fed.equals("Jeff"))
				{
					jeff.charAvailable(false);
				}
				else if (fed.equals("Granny"))
				{
					granny.charAvailable(false);
				}
				else if (fed.equals("Businessman"))
				{
					businessman.charAvailable(false);
				}
				else if (fed.equals("Cat"))
				{
					cat.charAvailable(false);
				}
				else if (fed.equals("Teacher"))
				{
					teacher.charAvailable(false);
				}
			}
		}
		
		//print statement telling the user that the tomatoes are poisoned
		System.out.println("""
				You are about to take some food for yourself when something peculiar happens. You get the strange sense that the tomatoes are dangerous. 
				Your stomach starts to feel queasy at the thought of tomatoes. You turn to look at your friends and see they have the same realization. Just like that, anyone who ate a dish containing tomatoes drops dead.""");
		//print statement telling the user which friends are dead from tomatoes 
		System.out.print("\033[1mThe following friends die from eating tomatoes:" + normal);
		
		//if statement to check if a character is poisoned
		if (doctor.charPoisoned() == true)
		{
			//prints out the name of the character and sets their alive status to false
			System.out.println(doctor.charName());
			doctor.charAlive(false);
		}
		if (dog.charPoisoned() == true)
		{
			System.out.println(dog.charName());
			dog.charAlive(false);
		}
		if (littleGirl.charPoisoned() == true)
		{
			System.out.println(littleGirl.charName());
			littleGirl.charAlive(false);
		}
		if (pastor.charPoisoned() == true)
		{
			System.out.println(pastor.charName());
			pastor.charAlive(false);
		}
		if (woman.charPoisoned() == true)
		{
			System.out.println(woman.charName());
			woman.charAlive(false);
		}
		if (jeff.charPoisoned() == true)
		{
			System.out.println(jeff.charName());
			jeff.charAlive(false);
		}
		if (granny.charPoisoned() == true)
		{
			System.out.println(granny.charName());
			granny.charAlive(false);
		}
		if (businessman.charPoisoned() == true)
		{
			System.out.println(businessman.charName());
			businessman.charAlive(false);
		}
		if (cat.charPoisoned() == true)
		{
			System.out.println(cat.charName());
			cat.charAlive(false);
		}
		if (teacher.charPoisoned() == true)
		{
			System.out.println(teacher.charName());
			teacher.charAlive(false);
		}
		
		//resets everyone's availability status to true
		doctor.charAvailable(true);
		littleGirl.charAvailable(true);
		dog.charAvailable(true);
		pastor.charAvailable(true);
		woman.charAvailable(true);
		jeff.charAvailable(true);
		granny.charAvailable(true);
		businessman.charAvailable(true);
		cat.charAvailable(true);
		teacher.charAvailable(true);
		
		//print statement moving the user forward
		System.out.println("""
				You look at the foods still available and choose a dish without any tomatoes. Now that everyone has eaten something, you can finally bring yourself to continue to the next room.
				""");
	}
	
	
	/**
	 * This method is room 18 that the user plays through. AKA the funeral room
	 * Print statements introduce the funeral to the user and a voice tells them to ruin the funeral
	 * The user is then asked 10 seperate times if they want to destroy 10 different parts of the funeral
	 * Then Death comes out of the shadows and tells the user if they are satisfied or disappointed in the funeral destruction
	 * If the user destroys exactly half the funeral, they decide whether they funeral is a disaster or not which determines whether death is satisfied or not
	 * If the user destroyes less than half, death is disappointed. if the user has no friends alive, death reveals to the user that their friends are ghosts and are watching.
	 * If the user has at least one friend still alive, the user chooses a friend to give to death to complete the funeral. the friend dies lol
	 * If the user destroys more than half, death is satisfied and lets the user continue. the user finds out the funeral was for them.
	 * Then, a giant hole opens up and it is suggested to the user that either the woman or the ghost of the woman pushed them down.
	 */
	public static void roomEighteen()
	{
		//print statement telling the user what room they are in
		System.out.println("\033[1mYou are in Room 18." + normal);
		
		//creates a String for Death's text color 
		String death = "\033[1m\033[38;2;255;0;0m";
		
		//print statement introducing the room and telling the user to destroy the funeral
		System.out.println("""
				It is a funeral. The casket is currently closed. The flower arrangements are set up. Tissue boxes are stationed at each pew. 
				It seems like the funeral hasn’t started yet, but is expected to be soon.
				You hear a voice whisper in your ear. It’s deep and raspy. It echoes in your mind, enters your soul, and you can’t help but feel like you need to do what it tells you.""");
		System.out.println(death + "\"Ruin the funeral.\"" + normal);
		System.out.println("You look down. Weapons of destruction lie at your feet. You look around. All these beautiful preparations. So much work probably went into this. It’s a shame.");				
		System.out.println("");

		//makes an int variable to represent how many times the user chose to destroy the funeral 
		int destruction = 0;
		
		//while loop to allow the user to make multiple inputs if they make type something incorrect
		while (true)
		{
			//print statement asking the user if they want to destroy something 
			System.out.println("\033[1mDo you want to rip up the flower arrangements?" + normal);
			
			//sets the user's input to a String variable
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user input yes
			if (input.equalsIgnoreCase("Yes"))
			{
				//print statement of the user destroying things
				System.out.println("You rip up the beautiful flowers. White petals are scattered everywhere. All the flowers, perfectly and precisely placed, now lay dead on the floor.");
				//increases the amount of times the user destroyed something by 1
				destruction ++;
				//breaks the loop since a correct answer was input
				break;
			}
			//else if statement to check if the user input no
			else if (input.equalsIgnoreCase("No"))
			{
				//print statement of the user not doing anything. lameeeee
				System.out.println("You leave the flowers alone. The world seems to get darker.");
				//breaks the loop since a correct answer was input
				break;
			}
			//else statement of if the user didn't input yes or no
			else
			{
				//print statement telling the user the expected answers are yes or no
				System.out.print("\033[1mYes or No. ");
			}
		}
		//while loop to allow the user to make multiple inputs if they make type something incorrect
		while (true)
		{
			//print statement asking the user if they want to destroy something 
			System.out.println("\033[1mDo you want to scatter the tissues around the room?" + normal);
			
			//sets the user's input to a String variable
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user input yes
			if (input.equalsIgnoreCase("Yes"))
			{
				//print statement of the user destroying things
				System.out.println("You all the tissues out from their boxes and throw them around the place. It's a total mess. No one will be using these to dry their tears now.");
				//increases the amount of times the user destroyed something by 1
				destruction ++;
				//breaks the loop since a correct answer was input
				break;
			}
			//else if statement to check if the user input no
			else if (input.equalsIgnoreCase("No"))
			{
				//print statement of the user not doing anything. lameeeee
				System.out.println("You leave the tissues alone. The world seems to get darker.");
				//breaks the loop since a correct answer was input
				break;
			}
			//else statement of if the user didn't input yes or no
			else
			{
				//print statement telling the user the expected answers are yes or no
				System.out.print("\033[1mYes or No. ");
			}
		}
		//while loop to allow the user to make multiple inputs if they make type something incorrect
		while (true)
		{
			//print statement asking the user if they want to destroy something 
			System.out.println("\033[1mDo you want to swing an axe at all the pews?" + normal);
			
			//sets the user's input to a String variable
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user input yes
			if (input.equalsIgnoreCase("Yes"))
			{
				//print statement of the user destroying things
				System.out.println("You grab an axe from the pile of weapons. You swing at all the pews, destroying them. Some are split in half. There's nowhere for anyone to sit.");
				//increases the amount of times the user destroyed something by 1
				destruction ++;
				//breaks the loop since a correct answer was input
				break;
			}
			//else if statement to check if the user input no
			else if (input.equalsIgnoreCase("No"))
			{
				//print statement of the user not doing anything. lameeeee
				System.out.println("You leave the pews alone. The world seems to get darker.");
				//breaks the loop since a correct answer was input
				break;
			}
			//else statement of if the user didn't input yes or no
			else
			{
				//print statement telling the user the expected answers are yes or no
				System.out.print("\033[1mYes or No. ");
			}
		}
		//while loop to allow the user to make multiple inputs if they make type something incorrect
		while (true)
		{
			//print statement asking the user if they want to destroy something 
			System.out.println("\033[1mDo you want to smash the windows?" + normal);
			
			//sets the user's input to a String variable
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user input yes
			if (input.equalsIgnoreCase("Yes"))
			{
				//print statement of the user destroying things
				System.out.println("You grab a bat from the pile of weapons. You smash all the windows to bits. Pieces of glass scatter across the floor like snow.");
				//increases the amount of times the user destroyed something by 1
				destruction ++;
				//breaks the loop since a correct answer was input
				break;
			}
			//else if statement to check if the user input no
			else if (input.equalsIgnoreCase("No"))
			{
				//print statement of the user not doing anything. lameeeee
				System.out.println("You leave the windows alone. The world seems to get darker.");
				//breaks the loop since a correct answer was input
				break;
			}
			//else statement of if the user didn't input yes or no
			else
			{
				//print statement telling the user the expected answers are yes or no
				System.out.print("\033[1mYes or No. ");
			}
		}
		//while loop to allow the user to make multiple inputs if they make type something incorrect
		while (true)
		{
			//print statement asking the user if they want to destroy something 
			System.out.println("\033[1mDo you want to change the background music?" + normal);
			
			//sets the user's input to a String variable
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user input yes
			if (input.equalsIgnoreCase("Yes"))
			{
				//print statement of the user destroying things
				System.out.println("You force your way into the maintenance room. You pause the somber piano music and change it to screams. Over and over, you just hear screaming.");
				//increases the amount of times the user destroyed something by 1
				destruction ++;
				//breaks the loop since a correct answer was input
				break;
			}
			//else if statement to check if the user input no
			else if (input.equalsIgnoreCase("No"))
			{
				//print statement of the user not doing anything. lameeeee
				System.out.println("You leave the music alone. The world seems to get darker.");
				//breaks the loop since a correct answer was input
				break;
			}
			//else statement of if the user didn't input yes or no
			else
			{
				//print statement telling the user the expected answers are yes or no
				System.out.print("\033[1mYes or No. ");
			}
		}
		//while loop to allow the user to make multiple inputs if they make type something incorrect
		while (true)
		{
			//print statement asking the user if they want to destroy something 
			System.out.println("\033[1mDo you want to rip the speech papers?" + normal);
			
			//sets the user's input to a String variable
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user input yes
			if (input.equalsIgnoreCase("Yes"))
			{
				//print statement of the user destroying things
				System.out.println("You go up to the mic stand and find the prepared eulogy speech and Bible readings. You rip them to shreds. It is impossible to read them now.");
				//increases the amount of times the user destroyed something by 1
				destruction ++;
				//breaks the loop since a correct answer was input
				break;
			}
			//else if statement to check if the user input no
			else if (input.equalsIgnoreCase("No"))
			{
				//print statement of the user not doing anything. lameeeee
				System.out.println("You leave the papers alone. The world seems to get darker.");
				//breaks the loop since a correct answer was input
				break;
			}
			//else statement of if the user didn't input yes or no
			else
			{
				//print statement telling the user the expected answers are yes or no
				System.out.print("\033[1mYes or No. ");
			}
		}
		//while loop to allow the user to make multiple inputs if they make type something incorrect
		while (true)
		{
			//print statement asking the user if they want to destroy something 
			System.out.println("\033[1mDo you want to vandelize the place with graffiti?" + normal);
			
			//sets the user's input to a String variable
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user input yes
			if (input.equalsIgnoreCase("Yes"))
			{
				//print statement of the user destroying things
				System.out.println("You grab a spray paint can from the pile of weapons and start painting the place. Right above the casket, you write \"THEY DESERVED IT\"");
				//increases the amount of times the user destroyed something by 1
				destruction ++;
				//breaks the loop since a correct answer was input
				break;
			}
			//else if statement to check if the user input no
			else if (input.equalsIgnoreCase("No"))
			{
				//print statement of the user not doing anything. lameeeee
				System.out.println("You leave the place alone. The world seems to get darker.");
				//breaks the loop since a correct answer was input
				break;
			}
			//else statement of if the user didn't input yes or no
			else
			{
				//print statement telling the user the expected answers are yes or no
				System.out.print("\033[1mYes or No. ");
			}
		}
		//while loop to allow the user to make multiple inputs if they make type something incorrect
		while (true)
		{
			//print statement asking the user if they want to destroy something 
			System.out.println("\033[1mDo you want to burn the program pamphlets?" + normal);
			
			//sets the user's input to a String variable
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user input yes
			if (input.equalsIgnoreCase("Yes"))
			{
				//print statement of the user destroying things
				System.out.println("You grab a lighter from the pile of weapons and grab some of the pamphlets. You light them on fire and watch them burn. You scatter the rest of the pamphlets around.");
				//increases the amount of times the user destroyed something by 1
				destruction ++;
				//breaks the loop since a correct answer was input
				break;
			}
			//else if statement to check if the user input no
			else if (input.equalsIgnoreCase("No"))
			{
				//print statement of the user not doing anything. lameeeee
				System.out.println("You leave the pamphlets alone. The world seems to get darker.");
				//breaks the loop since a correct answer was input
				break;
			}
			//else statement of if the user didn't input yes or no
			else
			{
				//print statement telling the user the expected answers are yes or no
				System.out.print("\033[1mYes or No. ");
			}
		}
		//while loop to allow the user to make multiple inputs if they make type something incorrect
		while (true)
		{
			//print statement asking the user if they want to destroy something 
			System.out.println("\033[1mDo you want to toss the casket over?" + normal);
			
			//sets the user's input to a String variable
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user input yes
			if (input.equalsIgnoreCase("Yes"))
			{
				//print statement of the user destroying things
				System.out.println("You head over to the casket and flip it over. As it falls on the ground, the body flops out. It's made of straw. It's not a real body.");
				//increases the amount of times the user destroyed something by 1
				destruction ++;
				//breaks the loop since a correct answer was input
				break;
			}
			//else if statement to check if the user input no
			else if (input.equalsIgnoreCase("No"))
			{
				//print statement of the user not doing anything. lameeeee
				System.out.println("You leave the casket alone. The world seems to get darker. You open it to look at the body. It's made of straw. It's not a real body.");
				//breaks the loop since a correct answer was input
				break;
			}
			//else statement of if the user didn't input yes or no
			else
			{
				//print statement telling the user the expected answers are yes or no
				System.out.print("\033[1mYes or No. ");
			}
		}
		//while loop to allow the user to make multiple inputs if they make type something incorrect
		while (true)
		{
			//print statement asking the user if they want to destroy something 
			System.out.println("\033[1mDo you want to BURN THE BODY?" + normal);
			
			//sets the user's input to a String variable
			String input = new String(myReader.nextLine());
			
			//if statement to check if the user input yes
			if (input.equalsIgnoreCase("Yes"))
			{
				//print statement of the user destroying things
				System.out.println("You grab a lighter. You burn the body. It goes up in flames. You watch it burn.");
				//increases the amount of times the user destroyed something by 1
				destruction ++;
				//breaks the loop since a correct answer was input
				break;
			}
			//else if statement to check if the user input no
			else if (input.equalsIgnoreCase("No"))
			{
				//print statement of the user not doing anything. lameeeee
				System.out.println("You leave the body alone. The world seems to get darker.");
				//breaks the loop since a correct answer was input
				break;
			}
			//else statement of if the user didn't input yes or no
			else
			{
				//print statement telling the user the expected answers are yes or no
				System.out.print("\033[1mYes or No. ");
			}
		}
		
		//creates a space between lines for organization
		System.out.println("");
		
		//print statements introducing death
		System.out.println("""
				You hear a noise coming from the shadows. It sounds like a deep, echoey laugh. The room gets noticeably colder and you feel a shiver down your spine. 
				Emerging from the shadows, you see Death. A skeleton cloaked in black with a menacing scythe pointing straight at you.""");
		
		//if statement to check if the user destroyed exactly half of the funeral 
		if (destruction == 5)
		{
			//print statemnets of death's reaction and asks the user if the funeral was a disaster or not, prompting a response
			System.out.println(death + """
					\"Well... I am hardly satisfied with this funeral. I told you to destroy the funeral, and you did. But what a pitiful job you did.\"
					\"I'm torn. Maybe you can decide. With the work that you've done so far, do you think this funeral is a disaster? Because I think it isn't.\"
					""" + normal);

			//while statement to allow the user to make multiple inputs if they type something incorrect
			while (true)
			{
				//sets the user's input to a String variable
				String funeralGood = new String(myReader.nextLine());
				
				//if statement to check if the user input yes
				if (funeralGood.equalsIgnoreCase("Yes"))
				{
					//increases the destruction by 1 to trigger death's response of satisfaction 
					destruction ++;
					//breaks loop since a correct answer was input
					break;
				}
				//else if statement to check if the user input no
				else if (funeralGood.equalsIgnoreCase("No"))
				{
					//decreases the destruction by 1 to trigger death's response of dissapointment
					destruction --;
					//breaks loop since a correct answer was input
					break;
				}
				//else statement of if the user didn't input yes or no
				else
				{
					//tells the user their input was invalid and asks the question again
					System.out.println("Yes or No, is this funeral a disaster?");
				}
			}
			
			//transition print statement to the next response
			System.out.println(death + "\"Well in that case...\"");
		}
		
		//if statement to check if the user destroyed less than 5 things of the funeral 
		if (destruction < 5)
		{
			//if statement to check if the user destroyed nothing 
			if (destruction == 0)
			{
				//print statement of death's response 
				System.out.println(death + """
						\"Unfortunate. What a disgustingly normal funeral. I thought I told you to destroy the funeral. I even gave you all those supplies, and for what? For you to never use them? Cast them aside like useless scraps.\"""");
			}
			//else statement of if the user destroyed at least 1 thing 
			else
			{
				//print statement of death's response 
				System.out.println(death + "\"Unfortunate. What a boring and bland funeral. I thought I told you to destroy the funeral. I even gave you all those supplies, and for what?\""
						+ "\"For you to barely put them to use? This is pitiful. I wanted worse.\"");
			}
			
			//if statement to check if the user is a good person
			if (Character.userGoodPerson() == true)
			{
				//print statement of death's response
				System.out.println("\"I should have expected this from you. You think you are such a good person. Why did I expect you to listen to me?\"");
			}
			//else statement of if the user is a bad person
			else
			{
				//print statement of death's response 
				System.out.println("\"I thought I could trust you. You consider yourself such a bad person. Why didn't you listen to me?\"");
			}
			
			//progressing the storyyyyy
			System.out.println(death + "\"From the quality of this funeral, it’s clear you want this to go off without a hitch. You must be expecting something good to happen here. Well, consider your wish granted.\"" + normal);
			
			//if statement to check if the user has no friends left alive
			if (charsAlive() == 0)
			{
				//print statement of death revealing to the user that all their dead friends are ghosts and can see them 
				System.out.println("""
						Death waves his scythe in the air. The air gets even colder and you feel your sins crawling down your back.
						In front of you, you see the ghosts of all your dead friends. Their faces are pale and translucent. They look at you with disgust.""");
			}
			//else statement of if the user has at least one friend alive 
			else
			{
				//print statement asking the user to choose a friend to die 
				System.out.println("Death holds his hand out to your friends. He wants you to give him one.");
				
				//allows the user to choose a friend and sets their choice to a String variable 
				String deadFriend = makeYourChoice();
				
				//if statements checking which friend the user chose 
				if (deadFriend.equals("Doctor"))
				{
					//sets the user's chosen friend's alive status to dead 
					doctor.charAlive(false);
				}
				else if (deadFriend.equals("Dog"))
				{
					dog.charAlive(false);
				}
				else if (deadFriend.equals("Little Girl"))
				{
					littleGirl.charAlive(false);
				}
				else if (deadFriend.equals("Pastor"))
				{
					pastor.charAlive(false);
				}
				else if (deadFriend.equals("Attractive Woman"))
				{
					woman.charAlive(false);
				}
				else if (deadFriend.equals("Jeff"))
				{
					jeff.charAlive(false);
				}
				else if (deadFriend.equals("Granny"))
				{
					granny.charAlive(false);
				}
				else if (deadFriend.equals("Businessman"))
				{
					businessman.charAlive(false);
				}
				else if (deadFriend.equals("Cat"))
				{
					cat.charAlive(false);
				}
				else
				{
					teacher.charAlive(false);
				}
				
				//if statement to check if the user chose jeff isn't referred to as "the [friend]" because he has an actual name and it totally ruins the dialogue so now he has to have a special dialogue line just so the grammar lines up NFLDSNFKLAN;GLN	
				if (deadFriend.equals("Jeff"))
				{
					//print statement of death killing jeff and user trying to move on
					System.out.println("""
						Death raises his scythe and chops off Jeff's head off. Their head rolls towards you. You look into their eyes, devoid of life. The funeral is complete.
						You and all your friends try to continue on into the next room.""");
				}
				//else statement of if the user chose anyone that isn't jeff
				else
				{
					//print statement of death killing the chosen friend and user trying to move on
					System.out.println("Death raises his scythe and chops off the " + deadFriend + "'s head off. Their head rolls towards you. You look into their eyes, devoid of life. The funeral is complete.");
					System.out.println("You and all your friends try to continue on into the next room.");
				}
			}
		}
		//else statement of if the user destroyed more than 5 things of the funeral 
		else
		{
			//print statement of death's response and him letting the user go
			System.out.println(death + """
					\"Interesting. What an interesting funeral. When I said to destroy the funeral… This is truly a sight. Exactly what I expected.\"
					\"Glad to see you put to use the supplies I provided. Continue on. I won’t get in your way.\"""" + normal);
			//print statement of the user finding out the funeral was for them and trying to move on
			System.out.println("Before you leave and continue into the next room, you take one last look at the funeral. You see one of the program pamphlets lying on the ground.");
			System.out.println("You pick it up and read it. \"" + Character.userName() + "\". What a peculiar name. You and all your friends try to continue on into the next room. ");
		}
		
		//creates a space between lines for organization
		System.out.println("");
		
		//print statement of the giant hole and the user being pushed down it by someone 
		System.out.println("""
				Just as you were about to, a giant hole opens up right in front of the exit door. You peer down. It seems endless. 
				You are about to turn around and look for something to help you cross it, but then you are pushed into the hole. You look up to see who did it.""");
		
		//if statement to check if the woman is alive 
		if (woman.charAlive() == true)
		{
			//print statement of the user maybe seeing her 
			System.out.println("All you see is a blur of red. A deep red. Then, black.");
		}
		//else statement of if the woman is dead 
		else 
		{
			//print statement of the user mayber seeing her ghost 
			System.out.println("All you see is a faint blur of red. A deep red. Then, black.");
		}
	
		//creates a space between lines for organization
		System.out.println("");
	}
	
	
	
	public static void roomTwenty()
	{
		System.out.println("""
				wow you made it to the end of the game! sike! i'm not finished... the endings will be much doper than this tho swear 
				maybe after break it'll be finished... we'll see. consider this a little beta test :3
				so far you've played like 2/5 of the game and met 1/2 of the characters so look forward to more please :'(
				""");
		
		//Closes the scanner so that it doesn't drain my computer of its life in a similar way that coding drains me of my life
		myReader.close();
	}


}
