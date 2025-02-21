/**
 * This class is for the ArrayList Intro Assignment. It does seven different ArrayList specific tasks. i want to go home and sleep.
 */

//imports ArrayList library :3
import java.util.ArrayList;

public class ArrayListIntro
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//1. Instantiate an empty ArrayList that could have any type in it.
		//creates an empty ArrayList that could have any type in it. shocker
		ArrayList thingysArrList = new ArrayList();
		
		//prints out the ArrayList to test :3
		System.out.println(thingysArrList);

		//2. Instantiate an empty ArrayList called intArrList that specifically stores ints. Repeat this for Strings.
		//creates an empty Integer ArrayList and an empty String ArrayList
		ArrayList <Integer> intArrList = new ArrayList <Integer>();
		ArrayList <String> strArrList = new ArrayList <String>();
		
		//prints out the ArrayLists to test :3
		System.out.println(intArrList);
		System.out.println(strArrList);
		
		//3. Add 1, 2, and 3 to your intArrList one at a time so that its values are {1, 2, 3}. Then add elements to stringArrList so its values are {"Alice , "Bob" , "Charlie"}
		
		//adds 1, 2, and 3 to the end of the ArrayList one at a time 
		intArrList.add(1);
		intArrList.add(2);
		intArrList.add(3);
		
		//prints out the ArrayList to test :3
		System.out.println(intArrList);
		
		//adds Alice, Bob, and Charlie to the end of the ArrayList one at a time
		strArrList.add("Alice");
		strArrList.add("Bob");
		strArrList.add("Charlie");
		
		//prints out the ArrayList to test :3
		System.out.println(strArrList);

		//4. Add 5 to your intArrList so that its values are now {1, 2, 5, 3}. Then add "Derek" to your stringArrList so its values are {"Alice" , "Derek" , "Bob" , "Charlie"}
		
		//adds 5 to the ArrayList as the 2nd index
		intArrList.add(2, 5);
		
		//adds Derek to the Arraylist as the 1st index
		strArrList.add(1, "Derek");
		
		//prints out the ArrayLists to test :3
		System.out.println(intArrList);
		System.out.println(strArrList);
		
		//5. Print out the second and last elements in both intArrList and stringArrList.
		
		//prints out the second elements in the ArrayLists
		System.out.println(intArrList.get(1));
		System.out.println(strArrList.get(1));

		//prints out the last elements in the ArrayLists
		System.out.println(intArrList.get(intArrList.size() - 1));
		System.out.println(strArrList.get(intArrList.size() - 1));
		
		//prints out the ArrayLists to test :3
		System.out.println(intArrList);
		System.out.println(strArrList);

		//hey i'm kinda bored and i wanna know if you actually read everyone's code so if you see this can you comment "beembo" on the assignment submmission 
		//6. Change the first element in intArrList to 0, and change the first element in stringArrList to "Zero". Print out the first element in each array before and after the change. 
		
		//prints out what the first element of the ArrayList was and changes it to 0
		System.out.println(intArrList.set(0, 0));
		//prints out the new first element of the ArrayList
		System.out.println(intArrList.get(0));
		
		//prints out what the first element of the ArrayList was and changes it to "Zero"
		System.out.println(strArrList.set(0, "Zero"));
		//prints out the new first element of the ArrayList
		System.out.println(strArrList.get(0));
		
		//prints out the ArrayLists to test :3
		System.out.println(intArrList);
		System.out.println(strArrList);
		
		//7. Delete the last element in both arrays. Print out what that removed element was. 
		
		//prints out the last element of the ArrayList and removes it 
		System.out.println(intArrList.remove(intArrList.size() - 1));
		
		//prints out the last element of the ArrayList and removes it 
		System.out.println(strArrList.remove(strArrList.size() - 1));
		
		//prints out the ArrayLists to test :3
		System.out.println(intArrList);
		System.out.println(strArrList);
		
		//read "The Creatures" on WebToon ;)
		
	}

}
