/**
* This file is for the second CodingBat logic assignment. It completes three exercises from Logic-1: 
* alarmClock, in1To10, and old35
*/

//alarmClock Exercise
//Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
//alarmClock(1, false) → "7:00"
//alarmClock(5, false) → "7:00"
//alarmClock(0, false) → "10:00"
public String alarmClock(int day, boolean vacation) {
  if (vacation)
  {
    if (day > 0 && day < 6)
    {
      return "10:00";
    }
    return "off";
  }
  else
  {
    if (day > 0 && day < 6)
    {
      return "7:00";
    }
    return "10:00";
  }
}

//in1To10 Exercise
//Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
//in1To10(5, false) → true
//in1To10(11, false) → false
//in1To10(11, true) → true
public boolean in1To10(int n, boolean outsideMode) {
  if (outsideMode)
  {
    if (n <= 1 || n >= 10)
    {
      return true;
    }
    return false;
  }
  else
  {
    if (n >= 1 && n <= 10)
    {
      return true;
    }
    return false;
  }
}

//old35 Exercise
//Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator
//old35(3) → true
//old35(10) → true
//old35(15) → false
public boolean old35(int n) {
  if (n % 3 == 0 && n % 5 == 0)
  {
    return false;
  }
  else if (n % 3 == 0 || n % 5 == 0)
  {
    return true;
  }
  return false;
}
