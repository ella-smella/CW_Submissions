//This class is for the Altering Arrays Problem. 
public class AlteringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a method subract5FromAll4() that is passed an array nums and returns a new array. The new array will consist of the values of nums, except that each element must be 5 less than its corresponding element in nums. Nums will always have 4 elements. 
		//Ex: 
		//subtract5FromAll4( {5, 0, 8, 20}  )   -------returns----->     {0, -5, 3, 15}
		
		//creates an array of ints called nums
		int[] nums = {3, 17, 9, 69};
		
		//calls the method to subtract 5 from all nums elements and sets it to a new array variable
		int[] numsSub5 = subtract5FromAll4(nums);
	
	}

		/**
		 * This method subtracts 5 from all elements of the passed array
		 * @param arr the passed array 
		 * @return returns an array that is the same as the passed array except all elements are 5 less than the original
		 */
		public static int[] subtract5FromAll4(int[] arr)
		{
			//creates a new int array that is the same length as the passed array
			int [] copyArr = new int[arr.length];
			
			//for loop that traverses through each element of the copyArr
			for (int i = 0; i < arr.length; i ++)
			{
				//changes each element of the copyArr to the corresponding element of the original arr and subtracts it by 5
				copyArr[i] = arr[i] - 5;
			}
			
			//returns the array that had 5 subtracted from all elements 
			return copyArr;
		}
}
