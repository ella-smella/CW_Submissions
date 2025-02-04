/**
* This file is for the third Array CodingBat assignment. It completes the rest of exercises from Array-1: 
* has23, no23, makeLast, double23, fix23, start1, biggerTwo, makeMiddle, plusTwo, swapEnds, midThree, maxTriple, 
* frontPiece, unlucky1, make2, front11
*/

//has23 Exercise 
public boolean has23(int[] nums) {
  int[] copyArr = nums;
  boolean has23 = false;
  
  if (copyArr[0] == 2 || copyArr[1] == 2)
  {
    has23 = true;
  }
  
  if (copyArr[0] == 3 || copyArr[1] == 3)
  {
    has23 = true;
  }
  
  return has23;
}

//no23 Exercise
public boolean no23(int[] nums) {
  int[] copyArr = nums;
  boolean no23 = true;
  
  if (copyArr[0] == 2 || copyArr[1] == 2)
  {
    no23 = false;
  }
  
  if (copyArr[0] == 3 || copyArr[1] == 3)
  {
    no23 = false;
  }
  
  return no23;
}

//makeLast Exercise
public int[] makeLast(int[] nums) {
  int[] lastNums = new int [nums.length * 2];
  
  lastNums[lastNums.length - 1] = nums[nums.length - 1];
  
  return lastNums;
}

//double23 Exercise
public boolean double23(int[] nums) {
  int[] copyArr = nums;
  int twoCounter = 0;
  int threeCounter = 0;
  boolean double23 = false;
  
  for (int i = 0; i < copyArr.length; i ++)
  {
    if (copyArr[i] == 2)
    {
      twoCounter ++;
    }
    
    if (copyArr[i] == 3)
    {
      threeCounter ++;
    }
  }
  
  if (twoCounter == 2 || threeCounter == 2)
  {
    double23 = true;
  }
  
  return double23;
}

//fix23 Exercise
public int[] fix23(int[] nums) {
  int[] copyArr = new int [3];
  
  for (int i = 0; i < nums.length; i++)
  {
    copyArr[i] = nums[i];
  }
  
  for (int i = 0; i < nums.length - 1; i ++)
  {
    if(nums[i] == 2 && nums[i + 1] == 3)
    {
      copyArr[i + 1] = 0;
    }
  }
  
  return copyArr;
}

//start1 Exercise
public int start1(int[] a, int[] b) {
  int counter = 0;
  
  if (a.length == 0)
  {
    
  }
  else if (a[0] == 1)
  {
    counter ++;
  }
  
  if (b.length == 0)
  {
    
  }
  else if (b[0] == 1)
  {
    counter ++;
  }
  
  return counter;
}

//biggerTwo
public int[] biggerTwo(int[] a, int[] b) {
  int aSum = a[0] + a[1];
  int bSum = b[0] + b[1];
  
  if (aSum == bSum || aSum > bSum)
  {
    return a;
  }
  else
  {
    return b;
  }
}

//makeMiddle
public int[] makeMiddle(int[] nums) {
  int[] middleNums = new int [2];
  
  middleNums[0] = nums[nums.length / 2 - 1];
  middleNums[1] = nums[nums.length / 2];
  
  return middleNums;
}

//plusTwo
public int[] plusTwo(int[] a, int[] b) {
  int[] arrAB = new int [4];
  
  arrAB[0] = a[0];
  arrAB[1] = a[1];
  arrAB[2] = b[0];
  arrAB[3] = b[1];
  
  return arrAB;
}
