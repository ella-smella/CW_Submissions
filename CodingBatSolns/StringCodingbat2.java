/**
* This file is for the first CodingBat assignment. It completes four exercises from String-1: 
* makeOutWord, extraEnd, firstTwo, and withoutEnd
*/

//makeOutWord Exercise
//Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
//makeOutWord("<<>>", "Yay") → "<<Yay>>"
//makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//makeOutWord("[[]]", "word") → "[[word]]"

public String makeOutWord(String out, String word) {
  return out.substring(0, 2) + word + out.substring(2);
}

//extraEnd Exercise
//Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
//extraEnd("Hello") → "lololo"
//extraEnd("ab") → "ababab"
//extraEnd("Hi") → "HiHiHi"

public String extraEnd(String str) {
  int strLength = str.length();
  String strLastTwo = str.substring(strLength - 2);
  return strLastTwo + strLastTwo + strLastTwo;
}

//firstTwo Exercise
//Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
//firstTwo("Hello") → "He"
//firstTwo("abcdefg") → "ab"
//firstTwo("ab") → "ab"

public String firstTwo(String str) {
  int strLength = str.length();
  if (strLength < 2)
  {
    return str;
  }
  else
  {
    return str.substring (0, 2);
  }
}

//withoutEnd Exercise
//Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
//withoutEnd("Hello") → "ell"
//withoutEnd("java") → "av"
//withoutEnd("coding") → "odin"

public String withoutEnd(String str) {
  int strLength = str.length();
  return str.substring(1, strLength - 1);
}

