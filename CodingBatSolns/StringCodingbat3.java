/**
* This file is for the third CodingBat String assignment. It completes one exercise from String-2: 
* doubleChar
*/

//doubleChar Exercise 
//Given a string, return a string where for every char in the original, there are two chars.
//doubleChar("The") → "TThhee"
//doubleChar("AAbb") → "AAAAbbbb"
//doubleChar("Hi-There") → "HHii--TThheerree"

public String doubleChar(String str) {
  String doubleStr = "";
  for (int i = 0; i < str.length(); i++)
  {
    doubleStr += str.substring(i, i+1) + str.substring(i, i+1);
  }
  
  return doubleStr;
}
