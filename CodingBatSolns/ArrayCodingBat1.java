/**
* This file is for the first Array CodingBat assignment. It completes five exercises from Array-1: 
* firstLast6, sameFirstLast, makePi, commonEnd, sum3
*/

//firstLast6 Exercise 
//Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
//firstLast6([1, 2, 6]) → true
//firstLast6([6, 1, 2, 3]) → true
//firstLast6([13, 6, 1, 2, 3]) → false
public boolean firstLast6(int[] nums) {
  if (nums[0] == 6 || nums[nums.length - 1] == 6)
  {
    return true;
  }
  else
  {
    return false;
  }
}

//sameFirstLast Exercise
//Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
//sameFirstLast([1, 2, 3]) → false
//sameFirstLast([1, 2, 3, 1]) → true
//sameFirstLast([1, 2, 1]) → true
public boolean sameFirstLast(int[] nums) {
  if (nums.length == 1)
  {
    return true;
  }
  if (nums.length - 1 >= 1 && nums[0] == nums[nums.length - 1])
  {
    return true;
  }
  else
  {
    return false;
  }
}

//makePi Exercise
//Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
//makePi() → [3, 1, 4]
public int[] makePi() {
  int[] pi = {3, 1, 4};
  return pi;
}

//commonEnd Exercise
//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
//commonEnd([1, 2, 3], [7, 3]) → true
//commonEnd([1, 2, 3], [7, 3, 2]) → false
//commonEnd([1, 2, 3], [1, 3]) → true
public boolean commonEnd(int[] a, int[] b) {
  if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
  {
    return true;
  }
  else
  {
    return false;
  }
}

//sum3 Exercise
//Given an array of ints length 3, return the sum of all the elements.
//sum3([1, 2, 3]) → 6
//sum3([5, 11, 2]) → 18
//sum3([7, 0, 0]) → 7
public int sum3(int[] nums) {
  int sum = 0;
  for (int i = 0; i < nums.length; i ++)
  {
    sum += nums[i];
  }
  return sum;
}
