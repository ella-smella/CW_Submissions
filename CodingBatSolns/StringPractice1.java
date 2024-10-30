/**
* This file is for the first CodingBat assignment. It completes four exercises from String-1: 
* helloName, makeAbba, makeTages, and firstHalf
*/

//helloName Exercise
//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//helloName("Bob") → "Hello Bob!"
//helloName("Alice") → "Hello Alice!"
//helloName("X") → "Hello X!"

public String helloName(String name) {
  return "Hello " + name + "!";
}

//makeAbba Exercise
//Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
//makeAbba("Hi", "Bye") → "HiByeByeHi"
//makeAbba("Yo", "Alice") → "YoAliceAliceYo"
//makeAbba("What", "Up") → "WhatUpUpWhat"

public String makeAbba(String a, String b) {
  return a + b + b + a;
}

//makeTags Exercise
//The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
//makeTags("i", "Yay") → "<i>Yay</i>"
//makeTags("i", "Hello") → "<i>Hello</i>"
//makeTags("cite", "Yay") → "<cite>Yay</cite>"

public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}

//firstHalf Exercise
//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//firstHalf("WooHoo") → "Woo"
//firstHalf("HelloThere") → "Hello"
//firstHalf("abcdef") → "abc"
public String firstHalf(String str) {
  int stringLength = str.length();
  int stringHalved = stringLength / 2;
  return str.substring (0, stringHalved);
}
