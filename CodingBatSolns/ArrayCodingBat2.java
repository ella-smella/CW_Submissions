/**
* This file is for the first Array CodingBat assignment. It completes five exercises from Array-1: 
* rotateLeft3, reverse3, maxEnd3, sum2, middleWay, makeEnds 
*/

//rotateLeft3 Exercise
//Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//rotateLeft3([1, 2, 3]) → [2, 3, 1]
//rotateLeft3([5, 11, 9]) → [11, 9, 5]
//rotateLeft3([7, 0, 0]) → [0, 0, 7]

public int[] rotateLeft3(int[] nums) {
  int[] copyArr = new int [nums.length];
  
  copyArr[0] = nums[1];
  copyArr[1] = nums[2];
  copyArr[2] = nums[0];
  
  return copyArr;
}

//reverse3 Exercise
//Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//reverse3([1, 2, 3]) → [3, 2, 1]
//reverse3([5, 11, 9]) → [9, 11, 5]
//reverse3([7, 0, 0]) → [0, 0, 7]

public int[] reverse3(int[] nums) {
  int[] copyArr = new int [nums.length];
  
  copyArr[0] = nums[2];
  copyArr[1] = nums[1];
  copyArr[2] = nums[0];
  
  return copyArr;
}

//maxEnd3 Exercise
//Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
//maxEnd3([1, 2, 3]) → [3, 3, 3]
//maxEnd3([11, 5, 9]) → [11, 11, 11]
//maxEnd3([2, 11, 3]) → [3, 3, 3]

public int[] maxEnd3(int[] nums) {
  int[] copyArr = new int [nums.length];
  int largeNum = nums[0];
  
  if (nums[2] > largeNum)
  {
    largeNum = nums[2];
  }
  
  for (int i = 0; i < nums.length; i++)
  {
    copyArr[i] = largeNum;
  }
  
  return copyArr;
}

//sum2 Exercise
//Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
//sum2([1, 2, 3]) → 3
//sum2([1, 1]) → 2
//sum2([1, 1, 1, 1]) → 2

public int sum2(int[] nums) {
  int[] copyArr = nums;
  int sum;
  
  if (nums.length == 0)
  {
    return 0;
  }
  
  if (nums.length == 1)
  {
    return nums[0];
  }
  
  sum = copyArr[0] + copyArr[1];
  return sum;
  
}

//middleWay Exercise
//Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
//middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
//middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
//middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]

public int[] middleWay(int[] a, int[] b) {
  int[] middleArr = new int [2];
  
  middleArr[0] = a[1];
  middleArr[1] = b[1];
  
  return middleArr;
}

//makeEnds Exercise
//Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
//makeEnds([1, 2, 3]) → [1, 3]
//makeEnds([1, 2, 3, 4]) → [1, 4]
//makeEnds([7, 4, 6, 2]) → [7, 2]

public int[] makeEnds(int[] nums) {
  int[] endArr = new int [2];
  
  endArr[0] = nums[0];
  endArr[1] = nums[nums.length - 1];
  
  return endArr;
}

